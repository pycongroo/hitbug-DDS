
public abstract class Contenido {
	
	String nombre;
	
	public String toString(){
		return String.format("{'tipo':%s, 'nombre':%s}",
			this.getClass().toString(), nombre);
	}
	
	public String extras(){
		return "";
	}

}
