package com.example.inventarioti;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConsultaController {

    private TableView<Activo> tableView;
        @FXML
        private TableColumn<Activo, String> activo;

        @FXML
        private TableColumn<Activo, String> id;

        @FXML
        private TableColumn<Activo, String> marca;

        @FXML
        private TableColumn<Activo, String > modelo;

        @FXML
        private TableColumn<Activo, String> responsable;

        @FXML
        private TableColumn<Activo, String> serial;

        @FXML
        void onActionModelo(ActionEvent event) {

        }

        @FXML
        void onActionResponsable(ActionEvent event) {

        }

        @FXML
        void onActionSerial(ActionEvent event) {

        }

        @FXML
        void onActionid(ActionEvent event) {

        }

        @FXML
        void onActionmarca(ActionEvent event) {

        }
        private ObservableList<Activo> data = FXCollections.observableArrayList();
        @FXML
        public final void onAtiontipoActivo(ActionEvent event) {

            id.setCellValueFactory(new PropertyValueFactory<>("ID"));
            serial.setCellValueFactory(new PropertyValueFactory<>("Serial"));
            marca.setCellValueFactory(new PropertyValueFactory<>("Marca"));
            modelo.setCellValueFactory(new PropertyValueFactory<>("Modelo"));
            responsable.setCellValueFactory(new PropertyValueFactory<>("Responsable"));
            //tipoActivo.setCellValueFactory(new PropertyValueFactory<>("TipoActivo"));

            loadFromFile("C:\\Users\\Esmailin\\IdeaProjects\\InventarioTI\\Directory\\Inventario.csv");
            tableView.setItems(data);
        }

    private void loadFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length == 6) {
                    Activo activo = new Activo(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
                    data.add(activo);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        }



