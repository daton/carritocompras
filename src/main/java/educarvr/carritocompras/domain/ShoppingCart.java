package educarvr.carritocompras.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

/*
singleton . CRea una sola instancia del bean por contendedor
prototype  Crea una nueva instancia cada vez que se requiera una nueva
request    Crea una sola instancia por requets a http
session    CRea una sola instania por session de http
globalSession   Crea una sola instanccia por sesion global de http.


 */
@Scope("prototype")
public class ShoppingCart {
    private List<Producto> articulos=new ArrayList<>();

    public List<Producto> getArticulos() {
        return articulos;
    }

    public void agarArticulo(Producto articulo) {
        articulos.add(articulo);
    }
}
