/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoramvc.controlador;

import calculadoramvc.modelo.CalculadoraModelo;
import calculadoramvc.vista.CalculadoraVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraControlador {

    private CalculadoraVista vista;
    private CalculadoraModelo modelo;

    public CalculadoraControlador(CalculadoraVista vista, CalculadoraModelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        iniciarEventos();
    }

    public void iniciarEventos() {
        vista.getbUno().addActionListener(new Acciones());
        vista.getbDos().addActionListener(new Acciones());
        vista.getbTres().addActionListener(new Acciones());
        vista.getbCuatro().addActionListener(new Acciones());
        vista.getbCinco().addActionListener(new Acciones());
        vista.getbSeis().addActionListener(new Acciones());
        vista.getbSiete().addActionListener(new Acciones());
        vista.getbOcho().addActionListener(new Acciones());
        vista.getbNueve().addActionListener(new Acciones());
        vista.getbCero().addActionListener(new Acciones());
        vista.getbSumar().addActionListener(new Acciones());
        vista.getbRestar().addActionListener(new Acciones());
        vista.getbMultiplicar().addActionListener(new Acciones());
        vista.getbDividir().addActionListener(new Acciones());
        vista.getbPotencia().addActionListener(new Acciones());
        vista.getbRaiz().addActionListener(new Acciones());
        vista.getbPorcentaje().addActionListener(new Acciones());
        vista.getbIgual().addActionListener(new Acciones());
        vista.getbLimpiar().addActionListener(new Acciones());
        vista.getbDecimal().addActionListener(new Acciones());
    }

    class Acciones implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                Object valor = e.getSource();
                if (valor == vista.getbLimpiar()) {
                    vista.limpiarPantalla();
                    modelo.limpiar();
                }
                if (valor == vista.getbIgual()) {
                    //vista.limpiarPantalla();
                    modelo.calcular(modelo.getNumero1(), modelo.getNumero2(), modelo.getOperacion());
                    vista.setValorPantalla(String.valueOf(modelo.getResultado()));
                }
                if (modelo.numeroExiste()) {
                    String temp = vista.getValorPantalla();
                    if (modelo.operacionExiste()) {
                        String[] operacion;
                        if (valor == vista.getbUno()) {
                            System.out.println();
                            temp = vista.getValorPantalla() + "1";
                            vista.setValorPantalla(temp);
                            operacion = temp.split("\\" + modelo.getOperacion());
                            modelo.setNumero1(Double.parseDouble(operacion[0]));
                            modelo.setNumero2(Double.parseDouble(operacion[1]));

                        } else if (valor == vista.getbDos()) {
                            temp = vista.getValorPantalla() + "2";
                            vista.setValorPantalla(temp);
                            operacion = temp.split("\\" + modelo.getOperacion());
                            modelo.setNumero1(Double.parseDouble(operacion[0]));
                            modelo.setNumero2(Double.parseDouble(operacion[1]));

                        } else if (valor == vista.getbTres()) {
                            temp = vista.getValorPantalla() + "3";
                            vista.setValorPantalla(temp);
                            operacion = temp.split("\\" + modelo.getOperacion());
                            modelo.setNumero1(Double.parseDouble(operacion[0]));
                            modelo.setNumero2(Double.parseDouble(operacion[1]));

                        } else if (valor == vista.getbCuatro()) {
                            temp = vista.getValorPantalla() + "4";
                            vista.setValorPantalla(temp);
                            operacion = temp.split("\\" + modelo.getOperacion());
                            modelo.setNumero1(Double.parseDouble(operacion[0]));
                            modelo.setNumero2(Double.parseDouble(operacion[1]));

                        } else if (valor == vista.getbCinco()) {
                            temp = vista.getValorPantalla() + "5";
                            vista.setValorPantalla(temp);
                            operacion = temp.split("\\" + modelo.getOperacion());
                            modelo.setNumero1(Double.parseDouble(operacion[0]));
                            modelo.setNumero2(Double.parseDouble(operacion[1]));
                        } else if (valor == vista.getbSeis()) {
                            temp = vista.getValorPantalla() + "6";
                            vista.setValorPantalla(temp);
                            operacion = temp.split("\\" + modelo.getOperacion());
                            modelo.setNumero1(Double.parseDouble(operacion[0]));
                            modelo.setNumero2(Double.parseDouble(operacion[1]));
                        } else if (valor == vista.getbSiete()) {
                            temp = vista.getValorPantalla() + "7";
                            vista.setValorPantalla(temp);
                            operacion = temp.split("\\" + modelo.getOperacion());
                            modelo.setNumero1(Double.parseDouble(operacion[0]));
                            modelo.setNumero2(Double.parseDouble(operacion[1]));
                        } else if (valor == vista.getbOcho()) {
                            temp = vista.getValorPantalla() + "8";
                            vista.setValorPantalla(temp);
                            operacion = temp.split("\\" + modelo.getOperacion());
                            modelo.setNumero1(Double.parseDouble(operacion[0]));
                            modelo.setNumero2(Double.parseDouble(operacion[1]));
                        } else if (valor == vista.getbNueve()) {
                            temp = vista.getValorPantalla() + "9";
                            vista.setValorPantalla(temp);
                            operacion = temp.split("\\" + modelo.getOperacion());
                            modelo.setNumero1(Double.parseDouble(operacion[0]));
                            modelo.setNumero2(Double.parseDouble(operacion[1]));
                        } else if (valor == vista.getbCero()) {
                            temp = vista.getValorPantalla() + "0";
                            vista.setValorPantalla(temp);
                            operacion = temp.split("\\" + modelo.getOperacion());
                            modelo.setNumero1(Double.parseDouble(operacion[0]));
                            modelo.setNumero2(Double.parseDouble(operacion[1]));
                        } else if (valor == vista.getbSumar()) {
                            vista.limpiarPantalla();
                            modelo.calcular(modelo.getNumero1(), modelo.getNumero2(), modelo.getOperacion());
                            vista.setValorPantalla(String.valueOf(modelo.getResultado()));
                            modelo.setOperacion("+");
                            vista.setValorPantalla(vista.getValorPantalla() + "+");
                        } else if (valor == vista.getbRestar()) {
                            vista.limpiarPantalla();
                            modelo.calcular(modelo.getNumero1(), modelo.getNumero2(), modelo.getOperacion());
                            vista.setValorPantalla(String.valueOf(modelo.getResultado()));
                            modelo.setOperacion("-");
                            vista.setValorPantalla(vista.getValorPantalla() + "-");
                        } else if (valor == vista.getbMultiplicar()) {
                            vista.limpiarPantalla();
                            modelo.calcular(modelo.getNumero1(), modelo.getNumero2(), modelo.getOperacion());
                            vista.setValorPantalla(String.valueOf(modelo.getResultado()));
                            modelo.setOperacion("*");
                            vista.setValorPantalla(vista.getValorPantalla() + "*");
                        } else if (valor == vista.getbDividir()) {
                            vista.limpiarPantalla();
                            modelo.calcular(modelo.getNumero1(), modelo.getNumero2(), modelo.getOperacion());
                            vista.setValorPantalla(String.valueOf(modelo.getResultado()));
                            modelo.setOperacion("÷");
                            vista.setValorPantalla(vista.getValorPantalla() + "÷");
                        } else if (valor == vista.getbPotencia()) {
                            vista.limpiarPantalla();
                            modelo.calcular(modelo.getNumero1(), modelo.getNumero2(), modelo.getOperacion());
                            vista.setValorPantalla(String.valueOf(modelo.getResultado()));
                            modelo.setOperacion("^");
                            vista.setValorPantalla(vista.getValorPantalla() + "^");
                        } else if (valor == vista.getbRaiz()) {
                            vista.limpiarPantalla();
                            modelo.calcular(modelo.getNumero1(), modelo.getNumero2(), modelo.getOperacion());
                            vista.setValorPantalla(String.valueOf(modelo.getResultado()));
                            modelo.setOperacion("√");
                            vista.setValorPantalla(vista.getValorPantalla() + "√");
                        } else if (valor == vista.getbPorcentaje()) {
                            vista.limpiarPantalla();
                            modelo.calcular(modelo.getNumero1(), modelo.getNumero2(), modelo.getOperacion());
                            vista.setValorPantalla(String.valueOf(modelo.getResultado()));
                            modelo.setOperacion("%");
                            vista.setValorPantalla(vista.getValorPantalla() + "%");
                        } else if (valor == vista.getbDecimal()) {
                            temp = vista.getValorPantalla() + ".";
                            String[] parte = temp.split(".");
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(parte[0]));
                        }
                    } else {
                        if (valor == vista.getbUno()) {
                            temp = vista.getValorPantalla() + "1";
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(temp));
                        } else if (valor == vista.getbDos()) {
                            temp = vista.getValorPantalla() + "2";
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(temp));
                        } else if (valor == vista.getbTres()) {
                            temp = vista.getValorPantalla() + "3";
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(temp));

                        } else if (valor == vista.getbCuatro()) {
                            temp = vista.getValorPantalla() + "4";
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(temp));

                        } else if (valor == vista.getbCinco()) {
                            temp = vista.getValorPantalla() + "5";
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(temp));
                        } else if (valor == vista.getbSeis()) {
                            temp = vista.getValorPantalla() + "6";
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(temp));
                        } else if (valor == vista.getbSiete()) {
                            temp = vista.getValorPantalla() + "7";
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(temp));
                        } else if (valor == vista.getbOcho()) {
                            temp = vista.getValorPantalla() + "8";
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(temp));
                        } else if (valor == vista.getbNueve()) {
                            temp = vista.getValorPantalla() + "9";
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(temp));
                        } else if (valor == vista.getbCero()) {
                            temp = vista.getValorPantalla() + "0";
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(temp));
                        } else if (valor == vista.getbDecimal()) {
                            temp = vista.getValorPantalla() + ".";
                            String[] parte = temp.split(".");
                            vista.setValorPantalla(temp);
                            modelo.setNumero1(Double.parseDouble(parte[0]));
                        } else if (valor == vista.getbSumar()) {
                            modelo.setOperacion("+");
                            vista.setValorPantalla(vista.getValorPantalla() + "+");
                        } else if (valor == vista.getbRestar()) {
                            modelo.setOperacion("-");
                            vista.setValorPantalla(vista.getValorPantalla() + "-");
                        } else if (valor == vista.getbMultiplicar()) {
                            modelo.setOperacion("*");
                            vista.setValorPantalla(vista.getValorPantalla() + "*");
                        } else if (valor == vista.getbDividir()) {
                            modelo.setOperacion("÷");
                            vista.setValorPantalla(vista.getValorPantalla() + "÷");
                        } else if (valor == vista.getbPotencia()) {
                            modelo.setOperacion("^");
                            vista.setValorPantalla(vista.getValorPantalla() + "^");
                        } else if (valor == vista.getbRaiz()) {
                            modelo.setOperacion("√");
                            vista.setValorPantalla(vista.getValorPantalla() + "√");
                        } else if (valor == vista.getbPorcentaje()) {
                            modelo.setOperacion("%");
                            vista.setValorPantalla(vista.getValorPantalla() + "%");
                        }
                    }
                } else {
                    if (valor == vista.getbUno()) {
                        vista.setValorPantalla("1");
                        modelo.setNumero1(1);
                    } else if (valor == vista.getbDos()) {
                        vista.setValorPantalla("2");
                        modelo.setNumero1(2);
                    } else if (valor == vista.getbTres()) {
                        vista.setValorPantalla("3");
                        modelo.setNumero1(3);
                    } else if (valor == vista.getbCuatro()) {
                        vista.setValorPantalla("4");
                        modelo.setNumero1(4);
                    } else if (valor == vista.getbCinco()) {
                        vista.setValorPantalla("5");
                        modelo.setNumero1(5);
                    } else if (valor == vista.getbSeis()) {
                        vista.setValorPantalla("6");
                        modelo.setNumero1(6);
                    } else if (valor == vista.getbSiete()) {
                        vista.setValorPantalla("7");
                        modelo.setNumero1(7);
                    } else if (valor == vista.getbOcho()) {
                        vista.setValorPantalla("8");
                        modelo.setNumero1(8);
                    } else if (valor == vista.getbNueve()) {
                        vista.setValorPantalla("9");
                        modelo.setNumero1(9);
                    }
                }

            } catch (Exception ex) {
               // System.out.println("Ocurrió un error " + ex);
            }
        }

    }

}
