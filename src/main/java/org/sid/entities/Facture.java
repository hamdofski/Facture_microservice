package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


 @Entity
public class Facture implements Serializable {
	 
	 @Id @GeneratedValue
	private Long idFacture;
	private Long idClient;
	private Date dateFacture;
	private String status;
	
	
	public Facture(Long idClient, Date dateFacture, String status) {
		super();
		this.idClient = idClient;
		this.dateFacture = dateFacture;
		this.status = status;
	}
	
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdFacture() {
		return idFacture;
	}
	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public Date getDateFacture() {
		return dateFacture;
	}
	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
}
