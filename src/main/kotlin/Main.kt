fun main() {
    val citizenKenyan = true
    var studentName = arrayOf("john", "peter", "dona")
    var studentPhoneNumber = arrayOf(765432134, 789098765, 798095447)
    var studentAge = arrayOf(23, 25, 29)
    var studentWeight = arrayOf(47, 58, 60)
    var detail = arrayOf("list",studentName[0],studentPhoneNumber[0],studentAge[0],studentWeight[0],!citizenKenyan)
    println(detail.contentToString())
    var list = arrayOf("detail",studentName[1],studentPhoneNumber[1],studentAge[1],studentWeight[1],citizenKenyan)
    println(list.contentToString())
    var lists = arrayOf("detail",studentName[2],studentPhoneNumber[0],studentAge[0],studentWeight[0],!citizenKenyan)
    println(lists.contentToString())
}