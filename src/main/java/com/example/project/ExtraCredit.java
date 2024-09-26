package com.example.project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
                StringBuilder result = new StringBuilder();
        
        

                        //COPY AND PASTE YOUR CODE HERE 
                        //your code here
                        double decimalPercentage = (percent / 100f) + 1;            //learned to divide by 100 https://stackoverflow.com/questions/16961275/dividing-by-100-returns-0
                        double totalTip1 = (cost * decimalPercentage) - cost;
                        double totalTip = Math.round(totalTip1 * 100.0) / 100.0;                            //I learned rounding from https://stackoverflow.com/questions/11701399/round-up-to-2-decimal-places-in-java
                        double totalBill1 = totalTip1 + cost;
                        double totalBill = Math.round(totalBill1 * 100.0) / 100.0;
                        double PerPersonBeforeTip1 = cost / people;
                        double PerPersonBeforeTip = Math.round(PerPersonBeforeTip1 * 100.0) / 100.0;
                        double TipPerPerson1 = totalTip1 / people;
                        double TipPerPerson = Math.round(TipPerPerson1 * 100.0) / 100.0;
                        double TotalCostPerPerson1 = totalBill1 / people;
                        double TotalCostPerPerson = Math.round(TotalCostPerPerson1 * 100.0) / 100.0;
        
                
                        result.append("-------------------------------\n");
                        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
                        result.append("Total percentage: " + percent + "%\n");
                        result.append("Total tip: $" + totalTip + "\n");
                        result.append("Total Bill with tip: $" + totalBill + "\n");
                        result.append("Per person cost before tip: $" + PerPersonBeforeTip + "\n");
                        result.append("Tip per person: $" + TipPerPerson + "\n");
                        result.append("Total cost per person: $" + TotalCostPerPerson + "\n");
                        result.append("-------------------------------\n");        
                //the two lines  should go below result.append("-------------------------------\n"); 
                result.append("Items ordered:\n");
                result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> menuItems = new ArrayList<>();  // To store the list of menu items

        // Collect number of people, tip percentage, and total cost
        System.out.print("Enter the number of people: ");
        int people = scanner.nextInt();

        System.out.print("Enter the tip percentage: ");
        int percent = scanner.nextInt();

        System.out.print("Enter the total cost before tip: ");
        double cost = scanner.nextDouble();

        scanner.nextLine(); // Consume the leftover newline

        // Collect menu items until the user enters "-1"
        System.out.println("Enter menu items one by one (enter '-1' to finish):");
        while (true) {
            System.out.print("Enter an item: ");
            String item = scanner.nextLine();

            if (item.equals("-1")) {
                break;  // Exit loop when user enters "-1"
            }

            menuItems.add(item + "\n");  // Add item to the list
        }
            StringBuilder sb = new StringBuilder();                 //https://www.geeksforgeeks.org/convert-list-of-characters-to-string-in-java/
            for (String ch : menuItems) {
                sb.append(ch);
            }

            String items = sb.toString();
        // Display the results by calling calculateTip method
        System.out.println(calculateTip(people, percent, cost, items));

        scanner.close();
    }
    }

