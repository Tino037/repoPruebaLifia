package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="muñeco")
public class Muñeco {
	@Id
	@GeneratedValue()
	private long id;
	@Column
	Double precio;
	@Column
	String material;
	@Column
	String nombre;
	public Muñeco() {
		// TODO Auto-generated constructor stub
	}
	
	
	 public Muñeco(String ma, Double pre,String nom) 
	  {
	    precio=pre;
	    material = ma;
	    nombre=nom;
	  }
	
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
