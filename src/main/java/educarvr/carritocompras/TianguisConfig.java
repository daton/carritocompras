package educarvr.carritocompras;

import educarvr.carritocompras.domain.Libro;
import educarvr.carritocompras.domain.Producto;
import educarvr.carritocompras.domain.Verdura;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("educarvr.carritocompras.domain")
public class TianguisConfig {

    @Bean
    Producto a(){
        Producto l1=new Libro("Los anunaki");

        l1.setNombre("Libro sobre los anunaqio");
        l1.setPrecio(500);
        return  l1;
    }

    @Bean
    Producto b(){
        Producto l1=new Libro("El camino del Shaman");

        l1.setNombre("Libro sobre los chamanes");
        l1.setPrecio(200);
        return  l1;
    }

    @Bean
    Producto c(){
        Producto l1=new Verdura(true);

        l1.setNombre("Zanahorias");
        l1.setPrecio(45);
        return  l1;
    }


}
