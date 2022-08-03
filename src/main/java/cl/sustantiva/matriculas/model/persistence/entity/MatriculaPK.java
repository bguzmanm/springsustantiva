package cl.sustantiva.matriculas.model.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class MatriculaPK implements Serializable {

    @Column(name="id_estudiante")
    private int estudianteId;
    @Column(name="id_curso")
    private int cursoId;

    public int getEstudianteId() {
        return estudianteId;
    }

    public void setEstudianteId(int estudianteId) {
        this.estudianteId = estudianteId;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }
}
