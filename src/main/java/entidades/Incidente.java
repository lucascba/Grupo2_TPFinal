package main.java.entidades;

import javax.persistence.*;

@Entity
@Table(name="Incidente")
public class Incidente {

	@Id
	@Column(name="idIncidente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idIncidente;
	
	@Column(name="especialidad")
	private String especialidad;
	
}
