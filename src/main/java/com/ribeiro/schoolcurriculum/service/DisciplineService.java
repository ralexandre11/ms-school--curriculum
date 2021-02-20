package com.ribeiro.schoolcurriculum.service;

import java.util.List;

import com.ribeiro.schoolcurriculum.entity.Discipline;

public interface DisciplineService {
	
	public List<Discipline> getAll();
	
	public Discipline getById(Long id);
	
	public Discipline save(final Discipline discipline);
	
	public Discipline update(final Long id, final Discipline discipline);
	
	public Boolean delete(final Long id);

}
