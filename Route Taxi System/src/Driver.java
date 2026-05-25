// Name: Dylan Grant
// Date: May 17, 2026.

import java.util.Scanner;
import java.time.LocalDate;

public class Driver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        boolean running = true;
        
        Route driver = null;

        while (running) {

            try { // Program needs updating. 

                System.out.println("***********************");
                System.out.println("*  Route Taxi System  *");
                System.out.println("***********************");
                System.out.println("1. Add Driver");
                System.out.println("2. View All Drivers");
                System.out.println("3. Search Driver by TRN");
                System.out.println("4. Update Driver");
                System.out.println("5. Delete Driver");
                System.out.println("6. Add Vechile");
                System.out.println("7. Calculate Fare");
                System.out.println("8. View Daily Earnings");
                System.out.println("9. Exit");

                System.out.print("\nPlease enter a number from the menu: ");

                int number = scanner.nextInt();
                scanner.nextLine();

                switch (number) {

                    case 1:

                        System.out.print("First name: ");
                        String firstname = scanner.nextLine();

                        System.out.print("Last name: ");
                        String lastname = scanner.nextLine();

                        System.out.print("Enter DOB (YYYY-MM-DD): ");
                        String input = scanner.nextLine();

                        LocalDate dob = LocalDate.parse(input);

                        System.out.print("TRN: ");
                        String trn = scanner.nextLine();

                        System.out.print("Phone number: ");
                        String phone = scanner.nextLine();

                        System.out.print("Email address: ");
                        String email = scanner.nextLine();
                        
                        driver = new Route(
                                firstname,
                                lastname,
                                dob,
                                trn,
                                phone,
                                email,
                                "",
                                0.0,
                                0.0,
                                "Driver Record.");

                        System.out.println("\nDriver Added Successfully!");
                        break;

                    case 2:

                    	  if (driver == null) {

                              System.out.println("No driver has been added yet.");
                              System.out.println("\n");

                          } else {

                              System.out.println(driver);
                          }

                          break;

                    case 3:

                        System.out.print("Search driver by TRN");
                        double sdtrn = scanner.nextDouble();
                        break;
                        
                    case 4: 
                    	
                    	System.out.println("Update Driver");
                    	String update = scanner.nextLine();
                    	break; 
                    	
                    case 5:
                    	
                    	System.out.println("Delete driver");
                    	String delete = scanner.nextLine();
                    	break;
                    	
                    case 6:
                    	
                    	System.out.println("Add vechile");
                    	String vechile = scanner.nextLine();
                    	break;
                    	
                    case 7:
                    	
                    	System.out.println("Calculate fare");
                    	double fare = scanner.nextDouble();
                    	break; 
                    	
                    case 8:

                        System.out.print("Total Earnings: ");
                        double earn = scanner.nextDouble();

                        if (earn <= 0) {

                            System.out.println("No earnings recorded for today.");

                        } else {

                            System.out.println("Daily Earnings: $" + earn);
                        }

                        break;
           

                    case 9:

                        System.out.println("Thank you for using our service!");
                        running = false;
                        break;

                    default:

                        System.out.println("Invalid menu option! Please try again.");
                }

            } catch (IllegalArgumentException e) {

                System.out.println("Error: Invalid date format. Use YYYY-MM-DD.");

            } catch (Exception e) {

                System.out.println("Invalid input! Please try again.");
                System.out.println("\n");
                scanner.nextLine();
            }
        }

        scanner.close();
        }
    }