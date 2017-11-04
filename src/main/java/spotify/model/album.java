package spotify.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class album {
	@Id 
	@Column(length = 16)
	public String Id;
	
	@Column(length = 64, nullable = false)
	public String Nombre;
	
	public Date fecha;
}
