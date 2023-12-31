package com.example;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Horarios {

    private Pelicula pelicula;
    private Cine cine;
    private Sala sala1;
    

    public Horarios(Cine cine, Pelicula pelicula, Sala sala1) {
        this.cine = cine;
        this.pelicula = pelicula;
        this.sala1 = sala1;
    }

    public void mostrar() {
        Stage stage = new Stage();
        stage.setTitle("Horarios - " + pelicula.getNombre());

        VBox layout = new VBox(10);

        // Creacion de botones para cada horario.
        Button btnHorario1 = new Button("Horario 1       12:35");
        btnHorario1.setOnAction(e -> {cine.mostrarBoletos(pelicula, "12:35", sala1);
        stage.close();});

        Button btnHorario2 = new Button("Horario 2       13:45");
        btnHorario2.setOnAction(e -> {cine.mostrarBoletos(pelicula,"13:45", sala1);
        stage.close();
        });

        Button btnHorario3 = new Button("Horario 3       15:00");
        btnHorario3.setOnAction(e -> {cine.mostrarBoletos(pelicula, "15:00", sala1);
        stage.close();
        });

        layout.getChildren().addAll(btnHorario1, btnHorario2, btnHorario3);
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }
}