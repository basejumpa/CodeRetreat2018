#!/usr/bin/env groovy

// The class Game shall exist
Field field = new Field()

/**
* Test 6:
* A field shall provide the option to add a cell to it
*/
Field field_6 = new Field()

// Act
field_6.addCell(new Cell())

// Assert
assert field_6.getNumberOfCells() == 1



