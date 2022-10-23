package com.jb.SpringBootDTO.controllers;

import com.jb.SpringBootDTO.dtos.HumanAddressDTO;
import com.jb.SpringBootDTO.services.HumanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HumanController {
    @Autowired
    HumanService humanService;
    @GetMapping("/allhuman")
    public List<HumanAddressDTO> getAllHuman() {
        return humanService.getAllHuman();
    }
}
