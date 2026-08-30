package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConversionDeletionRequestUserEmailTargets   {

    private List<String> userEmails = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ConversionDeletionRequestUserEmailTargets() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionDeletionRequestUserEmailTargets.
     *
     * @param userEmails Array of plain text user emails.
     */
    public ConversionDeletionRequestUserEmailTargets(
        List<String> userEmails
    ) {
        this.userEmails = userEmails;
    }



    /**
     * Array of plain text user emails.
     * @return userEmails
     */
    public List<String> getUserEmails() {
        return userEmails;
    }

    public void setUserEmails(List<String> userEmails) {
        this.userEmails = userEmails;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionDeletionRequestUserEmailTargets {\n");
        
        sb.append("    userEmails: ").append(toIndentedString(userEmails)).append("\n");
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

