fun main(args: Array<String>) {
    val number = if (args.isNotEmpty()) args[0].toIntOrNull() else null

    println("$number is ${even0r0dd(number)}")
}

 fun even0r0dd(num:Int?): String {
     if (num != null) {
         return if (num % 2 == 0) {
             "even"
         } else {
             "0dd"

         }
     }
     return "invalid input. Please enter a valid number."
 }

fun calculateFactorial(num:Int?): Long? {
    return if (num == null) {
        null
    } else if (num == 0 || num == 1 ) {
        1L
    } else {
        var result = 1L
        for (i in 2..num ){
            result *= i

        }
        return result
    }
}








