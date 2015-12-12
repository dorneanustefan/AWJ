package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.ArrayList;


@RestController
public class AngajatController {
	private List<Angajat> angajat = new ArrayList<Angajat>();

	AngajatController() {
		Angajat a1 = new Angajat("Oracle", "Andrei", "C++ dev", 1500, 2, "Dezvoltare");
		Angajat a2 = new Angajat("IBM", "Stefan", "Junior Java dev", 2000, 4, "Dezvoltare");
		Angajat a3 = new Angajat("EEU", "Eduard", "Marketing intern", 1700, 1, "Markering");
		
		angajat.add(a1);
		angajat.add(a2);	
		angajat.add(a3);
	}

	@RequestMapping(value="/angajat", method = RequestMethod.GET)
	public List<Angajat> index() {
		return this.angajat;
	}
  
	@RequestMapping(value="/angajat/{firma}", method = RequestMethod.GET)
	public ResponseEntity show(@PathVariable("firma") String firma) {
		for(Angajat p : this.angajat) {
			if(p.getFrima() == firma) {
				return new ResponseEntity<Angajat>(p, new HttpHeaders(), HttpStatus.OK);
			}
		}
	return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
  
	@RequestMapping(value="/angajati/{firma}/{nume}/{pozitie}/{salariu}/{vechime}/{departament}", method = RequestMethod.POST)
	public List<Angajati> create(@PathVariable(value="firma") String firma,@PathVariable(value="nume") String nume,@PathVariable(value="pozitie") String pozitie,@PathVariable(value="salariu") int salariu,@PathVariable(value="vechime" int vechime,@PathVariable(value="departament") String departament) {
		Angajat p = new Angajat (firma, nume, pozitie, salariu, vechime, departament );
		angajat.add(p);
		return this.angajat;
	}
  
	@RequestMapping(value="/angajati/{firma}", method = RequestMethod.PUT)
	public ResponseEntity update(@PathVariable("firma") String firma) {
		for(Angajat p : this.angajat){
			if(p.getFirma() == firma) {				
				p.setFirma("default firma");
				p.setNume("default nume");
				p.setPozitie("default pozitie");
				p.setSalariu(7000);
				p.setVechime(10);
				p.setDepartament("default departament");
				return new ResponseEntity<Angajat>(p, new HttpHeaders(), HttpStatus.OK);
			}
		}
	return new ResponseEntity<String>(null,new HttpHeaders(), HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value="/angajat/{id}", method = RequestMethod.DELETE)
	public ResponseEntity remove(@PathVariable("id") int id) {
		for(Angajat p : this.angajat) {
			if(p.getFirma() == firma) {
				this.angajat.remove(p);
				return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NO_CONTENT);
			}
		}
		return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}


}