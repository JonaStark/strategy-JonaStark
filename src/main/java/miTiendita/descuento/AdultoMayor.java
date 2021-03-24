package miTiendita.descuento;
import miTiendita.venta.LineaDeDetalle;
import miTiendita.venta.Venta;

public class AdultoMayor implements IDesctoStrategy {
    @Override
    public double getDescto(Venta v) {
        double descTotal=0;

        for(LineaDeDetalle lista : v.getLd()){
            descTotal +=(lista.getCtd()*lista.getP().getPunit())*0.05;

        }
        return descTotal;
    }    
}