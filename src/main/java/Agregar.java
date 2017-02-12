import java.util.List;

public class Agregar extends Hit {

	@Override
	public void aplicar(List<Contenido> playlist) {
		playlist.add(contenidoAfectado);
	}

	@Override
	public void deshacer(List<Contenido> playlist) {
		playlist.remove(contenidoAfectado);
	}

}
