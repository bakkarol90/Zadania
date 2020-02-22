package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Zadanie4 {
    public static Queue odwroc(Stack stos){
        Queue<Integer> stosKopia=new LinkedList<Integer>();
        while(!stos.empty()){
            stosKopia.add((int)stos.pop());
        }
        return stosKopia;
    }
}
