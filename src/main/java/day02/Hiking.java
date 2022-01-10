package day02;

import java.util.Arrays;
import java.util.List;

public class Hiking {

     public int getPlusElevation(List<Integer> heights) {
          int totalHeight = 0;
          for (int i = 1; i < heights.size(); i++ ) {
               if (heights.get(i) > heights.get(i - 1)) {
                    totalHeight += heights.get(i) - heights.get(i - 1);
               }
          }
          return totalHeight;
     }

     public static void main(String[] args) {
          Hiking hiking = new Hiking();
          System.out.println("A teljes magasságnövekedés: "+
                  hiking.getPlusElevation(Arrays.asList(10, 20, 15,18)));
     }
}
