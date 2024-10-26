package com.csc;

import java.util.ArrayList;


public class FuzzyFinder {


   public int linearSearch( ArrayList<Fuzzy> listFuzzies)
  {
     for(int i = 0; i < listFuzzies.size(); ++i ){

      if (listFuzzies.get(i).color.equals("gold"))
      {
          return i;
      }
    
     }
     return -1;
  }

 public int binarySearch (ArrayList<Fuzzy> listFuzzies)
  {
    int low = 0;
    int high = listFuzzies.size() -1;
     
     while(low <= high)
     {
        int middleIndx = (low+high)/2;
         int compareResult = listFuzzies.get(middleIndx).color.compareTo("gold");

         if(compareResult == 0)
         {
            return middleIndx;
         }
         if(compareResult < 0)
         {
            low = middleIndx +1 ;
         }
         else
         {
            high = middleIndx -1;
         }
     }

    return -1;
  }


  public static void main(String args[]) {
    System.out.println("In addition to your search functions, you can write a main function if you wish!");

  FuzzyListGenerator generator = new FuzzyListGenerator();
  FuzzyFinder finder = new FuzzyFinder();

  ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
  ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();



  int intSortedL = finder.linearSearch(sortedFuzzies);
  int intRamL =  finder.linearSearch(randomFuzzies);

  System.out.println("\nIndex where 'gold' fuzzy was by linear search in storted list:" + intSortedL);
  System.out.println("\nIndex where 'gold' fuzzy was by linear search in random list:" + intRamL);
 
  int intSorB = finder.binarySearch(sortedFuzzies);
  int intRanB = finder.binarySearch(randomFuzzies);
  System.out.println("\nIndex where 'gold' was found by binary search: " + intSorB);
  System.out.println("\nIndex where 'gold' was found by binary search: " + intRanB);








  }
}
