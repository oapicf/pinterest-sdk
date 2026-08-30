package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class FollowUser   {

    private String type;
    private String username;

    /**
     * Default constructor.
     */
    public FollowUser() {
    // JSON-B / Jackson
    }

    /**
     * Create FollowUser.
     *
     * @param type Always &#39;user&#39;
     * @param username Username
     */
    public FollowUser(
        String type, 
        String username
    ) {
        this.type = type;
        this.username = username;
    }



    /**
     * Always 'user'
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Username
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
        sb.append("class FollowUser {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

