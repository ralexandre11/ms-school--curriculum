package com.ribeiro.schoolcurriculum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ribeiro.schoolcurriculum.entity.Discipline;

public interface DisciplineRepository extends JpaRepository<Discipline, Long>{

}
