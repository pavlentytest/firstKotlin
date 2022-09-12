import java.net.URL
import java.util.*
// комментарий

fun main() {
    println("Hello World!")
   // val address = "https://ya.ru"
  //  val someText = URL(address).readText()
  //  println(someText);

/*
Блочный комментарий
 */


    var a1: String = "123"

    var a0: Short = 11 // 16

    var a2: Int = 123 // 32
    var a3: Long = 123 // 64

    var a4: Double = 1.45  // 64
    var a5: Float = 1.45F  // 32
    var c1: Char = 'A'

    var b1: Long = a2.toLong()
    var flag: Boolean = true
    println(sqr2(5))

    /*
    val bb: Scanner = Scanner(System.`in`)
    val aa = bb.nextInt()
    println(aa)
    */

    val y = readLine()?.toInt()
    println(y)

}
fun sqr(x: Int): Int {
    return x*x
}
fun sqr2(x:Int) = x*x