package dominio

class ReservaHotel private constructor(
    descripcion: String,
    private val ubicacion: String,
    private val numeroNoches: Int
) : Reserva(descripcion) {
    override val detalle: String
        get() = "$id - $descripcion - $ubicacion ($numeroNoches noches)"

    override fun toString(): String = detalle

    companion object {
        fun creaInstancia(descripcion: String, ubicacion: String, numeroNoches: Int): ReservaHotel {
            return ReservaHotel(descripcion, ubicacion, numeroNoches)
        }
    }
}
