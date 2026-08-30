package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.CampaignAdPreviewDelete200ResponseInnerStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CampaignAdPreviewDelete200ResponseInner   {

    private CampaignAdPreviewDelete200ResponseInnerStatus status;

    /**
     * Default constructor.
     */
    public CampaignAdPreviewDelete200ResponseInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignAdPreviewDelete200ResponseInner.
     *
     * @param status status
     */
    public CampaignAdPreviewDelete200ResponseInner(
        CampaignAdPreviewDelete200ResponseInnerStatus status
    ) {
        this.status = status;
    }



    /**
     * Get status
     * @return status
     */
    public CampaignAdPreviewDelete200ResponseInnerStatus getStatus() {
        return status;
    }

    public void setStatus(CampaignAdPreviewDelete200ResponseInnerStatus status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignAdPreviewDelete200ResponseInner {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

