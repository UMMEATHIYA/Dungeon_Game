package org.example;

//
// Axe.java
// Written by: Umme Athiya
// For SOEN 350 - Lab Assignment 2
//

/**
 * Represents an Axe item that can be equipped
 * by a character to increase strength.
 * The Axe provides a strength bonus but no craft bonus.
 */
public class Axe extends Item {

    /**
     * Constructs an Axe with a given name
     * and strength bonus.
     *
     * @param name The name of the axe.
     * @param strengthBonus The amount of strength
     * this axe adds when equipped.
     */
    public Axe(String name, int strengthBonus) {
        super(name, strengthBonus, 0); // 0 craft bonus
    }
}
