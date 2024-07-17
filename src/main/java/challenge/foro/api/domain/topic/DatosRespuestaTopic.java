package challenge.foro.api.domain.topic;

public record DatosRespuestaTopic(
        Long id,
        String titulo,
        String mensaje,
        String fecha_creacion,
        String autor,
        String curso) {
}
