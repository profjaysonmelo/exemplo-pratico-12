
public class Quadrado extends Forma{

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}
	public Quadrado() {
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public String desenhar() {
		return "Desenhando um quadrado de área: " + this.lado * this.lado + " m²";
	}
	
}
