public class Motocicleta {
	private String color;
	private String modelo;
	private String marca;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Motocicleta de la marca: " + marca + ", de modelo: " + modelo
				+ " y de color " + color;
	}
}
