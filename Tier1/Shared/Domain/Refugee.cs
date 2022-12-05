﻿namespace Shared.Domain;

public class Refugee
{
    public string Email { get; set; }
    public string Password { get; set; }
    public char Gender { get; set; }
    public string Nationality { get; set; }
    public string FirstName { get; set; }
    public string MiddleName { get; set; }
    public string LastName { get; set; }
    
    public Date DateOfBirth { get; set; }

    public Refugee(string email, string password, char gender, string nationality,
        string firstName, string middleName, string lastName, Date dateOfBirth)
    {
        Email = email;
        Password = password;
        Gender = gender;
        Nationality = nationality;
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
    }

    public Refugee()
    {
    }
}