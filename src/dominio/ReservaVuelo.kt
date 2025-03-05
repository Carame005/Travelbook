package dominio

class ReservaVuelo private constructor(
    descripcion: String,
    private val origen: String,
    private val destino: String,
    private val horaVuelo: String
) : Reserva(descripcion) {
    override val detalle: String
        get() = "$id - $descripcion - $origen -> $destino [$horaVuelo]"

    override fun toString(): String = detalle

    companion object {
        fun creaInstancia(descripcion: String, origen: String, destino: String, horaVuelo: String): ReservaVuelo {
            return ReservaVuelo(descripcion, origen, destino, horaVuelo)
        }
    }
}