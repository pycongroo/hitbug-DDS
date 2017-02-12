import java.util.List;

public class Remover extends Hit {

	@Override
	public void aplicar(List<Contenido> playlist) {
		playlist.remove(contenidoAfectado);
	}

	@Override
	public void deshacer(List<Contenido> playlist) {
		playlist.add(contenidoAfectado);
	}

}
