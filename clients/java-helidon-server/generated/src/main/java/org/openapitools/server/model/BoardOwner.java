package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BoardOwner   {

    private String username;

    /**
     * Default constructor.
     */
    public BoardOwner() {
    // JSON-B / Jackson
    }

    /**
     * Create BoardOwner.
     *
     * @param username username
     */
    public BoardOwner(
        String username
    ) {
        this.username = username;
    }



    /**
     * Get username
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
        sb.append("class BoardOwner {\n");
        
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

