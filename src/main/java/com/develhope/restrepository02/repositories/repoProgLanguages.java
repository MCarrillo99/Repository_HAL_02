package com.develhope.restrepository02.repositories;

import com.develhope.restrepository02.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo_prog_languages")
public interface repoProgLanguages extends JpaRepository<ProgrammingLanguage, Integer> {
}
