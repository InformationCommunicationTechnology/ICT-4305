package edu.du.ict_4305_grouptutorialassignmentweekseven;

public class Main {
      public static void main(String[] args) {
            NBAPlayer nbaPlayer = new NBAPlayer("luther",4,"NBA");
            NFLPlayer nflPlayer = new NFLPlayer("tafadzwa",200,"NFL");

            System.out.println("The name of the NBA player is " + nbaPlayer.getName());
            System.out.println("The name of the sport is " + nflPlayer.getSport());

      }
}