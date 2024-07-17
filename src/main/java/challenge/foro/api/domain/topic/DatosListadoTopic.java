package challenge.foro.api.domain.topic;

public record DatosListadoTopic(
        Long id,
        String titulo,
        String mensaje,
        String fecha_creacion,
        String autor,
        String curso) {

    public DatosListadoTopic(Topic topic) {
        this(
                topic.getId(),
                topic.getTitulo(),
                topic.getMensaje(),
                topic.getFecha_creacion().toString(),
                topic.getAutor(),
                topic.getCurso());
    }
}
