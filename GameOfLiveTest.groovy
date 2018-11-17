#!/usr/bin/env groovy

// The class Game shall exist
Game game = new Game()

// Check isAlive
assert true == game.isAlive(true, 2)

// Check isAlive if there are two neighbours 
assert true == game.staysAlive(true, 2)

// Bleibt das Feld am leben, wenn es zwei nachbarn hat. Gebe nur ein True zurück, wenn du überprüft hast, dass er nur zwei, nicht mehr, nicht weniger als zwei nachbarn hat!!!

assert true == (game.staysAliveWithTwoNeighbours(true, 2) && game.getNumberOfNeighbours() && game.checkThatThereAreNotMoreThanTwoNeigbours() && game.checkThatThereAreNotLessThanZwoNeighbours())