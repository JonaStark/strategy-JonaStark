package miTiendita.descuento;

import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class FrutaDescuento implements IDesctoStrategy {

    @Override
    public double getDescto(Venta v) {
        double descTotal=0;

        for (LineaDeDetalle lista : v.getLd()) {
            if(lista.getP().getClave()==(6)){
                descTotal+=(lista.getCtd()*lista.getP().getPunit())*.15;
            }
            if(lista.getP().getClave()==(7)){
                descTotal+=(lista.getCtd()*lista.getP().getPunit())*.15;
            }
        }

        return descTotal;
    }
}
