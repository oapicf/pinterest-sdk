package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.Country;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LocalStoreBatchUpdate   {

    private String addressPrimary;
    private String addressSecondary;
    private String city;
    private Country country;
    private String id;
    private Float latitude;
    private Float longitude;
    private String name;
    private String postalCode;
    private String region;
    private String storeCode;

    /**
     * Default constructor.
     */
    public LocalStoreBatchUpdate() {
    // JSON-B / Jackson
    }

    /**
     * Create LocalStoreBatchUpdate.
     *
     * @param addressPrimary Primary address line of the store.
     * @param addressSecondary Secondary address line of the store.
     * @param city City where the store is located.
     * @param country Country code where the store is located.
     * @param id The ID of the local store.
     * @param latitude Geographic latitude coordinate of the store.
     * @param longitude Geographic longitude coordinate of the store.
     * @param name The name of the local store.
     * @param postalCode Postal or ZIP code of the store.
     * @param region State or region code where the store is located.
     * @param storeCode Merchant provided code for the local store. Unique within the merchant&#39;s catalog.
     */
    public LocalStoreBatchUpdate(
        String addressPrimary, 
        String addressSecondary, 
        String city, 
        Country country, 
        String id, 
        Float latitude, 
        Float longitude, 
        String name, 
        String postalCode, 
        String region, 
        String storeCode
    ) {
        this.addressPrimary = addressPrimary;
        this.addressSecondary = addressSecondary;
        this.city = city;
        this.country = country;
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.postalCode = postalCode;
        this.region = region;
        this.storeCode = storeCode;
    }



    /**
     * Primary address line of the store.
     * @return addressPrimary
     */
    public String getAddressPrimary() {
        return addressPrimary;
    }

    public void setAddressPrimary(String addressPrimary) {
        this.addressPrimary = addressPrimary;
    }

    /**
     * Secondary address line of the store.
     * @return addressSecondary
     */
    public String getAddressSecondary() {
        return addressSecondary;
    }

    public void setAddressSecondary(String addressSecondary) {
        this.addressSecondary = addressSecondary;
    }

    /**
     * City where the store is located.
     * @return city
     */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Country code where the store is located.
     * @return country
     */
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * The ID of the local store.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Geographic latitude coordinate of the store.
     * @return latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    /**
     * Geographic longitude coordinate of the store.
     * @return longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    /**
     * The name of the local store.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Postal or ZIP code of the store.
     * @return postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * State or region code where the store is located.
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Merchant provided code for the local store. Unique within the merchant's catalog.
     * @return storeCode
     */
    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LocalStoreBatchUpdate {\n");
        
        sb.append("    addressPrimary: ").append(toIndentedString(addressPrimary)).append("\n");
        sb.append("    addressSecondary: ").append(toIndentedString(addressSecondary)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
        sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    storeCode: ").append(toIndentedString(storeCode)).append("\n");
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

