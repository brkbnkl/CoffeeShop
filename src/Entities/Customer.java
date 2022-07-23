package Entities;

import Abstract.Entities;

public class Customer implements Entities {

    int id;
    String FirstName;
    String LastName;
    int DateOfBirth;
    String NationalitId;

    public Customer() {

    }

    public Customer(int id, String firstName, String lastName, int dateOfBirth, String nationalitId) {
        this.id = id;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.DateOfBirth = dateOfBirth;
        this.NationalitId = nationalitId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public Integer getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationalitId() {
        return NationalitId;
    }

    public void setNationalitId(String nationalitId) {
        NationalitId = nationalitId;
    }
}
