package com.stackroute.muzix.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
public class Track {
    @Id
  // @GeneratedValue(strategy= GenerationType.AUTO)
    private int trackId;
    private String trackName;
    private String comments;

}
