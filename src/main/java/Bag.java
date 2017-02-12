import java.util.ArrayList;
import java.util.List;

public class Bag {
	
	Duenio duenio;
	List<User> colaboradores;
	List<Contenido> playlist;
	List<Bag> bagsInteresados;
	List<Hit> cambios;
	
	public Bag(){
		this.colaboradores = new ArrayList<>();
		this.playlist = new ArrayList<>();
		this.bagsInteresados = new ArrayList<>();
		this.cambios = new ArrayList<>();
	}
	
	public void importarBag(Bag unBag){
		
	}
	
	public void aplicarHit(User user, Hit unHit){
		if (puedeEditar(user)){
			unHit.aplicar(playlist);
			bagsInteresados.forEach(aBag->aBag.aplicarHit(user, unHit));
		} else {
			//throws new NoPuedeEditarException
			System.out.println("no puede tocar bag");
		}
		
	}
	
	public List<Contenido> enviarPlaylist(Bag bagReceptor){
		bagsInteresados.add(bagReceptor);
		bagReceptor.agregarColaborador(duenio);
		colaboradores.forEach(colab->bagReceptor.agregarColaborador(colab));
		return playlist;
	}
	
	public void agregarColaborador(User colaborador){
		colaboradores.add(colaborador);
	}
	
	public Boolean puedeEditar(User user){
		return (duenio==user) || (colaboradores.contains(user));
	}
	
	public List<Contenido> getContenido(){
		return playlist;
	}

}
