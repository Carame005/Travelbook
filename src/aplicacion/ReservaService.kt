package aplicacion
import datos.IReservaRepository
import dominio.ReservaVuelo
import dominio.ReservaHotel

class ReservaService(private val repository: IReservaRepository) :IReservaService {
    override fun crearReservaVuelo(descripcion: String, origen: String, destino: String, horaVuelo: String) {
        val reserva = ReservaVuelo.creaInstancia(descripcion, origen, destino, horaVuelo)
        repository.agregar(reserva)
    }

    override fun crearReservaHotel(descripcion: String, ubicacion: String, numeroNoches: Int) {
        val reserva = ReservaHotel.creaInstancia(descripcion, ubicacion, numeroNoches)
        repository.agregar(reserva)
    }

    override fun listarReservas(): List<String> = repository.obtenerTodas().map { it.detalle }
}