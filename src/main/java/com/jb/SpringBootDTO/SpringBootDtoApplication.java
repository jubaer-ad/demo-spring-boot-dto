package com.jb.SpringBootDTO;


import com.jb.SpringBootDTO.entities.Address;
import com.jb.SpringBootDTO.entities.Human;
import com.jb.SpringBootDTO.repositories.AddressRepository;
import com.jb.SpringBootDTO.repositories.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDtoApplication implements CommandLineRunner {
	@Autowired
	HumanRepository humanRepository;

	@Autowired
	AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDtoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Address address = new Address();
		address.setPlace("Kalaia");
		address.setLongitude("testLongitude");
		address.setLatitude("testLatitude");
		address.setTestStringToHideFromDTO("Volla!");
		addressRepository.save(address);

		Human human001 = new Human();
		human001.setFirstName("testFirstName");
		human001.setLastName("testLastName");
		human001.setEmail("testemail@test.test");
		human001.setUsername("testUsername");
		human001.setPassword("testPwd");
		human001.setAddress(address);
		humanRepository.save(human001);

		Human human002 = new Human();
		human002.setFirstName("testFirstNamehuman002");
		human002.setLastName("testLastNamehuman002");
		human002.setEmail("testemail@test.testhuman002");
		human002.setUsername("testUsernamehuman002");
		human002.setPassword("testPwdhuman002");
		human002.setAddress(address);
		humanRepository.save(human002);
	}
}
