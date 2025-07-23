package models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import play.db.jpa.Model;

@Entity
public class Aluno extends Model{
	public String nome;
	public String matricula;
	public String email;
	
	@ManyToMany(mappedBy="alunos")
	public List<Curso> cursos;
	
}
