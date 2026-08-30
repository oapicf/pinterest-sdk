package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Metadata of the member/partner that has access to the asset.
 */
public class CancelInviteResultUser   {

    private String email;
    private String id;
    private String username;

    /**
     * Default constructor.
     */
    public CancelInviteResultUser() {
    // JSON-B / Jackson
    }

    /**
     * Create CancelInviteResultUser.
     *
     * @param email Email of the business member/partner.
     * @param id Unique identifier of the business member/partner.
     * @param username Username of the business member/partner.
     */
    public CancelInviteResultUser(
        String email, 
        String id, 
        String username
    ) {
        this.email = email;
        this.id = id;
        this.username = username;
    }



    /**
     * Email of the business member/partner.
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Unique identifier of the business member/partner.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Username of the business member/partner.
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
        sb.append("class CancelInviteResultUser {\n");
        
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

