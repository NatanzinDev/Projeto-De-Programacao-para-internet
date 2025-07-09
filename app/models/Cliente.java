package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Cliente extends Model{
	public String nome;
	public String cpf;
	public String telefone;
	public String email;
	
	@OneToMany
	public List<Endereco> endereco;
}
