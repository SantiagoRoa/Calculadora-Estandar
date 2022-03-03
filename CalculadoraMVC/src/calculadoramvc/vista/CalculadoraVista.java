package calculadoramvc.vista;

import javax.swing.*;

public class CalculadoraVista extends JFrame {

    private JPanel calculadora;

    private JButton bCero, bUno, bDos, bTres, bCuatro, bCinco;
    private JButton bSeis, bSiete, bOcho, bNueve, bDiez;
    private JButton bSumar, bRestar, bMultiplicar, bDividir;
    private JButton bPotencia, bRaiz, bPorcentaje;
    private JButton bIgual, bLimpiar, bDecimal;

    private JTextField pantallaCalculos;

    public CalculadoraVista() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);
        setSize(325, 480);
        setLocationRelativeTo(null);
        setType(java.awt.Window.Type.UTILITY);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        iniciarPanel();
        iniciarEtiquetas();
    }

    private void iniciarPanel() {
        calculadora = new JPanel();
        this.getContentPane().add(calculadora);
        calculadora.setLayout(null);
    }

    private void iniciarEtiquetas() {

        iniciarCampos();
        iniciarBotones();
    }

    private void iniciarCampos() {
        pantallaCalculos = new JTextField();
        colocarCampos();
    }

    private void iniciarBotones() {
        bCero = new JButton();
        bUno = new JButton();
        bDos = new JButton();
        bTres = new JButton();
        bCuatro = new JButton();
        bCinco = new JButton();
        bSeis = new JButton();
        bSiete = new JButton();
        bOcho = new JButton();
        bNueve = new JButton();
        bSumar = new JButton();
        bRestar = new JButton();
        bMultiplicar = new JButton();
        bDividir = new JButton();
        bPotencia = new JButton();
        bRaiz = new JButton();
        bPorcentaje = new JButton();
        bIgual = new JButton();
        bLimpiar = new JButton();
        bDecimal = new JButton();
        colocarBotones();
    }

    private void colocarCampos() {
        pantallaCalculos.setEditable(false);
        pantallaCalculos.setFont(new java.awt.Font("Tahoma", 0, 20));
        pantallaCalculos.setHorizontalAlignment(JTextField.RIGHT);
        pantallaCalculos.setBounds(20, 15, 270, 50);
        calculadora.add(pantallaCalculos);
    }

    public void colocarBotones() {

        bDecimal.setFont(new java.awt.Font("Tahoma", 0, 20));
        bDecimal.setText(".");
        bDecimal.setBounds(20, 365, 60, 60);
        bDecimal.setFocusPainted(false);
        calculadora.add(bDecimal);

        bCero.setFont(new java.awt.Font("Tahoma", 0, 20));
        bCero.setText("0");
        bCero.setBounds(90, 365, 60, 60);
        bCero.setFocusPainted(false);
        calculadora.add(bCero);

        bUno.setFont(new java.awt.Font("Tahoma", 0, 20));
        bUno.setText("1");
        bUno.setBounds(20, 295, 60, 60);
        bUno.setFocusPainted(false);
        calculadora.add(bUno);

        bDos.setFont(new java.awt.Font("Tahoma", 0, 20));
        bDos.setText("2");
        bDos.setBounds(90, 295, 60, 60);
        bDos.setFocusPainted(false);
        calculadora.add(bDos);

        bTres.setFont(new java.awt.Font("Tahoma", 0, 20));
        bTres.setText("3");
        bTres.setBounds(160, 295, 60, 60);
        bTres.setFocusPainted(false);
        calculadora.add(bTres);

        bCuatro.setFont(new java.awt.Font("Tahoma", 0, 20));
        bCuatro.setText("4");
        bCuatro.setBounds(20, 225, 60, 60);
        bCuatro.setFocusPainted(false);
        calculadora.add(bCuatro);

        bCinco.setFont(new java.awt.Font("Tahoma", 0, 20));
        bCinco.setText("5");
        bCinco.setBounds(90, 225, 60, 60);
        bCinco.setFocusPainted(false);
        calculadora.add(bCinco);

        bSeis.setFont(new java.awt.Font("Tahoma", 0, 20));
        bSeis.setText("6");
        bSeis.setBounds(160, 225, 60, 60);
        bSeis.setFocusPainted(false);
        calculadora.add(bSeis);

        bSiete.setFont(new java.awt.Font("Tahoma", 0, 20));
        bSiete.setText("7");
        bSiete.setBounds(20, 155, 60, 60);
        bSiete.setFocusPainted(false);
        calculadora.add(bSiete);

        bOcho.setFont(new java.awt.Font("Tahoma", 0, 20));
        bOcho.setText("8");
        bOcho.setBounds(90, 155, 60, 60);
        bOcho.setFocusPainted(false);
        calculadora.add(bOcho);

        bNueve.setFont(new java.awt.Font("Tahoma", 0, 20));
        bNueve.setText("9");
        bNueve.setBounds(160, 155, 60, 60);
        bNueve.setFocusPainted(false);
        calculadora.add(bNueve);

        bSumar.setFont(new java.awt.Font("Tahoma", 0, 20));
        bSumar.setText("+");
        bSumar.setBounds(230, 365, 60, 60);
        bSumar.setFocusPainted(false);
        calculadora.add(bSumar);

        bRestar.setFont(new java.awt.Font("Tahoma", 0, 20));
        bRestar.setText("-");
        bRestar.setBounds(230, 295, 60, 60);
        bRestar.setFocusPainted(false);
        calculadora.add(bRestar);

        bMultiplicar.setFont(new java.awt.Font("Tahoma", 0, 20));
        bMultiplicar.setText("x");
        bMultiplicar.setBounds(230, 225, 60, 60);
        bMultiplicar.setFocusPainted(false);
        calculadora.add(bMultiplicar);

        bDividir.setFont(new java.awt.Font("Tahoma", 0, 20));
        bDividir.setText("÷");
        bDividir.setBounds(230, 155, 60, 60);
        bDividir.setFocusPainted(false);
        calculadora.add(bDividir);

        bPotencia.setFont(new java.awt.Font("Tahoma", 0, 20));
        bPotencia.setText("^");
        bPotencia.setBounds(160, 85, 60, 60);
        bPotencia.setFocusPainted(false);
        calculadora.add(bPotencia);

        bRaiz.setFont(new java.awt.Font("Tahoma", 0, 20));
        bRaiz.setText("√");
        bRaiz.setBounds(90, 85, 60, 60);
        bRaiz.setFocusPainted(false);
        calculadora.add(bRaiz);

        bPorcentaje.setFont(new java.awt.Font("Tahoma", 0, 20));
        bPorcentaje.setText("%");
        bPorcentaje.setBounds(20, 85, 60, 60);
        bPorcentaje.setFocusPainted(false);
        calculadora.add(bPorcentaje);

        bIgual.setFont(new java.awt.Font("Tahoma", 0, 20));
        bIgual.setText("=");
        bIgual.setBounds(160, 365, 60, 60);
        bIgual.setFocusPainted(false);
        calculadora.add(bIgual);

        bLimpiar.setFont(new java.awt.Font("Tahoma", 0, 20));
        bLimpiar.setText("C");
        bLimpiar.setBounds(230, 85, 60, 60);
        bLimpiar.setFocusPainted(false);
        calculadora.add(bLimpiar);
    }

    public String getValorPantalla() {
        return pantallaCalculos.getText();
    }
    
    public void setValorPantalla(String valor){
        pantallaCalculos.setText(valor);
    }
    
    public void limpiarPantalla(){
        pantallaCalculos.setText("");
    }

    public JPanel getCalculadora() {
        return calculadora;
    }

    public JButton getbCero() {
        return bCero;
    }

    public JButton getbUno() {
        return bUno;
    }

    public JButton getbDos() {
        return bDos;
    }

    public JButton getbTres() {
        return bTres;
    }

    public JButton getbCuatro() {
        return bCuatro;
    }

    public JButton getbCinco() {
        return bCinco;
    }

    public JButton getbSeis() {
        return bSeis;
    }

    public JButton getbSiete() {
        return bSiete;
    }

    public JButton getbOcho() {
        return bOcho;
    }

    public JButton getbNueve() {
        return bNueve;
    }

    public JButton getbDiez() {
        return bDiez;
    }

    public JButton getbSumar() {
        return bSumar;
    }

    public JButton getbRestar() {
        return bRestar;
    }

    public JButton getbMultiplicar() {
        return bMultiplicar;
    }

    public JButton getbDividir() {
        return bDividir;
    }

    public JButton getbPotencia() {
        return bPotencia;
    }

    public JButton getbRaiz() {
        return bRaiz;
    }

    public JButton getbPorcentaje() {
        return bPorcentaje;
    }

    public JButton getbIgual() {
        return bIgual;
    }

    public JButton getbLimpiar() {
        return bLimpiar;
    }

    public JButton getbDecimal() {
        return bDecimal;
    }
    
}
