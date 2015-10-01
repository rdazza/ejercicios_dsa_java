
package edu.upc.eetac.dsa.exercises.java.lang;


public class Main{

    public static void main (String args []){
        Tree[] arboles = new Tree[4];
        arboles[0] = new Tree(4);
        arboles[1] = new Tree("Roble");
        arboles[2] = new Tree();
        arboles[3] = new Tree(5,"Pino");

        for (Tree t : arboles)
            t.Escribir();
            //System.out.println(t);


    }

}
