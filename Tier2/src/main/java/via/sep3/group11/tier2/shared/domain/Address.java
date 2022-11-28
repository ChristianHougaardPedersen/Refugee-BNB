package via.sep3.group11.tier2.shared.domain;


import via.sep3.group11.tier2.shared.exceptions.ValidationException;

import static via.sep3.group11.tier2.shared.domain.ValidationHelper.SimpleValidateString;

/**
 * Class representing an address belonging to a Housing-object.
 * @version 27/11-2022
 * @author Group 11
 */
public class Address {

    private long addressId;
    private String country;
    private String city;
    private String streetName;
    private String houseNumber;
    private String roomNumber;
    private String postCode;

    /**
     * 6-argument constructor used to create an instance of the Address object.
     * All arguments are initialized by calling their corresponding set-method.
     * addressId is not initialized here, as it is assigned by the database implementation when created.
     * @param country: The country of the address.
     * @param city: The city of the address.
     * @param streetName: The street name of the address.
     * @param houseNumber: The house number of the address.
     * @param roomNumber: The room number of the address.
     * @param postCode: The post code of the address.
     * @throws ValidationException if any set method throws an exception.
     */
    public Address(String country, String city, String streetName, String houseNumber, String roomNumber, String postCode) throws ValidationException {
        setCountry(country);
        setCity(city);
        setStreetName(streetName);
        setHouseNumber(houseNumber);
        setRoomNumber(roomNumber);
        setPostCode(postCode);
    }

    public Address(Long id,String country, String city, String streetName, String houseNumber, String roomNumber, String postCode) throws ValidationException {
        setCountry(country);
        setCity(city);
        setStreetName(streetName);
        setHouseNumber(houseNumber);
        setRoomNumber(roomNumber);
        setPostCode(postCode);
        setAddressId(id);
    }

    /**
     * Getter-method for getting the id of the address.
     * @return the id of the address.
     */
    public long getAddressId() {
        return addressId;
    }

    // Todo would this ever be needed??
    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    /**
     * Getter-method for getting the country of the address.
     * @return the country of the address.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter-method used for validating the string given as argument and then setting the objects variable to this.
     * Validation of the string is done by calling the SimpleValidateString-method and passing the string-value and the name of the variable as arguments.
     * @param country: String representation of the country of the address.
     * @throws ValidationException if the parameter is either null or an empty string.
     */
    public void setCountry(String country) throws ValidationException {
        SimpleValidateString(country, "Country");
        this.country = country;
    }

    /**
     * Getter-method for getting the city of the address.
     * @return the city of the address.
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter-method used for validating the string given as argument and then setting the objects variable to this.
     * Validation of the string is done by calling the SimpleValidateString-method and passing the string-value and the name of the variable as arguments.
     * @param city: String representation of the city of the address.
     * @throws ValidationException if the parameter is either null or an empty string.
     */
    public void setCity(String city) throws ValidationException {
        SimpleValidateString(city, "City");
        this.city = city;
    }

    /**
     * Getter-method for getting the street name of the address.
     * @return the street name of the address.
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Setter-method used for validating the string given as argument and then setting the objects variable to this.
     * Validation of the string is done by calling the SimpleValidateString-method and passing the string-value and the name of the variable as arguments.
     * @param streetName: String representation of the street name of the address.
     * @throws ValidationException if the parameter is either null or an empty string.
     */
    public void setStreetName(String streetName) throws ValidationException {
        SimpleValidateString(streetName, "Street name");
        this.streetName = streetName;
    }

    /**
     * Getter-method for getting the house number of the address.
     * @return the house number of the address.
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * Setter-method used for validating the string given as argument and then setting the objects variable to this.
     * Validation of the string is done by calling the SimpleValidateString-method and passing the string-value and the name of the variable as arguments.
     * @param houseNumber: String representation of the house number of the address.
     * @throws ValidationException if the parameter is either null or an empty string.
     */
    public void setHouseNumber(String houseNumber) throws ValidationException {
        SimpleValidateString(houseNumber, "House Number");
        this.houseNumber = houseNumber;
    }

    /**
     * Getter-method for getting the room number of the address.
     * @return the room number of the address.
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Setter-method used for validating the string given as argument and then setting the objects variable to this.
     * Validation of the string is done by calling the SimpleValidateString-method and passing the string-value and the name of the variable as arguments.
     * If an exception is thrown by the validator-method, it means that the string is either null or empty, in which case the variable is set to be an empty string.
     * @param roomNumber: String representation of the room number of the address.
     */
    public void setRoomNumber(String roomNumber) {
        try {
            SimpleValidateString(roomNumber, "Room Number");
            this.roomNumber = roomNumber;
        } catch (ValidationException ve) {
            this.roomNumber = "";
        }
    }

    /**
     * Getter-method for getting the post code of the address.
     * @return the post code of the address.
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Setter-method used for validating the string given as argument and then setting the objects variable to this.
     * Validation of the string is done by calling the SimpleValidateString-method and passing the string-value and the name of the variable as arguments.
     * @param postCode: String representation of the post code of the address.
     * @throws ValidationException if the parameter is either null or an empty string.
     */
    public void setPostCode(String postCode) throws ValidationException {
        SimpleValidateString(postCode, "Postcode");
        this.postCode = postCode;
    }
}
