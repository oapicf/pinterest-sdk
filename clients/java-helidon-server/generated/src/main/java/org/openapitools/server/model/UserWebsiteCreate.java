package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.WebsiteVerificationMethod;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class UserWebsiteCreate   {

    private WebsiteVerificationMethod verificationMethod;
    private String website;

    /**
     * Default constructor.
     */
    public UserWebsiteCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create UserWebsiteCreate.
     *
     * @param verificationMethod Method used to verify website ownership.
     * @param website Website with path or domain only
     */
    public UserWebsiteCreate(
        WebsiteVerificationMethod verificationMethod, 
        String website
    ) {
        this.verificationMethod = verificationMethod;
        this.website = website;
    }



    /**
     * Method used to verify website ownership.
     * @return verificationMethod
     */
    public WebsiteVerificationMethod getVerificationMethod() {
        return verificationMethod;
    }

    public void setVerificationMethod(WebsiteVerificationMethod verificationMethod) {
        this.verificationMethod = verificationMethod;
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
        sb.append("class UserWebsiteCreate {\n");
        
        sb.append("    verificationMethod: ").append(toIndentedString(verificationMethod)).append("\n");
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

