
public class Triangulo extends Forma{

	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public String desenhar() {
		return "Desenhando um tri�ngulo de �rea: " + this.base * this.altura + " m�";
	}
	
}
