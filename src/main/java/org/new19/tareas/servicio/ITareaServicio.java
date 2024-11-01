package org.new19.tareas.servicio;

import org.new19.tareas.modelo.Tarea;

import java.util.List;

public interface ITareaServicio {
    List<Tarea> listarTareas();

    Tarea buscarTareaPorId(Integer idTarea);

    void guardarTarea(Tarea tarea);

    void eliminarTarea(Tarea tarea);
}
