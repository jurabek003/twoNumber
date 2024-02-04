import java.util.Scanner
import kotlin.random.Random

fun main(args: Array<String>) {

    val input=Scanner(System.`in`)
    println("Please input list size :)")
    val size=input.nextInt()

    val array=ArrayList<Int>()
    for (i in 0 until size){
      array.add( Random(i).nextInt(size))
    }
    println(array)
    println("Please input target number :)")
    val target=input.nextInt()

    for (i in 0 until array.size){
        for (j in 0 ..i){
            if (array[i]+array[j]==target){
                println("${array[i]} + ${array[j]}")
                break
            }
        }
    }
}