package com.ribeiro.schoolcurriculum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ribeiro.schoolcurriculum.entity.Discipline;
import com.ribeiro.schoolcurriculum.repository.DisciplineRepository;

@Service
public class DisciplineServiceImpl implements DisciplineService {

	@Autowired
	private DisciplineRepository repository;
	
	@Override
	public Discipline update(final Long id, final Discipline discipline) {
		try {
			Discipline disciplineFound = repository.findById(discipline.getId()).get();
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
