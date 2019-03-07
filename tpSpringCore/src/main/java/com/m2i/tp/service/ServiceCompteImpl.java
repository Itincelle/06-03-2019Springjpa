package com.m2i.tp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.m2i.tp.dao.DaoCompte;
import com.m2i.tp.entity.Compte;

@Service //@Service h√©rite de @Component 
@Transactional //  par defaut esgale a Áa @Transactional(propagation=Propagation.REQUIRED)  voir page 73 pdf
public class ServiceCompteImpl implements ServiceCompte {
	
	@Autowired
	private DaoCompte daoCompte;

	@Override
	public Compte rechercherCompteParNumero(Long numero) {
		return daoCompte.findById(numero);
	}
	
	@Override
	public void sauvegarder(Compte c) {
		daoCompte.save(c);
	}

	@Override
	public List<Compte> comptesDuClient() {
		return daoCompte.findAll();
	}

	@Override
	public void virement(double montant, long numCptDeb, long numCptCred) {
		Compte CptDeb = daoCompte.findById(numCptDeb);
		CptDeb.setSolde(CptDeb.getSolde()-montant);
		daoCompte.save(CptDeb); // facultatif pour mise a jour sur B.D facultatif psk @transactional est ici en haut

		
		Compte CptCred = daoCompte.findById(numCptCred);
		CptCred.setSolde(CptCred.getSolde()+montant);
		daoCompte.save(CptCred); //
	}

	@Override
	public void supprimerCompte(Long numero) {
		// TODO Auto-generated method stub

	}

	

}
