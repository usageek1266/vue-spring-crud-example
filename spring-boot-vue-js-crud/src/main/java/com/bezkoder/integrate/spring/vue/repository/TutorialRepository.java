package com.bezkoder.integrate.spring.vue.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.integrate.spring.vue.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByPublished(boolean published);

  List<Tutorial> findByTitleContaining(String title);
}
