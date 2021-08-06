package com.Gastos;

import java.util.Scanner;


/**
 *
 * @author PC
 */
public class ClsGastos {

    /**
     * @return the numero_Unidades
     */
    public double getNumero_Unidades() {
        return numero_Unidades;
    }

    /**
     * @param numero_Unidades the numero_Unidades to set
     */
    public void setNumero_Unidades(double numero_Unidades) {
        this.numero_Unidades = numero_Unidades;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Valor_Factura
     */
    public double getValor_Factura() {
        return Valor_Factura;
    }

    /**
     * @param Valor_Factura the Valor_Factura to set
     */
    public void setValor_Factura(double Valor_Factura) {
        this.Valor_Factura = Valor_Factura;
    }

    /**
     * @return the Gasto_valor
     */
    public double getGasto_valor() {
        return Gasto_valor;
    }

    /**
     * @param Gasto_valor the Gasto_valor to set
     */
    public void setGasto_valor(double Gasto_valor) {
        this.Gasto_valor = Gasto_valor;
    }

    /**
     * @return the Gasto_peso
     */
    public double getGasto_peso() {
        return Gasto_peso;
    }

    /**
     * @param Gasto_peso the Gasto_peso to set
     */
    public void setGasto_peso(double Gasto_peso) {
        this.Gasto_peso = Gasto_peso;
    }

    /**
     * @return the CostoxUnidad
     */
    public double getCostoxUnidad() {
        return CostoxUnidad;
    }

    /**
     * @param CostoxUnidad the CostoxUnidad to set
     */
    public void setCostoxUnidad(double CostoxUnidad) {
        this.CostoxUnidad = CostoxUnidad;
    }

    /**
     * @return the Costo_total
     */
    public double getCosto_total() {
        return Costo_total;
    }

    /**
     * @param Costo_total the Costo_total to set
     */
    public void setCosto_total(double Costo_total) {
        this.Costo_total = Costo_total;
    }

    /**
     * @return the Cemento
     */
    public double getCemento() {
        return Cemento;
    }

    /**
     * @param Cemento the Cemento to set
     */
    public void setCemento(double Cemento) {
        this.Cemento = Cemento;
    }

    /**
     * @return the cal
     */
    public double getCal() {
        return cal;
    }

    /**
     * @param cal the cal to set
     */
    public void setCal(double cal) {
        this.cal = cal;
    }

    /**
     * @return the tuboPc
     */
    public double getTuboPc() {
        return tuboPc;
    }

    /**
     * @param tuboPc the tuboPc to set
     */
    public void setTuboPc(double tuboPc) {
        this.tuboPc = tuboPc;
    }

    /**
     * @return the hierro
     */
    public double getHierro() {
        return hierro;
    }

    /**
     * @param hierro the hierro to set
     */
    public void setHierro(double hierro) {
        this.hierro = hierro;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the valorCemento
     */
    public double getValorCemento() {
        return valorCemento;
    }

    /**
     * @param valorCemento the valorCemento to set
     */
    public void setValorCemento(double valorCemento) {
        this.valorCemento = valorCemento;
    }

    /**
     * @return the valorcal
     */
    public double getValorcal() {
        return valorcal;
    }

    /**
     * @param valorcal the valorcal to set
     */
    public void setValorcal(double valorcal) {
        this.valorcal = valorcal;
    }

    /**
     * @return the valortuboPc
     */
    public double getValortuboPc() {
        return valortuboPc;
    }

    /**
     * @param valortuboPc the valortuboPc to set
     */
    public void setValortuboPc(double valortuboPc) {
        this.valortuboPc = valortuboPc;
    }

    /**
     * @return the valorhierro
     */
    public double getValorhierro() {
        return valorhierro;
    }

    /**
     * @param valorhierro the valorhierro to set
     */
    public void setValorhierro(double valorhierro) {
        this.valorhierro = valorhierro;
    }

    /**
     * @return the pcemento
     */
    public double getPcemento() {
        return pcemento;
    }

    /**
     * @param pcemento the pcemento to set
     */
    public void setPcemento(double pcemento) {
        this.pcemento = pcemento;
    }

    /**
     * @return the pcal
     */
    public double getPcal() {
        return pcal;
    }

    /**
     * @param pcal the pcal to set
     */
    public void setPcal(double pcal) {
        this.pcal = pcal;
    }

    /**
     * @return the ptuboPc
     */
    public double getPtuboPc() {
        return ptuboPc;
    }

    /**
     * @param ptuboPc the ptuboPc to set
     */
    public void setPtuboPc(double ptuboPc) {
        this.ptuboPc = ptuboPc;
    }

    /**
     * @return the phierro
     */
    public double getPhierro() {
        return phierro;
    }

    /**
     * @param phierro the phierro to set
     */
    public void setPhierro(double phierro) {
        this.phierro = phierro;
    }

    /**
     * @return the seguro
     */
    public double getSeguro() {
        return seguro;
    }

    /**
     * @param seguro the seguro to set
     */
    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }

    /**
     * @return the impuestos
     */
    public double getImpuestos() {
        return impuestos;
    }

    /**
     * @param impuestos the impuestos to set
     */
    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }

    /**
     * @return the comisiones
     */
    public double getComisiones() {
        return comisiones;
    }

    /**
     * @param comisiones the comisiones to set
     */
    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    /**
     * @return the flete
     */
    public double getFlete() {
        return flete;
    }

    /**
     * @param flete the flete to set
     */
    public void setFlete(double flete) {
        this.flete = flete;
    }

    /**
     * @return the acarreo
     */
    public double getAcarreo() {
        return acarreo;
    }

