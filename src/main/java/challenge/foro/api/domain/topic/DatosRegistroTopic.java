package challenge.foro.api.domain.topic;


import jakarta.validation.constraints.NotBlank;

public record DatosRegistroTopic(

        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotBlank
        String fecha_creacion,
        @NotBlank
        String autor,
        @NotBlank
        String curso
) {
}
