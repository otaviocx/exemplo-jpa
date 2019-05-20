package ifg.edu.br.exemplo_jpa.entidades;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	private long id;
	
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 11, nullable = false)
	private String cpf;
	
	@Column(length = 100, nullable = false, 
			unique = true)
	private String email;
	
	@Column(length = 128, nullable = false)
	private String senha;
	
	@OneToMany(mappedBy = "usuario")
	private Set<Conta> contas;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email + ", senha=" + senha
				+ ", contas=" + contas + ", dataNascimento=" + dataNascimento + "]";
	}
}
