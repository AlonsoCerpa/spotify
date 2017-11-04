package spotify.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class usernormal extends usuario{
	
	@Column(nullable = false)
	public Boolean estado;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "seguidor",
		joinColumns = @JoinColumn(name = "usuario_id", referencedColumnName = "Id"),
		inverseJoinColumns = @JoinColumn(name = "sigue_id", referencedColumnName = "Id")
	)
	public List<usernormal> sigue;
	
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	public List<usernormal> getSigue() {
		return sigue;
	}
	public void setSigue(List<usernormal> sigue) {
		this.sigue = sigue;
	}
	
	
}
