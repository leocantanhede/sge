package pt.lunasoft.sge.api.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pt.lunasoft.sge.api.model.Eleitor;
import pt.lunasoft.sge.api.repository.EleitorRepository;
import pt.lunasoft.sge.api.repository.filter.Filtro;

@RestController
@RequestMapping("/eleitores")
@CrossOrigin(origins = "https://lunasoft-sge.herokuapp.com")
public class EleitorResource {

	@Autowired
	private EleitorRepository eleitorRepository;
	
	@GetMapping
	public List<Eleitor> eleitores() {
		return this.eleitorRepository.findAll();
	}
	
	@GetMapping("/filtrar")
	public List<Eleitor> eleitoresPorNome(Filtro filtro) {
		return this.eleitorRepository.filtrar(filtro);
	}
	
	@GetMapping("eleitor/{id}")
	public ResponseEntity<Eleitor> eleitor(@PathVariable Integer id) {
		return ResponseEntity.ok(this.eleitorRepository.findOne(id));
	}
	
	@PostMapping
	public ResponseEntity<Eleitor> salvar(@Valid @RequestBody Eleitor eleitor) {
		eleitor = this.eleitorRepository.save(eleitor);
		return ResponseEntity.status(HttpStatus.CREATED).body(eleitor);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Eleitor> atualizar(@PathVariable Integer id, @Valid @RequestBody Eleitor eleitor) {
		Eleitor eleitorSalvo = this.eleitorRepository.findOne(id);
		BeanUtils.copyProperties(eleitor, eleitorSalvo, "codigo");
		return ResponseEntity.ok(this.eleitorRepository.save(eleitorSalvo));
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable Integer id) {
		this.eleitorRepository.delete(id);
	}
	
}