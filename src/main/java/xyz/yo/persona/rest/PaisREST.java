package xyz.yo.persona.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import xyz.yo.persona.model.Pais;
import xyz.yo.persona.service.PaisService;

@RestController
@RequestMapping("/pais/")
public class PaisREST {
	
	@Autowired
	private PaisService paisService;
	
	@GetMapping
	private ResponseEntity<List<Pais>> getAllPaises(){
		return ResponseEntity.ok(paisService.findAll());
		
	}

}
