package aplicacion
import datos.IReservaRepository
import dominio.ReservaVuelo
import dominio.ReservaHotel

interface IReservaService {
    fun crearReservaVuelo(descripcion: String, origen: String, destino: String, horaVuelo: String)
    fun crearReservaHotel(descripcion: String, ubicacion: String, numeroNoches: Int)
    fun listarReservas(): List<String>
}