package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.BrandAccountProfileImage;
import org.openapitools.server.model.Country;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class BrandAccountCreate   {

    private String about;
    private Country country;
    private String name;
    private BrandAccountProfileImage profileImage;
    private String username;
    private String website;

    /**
     * Default constructor.
     */
    public BrandAccountCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create BrandAccountCreate.
     *
     * @param about Brand Account about information
     * @param country country
     * @param name Brand Account name
     * @param profileImage profileImage
     * @param username Brand Account username
     * @param website Brand Account website
     */
    public BrandAccountCreate(
        String about, 
        Country country, 
        String name, 
        BrandAccountProfileImage profileImage, 
        String username, 
        String website
    ) {
        this.about = about;
        this.country = country;
        this.name = name;
        this.profileImage = profileImage;
        this.username = username;
        this.website = website;
    }



    /**
     * Brand Account about information
     * @return about
     */
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * Get country
     * @return country
     */
    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    /**
     * Brand Account name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get profileImage
     * @return profileImage
     */
    public BrandAccountProfileImage getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(BrandAccountProfileImage profileImage) {
        this.profileImage = profileImage;
    }

    /**
     * Brand Account username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Brand Account website
     * @return website
     */
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BrandAccountCreate {\n");
        
        sb.append("    about: ").append(toIndentedString(about)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

