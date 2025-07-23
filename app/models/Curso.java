package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import play.db.jpa.Model;

@Entity
public class Curso extends Model{
	public String  nome;
	public String descricao;
	public String cargahoraria;
	
	@ManyToMany
	@JoinTable(name="curso_alunos")
	public List<Aluno> alunos;
}
