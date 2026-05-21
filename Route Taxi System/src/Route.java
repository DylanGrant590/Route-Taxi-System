// Name: Dylan Grant
// Date: May 17, 2026.

import java.time.LocalDate;

public class Route {

    private String firstname;
    private String lastname;
    private LocalDate dob;
    private String trn;
    private String phone;
    private String email;
    private String route;
    private double fare;
    private double earn;
    private String info;

    // Constructor
    public Route(String firstname, String lastname, LocalDate dob,
                 String trn, String phone, String email,
                 String route, double fare, double earn, String info) {

        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.trn = trn;
        this.phone = phone;
        this.email = email;
        this.route = route;
        this.fare = fare;
        this.earn = earn;
        this.info = info;
    }

    // Getters
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getTrn() {
        return trn;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getRoute() {
        return route;
    }

    public double getFare() {
        return fare;
    }

    public double getEarn() {
        return earn;
    }
    
    public String info() {
    	return info;
    }

    // Setters
    public void setFare(double fare) {
        this.fare = fare;
    }

    public void setEarn(double earn) {
        this.earn = earn;
    }

    // toString Method
    @Override
    public String toString() {

        return "\nFirst Name: " + firstname +
               "\nLast Name: " + lastname +
               "\nDate of Birth: " + dob +
               "\nTRN: " + trn +
               "\nPhone Number: " + phone +
               "\nEmail Address: " + email +
               "\nRoute: " + route +
               "\nFare: $" + fare +
               "\nTotal Earnings: $" + earn
               +  "\nDriver Info: " + info;
    }
}