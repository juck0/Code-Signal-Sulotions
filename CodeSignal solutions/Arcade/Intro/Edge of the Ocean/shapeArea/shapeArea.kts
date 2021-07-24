fun shapeArea(n: Int): Int {



    var numMiddleBoxes = 1 + (2 * (n-1));
    var leftSideArea = 0;

    var boxesToAdd = numMiddleBoxes-2;

    while(boxesToAdd >= 1) {
        leftSideArea += boxesToAdd;
        boxesToAdd -= 2
    }

    var area = (leftSideArea * 2) + numMiddleBoxes;
    return area
}

