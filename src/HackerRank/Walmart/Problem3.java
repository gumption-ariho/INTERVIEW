package HackerRank.Walmart;

import java.util.Arrays;

class Problem3 {//1223

        static int numRescueBoats(int[] people, int limit) {
            Arrays.sort(people);
            int boats = 0;
            for (int i = 0; i < people.length;) {
                int sum = people[i];
                int j = i + 1;
                while (j < people.length && sum + people[j] <= limit) {
                    sum += people[j];
                    j++;
                }
                boats++;
                i = j; // Move to the next person
            }
            return boats;
        }




    /*

      public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int i = 0;
        int j = people.length - 1; // Start from the heaviest person

        while (i <= j) {
            // If the heaviest and lightest people can fit in the boat together, increment both indices
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
            } else {
                // Otherwise, only the heaviest person can fit in the boat
                j--;
            }
            boats++; // Increment the number of boats
        }
        return boats;
    }
     */
    public static void main(String[]args){
        System.out.println(numRescueBoats(new int[]{3,2,2,1},3));
        System.out.println(numRescueBoats(new int[]{2,1},3));
    }
}
