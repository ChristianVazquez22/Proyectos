/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author cbvp_
 */
public class Principal {
    public static void main(String[] args) {
       /* 
        try {
            ArrayList<String> lista = new ArrayList<String>();
            PreparedStatement consulta = Conexion.getInstancia().getConexion().prepareStatement("SELECT * FROM USUARIOS");
            ResultSet resultado = consulta.executeQuery();
            while(resultado.next()){
                lista.add(resultado.getString(1)+" "+resultado.getString(2)+" "+resultado.getString(3)+" "+resultado.getString(4)+" "+
                        resultado.getString(5)+" "+resultado.getString(6)+" "+resultado.getString(7)+" "+resultado.getString(8)+" "+
                        resultado.getString(9)+" "+resultado.getString(10)+" "+resultado.getString(11)+" "+resultado.getString(12)+" "+
                        resultado.getString(13)+" "+resultado.getString(14)+" "+resultado.getString(15));
                lista.add(resultado.getString("LOGIN")+" "+resultado.getString("PASSWORD")+" "+resultado.getString("NOMBRE")+" "+
                        resultado.getString("CLIENTE")+" "+resultado.getString("EMAIL")+" "+resultado.getString("FECHA_ALTA")+" "+
                        resultado.getString("FECHA_BAJA")+" "+resultado.getString("STATUS")+" "+resultado.getString("INTENTOS")+" "+
                        resultado.getString("FECHA_REVOCADO")+" "+resultado.getString("FECHA_VIGENCIA")+" "+resultado.getString("NO_ACCESO")+" "+
                        resultado.getString("APELLIDO_PATERNO")+" "+resultado.getString("AREA")+" "+resultado.getString("FECHA_MODIFICACION"));
            }
            
            for (int i = 0; i < lista.size(); i++) {
               System.out.println(lista.get(i));
            }

        } catch (SQLException e) {
            System.out.println("SQL");
            e.printStackTrace();
        }*/
       FormLogin login = new FormLogin();
       login.setVisible(true);
       
       
       /*String pass = "JSDK216HCN45";
       String res = "";
       Cifrado cifrado = new Cifrado();
       res = cifrado.cifrarBase64(pass);
       System.out.println("Cifrado: " + res);
       res = cifrado.descifrarBase64(res);
       System.out.println("Cifrado: " + res);*/
    }
}
