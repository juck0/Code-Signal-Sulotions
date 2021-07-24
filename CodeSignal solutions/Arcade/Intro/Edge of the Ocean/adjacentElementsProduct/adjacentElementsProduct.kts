fun adjacentElementsProduct(inputArray: MutableList<Int>): Int {


    var MaxProduct=inputArray[0]*inputArray[1]
    for(i in 0 until inputArray.size-1)
    {
        MaxProduct= Math.max(MaxProduct,inputArray[i]*inputArray[i+1] )

    }
    return  MaxProduct

}
