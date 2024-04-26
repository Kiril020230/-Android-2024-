package task_3

import kotlin.math.PI
import kotlin.math.pow

// Базовый класс трехмерной фигуры
open class Shape3D {
    open fun getVolume(): Double {
        return 0.0
    }

    open fun getBaseArea(): Double {
        return 0.0
    }
}

// Сфера
class Sphere(val radius: Double) : Shape3D() {
    override fun getVolume(): Double {
        return (4.0 / 3.0) * PI * radius.pow(3.0)
    }

    override fun getBaseArea(): Double {
        return PI * radius.pow(2.0)
    }
}

// Прямоугольный параллелепипед
class Cuboid(val length: Double, val width: Double, val height: Double) : Shape3D() {
    override fun getVolume(): Double {
        return length * width * height
    }

    override fun getBaseArea(): Double {
        return length * width
    }
}

// Пример использования
fun main() {
    val sphere = Sphere(3.0)
    println("Объем сферы: ${sphere.getVolume()}")
    println("Площадь основания сферы: ${sphere.getBaseArea()}")

    val cuboid = Cuboid(3.0, 4.0, 5.0)
    println("Объем прямоугольного параллелепипеда: ${cuboid.getVolume()}")
    println("Площадь основания прямоугольного параллелепипеда: ${cuboid.getBaseArea()}")
}
