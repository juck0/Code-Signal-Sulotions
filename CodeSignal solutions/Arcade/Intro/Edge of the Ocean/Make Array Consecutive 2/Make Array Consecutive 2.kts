fun makeArrayConsecutive2(statues: MutableList<Int>): Int {
    statues.sort()
    val min = statues.first()
    val max = statues.last()
    var result: Int = 0
    for (i in min..max){
        if(!statues.contains(i)) result++
    }
    return result
}
