package homework;

public class Person {

    // Instance variables
    private String firstName;
    private String lastName;
    private int age;

    // Get data
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    // Set data
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;  // Set age to 0 if it's less than 0 or greater than 100
        } else {
            this.age = age;
        }
    }

    // Method for check the person is a teen
    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    // Method for get the full name
    public String getFullName() {
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";  // Return empty if both first and last names are empty
        } else if (firstName.isEmpty()) {
            return lastName;  // Return lastName if firstName is empty
        } else if (lastName.isEmpty()) {
            return firstName;  // Return firstName if lastName is empty
        } else {
            return firstName + " " + lastName;  // Return full name if both are present
        }
    }
}
