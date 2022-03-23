
public class Circulo extends Forma {

	private double raio;
	private static final double PI = 3.1415;
	
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public String desenhar() {
		return "Desenhando um círculo de área: " + PI * raio * raio + " m²";
	}
}
