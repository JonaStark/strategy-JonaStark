package miTiendita.descuento;
import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class MenonitaDescuento implements IDesctoStrategy {

    @Override
    public double getDescto(Venta v) {
        double descTotal=0;

        for (LineaDeDetalle lista : v.getLd()) {
            if(lista.getP().getClave()==(1)){
                descTotal+=(lista.getCtd()*lista.getP().getPunit())*.10;
            }
            if(lista.getP().getClave()==(2)){
                descTotal+=(lista.getCtd()*lista.getP().getPunit())*.10;
            }
            if(lista.getP().getClave()==(3)){
                descTotal+=(lista.getCtd()*lista.getP().getPunit())*.10;
            }
            if(lista.getP().getClave()==(5)){
                descTotal+=(lista.getCtd()*lista.getP().getPunit())*.10;
            }
        }
        return descTotal;
    }
}
