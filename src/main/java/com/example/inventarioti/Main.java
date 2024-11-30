package com.example.inventarioti;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

public class Main {
       @FXML
       private Button consultar;

        @FXML
        private Button guardar;

        @FXML
        private TextField id;

        @FXML
        private Button limpiar;

        @FXML
        private TextField marca;

        @FXML
        private TextField modelo;

        @FXML
        private TextField responsable;

        @FXML
        private ComboBox<String > seleccion;

        @FXML
        private TextField serial;

        File f = new File("Directory", "Inventario.csv");


        @FXML
        void onActionGuardar(ActionEvent event) throws IOException {
            String ID = id.getText();
            String Serial = serial.getText();
            String Marca = marca.getText();
            String Modelo = modelo.getText();
            String Responsable = responsable.getText();
            String TipoActivo = seleccion.getValue();
            Activo A1 = new Activo(ID, Serial, Marca, Modelo, Responsable, TipoActivo);

            String linea = String.format("%s;%s;%s;%s;%s;%s", A1.getID(), A1.getSerial(), A1.getMarca(),
                    A1.getModelo(), A1.getResponsable(), A1.getTipoActivo());

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(f, true))) {
                writer.write(linea);
                writer.newLine();
            }
            onActionLimpiar(event);
        }

        @FXML
        void onActionID(ActionEvent event) {
            id.getText();
        }

        @FXML
        void onActionLimpiar(ActionEvent event) {
          marca.clear();
          id.clear();
          modelo.clear();
          serial.clear();
          responsable.clear();
          seleccion.getSelectionModel().clearSelection();
        }

        @FXML
        void onActionMarca(ActionEvent event) {
          marca.getText();
        }

        @FXML
        void onActionModelo(ActionEvent event) {
          modelo.getText();
        }

        @FXML
        void onActionResponsable(ActionEvent event) {
           responsable.getText();
        }
        public void initialize(){
            seleccion.getItems().addAll("Desktop", "Labtop", "Impresora", "Scanner", "Switch", "Router", "Firewall");
        }
        @FXML
        void onActionSeleccion(ActionEvent event) {
            seleccion.getValue();
        }

        @FXML
        void onActionSerial(ActionEvent event) {
           serial.getText();
        }
       @FXML
       void onActionConsultar(ActionEvent event) throws IOException {
           FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("consulta.view.fxml"));
           Scene scene = new Scene(loader.load());
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           stage.setTitle("Consulta de Inventario");
           stage.setScene(scene);
           stage.show();
    }


    }

