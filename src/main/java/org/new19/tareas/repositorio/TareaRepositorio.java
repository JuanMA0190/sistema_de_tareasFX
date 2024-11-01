package org.new19.tareas.repositorio;

import org.new19.tareas.modelo.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {

}
