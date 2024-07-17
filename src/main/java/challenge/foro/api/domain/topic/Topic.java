package challenge.foro.api.domain.topic;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "topicos")
@Entity(name = "Topic")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private String fecha_creacion;
    private String autor;
    private String curso;

    private Boolean status;

    // metodo que permite registrar datos en la base de datos
    public Topic(DatosRegistroTopic datosRegistroTopic) {
        this.status = true;
        this.titulo = datosRegistroTopic.titulo();
        this.mensaje = datosRegistroTopic.mensaje();
        this.fecha_creacion = datosRegistroTopic.fecha_creacion();
        this.autor = datosRegistroTopic.autor();
        this.curso = datosRegistroTopic.curso();

    }

    // Metodo que permite actualizar de la base de datos
    public void actualizarDatos(DatosActualizarTopic datosActualizarTopic) {
        this.titulo = datosActualizarTopic.titulo();
        this.mensaje = datosActualizarTopic.mensaje();
        this.fecha_creacion = datosActualizarTopic.fecha_creacion();
        this.autor = datosActualizarTopic.autor();
        this.curso = datosActualizarTopic.curso();

//Condicionales para cuando no se valida desde el record
//        if (datosActualizarTopic.titulo() != null) {
//            this.titulo = datosActualizarTopic.titulo();
//        }
//        if (datosActualizarTopic.mensaje() != null) {
//            this.mensaje = datosActualizarTopic.mensaje();
//        }
//        if (datosActualizarTopic.fecha_creacion() != null) {
//            this.fecha_creacion = datosActualizarTopic.fecha_creacion();
//        }
//        if (datosActualizarTopic.autor() != null) {
//            this.autor = datosActualizarTopic.autor();
//        }
//        if (datosActualizarTopic.curso() != null) {
//            this.curso = datosActualizarTopic.curso();
//        }

    }

    // Metodo que permite desactivar usuarios de manera logica
    public void desactivarTopic() {
        this.status = false;
    }
}
