package com.mycompany.primer.parcial;

import com.Gastos.ClsGastos;
import com.comisiones.ClsComisiones;


public class Clsprincipal {
        
    public static void main(String[] args) {
        ClsComisiones co = new ClsComisiones(5);
        ClsGastos x= new ClsGastos();
      
        x.llenaInformacion();
        System.out.println("\nPaso 9");
        x.setNumero_Unidades(x.getCemento()); 
        x.setDescripcion("BOLSA DE CEMENTO");
        x.setValor_Factura(x.getValorCemento());
        x.setGasto_valor(x.getValorCemento()*x.getResul3());
        x.setGasto_peso(x.getResul6()*x.getPcemento());
        x.setCosto_total(x.getCemento()*111.42);
        co.AgregarVendedorMatriz(x);
        
        x.setNumero_Unidades (x.getCal()); 
        x.setDescripcion("BOLSAS CAL       ");
        x.setValor_Factura(x.getValorcal());
        x.setGasto_valor(Math.round(x.getValorcal()*x.getResul3()));
        x.setGasto_peso(x.getResul6()*x.getPcal());
        x.setCosto_total(x.getCal()*64.28);
        co.AgregarVendedorMatriz(x);
        
        x.setNumero_Unidades (x.getTuboPc());
        x.setDescripcion("TUBOS PC          ");
        x.setValor_Factura(x.getValortuboPc());
        x.setGasto_valor(x.getValortuboPc()*x.getResul3());
        x.setGasto_peso(x.getResul6()*x.getPtuboPc());
        x.setCosto_total(Math.round(x.getTuboPc()*75.26));
        co.AgregarVendedorMatriz(x);
        
        x.setNumero_Unidades(x.getHierro());
        x.setDescripcion("QUINTALES DE HIERRO");
        x.setValor_Factura(x.getValorhierro());
        x.setGasto_valor(x.getValorhierro()*x.getResul3());
        x.setGasto_peso(x.getResul6()*x.getPhierro());
        x.setCosto_total(x.getHierro()*468.7);
        co.AgregarVendedorMatriz(x);
        
        x.setNumero_Unidades(00);
        x.setDescripcion("Gran toal          ");
        x.setValor_Factura(00);
        x.setGasto_valor(00);
        x.setGasto_peso(00);
        x.setCosto_total((x.getCemento()*111.42)+(x.getCal()*64.28)+(Math.round(x.getTuboPc()*75.26))+(x.getHierro()*468.7));
        co.AgregarVendedorMatriz(x);
      
        co.sumaFila(0);
        co.sumaFila(1);
        co.sumaFila(2);
        co.sumaFila(3);
        co.sumaFila(4);
        
        co.imprimirDecorado();
        
        System.out.println("\nPaso 10");
        
        System.out.println("Total Según Factura       = Q."+x.getResultado());
        System.out.println("Total de Gastos al valor  = Q."+x.getResul2()  );
        System.out.println("Total de Gasto al peso    = Q."+x.getResul5() );
        double total;
        total=x.getResultado()+x.getResul2()+x.getResul5();
       
        System.out.println("\nGRAN TOTAL             = Q."+total);

        
    }
}
   

