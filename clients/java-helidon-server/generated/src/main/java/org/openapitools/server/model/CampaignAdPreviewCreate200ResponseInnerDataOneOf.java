package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.PinterestLibError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CampaignAdPreviewCreate200ResponseInnerDataOneOf   {

    private PinterestLibError exceptions;

    /**
     * Default constructor.
     */
    public CampaignAdPreviewCreate200ResponseInnerDataOneOf() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignAdPreviewCreate200ResponseInnerDataOneOf.
     *
     * @param exceptions exceptions
     */
    public CampaignAdPreviewCreate200ResponseInnerDataOneOf(
        PinterestLibError exceptions
    ) {
        this.exceptions = exceptions;
    }



    /**
     * Get exceptions
     * @return exceptions
     */
    public PinterestLibError getExceptions() {
        return exceptions;
    }

    public void setExceptions(PinterestLibError exceptions) {
        this.exceptions = exceptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignAdPreviewCreate200ResponseInnerDataOneOf {\n");
        
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

