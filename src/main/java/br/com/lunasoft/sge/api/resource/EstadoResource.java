package br.com.lunasoft.sge.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lunasoft.sge.api.model.Estado;
import br.com.lunasoft.sge.api.repository.EstadoRepository;

@RestController
@RequestMapping("/estados")
@CrossOrigin(origins = "https://lunasoft-sge.herokuapp.com")
public class EstadoResource {

	@Autowired
	private EstadoRepository estadoRepository;
	
	@GetMapping
	public List<Estado> estados() {
		return this.estadoRepository.findAll();
	}
	
}