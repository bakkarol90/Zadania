package org.example;

public class Zadanie5{
    public class Wezel {
  int val;
  Wezel lewy;
  Wezel prawy;
  Wezel(int x) { val = x; }
  }

    public class Obroc {
        public Wezel obrocDrzewo(Wezel korzen) {
            if(korzen == null) return null;
            Wezel temp = korzen.lewy;
            korzen.lewy = obrocDrzewo(korzen.prawy);
            korzen.prawy = obrocDrzewo(temp);
            return korzen;
        }
    }
}



