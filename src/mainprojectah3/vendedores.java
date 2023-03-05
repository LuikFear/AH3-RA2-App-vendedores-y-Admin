/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainprojectah3;

import java.util.LinkedList;

/**
 *
 * @author LuikFear
 */
public class vendedores {
     static LinkedList<vendedores> Lista = new LinkedList<> ();

           private int codigo;
           private String Nombre;
           private int caja;
           private int ventas;
           private String genero;
           private String pass;

        public vendedores(int codigo, String Nombre, int caja, int ventas, String genero, String pass) {
            this.codigo = codigo;
            this.Nombre = Nombre;
            this.caja = caja;
            this.ventas = ventas;
            this.genero = genero;
            this.pass = pass;
        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getNombre() {
            return Nombre;
        }

        public void setNombre(String Nombre) {
            this.Nombre = Nombre;
        }

        public int getCaja() {
            return caja;
        }

        public void setCaja(int caja) {
            this.caja = caja;
        }

        public int getVentas() {
            return ventas;
        }

        public void setVentas(int ventas) {
            this.ventas = ventas;
        }

        public String getGenero() {
            return genero;
        }

        public void setGenero(String genero) {
            this.genero = genero;
        }

        public String getpass() {
            return pass;
        }

        public void setpass(String pass) {
            this.pass = pass;
        }
                 
           
    
       }

