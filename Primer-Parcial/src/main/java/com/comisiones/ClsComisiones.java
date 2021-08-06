
package com.comisiones;

import com.Gastos.ClsGastos;

public class ClsComisiones {
    private String[][]comisiones;
    private static final int NUMERO_UNIDADES =0;
    private static final int DESCRIPCIÓN =1;
    private static final int VALOR_FACTURA =2;
    private static final int GASTO_VALOR =3;
    private static final int GASTO_PESO =4;
    private static final int COSTOxUNIDAD =5;
    private static final int COSTO_TOTAL =6;
    private int filaActual = 0;
    
    private final int MAX_FILAS = 5; 
    private final int MAX_COLUMNAS = 7; 
    private int totalFilas=0;
    
    public ClsComisiones(int filas){
        
      if (filas > MAX_FILAS){
       throw (new IllegalArgumentException());//lanzamos la excepcion
      }else{
          totalFilas = filas;
          comisiones = new String[totalFilas][MAX_COLUMNAS];
      }  
        
        
    }
   
    public String AgregarVendedorMatriz(ClsGastos vende){
       
        if (filaActual >= MAX_FILAS){
            return "Ya llegaste al final";
        }else{
            comisiones[filaActual][NUMERO_UNIDADES]=vende.getNumero_Unidades()+"";
            comisiones[filaActual][DESCRIPCIÓN]=vende.getDescripcion();
            comisiones[filaActual][VALOR_FACTURA]=vende.getValor_Factura()+"";
            comisiones[filaActual][GASTO_VALOR]=vende.getGasto_valor()+"";
            comisiones[filaActual][GASTO_PESO]=vende.getGasto_peso()+"";
            comisiones[filaActual][COSTO_TOTAL]=vende.getCosto_total()+"";
            
            
            filaActual = filaActual+1;
        }
        return"ok";
    }
    
    public  void imprimirDecorado(){
       
       for (int x = 0; x < comisiones.length; x++) {
            System.out.print("|");
            for (int y = 0; y < comisiones[x].length; y++) {
                System.out.print(comisiones[x] [y]);
                if (y != comisiones[x].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }
    }
     
     public double sumaFila(int fila){
        double total=0;
        for (int y=2; y<5; y++){
            String fil = comisiones[fila][y];
            total = total + Double.valueOf(fil);
            
        }
        comisiones[fila][COSTOxUNIDAD]=total+"";
       
        return total;
     }
     
}