package main.java.entidades;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Cliente")
public class Cliente {

	@Id
	@Column(name="idCliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	
	@Column(name="razonSocial")
	private String razonSocial;
	
	@Column(name="cuit")
	private String cuit;
	
	@Column(name="direccion")
	private String direccion;
	
	@OneToMany
	@ElementCollection
    @CollectionTable(name = "incidentes", joinColumns = @JoinColumn(name = "idCorreo", referencedColumnName="idCliente")) 
    @Column(name = "correoElectronico")
	private List<CorreoElectronico> correoElectronico;
	
	@Column(name="notasAdicionales")
	private String notasAdicionales;
	
	@OneToMany
	@ElementCollection
    @CollectionTable(name = "incidentes", joinColumns = @JoinColumn(name = "idCliente", referencedColumnName="idCliente")) 
    @Column(name = "incidente")
    private List<Incidente> incidentes;
	
	@Column(name="estado")
	private boolean estado;
	
	public Cliente() {}

	public Cliente(String razonSocial, String cuit, String direccion, List<CorreoElectronico> correoElectronico, String notasAdicionales,
			List<Incidente> incidentes, boolean estado) {
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
		this.notasAdicionales = notasAdicionales;
		this.incidentes = incidentes;
		this.estado = estado;
	}

	public Cliente(int idCliente, String razonSocial, String cuit, String direccion, List<CorreoElectronico> correoElectronico,
			String notasAdicionales, List<Incidente> incidentes, boolean estado) {
		this.idCliente = idCliente;
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.direccion = direccion;
		this.correoElectronico = correoElectronico;
		this.notasAdicionales = notasAdicionales;
		this.incidentes = incidentes;
		this.estado = estado;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<CorreoElectronico> getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(List<CorreoElectronico> correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getNotasAdicionales() {
		return notasAdicionales;
	}

	public void setNotasAdicionales(String notasAdicionales) {
		this.notasAdicionales = notasAdicionales;
	}

	public List<Incidente> getIncidentes() {
		return incidentes;
	}

	public void setIncidentes(List<Incidente> incidentes) {
		this.incidentes = incidentes;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cliente [razonSocial=" + razonSocial + ", cuit=" + cuit + ", direccion=" + direccion
				+ ", correoElectronico=" + correoElectronico + ", notasAdicionales=" + notasAdicionales + "]";
	}
}
