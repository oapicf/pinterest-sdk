package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UserWebsite   {

    private String status;
    private String verifiedAt;
    private String website;

    /**
     * Default constructor.
     */
    public UserWebsite() {
    // JSON-B / Jackson
    }

    /**
     * Create UserWebsite.
     *
     * @param status Status of the verification process
     * @param verifiedAt UTC timestamp when the verification happened - sometimes missing
     * @param website Website with path or domain only
     */
    public UserWebsite(
        String status, 
        String verifiedAt, 
        String website
    ) {
        this.status = status;
        this.verifiedAt = verifiedAt;
        this.website = website;
    }



    /**
     * Status of the verification process
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * UTC timestamp when the verification happened - sometimes missing
     * @return verifiedAt
     */
    public String getVerifiedAt() {
        return verifiedAt;
    }

    public void setVerifiedAt(String verifiedAt) {
        this.verifiedAt = verifiedAt;
    }

    /**
     * Website with path or domain only
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
        sb.append("class UserWebsite {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
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

