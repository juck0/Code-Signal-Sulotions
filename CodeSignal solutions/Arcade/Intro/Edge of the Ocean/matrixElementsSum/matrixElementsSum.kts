fun matrixElementsSum(matrix: MutableList<MutableList<Int>>): Int {
    var col    = mutableListOf<Int>()
    var sum = 0;
    for(i in 0..matrix.size-1){
        for(j in  0..matrix[0].size-1){
            if(matrix[i][j] == 0 || col.contains(j)){
                col.add(j);
                continue;
            }else{
                sum += matrix[i][j];
            }
        }
    }
    return sum;
}