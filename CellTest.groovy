#!/usr/bin/env groovy

/** Test 4: 
 * An object of Class Cell shall provide a function "getNeighborCount" returning an
 * object of class Integer and with empty argument list
 */
Cell someCell = new Cell()
Object neightborCount = someCell.getNeighborCount()
assert neightborCount instanceof Integer
assert neightborCount == 0


/** Test 5: 
    cells know how many neighbors they have
 */
Cell someCell_5 = new Cell()
someCell_5.setNeighborCount(5);
assert someCell_5.getNeighborCount() == 5


