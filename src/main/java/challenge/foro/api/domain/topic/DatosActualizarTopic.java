package challenge.foro.api.domain.topic;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopic(
        @NotNull Long id,
        @NotNull String titulo,
        @NotNull String mensaje,
        @NotNull String fecha_creacion,
        @NotNull String autor,
        @NotNull String curso)
{
}