    /**
     * @param acarreo the acarreo to set
     */
    public void setAcarreo(double acarreo) {
        this.acarreo = acarreo;
    }

    /**
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the resul2
     */
    public double getResul2() {
        return resul2;
    }

    /**
     * @param resul2 the resul2 to set
     */
    public void setResul2(double resul2) {
        this.resul2 = resul2;
    }

    /**
     * @return the resul3
     */
    public double getResul3() {
        return resul3;
    }

    /**
     * @param resul3 the resul3 to set
     */
    public void setResul3(double resul3) {
        this.resul3 = resul3;
    }

    /**
     * @return the resul4
     */
    public double getResul4() {
        return resul4;
    }

    /**
     * @param resul4 the resul4 to set
     */
    public void setResul4(double resul4) {
        this.resul4 = resul4;
    }

    /**
     * @return the resul5
     */
    public double getResul5() {
        return resul5;
    }

    /**
     * @param resul5 the resul5 to set
     */
    public void setResul5(double resul5) {
        this.resul5 = resul5;
    }

    /**
     * @return the resul6
     */
    public double getResul6() {
        return resul6;
    }

    /**
     * @param resul6 the resul6 to set
     */
    public void setResul6(double resul6) {
        this.resul6 = resul6;
    }

    private double numero_Unidades;
    private String Descripcion;
    private double Valor_Factura;
    private double Gasto_valor;
    private double Gasto_peso;
    private double CostoxUnidad;
    private double Costo_total;
    
    private  double Cemento=50; 
    private  double cal=150;
    private  double tuboPc =200;
    private  double hierro=50;
    
    private  String nombre;
    
    private double valorCemento=60; 
    private double valorcal=40;
    private double valortuboPc =55;
    private double valorhierro=350;
    
    private  double pcemento=50; 
    private  double pcal=20;
    private  double ptuboPc =10;
    private  double phierro=50;
    
    private double seguro = 3500;
    private double impuestos = 5000;
    private double comisiones = 200;
    
    private double flete = 2500;
    private double acarreo = 5000;

    private double resultado;
    private double resul2;
    private double resul3;
    private double resul4;
    private double resul5;
    private double resul6;
    
    public void llenaInformacion(){        
    Scanner t = new Scanner(System.in);
    
    System.out.println("PASO 1" );
    System.out.println(" 50  Cemento a 60  c/u = Q." + getCemento()*getValorCemento());
    System.out.println(" 150   cal   a 40  c/u = Q." + getCal()*getValorcal());
    System.out.println(" 200  TuboPC a 55  c/u = Q." + getTuboPc()*getValortuboPc());
    System.out.println(" 50   hierro a 350 c/u = Q." + getHierro()*getValorhierro());
       setResultado((getCemento()*getValorCemento())+(getCal()*getValorcal())+(getTuboPc()*getValortuboPc())+(getHierro()*getValorhierro()));
    System.out.println("\n Valor Total           = Q." + getResultado());
    
    System.out.println("\nPASO 2" );
    System.out.println("Seguro              = Q." + getSeguro());
    System.out.println("Impuestos           = Q." + getImpuestos());
    System.out.println("Comisiones Bancarias= Q." + getComisiones());
        setResul2(getSeguro() + getImpuestos() + getComisiones());
    System.out.println("\nTotal Gasto al Valor= Q." + getResul2());
    
    System.out.println("\nPASO 3" );   
        setResul3(getResul2() / getResultado());
    System.out.println("Coeficiente del gasto = " + getResul3());
    
    
    System.out.println("\nPASO 4" );
    System.out.println("Gasto al valor = " +getValorCemento()*getResul3());
    System.out.println("Gasto al valor = " +getValorcal()*getResul3() );
    System.out.println("Gasto al valor = " +getValortuboPc()*getResul3() );
    System.out.println("Gasto al valor = " +getValorhierro()*getResul3() );
    
    System.out.println("\nPASO 5" );
    System.out.println("50 kgs x  50 = " + getCemento()*getPcemento()+"kgs");
    System.out.println("20 kgs x 150 = " + getCal()*getPcal()+"kgs");
    System.out.println("10 kgs x 200 = " + getTuboPc()*getPtuboPc()+"kgs");
    System.out.println("50 kgs x  50 = " + getHierro()*getPhierro()+"kgs");
         setResul4((getCemento()*getPcemento())+(getCal()*getPcal())+(getTuboPc()*getPtuboPc())+(getHierro()*getPhierro()));
    System.out.println(" PESO TOTAL  = " + getResul4()+"Kilogramos");
    
    System.out.println("\nPASO 6" );
    System.out.println("Fletes                  = Q." + getFlete());
    System.out.println("Acarreo                 = Q." + getAcarreo());
        setResul5(getFlete() + getAcarreo());
    System.out.println("Total de gastos al peso = Q."+getResul5());
    
    System.out.println("\nPASO 7" );
    System.out.println("Q."+getResul5()+"/"+getResul4());
        setResul6(getResul5() / getResul4());
    System.out.println("Coeficiente de gasto al peso = "+ getResul6()); 
    
    System.out.println("\nPASO 8" );
    System.out.println("50 kgs x 0.75 = " +getResul6()*getPcemento()+"kgs");
    System.out.println("20 kgs x 0.75 = " +getResul6()*getPcal()+"kgs");
    System.out.println("10 kgs x 0.75 = " +getResul6()*getPtuboPc()+"kgs");
    System.out.println("50 kgs x 0.75 = " +getResul6()*getPhierro()+"kgs");
    }
    
}
    

