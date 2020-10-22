package com.neu.edu;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DockerController {
	//For docker checkpoint
			@GetMapping(path ="/docker", produces=MediaType.APPLICATION_JSON_VALUE)
			public ResponseEntity<Object> clearhealthCheckpoint(){
					return new ResponseEntity<>("{\n" + "\"message\":\"To initialize docker check\"\n" + "}",HttpStatus.OK);
			}
}
