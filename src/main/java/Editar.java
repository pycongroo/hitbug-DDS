import java.util.List;

public class Editar extends Hit {
	
	private Contenido nuevoContenido;

	@Override
	public void aplicar(List<Contenido> playlist) {
		playlist.remove(contenidoAfectado);
		playlist.add(nuevoContenido);
	}

	@Override
	public void deshacer(List<Contenido> playlist) {
		playlist.remove(nuevoContenido);
		playlist.add(contenidoAfectado);
	}

}
