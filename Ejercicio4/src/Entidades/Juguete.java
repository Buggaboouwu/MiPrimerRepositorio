package Entidades;

public class Juguete {

	private long sku;
	private String material;
	private String empresa;
	private String edad;
	
	public Juguete() {
		
	}

	public Juguete(long sku, String material, String empresa, String edad) {
		super();
		this.sku = sku;
		this.material = material;
		this.empresa = empresa;
		this.edad = edad;
	}

	public long getSku() {
		return sku;
	}

	public void setSku(long sku) {
		this.sku = sku;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Juguete [sku=" + sku + ", material=" + material + ", empresa=" + empresa + ", edad=" + edad + "]";
	}
	
	
}
