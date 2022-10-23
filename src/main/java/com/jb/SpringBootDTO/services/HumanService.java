package com.jb.SpringBootDTO.services;

import com.jb.SpringBootDTO.dtos.HumanAddressDTO;
import com.jb.SpringBootDTO.entities.Human;
import com.jb.SpringBootDTO.repositories.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HumanService {
    @Autowired
    HumanRepository humanRepository;

    public List<HumanAddressDTO> getAllHuman() {
        return humanRepository.findAll()
                .stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    public HumanAddressDTO convertEntityToDTO (Human human) {
        HumanAddressDTO humanAddressDTO = new HumanAddressDTO();
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
