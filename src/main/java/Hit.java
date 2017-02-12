import java.util.List;

public abstract class Hit {
	
//	Hit previo;
	String descripcion;
	Contenido contenidoAfectado;
	
	public abstract void aplicar(List<Contenido> playlist);
	
	public abstract void deshacer(List<Contenido> playlist);

}
