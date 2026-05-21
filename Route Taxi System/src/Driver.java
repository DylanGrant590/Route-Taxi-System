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

            try {

                System.out.println("***********************");
                System.out.println("*  Route Taxi System  *");
                System.out.println("***********************");
                System.out.println("1. Add Driver");
                System.out.println("2. Add Route");
                System.out.println("3. Calculate Fare");
                System.out.println("4. View Daily Earnings");
                System.out.println("5. View Driver");
                System.out.println("6. Exit");

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
                                "Driver Record");

                        System.out.println("\nDriver Added Successfully!");
                        break;

                    case 2:

                        System.out.print("Route: ");
                        String route = scanner.nextLine();

                        System.out.println("Route Added: " + route);
                        break;

                    case 3:

                        System.out.print("Fare: ");
                        double fare = scanner.nextDouble();

                        System.out.println("Fare is: $" + fare);
                        break;

                    case 4:

                        System.out.print("Total Earnings: ");
                        double earn = scanner.nextDouble();

                        if (earn <= 0) {

                            System.out.println("No earnings recorded for today.");

                        } else {

                            System.out.println("Daily Earnings: $" + earn);
                        }

                        break;
                        
                    case 5:
                    	
                    	  if (driver == null) {

                              System.out.println("No driver has been added yet.");
                              System.out.println("\n");

                          } else {

                              System.out.println(driver);
                          }

                          break;

                    case 6:

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