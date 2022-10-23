package com.jb.SpringBootDTO.dtos;

import lombok.Data;

@Data
public class HumanAddressDTO {
    private long humanId;
    private String firstName;
    private String lastName;
    private String email;
    private String place;
    private String longitude;
    private String latitude;
}
