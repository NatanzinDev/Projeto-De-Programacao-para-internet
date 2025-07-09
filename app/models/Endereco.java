package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Endereco extends Model{
	public String cidade;
	public String cep;
	public String bairro;
	public String numero;
	public String rua;
}
