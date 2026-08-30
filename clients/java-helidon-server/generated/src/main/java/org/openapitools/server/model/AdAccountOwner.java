package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdAccountOwner   {

    private String id;
    private String username;

    /**
     * Default constructor.
     */
    public AdAccountOwner() {
    // JSON-B / Jackson
    }

    /**
     * Create AdAccountOwner.
     *
     * @param id The owning account&#39;s user ID.
     * @param username Public username for the user account
     */
    public AdAccountOwner(
        String id, 
        String username
    ) {
        this.id = id;
        this.username = username;
    }



    /**
     * The owning account's user ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Public username for the user account
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
        sb.append("class AdAccountOwner {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

