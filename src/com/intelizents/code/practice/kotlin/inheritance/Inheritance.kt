package com.intelizents.code.practice.kotlin.inheritance

open class AreaCalculator(val length: Double, val width: Double) {
    constructor() : this(1.0, 1.0)
    constructor(x: Double) : this(x, x)
    constructor(x: AreaCalculator) : this(x.length, x.width)

    open fun show() {
        println("Length : $length")
        println("Width  : $width")
    }

    open fun calculate(): Double {
        return length * width
    }
}


class VolumeCalculator(length: Double, width: Double, val height: Double) : AreaCalculator(length, width) {
    constructor() : this(1.0, 1.0, 1.0)
    constructor(x: Double) : this(x, x, x)
    constructor(x: VolumeCalculator) : this(x.length, x.width, x.height)

    override fun show() {
        super.show()
        println("Height : $height")
        println("Area calculated : " + super.calculate())
        println("Volume calculated : " + calculate())
        println()
    }

    override fun calculate(): Double {
        return height * super.calculate()
    }
}


fun main() {
    val calc1 = VolumeCalculator()
    val calc2 = VolumeCalculator(10.0)
    val calc3 = VolumeCalculator(12.5, 15.5, 10.5)

    calc1.show()
    calc2.show()
    calc3.show()
}
