package ifg.edu.br.exemplo_jpa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "contas")
public class Conta {
	@Id
	private long id;
	
	@Column(name = "codigo_banco", nullable = false)
	private int codigoBanco;
	
	@Column(length = 30, nullable = false)
	private String codigo;
	
	@Column(length = 30, nullable = false)
	private String agencia;
	
	@ManyToOne(optional = false)
	private Usuario usuario;
	
	private float saldo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getCodigoBanco() {
		return codigoBanco;
	}
	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
}
