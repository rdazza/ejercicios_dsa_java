package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by ruben on 24/09/15.
 */

public class Tree {

    private int height;
    private String name;

    public Tree() {
        this(0, null);
    }

    public Tree(int height) {
        this(height, null);
    }

    public Tree(String name) {
        this(0, name);
    }

    public Tree(int height, String name) {
        this.height = height;
        this.name = name;
    }

    public void Escribir() {
        System.out.print("Un ");
        if (name == null) {
            System.out.print("arbol");
        } else {
            System.out.print(name);
        }
        if (height > 0) {
            System.out.println(" de " + height + " metros");
        } else {
            System.out.println("");
        }
    }


    /*public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Un ");
        if (name == null)
            sb.append("árbol");
        else
            sb.append(name);
        if (height > 0)
            sb.append(" de ").append(height).append(" metros");
        return sb.toString();
    }
    */
}
