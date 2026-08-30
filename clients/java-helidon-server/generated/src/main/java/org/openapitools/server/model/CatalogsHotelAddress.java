package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsHotelAddress   {

    private String addr1;
    private String city;
    private String country;
    private String postalCode;
    private String region;

    /**
     * Default constructor.
     */
    public CatalogsHotelAddress() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelAddress.
     *
     * @param addr1 Primary street address of hotel.
     * @param city City where the hotel is located.
     * @param country Country where the hotel is located.
     * @param postalCode Required for countries with a postal code system. Postal or zip code of the hotel.
     * @param region State, county, province, where the hotel is located.
     */
    public CatalogsHotelAddress(
        String addr1, 
        String city, 
        String country, 
        String postalCode, 
        String region
    ) {
        this.addr1 = addr1;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.region = region;
    }



    /**
     * Primary street address of hotel.
     * @return addr1
     */
    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    /**
     * City where the hotel is located.
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Country where the hotel is located.
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Required for countries with a postal code system. Postal or zip code of the hotel.
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * State, county, province, where the hotel is located.
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelAddress {\n");
        
        sb.append("    addr1: ").append(toIndentedString(addr1)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

