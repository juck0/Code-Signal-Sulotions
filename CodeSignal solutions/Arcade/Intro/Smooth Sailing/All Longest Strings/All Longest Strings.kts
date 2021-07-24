fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    val strs = mutableListOf<String>()
    for(str in inputArray){
        if(strs.isEmpty() || str.length == strs.get(0).length){
            strs.add(str)
        } else if(str.length > strs.get(0).length){
            strs.clear()
            strs.add(str)
        }
    }
    return strs
}

