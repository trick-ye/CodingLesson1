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




