package br.com.springboot.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.rest.model.Usuario;
import br.com.springboot.rest.repository.UsuarioRepository;

@RestController
public class GreetingsController {

	@Autowired
	private UsuarioRepository usuarioRepository;


	@PostMapping(value = "salvar")
	@ResponseBody
	public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario) {

		Usuario user = usuarioRepository.save(usuario);

		return new ResponseEntity<Usuario>(user, HttpStatus.CREATED);

	}
	
	@GetMapping(value = "listar")
	@ResponseBody
	public ResponseEntity<List<Usuario>> listar() {

		List<Usuario> usuarios = usuarioRepository.findAll();

		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);
	}


	@GetMapping(value = "buscarId")
	@ResponseBody
	public ResponseEntity<Usuario> buscarId(@RequestParam(name = "id") Long id) {

		Usuario usuario = usuarioRepository.findById(id).get();

		return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);

	}
	
	@GetMapping(value = "buscarNome")
	@ResponseBody
	public ResponseEntity<List<Usuario>> buscarNome(@RequestParam(name = "nome") String nome) {

		List<Usuario> usuarios = usuarioRepository.buscarPorNome(nome.toUpperCase());

		return new ResponseEntity<List<Usuario>>(usuarios, HttpStatus.OK);

	}

	@PutMapping(value = "atualizar")
	@ResponseBody
	public ResponseEntity<?> atualizar(@RequestBody Usuario usuario) {

		if (usuario.getId() == null) {
			return new ResponseEntity<String>("Informe um Id", HttpStatus.OK);
		} else {

			Usuario user = usuarioRepository.saveAndFlush(usuario);

			return new ResponseEntity<Usuario>(user, HttpStatus.OK);
		}

	}
	
	@DeleteMapping(value = "deletar")
	@ResponseBody
	public ResponseEntity<?> deletar(@RequestParam Long id) {
		
		if (usuarioRepository.findById(id).isEmpty()) {
			return new ResponseEntity<String>("Informe um Id existente", HttpStatus.OK);
		} else {
			usuarioRepository.deleteById(id);

			return new ResponseEntity<String>("Usuário deletado com sucesso!", HttpStatus.OK);
			
		}

		

	}
}
