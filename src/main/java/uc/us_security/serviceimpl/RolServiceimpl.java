package uc.us_security.serviceimpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uc.us_security.entity.Rol;
import uc.us_security.repository.Rolrepository;
import uc.us_security.service.RolService;

@Service
public class RolServiceimpl implements RolService {
	@Autowired
	private Rolrepository rolrepository;

	@Override
	public Rol create(Rol rl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolrepository.findAll();
	}

	@Override
	public Rol read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Rol update(Rol lb) {
		// TODO Auto-generated method stub
		return null;
	}
}
