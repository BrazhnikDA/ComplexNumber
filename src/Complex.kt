import kotlin.math.atan2
import kotlin.math.sqrt

/**
 * A class for operations on complex numbers
 *
 * The class implements standard operations: +,  -,  *, /
 *
 * @param x_ The real part of a complex number
 * @param y_ The imaginary part of a complex number
 * @constructor Assigning input parameters to class fields
 */
class Complex(x_: Double, y_: Double) {
    var x: Double = x_
    var y: Double = y_

    init {
        x = x_
        y = y_
    }

    /**
     * Adding fields of a class with a complex number
     *
     * @param inComplex Complex number
     */
    fun add(inComplex: Complex) {
        x += inComplex.x
        y += inComplex.y
    }

    /**
     * Addition of a complex number with another complex number
     *
     * @param first First complex number
     * @param second Second complex number
     * @return Finished complex number
     */
    fun add(first: Complex, second: Complex): Complex {
        return Complex(first.x + second.x, first.y + second.y)
    }

    /**
     * Subtraction from the fields of the complex number class
     *
     * @param inComplex Complex number
     */
    fun sub(inComplex: Complex) {
        x -= inComplex.x
        y -= inComplex.y
    }

    /**
     * Subtracting a complex number from a complex number
     *
     * @param first First complex number
     * @param second Second complex number
     * @return Finished complex number
     */
    fun sub(first: Complex, second: Complex): Complex {
        return Complex(first.x - second.x, first.y - second.y)
    }

    /**
     * Multiply the class fields by a complex number
     *
     * @param inComplex Complex number
     */
    fun mul(inComplex: Complex) {
        val resX = x * inComplex.x - y * inComplex.y
        val resY = x * inComplex.y + inComplex.x * y
        x = resX
        y = resY
    }

    /**
     * Multiplication of the first complex number by the second
     *
     * @param first First complex number
     * @param second Second complex number
     * @return Finished complex number
     */
    fun mul(first: Complex, second: Complex): Complex {
        return Complex(
            first.x * second.x - first.y * second.y,
            first.x * second.y + second.x * first.y
        )
    }

    /**
     * Dividing class fields by a complex number
     *
     * @param inComplex Complex number
     */
    fun div(inComplex: Complex) {
        val resX = (x * inComplex.x + y * inComplex.y) / (inComplex.x * inComplex.x + inComplex.y * inComplex.y)
        val resY = (y * inComplex.x - x * inComplex.y) / (inComplex.x * inComplex.x + inComplex.y * inComplex.y)
        x = resX
        y = resY
    }

    /**
     * The module of a complex number
     *
     * @return Result in Double format
     */
    fun getAbs(): Double {
        return sqrt(x * x + y * y)
    }

    /**
     * The argument of a complex number
     *
     * @return Result in Double format
     */
    fun getArg(): Double {
        return atan2(y, x)
    }

    /**
     * Overloading the toString method to output a complex number to the console
     *
     * @return Finished string
     */
    override fun toString(): String {
        return buildString {
            append(x); append(" + "); append(y); append("i")
        }
    }
}