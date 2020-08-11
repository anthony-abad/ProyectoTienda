import java.util.ArrayList;

public class Main {
	
	public static void mostrarProductos (ArrayList<Producto> p) {
		for (int i=0;i<p.size();i++) {
			System.out.println(p.get(i));
		}
	}
	
	public static void calcularPrecio (ArrayList<Producto> p) {
		System.out.println("CALCULANDO... ");
		double precio = 0.00d;
		double iva = 0.00d;
		double total = 0.00d;
		for (int i=0;i<p.size();i++) {
			precio = p.get(i).getPrecio();
			iva = precio*0.09;
			total = precio+iva;
			p.get(i).setPrecio(total);
			
		}
	}
	
	
public static void main(String[] args) {
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		
		Producto p1 = new Producto(1512, "ARROZ", 12.20, 12, 06, 2020, " SACO DE ARROZ ");
		Producto p2 = new Producto(1620, "GELATINA", 15.20, 12, 06, 2020, " SACO DE ARROZ ");
		Producto p3 = new Producto(1715, "FIDEOS", 12.20, 12, 06, 2020, " SACO DE ARROZ ");
		Producto p4 = new Producto(1950, "", 15.20, 12, 06, 2020, " SACO DE ARROZ ");
		Producto p5 = new Producto(1814, "ARROZ", 12.20, 12, 06, 2020, " SACO DE ARROZ ");
		Producto p6 = new Producto(1125, "ARROZ", 15.20, 12, 06, 2020, " SACO DE ARROZ ");
		Producto p7 = new Producto(1754, "ARROZ", 12.20, 12, 06, 2020, " SACO DE ARROZ ");
		Producto p8 = new Producto(1245, "ARROZ", 15.20, 12, 06, 2020, " SACO DE ARROZ ");
		Producto p9 = new Producto(2706, "ARROZ", 12.20, 12, 06, 2020, " SACO DE ARROZ ");
		Producto p10 = new Producto(3024, "ARROZ", 15.20, 12, 06, 2020, " SACO DE ARROZ ");
		
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p5);
		productos.add(p6);
		productos.add(p7);
		productos.add(p8);
		productos.add(p9);
		productos.add(p10);
		
		mostrarProductos(productos);
		calcularPrecio(productos);
		System.out.println(p1.getPrecio());
		System.out.println(p2.getPrecio());
		
		
	}
}
