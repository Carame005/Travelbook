package datos
import  dominio.Reserva

class ReservaRepositoryEnMemoria : IReservaRepository {
    private val reservas = mutableListOf<Reserva>()

    override fun agregar(reserva: Reserva) {
        reservas.add(reserva)
    }

    override fun obtenerTodas(): List<Reserva> = reservas
}
