fun main(args: Array<String>) {

    //    var r = 5
    //    for ( r in 1 ..5 )
   //  {
   //      for (s in 4 downTo r)
   //          println("")
   //  }
   //  for (c in 1 .. r ){
   //      println(" *")
   //  }
   //  println()
   //

        val n = 5 // You can change this value to adjust the height of the pyramid
        printPyramid(n)
    }

    fun printPyramid(n: Int) {
        for (i in 1..n) {
            // Print spaces
            for (j in 1..n - i) {
                print(" ")
            }

            // Print stars
            for (k in 1..2 * i - 1) {
                print("*")
            }

            // Move to the next line after each row is printed
            println()
        }
    }
