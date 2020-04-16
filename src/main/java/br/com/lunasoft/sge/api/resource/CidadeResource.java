package br.com.lunasoft.sge.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.lunasoft.sge.api.model.Cidade;
import br.com.lunasoft.sge.api.model.Estado;
import br.com.lunasoft.sge.api.repository.CidadeRepository;

@RestController
@RequestMapping("/cidades")
@CrossOrigin(origins = "http://localhost:4200")
public class CidadeResource {

	@Autowired
	private CidadeRepository cidadeRepository;
	
	@GetMapping("/{estado}")
	public List<Cidade> cidades(@PathVariable Integer estado) {
		return this.cidadeRepository.findByEstado(new Estado(estado));
	}
	
}