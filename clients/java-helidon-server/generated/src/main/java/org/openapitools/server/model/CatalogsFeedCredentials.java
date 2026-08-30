package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * This field is **OPTIONAL**. Use this if your feed file requires username and password.
 */
public class CatalogsFeedCredentials   {

    private String password;
    private String username;

    /**
     * Default constructor.
     */
    public CatalogsFeedCredentials() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsFeedCredentials.
     *
     * @param password The required password for downloading a feed.
     * @param username The required username for downloading a feed.
     */
    public CatalogsFeedCredentials(
        String password, 
        String username
    ) {
        this.password = password;
        this.username = username;
    }



    /**
     * The required password for downloading a feed.
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * The required username for downloading a feed.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedCredentials {\n");
        
        sb.append("    password: ").append("*").append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

