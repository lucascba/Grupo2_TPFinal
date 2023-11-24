package main.java.entidades;

import javax.persistence.*;

@Entity
@Table(name="CorreoElectronico")
public class CorreoElectronico {

	/*@Id
	 *@Column(name="idCorreo")
	 *@GeneratedValue(strategy = GenerationType.TABLE)
	 *private int idCorreo;*/

	@Column(name="correoElectronico")
	private String correoElectronico;
	
	@Column(name="estado")
	private boolean estado;
	
	public CorreoElectronico() {}

	public CorreoElectronico(String correoElectronico, boolean estado) {
		this.correoElectronico = correoElectronico;
		this.estado = estado;
	}

	/*public CorreoElectronico(int idCorreo, String correoElectronico, boolean estado) {
		this.idCorreo = idCorreo;
		this.correoElectronico = correoElectronico;
		this.estado = estado;
	}

	public int getIdCorreo() {
		return idCorreo;
	}

	public void setIdCorreo(int idCorreo) {
		this.idCorreo = idCorreo;
	}*/

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "CorreoElectronico [correoElectronico=" + correoElectronico + "]";
	}
}
