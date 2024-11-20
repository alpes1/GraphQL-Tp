package com.alpes.graphqltest.web;

import com.alpes.graphqltest.dao.entities.Creator;
import com.alpes.graphqltest.dao.entities.Video;
import com.alpes.graphqltest.dao.repository.CreatorRepository;
import com.alpes.graphqltest.dao.repository.VideoRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VideoGraphQlController {
    private CreatorRepository creatorRepository;
    private VideoRepository videoRepository;
    VideoGraphQlController(CreatorRepository creatorRepository, VideoRepository videoRepository){
        this.creatorRepository = creatorRepository;
        this.videoRepository = videoRepository;
    }
    @QueryMapping
    public List<Video> videoList(){
        return videoRepository.findAll();
    }
    @QueryMapping
    public Creator creatorById(@Argument Integer id) {
        return creatorRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id)));
    }
    @MutationMapping
    public Creator saveCreator(@Argument CreatorRequest creatorRequest) {
        Creator creator = new Creator();
        creator.setName(creatorRequest.getName());
        creator.setEmail(creatorRequest.getEmail());
        return creatorRepository.save(creator);
    }

    @MutationMapping
    public Video saveVideo(@Argument VideoRequest videoRequest) {
        Creator creator = creatorRepository.findById(videoRequest.getCreatorId())
                .orElseThrow(() -> new RuntimeException("Creator not found"));
        Video video = new Video();
        video.setTitle(videoRequest.getTitle());
        video.setDescription(videoRequest.getDescription());
        video.setCreator(creator);
        return videoRepository.save(video);
    }
}
