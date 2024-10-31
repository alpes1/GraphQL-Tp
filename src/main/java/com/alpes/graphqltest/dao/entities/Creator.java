package com.alpes.graphqltest.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Creator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String email ;

    @OneToMany(mappedBy = "creator", fetch = FetchType.EAGER)
    private List<Video> videos = new ArrayList<>();
}
