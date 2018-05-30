import java.util.*

object Sort {
    fun insertSort(list : IntArray) {
        for (i in 1 until list.size) {
            val value = list[i]
            var position = i-1
            while (position >=0 && list[position] > value) {
                list[position+1] = list[position]
                position--
            }
            list[position+1] = value
        }
    }
}

fun main(args: Array<String>) {
    val list = intArrayOf(3,2,1,5,6,8,3,4,6,8,3,0,1,4,2)
    System.out.print(Arrays.toString(list)+"\n")
    Sort.insertSort(list)
    System.out.print(Arrays.toString(list)+"\n")
}