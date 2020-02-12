import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit

fun main(){
    var today = LocalDateTime.now()
    var formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    var itFormatted = today.format(formatter)

    var month = 2
    var day = 10
    var year = 2020

    var dToday = LocalDate.now()
    var createDate: LocalDate = LocalDate.of(year, month, day)
    var justDate = LocalDate.now()

    println(today.month)
    println(today.plusDays(45))
    println("$itFormatted")

    var daysToBirthday = dToday.until(createDate, ChronoUnit.DAYS)

    println(daysToBirthday)

}