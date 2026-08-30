package org.openapitools.server.model;

import org.openapitools.server.model.ConversionDeletionRequestTargets;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class ConversionDeletionRequestCreate   {

    private ConversionDeletionRequestTargets deletionTargets;

    /**
     * Default constructor.
     */
    public ConversionDeletionRequestCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionDeletionRequestCreate.
     *
     * @param deletionTargets Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
     */
    public ConversionDeletionRequestCreate(
        ConversionDeletionRequestTargets deletionTargets
    ) {
        this.deletionTargets = deletionTargets;
    }



    /**
     * Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
     * @return deletionTargets
     */
    public ConversionDeletionRequestTargets getDeletionTargets() {
        return deletionTargets;
    }

    public void setDeletionTargets(ConversionDeletionRequestTargets deletionTargets) {
        this.deletionTargets = deletionTargets;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionDeletionRequestCreate {\n");
        
        sb.append("    deletionTargets: ").append(toIndentedString(deletionTargets)).append("\n");
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

