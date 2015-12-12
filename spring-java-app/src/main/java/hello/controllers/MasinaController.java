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
public class MasinaController {
  private List<Masina> masina = new ArrayList<Masina>();

  MasinaController() {
    Masina p1 = new Masina(5, "Berlina", "Volan1", "Albastru", 1234);
    Masina p2 = new Masina(7, "Berlina", "Volan2", "Verde", 4567);
    Masina p3 = new Masina(3, "Coupe", "Volan3", "Galben", 2345);

    persoane.add(p1);
    persoane.add(p2);
    persoane.add(p3);
  }

	@RequestMapping(value="/masina", method = RequestMethod.GET)
	public List<Masina> index() {
		return this.masina;
	}
  
	@RequestMapping(value="/masina/{numar usi}", method = RequestMethod.GET)
	public ResponseEntity show(@PathVariable("numar usi") int numar_usi) {
		for(Masina p : this.masina) {
			if(p.getNumarUsi() == numar_usi) {
				return new ResponseEntity<Masina>(p, new HttpHeaders(), HttpStatus.OK);
			}
		}
	return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}
  
/*
  public Masina(int numar_usi, String model, String volan, String culoare, int numar)
*/

	@RequestMapping(value="/masina/{numar usi}/{model}/{volan}/{culoare}/{numar}", method = RequestMethod.POST)
	public List<Masina> create(@PathVariable(value="numar usi") int numar_usi,@PathVariable(value="model") String model,@PathVariable(value="volan") String volan,@PathVariable(value="culoare" String culoare,@PathVariable(value="numar") int numar) {
		Masina p = new Masina (numar_usi, model, volan, culoare, numar );
		masina.add(p);
		return this.masina;
	}
  
	@RequestMapping(value="/masina/{numar usi}", method = RequestMethod.PUT)
	public ResponseEntity update(@PathVariable("numar usi") int numar_usi) {
		for(Masina p : this.masina){
			if(p.getNumarUsi() == numar_usi) {				
				p.setNumarUsi(5);
				p.setModel("default model");
				p.setVolan("default volan");
				p.setCuloare("default culoare");
				p.setNumar(8888);
				return new ResponseEntity<Angajat>(p, new HttpHeaders(), HttpStatus.OK);
			}
		}
	return new ResponseEntity<String>(null,new HttpHeaders(), HttpStatus.NOT_FOUND);
	}

	@RequestMapping(value="/masina/{numar usi}", method = RequestMethod.DELETE)
	public ResponseEntity remove(@PathVariable("numar usi") int numar_usi) {
		for(Masina p : this.masina) {
			if(p.getNumarUsi() == numar_usi) {
				this.masina.remove(p);
				return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NO_CONTENT);
			}
		}
		return new ResponseEntity<String>(null, new HttpHeaders(), HttpStatus.NOT_FOUND);
	}


}