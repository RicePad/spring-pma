package com.jonali.pma.dao;

import org.springframework.data.repository.CrudRepository;

import com.jonali.pma.entities.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {

}
