package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

//import static org.junit.jupiter.api.Assertions.assertEquals;

//import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFuzzyFinder {

  FuzzyFinder finder;
  FuzzyListGenerator generator;

  @BeforeEach
  void setUp() {
    finder = new FuzzyFinder();
    generator = new FuzzyListGenerator();
  }

  @Test
  void exampleSortedFuzziesLiearSearch() {
    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
    int sortedLinear = finder.linearSearch(sortedFuzzies);
    assertEquals( 1000, sortedLinear );

  }

  @Test
  void TestRandomLinearSearch(){
    ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
    int RandLinear = finder.linearSearch(randomFuzzies);
    assertNotEquals( -1, RandLinear );
  }

  @Test
  void TestSortedBinarySearch(){
    ArrayList<Fuzzy> sortedFuzzies = generator.sortedRainbowFuzzies();
    int sortedB = finder.binarySearch(sortedFuzzies);
    assertEquals( 1000, sortedB);
  }

  @Test
  void TestRadBinarySearch(){
    ArrayList<Fuzzy> randomFuzzies = generator.randomizedRainbowFuzzies();
    int RandB = finder.binarySearch(randomFuzzies);
    assertEquals( -1, RandB);
  }
}
