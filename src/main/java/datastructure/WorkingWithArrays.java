package datastructure;

import java.util.Arrays;

/***************************************************************
 Filename: 
 Created by: melat
 Created on: 02/05/2022
 Comment: 
 ***************************************************************/
public class WorkingWithArrays {
    public static void main(String[] args) {
        String[] colours = new String[5];
        colours[0] = "purple";
        colours[1] = "blue";
        System.out.println(Arrays.toString(colours));
        System.out.println(colours[1]);

        colours[1] = "yellow";
        System.out.println(colours[1]);

        //in this declaration the size is fixed.
        int[] numbers = {100, 200};
        System.out.println(Arrays.toString(numbers));

        System.out.println("For Loop Using Incrementation");
        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(colours[i] + "\t");
        }

        System.out.println("For Loop Using Decrementing");
        for(int i = colours.length - 1; i >=0; i--)
        {
            System.out.println(colours[i] + "\t");
        }

        System.out.println("ForEach Loop");
        for(String colour : colours)
        {
            System.out.println(colour + "\t");
        }

        //using streams
        System.out.println("ForEach Loop using stream");
        Arrays.stream(colours).forEach(System.out::println);

    }
}
