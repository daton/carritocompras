package educarvr.carritocompras;

import educarvr.carritocompras.domain.Producto;
import educarvr.carritocompras.domain.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarritocomprasApplication implements CommandLineRunner {
@Autowired
	Producto a;
@Autowired
Producto b;
@Autowired
Producto c;

@Autowired
	ShoppingCart carrito1;
@Autowired
ShoppingCart carrito2;

	public static void main(String[] args) {
		SpringApplication.run(CarritocomprasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		carrito1.agarArticulo(a);
		carrito1.agarArticulo(b);

		//carrito dos
		carrito2.agarArticulo(c);

		//Contenidos de carritos
		System.out.println("Carrito 1 "+carrito1.getArticulos());
		System.out.println("Carrito 2 "+carrito2.getArticulos());

	}
}
