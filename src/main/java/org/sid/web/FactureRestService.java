package org.sid.web;

import org.sid.dao.FactureRepository;
import org.sid.entities.Facture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@CrossOrigin("*")
public class FactureRestService {
	@Autowired
	private FactureRepository factureRepository;
	@RequestMapping(value="/factures",method=RequestMethod.GET)
	public List<Facture> getFactures(){
		return factureRepository.findAll();
		

}
	@RequestMapping(value="/factures/{id}",method=RequestMethod.GET)
	public Facture getItem(@PathVariable Long id){
		return factureRepository.findOne(id);
		
}
	@RequestMapping(value="/factures",method=RequestMethod.POST)
	public Facture save(@RequestBody Facture  f){
		return factureRepository.save(f);
		
}
		

	@RequestMapping(value="/factures/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Long id){
		factureRepository.delete(id);
		return true;
		
}
	@RequestMapping(value="/factures/{id}",method=RequestMethod.PUT)
	public Facture save(@PathVariable Long id,@RequestBody Facture f ){
		f.setIdFacture(id);
		return factureRepository.save(f);
		
}
	
	}
