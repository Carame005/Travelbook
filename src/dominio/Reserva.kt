package dominio
import java.time.LocalDateTime
import java.util.UUID

sealed class Reserva(val descripcion: String) {
    val id: String = UUID.randomUUID().toString()
    val fechaCreacion: LocalDateTime = LocalDateTime.now()
    abstract val detalle: String
}