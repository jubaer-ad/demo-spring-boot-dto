package com.jb.SpringBootDTO.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue
    private long id;
    private String place;
    private String longitude;
    private String latitude;

    @Column(name = "test_string_to_hide_from_dto")
    private String testStringToHideFromDTO;
}
