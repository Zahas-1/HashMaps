package SameDate; // Package declaration for the SimpleDate class

import java.util.Objects; // Importing Objects class from java.util package

public class SimpleDate { // Declaration of the SimpleDate class
    private int day; // Declaration of private integer variable to store the day
    private int month; // Declaration of private integer variable to store the month
    private int year; // Declaration of private integer variable to store the year

    // Constructor for the SimpleDate class, initializes day, month, and year
    public SimpleDate(int day, int month, int year) {
        this.day = day; // Assigns value to the day instance variable
        this.month = month; // Assigns value to the month instance variable
        this.year = year; // Assigns value to the year instance variable
    }

    // Getter method for retrieving the day
    public int getDay() {
        return this.day; // Returns the value of the day instance variable
    }

    // Getter method for retrieving the month
    public int getMonth() {
        return this.month; // Returns the value of the month instance variable
    }

    // Getter method for retrieving the year
    public int getYear() {
        return this.year; // Returns the value of the year instance variable
    }

    // Setter method for setting the day
    public void setDay(int day){ this.day = day; }

    // Setter method for setting the month
    public void setMonth(int month){ this.month = month; }

    // Setter method for setting the year
    public void setYear(int year){ this.year = year; }


    // Override equals method to compare SimpleDate objects
    @Override
    public boolean equals(Object compared) {
        // if the objects are located in the same memory location, they're the same
        if(this == compared){
            return true;
        }
        // if compared object is not an instance of SimpleDate class, they're not the same
        if(!(compared instanceof SimpleDate)){
            return false;
        }
        // let's convert the object to a SimpleDate object
        SimpleDate compared2 = (SimpleDate) compared;

        // if the instance variables of the objects are the same, they're the same objects
        if (this.day == compared2.day &&
                this.month == compared2.month &&
                this.year == compared2.year){
            return true;
        }
        return false;
    }

    // Override hashCode method to generate hash code for SimpleDate objects
    @Override
    public int hashCode() {
        int prime = 31; // A prime number commonly used in hash code calculations
        int hash = 1;   // Initial hash value
        hash = prime * hash + day;                     // Add day to hash
        hash = prime * hash + month;                   // Add month to hash
        hash = prime * hash + (year - 1900);          // Adjust year and add it to hash
        return hash;                                  // Return the calculated hash code
    }

    // Override toString method to return a string representation of the SimpleDate object
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year; // Returns concatenated day, month, and year
    }

    // Method to check if a date is before another date
    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }
        // if the years are the same, compare months
        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }
        // the years and the months are the same, compare days
        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }
        return false;
    }

    // Method to advance the date by one day
    public void advance(){
        this.day++; // Increment the day by one
    }

    // Method to advance the date by a specified number of days
    public void advance(int howManyDays){
        this.day += howManyDays; // Increment the day by the specified number of days
    }

    // Method to calculate the date after a specified number of days
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate newDate = new SimpleDate(this.day + days, this.month, this.year); // Create a new SimpleDate object with the incremented day
        if(newDate.day > 30){ // Check if the day exceeds the maximum day in a month
            newDate.day = newDate.day - 30; // Adjust the day to fall within the month
            newDate.month += 1; // Increment the month
            if(this.month > 12){ // Check if the month exceeds 12
                newDate.month = newDate.month - 12; // Adjust the month to fall within the year
                newDate.year += 1; // Increment the year
            }
            return newDate; // Return the new date
        } else return newDate; // Return the new date if no adjustment is needed
    }

    // Test code
    public static void main(String[] args){
        SimpleDate d = new SimpleDate(1, 2, 2000);
        System.out.println(d.equals("heh"));
        System.out.println(d.equals(new SimpleDate(5, 2, 2012)));
        System.out.println(d.equals(new SimpleDate(1, 2, 2000)));
    }
}
