fun f(x: Double): Double {
    if (x <= 0) {
       return f1(x)
    } else if (0 < x && x < 1) {
       return f2(x)
    } else {
       return f3(x)
    }
}

fun f1(x: Double): Double {
    return x * x + 1
}

fun f2(x: Double): Double {
    return 1 / (x * x)
}

fun f3(x: Double): Double {
    return x * x -1
}

fun main() {
    val x = readLine()!!.toDouble()
    println(f(x))
}
