
public class Producto {
	int codigo;
	String nombre,descripcion;
	double precio;
	int dia,mes,anho;
	
	public Producto(int codigo, String nombre, double precio, int dia, int mes, int anho, String descripcion) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
		this.dia = dia;
		this.mes = mes;
		this.anho = anho;
		this.descripcion = descripcion;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnho() {
		return anho;
	}
	public void setAnho(int anho) {
		this.anho = anho;
	}
	
	
	
	
	
	@Override
	public String toString() {
		String a = "NOMBRE DEL PRODUCTO: "+nombre +" DESCRIPCION: "+descripcion+" CODIGO: "+codigo+" PRECIO: "+precio+ " FECHA: "+ dia+ "/"+mes+"/"+anho;
		return a;
	}
	
	
}
