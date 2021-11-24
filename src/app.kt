import kotlin.math.pow

/**
 * The main function for launching the project
 */
fun main() {
    // Task A
    println("TASK A")
    println("----------------------------------------")
    val c1 = Complex(5.0, 10.0)
    println("Start: $c1")

    print("$c1 + 2.0 + 3.0i = ")
    c1.add(Complex(2.0, 3.0))
    println(c1)

    print("$c1 * 1.0 + 2.0i = ")
    c1.mul(Complex(1.0, 2.0))
    println(c1)

    print("$c1 / 1.0 + 2.0i = ")
    c1.div(Complex(1.0, 2.0))
    println(c1)

    print("$c1 - 7.0 + 13.0i = ")
    c1.sub(Complex(7.0, 13.0))
    println(c1)

    // Task B
    println("TASK B")
    println("----------------------------------------")

    val z = Complex(3.0, 5.0)
    val numbers: Array<Complex> = arrayOf(
        Complex(3.0, 2.0), Complex(2.0, 3.0), Complex(5.0, 5.0),
        Complex(-1.0, -1.0), Complex(3.2, 2.4), Complex(5.1, 2.3)
    )

    var result = Complex(0.0, 0.0)

    for (i in numbers.indices) {
        result.add(result.mul(numbers[i], powComplex(z, numbers.size - i)))
    }

    println(result)
}

/**
 * Raising a complex number to a power
 *
 * @param complex Complex number for construction
 * @param n Required degree
 * @return the finished complex number
 */
fun powComplex(complex: Complex, n: Int): Complex {
    val x = complex.x
    val y = complex.y
    val resX = x.pow(n.toDouble())
    val resY = y.pow(n.toDouble())
    return Complex(resX, resY)
}
