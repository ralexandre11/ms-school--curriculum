package com.ribeiro.schoolcurriculum.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ribeiro.schoolcurriculum.entity.Discipline;
import com.ribeiro.schoolcurriculum.repository.DisciplineRepository;

@Service
public class DisciplineServiceImpl implements DisciplineService {

	@Autowired
	private DisciplineRepository repository;

	@Override
	public List<Discipline> getAll() {
		try {
			return repository.findAll();
		} catch (Exception e) {
			return new ArrayList<>();		}
	}

	@Override
	public Discipline getById(Long id) {
		try {
			Optional<Discipline> discipline = this.repository.findById(id);
			if (discipline.isPresent()) {
				return discipline.get();
			}
			return null;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Discipline save(Discipline discipline) {
		try {
			return repository.save(discipline);
		} catch (Exception e) {
			return discipline;
		}
	}

	
	@Override
	public Discipline update(final Long id, final Discipline discipline) {
		try {
			Discipline disciplineFound = repository.findById(id).get();
			disciplineFound.setName(discipline.getName());
			disciplineFound.setHours(discipline.getHours());
			disciplineFound.setCodeDiscipline(discipline.getCodeDiscipline());
			disciplineFound.setFrequency(discipline.getFrequency());
			
			return repository.save(disciplineFound);
		} catch (Exception e) {
			return discipline;	
		}
	}

	@Override
	public Boolean delete(final Long id) {
		try {
			repository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
