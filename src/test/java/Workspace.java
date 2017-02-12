
public class Workspace {

	public static void main(String[] args) {
		User colab = new User();
		User desconocido = new User();
		Bag bag1 = new Bag();
		bag1.agregarColaborador(colab);
		System.out.println(bag1.getContenido());
		Agregar agrH = new Agregar();
		agrH.contenidoAfectado = new Multimedia();
		bag1.aplicarHit(colab, agrH);
		System.out.println(bag1.getContenido());
		Agregar agrHT = new Agregar();
		agrHT.contenidoAfectado = new Texto();
		bag1.aplicarHit(desconocido, agrHT);
		System.out.println(bag1.getContenido());
	}

}
