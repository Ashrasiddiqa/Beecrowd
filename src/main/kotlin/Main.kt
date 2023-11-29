fun main(args: Array<String>) {

        var r = 5
        for ( r in 1 ..5 )
        {
            for (s in 4 downTo r)
                println("")
        }
        for (c in 1 .. r ){
            println(" *")
        }
        println()
    }
 