package com.alpes.graphqltest.dao.repository;

import com.alpes.graphqltest.dao.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;



public interface VideoRepository extends JpaRepository<Video, Integer > {
}
