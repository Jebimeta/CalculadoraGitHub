/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Jes�s Ben�tez Cerezo
 */
public class Calculadora {

  // Atributos
  // Con car�cter general los atributos se declaran como privados
  public String marca;
  private String modelo;
  private String nserie;

  private Scanner s;

  // Un atributo est�tico solo es accesible desde un m�todo est�tico
  private static int nObjetos;

// M�todo constructor
// El m�todo constructor se llama igual que la clase y sirve para para determinar
// las caracter�sticas del objeto a trav�s de sus par�metros
// Est� tan estandarizado que los constructores y los getters y setters pueden
// crearse de forma autom�tica desde Source->Insert Code
  public Calculadora(String marca, String modelo, String nserie) {
    this.marca = marca;
    this.modelo = modelo;
    this.nserie = nserie;
    nObjetos++;
  }

  // Constructores vac�os
  // Sirven para sobrecargar los m�todos de un objeto para que los par�metros que
  // haya que pasarle puedan ser distintos. Lo crearemos vac�o y le pasaremos los
  // par�metros a trav�s de los m�todos setters
  public Calculadora() {

  }

// M�todos
  public double suma(double n1, double n2) {
    return n1 + n2;
  }

  public double resta(double n1, double n2) {
    return n1 - n2;
  }

  public double multiplica(double n1, double n2) {
    return n1 * n2;
  }

  public double divide(double n1, double n2) {
    return n1 / n2;
  }
  
  public double modulo(double n1, double n2){
    return n1 % n2;
  }

  // M�todos Getters y Setters
  // M�todos para poder acceder a los atributos declarados como privados
  // Con los getters puede obtenerse informaci�n, mientras que con los setters pueden
  // modificarse sus valores
  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public static int getnObjetos() {
    return nObjetos;
  }

  public static void setnObjetos(int nObjetos) {
    Calculadora.nObjetos = nObjetos;
  }

}
