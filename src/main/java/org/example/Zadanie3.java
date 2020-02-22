package org.example;

class Wezel
{
    int data;
    Wezel lewy, prawy;

    public Wezel(int item)
    {
        data = item;
        lewy = prawy = null;
    }
}

public class Zadanie3 {
    //Root of the Binary Tree
    Wezel korzen;

    int getLeafCount() {
        return getLeafCount(korzen);
    }

    int getLeafCount(Wezel wezel) {
        if (wezel == null)
            return 0;
        if (wezel.lewy == null && wezel.prawy == null)
            return 1;
        else
            return getLeafCount(wezel.lewy) + getLeafCount(wezel.prawy);
    }
}