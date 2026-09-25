package edu.ncsu.monopoly;
//Eguneraketa irailak 25 bigarrena
public abstract class Card {
//actualizacion viernes 25 is2 version 2.2
    public static final int TYPE_CHANCE = 1;
    public static final int TYPE_CC = 2;

    public abstract String getLabel();
    public abstract void applyAction();
    public abstract int getCardType();
}
