package arnaud.projects.org.example.entities

import java.time.LocalDateTime

class Ticket(
    val id: String,
    val price: Double,
    val isBooked: Boolean,
    val movieTitle: String,
    val showTime: LocalDateTime,
    val seatNumber: Int,
    val hall: String,
    val customerName: String,
    val isPaid: Boolean,
    val paidDate: String,
    val qrCode: String
)