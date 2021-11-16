package uc.us_security.service;
import java.util.List;

import uc.us_security.entity.Rol;


public interface RolService {
	Rol create(Rol rl);
	List<Rol> readAll();
	Rol read(int id);
	void delete(int id);
	Rol update(Rol lb);
}
