fun almostIncreasingSequence(sequence: MutableList<Int>): Boolean {
    var counts = if(sequence[0] >= sequence[1]) 1 else 0
    var i = 2
    while(i < sequence.size){
        if(sequence[i-1] >= sequence[i]){
            counts++
            if(sequence[i-2] >= sequence[i]){
                sequence[i] = sequence[i-1]
            }
        }
        i++
        if(counts > 1) return false
    }
    return true
}

