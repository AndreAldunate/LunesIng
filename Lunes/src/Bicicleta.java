public class Bicicleta {
	private String marca;
	private String color;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Bicicleta de la marca " + marca + " y de color " + color;
	}
}
