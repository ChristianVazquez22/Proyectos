/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author cbvp_
 */
public class Login {
    
    public void validarUsuario(JTextField usuario, JPasswordField password){
        try {
            Cifrado cifrado = new Cifrado();
            PreparedStatement consulta = Conexion.getInstancia().getConexion().prepareStatement("SELECT LOGIN,PASSWORD FROM USUARIOS WHERE LOGIN = (?) AND PASSWORD = (?)");
            consulta.setString(1, usuario.getText());
            consulta.setString(2, cifrado.cifrarBase64(String.valueOf(password.getPassword())));
            ResultSet resultado = consulta.executeQuery();
            
            if(resultado.next()){
                JOptionPane.showMessageDialog(null, "Login Correcto");
                MenuBienvenida menu = new MenuBienvenida();
                menu.setVisible(true);
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
            }
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
        }
    
    }
    
}
