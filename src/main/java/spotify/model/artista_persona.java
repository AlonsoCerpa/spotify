package spotify.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class artista_persona {
	@Id
	public Integer Id_persona;
	
	public String nombre;
	@Column(name = "ap_pat", length = 64, nullable = false)
	
	public String ApellidoPaterno;
	@Column(name = "ap_mat", length = 64, nullable = false)
	public String ApellidoMaterno;
}
