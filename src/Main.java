public class Main {
    public static void main(String[] args) {
        /* --- PROBLEM 1 --- */
        System.out.println("PROBLEM 1:");
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};

        System.out.println("---------");
// write code below that uses nested ENHANCED for loops
// to print each element in nums in ROW-MAJOR order again;
// print all the numbers in a row on the same line
// with a space in between
        for(int[] numList: nums){
            for(int numbers: numList){
                System.out.print(numbers + " ");
            }
            System.out.println();
        }

// now, write code below that uses nested INDEX-BASED for loops
// to print each element in nums in ROW-MAJOR order;
// print all the numbers in a row on the same line
// with a space in between

// write code here
        for(int r = 0; r < nums.length; r++){
            for(int c = 0; c < nums[nums.length-1].length;c++){
                System.out.print(nums[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("---------");
// finally, write code below that uses nested for loops
// to print each element in nums in COLUMN-MAJOR order;
// print all the numbers in a COLUMN on the same line
// with a space in between
        for(int c = 0; c < nums[nums.length-1].length;c++){
            for(int r = 0; r < nums.length; r++){
                System.out.print(nums[r][c] + " ");
            }
            System.out.println();
        }

        /* --- PROBLEM 2 --- */
        System.out.println("---------");
        System.out.println("PROBLEM 2:");

        String[][] animals = {
                {"anteater", "bird"},
                {"camel", "dog"},
                {"elephant", "giraffe"},
                {"hyena", "jackal"}
        };
// write code below using a nested loop to update each element
// in animals to its plural form, e.g. bird --> birds;
// (no printing yet)

        for(int r = 0; r < animals.length; r++){
            for(int c = 0; c < animals[0].length;c++){
                animals[r][c] = animals[r][c] + "s";
            }
        }
// next, write code below to print out the 2D
// array in column-major order, showing each
// animal in inside a bracketed "enclosure"
// using "|" (like fences separating animal pens
// in a zoo)
        for(int c = 0; c < animals[animals.length-1].length;c++){
            for(int r = 0; r < animals.length; r++){
                System.out.print(animals[r][c] + "|");
            }
            System.out.println();
        }
    }
}
