package spotify.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class artista {
	@Id
	public Integer Id_artista;

	@Column(length = 32, nullable = false)
	public String Nombre;
}
