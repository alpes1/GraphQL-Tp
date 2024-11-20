package com.alpes.graphqltest;

import com.alpes.graphqltest.dao.entities.Creator;
import com.alpes.graphqltest.dao.entities.Video;
import com.alpes.graphqltest.dao.repository.CreatorRepository;
import com.alpes.graphqltest.dao.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GraphQlTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQlTestApplication.class, args);
    }

   // @Bean
   /* CommandLineRunner start(CreatorRepository creatorRepository, VideoRepository videoRepository) {
        return args -> {
            List<Creator> creators = List.of(
                    Creator.builder().name("alpes lp").build(),
                    Creator.builder().name("Ilyass ily").build(),
                    Creator.builder().name("med ko").build()
            );

            // Save all creators to the repository
            creatorRepository.saveAll(creators);

            // Create a list of videos and associate each with a creator
            List<Video> videos = List.of(
                    Video.builder().name("Introduction to Java").creator(creators.get(0)).build(),
                    Video.builder().name("Advanced Spring Boot").creator(creators.get(1)).build(),
                    Video.builder().name("Microservices with Spring Cloud").creator(creators.get(2)).build()
            );

            // Save all videos to the repository
            videoRepository.saveAll(videos);
        };*/
    }


