package com.alpes.graphqltest.dao.repository;

import com.alpes.graphqltest.dao.entities.Creator;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CreatorRepository extends JpaRepository<Creator, Integer > {
}
