package com.training.springbootdemo;

import com.training.springbootdemo.data.entity.Room;
import com.training.springbootdemo.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// the @SpringBootApplication is the trigger for Spring Boot Autoconfiguration.
// using @SpringBootApplication annotation makes this file a configuration file.
// it also makes this file the starting of all our components scanning.
// it also initiates  the auto-configuration capabilities that Spring Boot offers
@SpringBootApplication
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }

    @RestController
    @RequestMapping("/rooms")
    public class RoomController {
        @Autowired
        private RoomRepository roomRepository;

		@GetMapping
		public Iterable<Room> getRooms(){
			return roomRepository.findAll();
		}
    }

}
