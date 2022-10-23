package com.jb.SpringBootDTO.converters;

import com.jb.SpringBootDTO.dtos.HumanAddressDTO;
import com.jb.SpringBootDTO.entities.Human;
import org.springframework.stereotype.Component;

@Component
public class HumanEntityToDto {
    public HumanAddressDTO humanEntityToDto(Human human, HumanAddressDTO humanAddressDTO) {
        humanAddressDTO.setHumanId(human.getId());
        humanAddressDTO.setFirstName(human.getFirstName());
        humanAddressDTO.setLastName(human.getLastName());
        humanAddressDTO.setEmail(human.getEmail());
        humanAddressDTO.setPlace(human.getAddress().getPlace());
        humanAddressDTO.setLatitude(human.getAddress().getLatitude());
        humanAddressDTO.setLongitude(human.getAddress().getLongitude());
        return humanAddressDTO;
    }
}
