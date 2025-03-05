package presentacion

import servicios.ReservaService
import datos.ReservaRepositoryEnMemoria

fun main() {
    val reservaService = ReservaService(ReservaRepositoryEnMemoria())
    while (true) {
        println("\nGestor de Reservas - Agencia de Viajes")
        println("1. Crear reserva de vuelo")
        println("2. Crear reserva de hotel")
        println("3. Listar reservas")
        println("4. Salir")
        print("Seleccione una opción: ")
        when (readLine()?.toIntOrNull()) {
            1 -> {
                print("Descripción: ")
                val descripcion = readLine() ?: ""
                print("Origen: ")
                val origen = readLine() ?: ""
                print("Destino: ")
                val destino = readLine() ?: ""
                print("Hora de vuelo (HH:mm): ")
                val horaVuelo = readLine() ?: ""
                reservaService.crearReservaVuelo(descripcion, origen, destino, horaVuelo)
            }
            2 -> {
                print("Descripción: ")
                val descripcion = readLine() ?: ""
                print("Ubicación: ")
                val ubicacion = readLine() ?: ""
                print("Número de noches: ")
                val numeroNoches = readLine()?.toIntOrNull() ?: 0
                reservaService.crearReservaHotel(descripcion, ubicacion, numeroNoches)
            }
            3 -> {
                println("\nReservas registradas:")
                reservaService.listarReservas().forEach { println(it) }
            }
            4 -> return
            else -> println("Opción no válida")
        }
    }
}
