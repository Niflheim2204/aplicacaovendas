/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vendas.gui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author aluno
 */
class InsereFuncionario {
    public void start (Stage primaryStage) throws Exception {
        
            Parent root = FXMLLoader.load(getClass().getResource("InsereFuncionario.fxml"));
            Scene cena = new Scene (root);
            
            primaryStage.setScene(cena);
            primaryStage.show();
                    }
    
    
}
