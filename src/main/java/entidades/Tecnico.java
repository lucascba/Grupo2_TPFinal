package main.java.entidades;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Tecnico")
public class Tecnico {

	@Id
	@Column(name="idTecnico")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTecnico;
	
	@Column(name="legajo")
	private long legajo;
	
	@Column(name="nombreCompleto")
	private String nombreCompleto;
	
	@Column(name="especialidad")
	private String especialidad;
	
	@OneToMany
	@ElementCollection
    @CollectionTable(name = "incidentes", joinColumns = @JoinColumn(name = "idCorreo", referencedColumnName="idTecnico")) 
    @Column(name = "correoElectronico")
	private List<CorreoElectronico> correoElectronico;
	
	@Column(name="estado")
	private boolean estado;
	
	public Tecnico() {}

	public Tecnico(long legajo, String nombreCompleto, String especialidad,
			List<CorreoElectronico> correoElectronico, boolean estado) {
		this.legajo = legajo;
		this.nombreCompleto = nombreCompleto;
		this.especialidad = especialidad;
		this.correoElectronico = correoElectronico;
		this.estado = estado;
	}
	
	public Tecnico(int id, int legajo, String nombreCompleto, String especialidad,
			List<CorreoElectronico> correoElectronico, boolean estado) {
		this.idTecnico = id;
		this.legajo = legajo;
		this.nombreCompleto = nombreCompleto;
		this.especialidad = especialidad;
		this.correoElectronico = correoElectronico;
		this.estado = estado;
	}

	public int getId() {
		return idTecnico;
	}
	
	public void setId(int id) {
		this.idTecnico = id;
	}
	
	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public List<CorreoElectronico> getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(List<CorreoElectronico> correoElectronico) {
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
		return "Tecnico [legajo=" + legajo + ", nombreCompleto=" + nombreCompleto
				+ ", especialidad=" + especialidad + ", correoElectronico=" + correoElectronico + "]";
	}
}
