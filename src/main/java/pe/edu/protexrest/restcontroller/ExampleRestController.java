package pe.edu.protexrest.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.protexrest.model.entity.Usuario;
import pe.edu.protexrest.model.repository.UsuarioRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ExampleRestController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	/*public CarreraRestController(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}*/

	@GetMapping("rest1")
	public String rest1() {
		return "API Rest 1";
	}
	
	@GetMapping("rest2")
	public String rest2() {
		return "API Rest 2";
	}
	
	@GetMapping("usuarios")
	public List<Usuario> usuarios() {
		return this.usuarioRepository.findAll();
	}
}
