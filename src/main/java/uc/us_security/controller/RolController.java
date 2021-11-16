package uc.us_security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uc.us_security.entity.Rol;
import uc.us_security.serviceimpl.RolServiceimpl;



@RestController
@RequestMapping("/api/rol")
public class RolController {
@Autowired
private RolServiceimpl rolService;
@GetMapping("/all")
public ResponseEntity<List<Rol>> getRol(){
	try {
		List<Rol> list = new ArrayList<>();
		list = rolService.readAll();
		if(list.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(list, HttpStatus.OK);
	} catch (Exception e) {
		// TODO: handle exception
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}

}
