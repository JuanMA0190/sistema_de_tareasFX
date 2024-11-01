package org.new19.tareas;

import javafx.application.Application;
import org.new19.tareas.presentacion.SistemaTareasFx;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {
		Application.launch(SistemaTareasFx.class, args);
	}

}
