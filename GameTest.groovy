#!/usr/bin/env groovy

// Test 1: The class Game shall exist
Game game = new Game()


// Test 2: ...
assert 1 == 1

/** Test 3: 
 * Game shall provide a function "step" returning an
* object of class Field, accepting an object of class Field
 */
Field before = new Field()
Object next = (new Game()).step(before)
assert next instanceof Field


