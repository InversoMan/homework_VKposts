data class Donut(
    val isDonut: Boolean = false, // запись доступна только донам
    val paidDuration: Int = 0, // время доступа записи донов
    val placeholder: String = "", // заглушка не донам
    val canPublishFreeCopy: Boolean = false, // открыть запись для всех
    val editMode: String = "" //
)
