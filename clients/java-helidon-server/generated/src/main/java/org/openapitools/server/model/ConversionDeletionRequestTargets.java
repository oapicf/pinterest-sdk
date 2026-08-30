package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ConversionDeletionRequestEPIKTargets;
import org.openapitools.server.model.ConversionDeletionRequestUserEmailTargets;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ConversionDeletionRequestTargets   {

    private List<String> userEmails = new ArrayList<>();
    private List<String> epiks = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ConversionDeletionRequestTargets() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionDeletionRequestTargets.
     *
     * @param userEmails Array of plain text user emails.
     * @param epiks Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
     */
    public ConversionDeletionRequestTargets(
        List<String> userEmails, 
        List<String> epiks
    ) {
        this.userEmails = userEmails;
        this.epiks = epiks;
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
     * Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
     * @return epiks
     */
    public List<String> getEpiks() {
        return epiks;
    }

    public void setEpiks(List<String> epiks) {
        this.epiks = epiks;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionDeletionRequestTargets {\n");
        
        sb.append("    userEmails: ").append(toIndentedString(userEmails)).append("\n");
        sb.append("    epiks: ").append(toIndentedString(epiks)).append("\n");
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

