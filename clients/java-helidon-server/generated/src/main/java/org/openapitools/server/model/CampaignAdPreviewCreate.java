package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class CampaignAdPreviewCreate   {

    private String adGroupId;

    /**
     * Default constructor.
     */
    public CampaignAdPreviewCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignAdPreviewCreate.
     *
     * @param adGroupId Ad group ID to create a preview record for.
     */
    public CampaignAdPreviewCreate(
        String adGroupId
    ) {
        this.adGroupId = adGroupId;
    }



    /**
     * Ad group ID to create a preview record for.
     * @return adGroupId
     */
    public String getAdGroupId() {
        return adGroupId;
    }

    public void setAdGroupId(String adGroupId) {
        this.adGroupId = adGroupId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignAdPreviewCreate {\n");
        
        sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
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

