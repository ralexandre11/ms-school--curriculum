package com.ribeiro.schoolcurriculum.service;

import com.ribeiro.schoolcurriculum.entity.Discipline;

public interface DisciplineService {
	
	public Discipline update(final Long id, final Discipline discipline);
	
	public Boolean delete(final Long id);

}
