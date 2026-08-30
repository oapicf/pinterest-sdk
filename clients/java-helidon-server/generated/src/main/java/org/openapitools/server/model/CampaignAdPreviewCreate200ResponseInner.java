package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.CampaignAdPreviewCreate200ResponseInnerData;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CampaignAdPreviewCreate200ResponseInner   {

    private CampaignAdPreviewCreate200ResponseInnerData data;

    /**
     * Default constructor.
     */
    public CampaignAdPreviewCreate200ResponseInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignAdPreviewCreate200ResponseInner.
     *
     * @param data data
     */
    public CampaignAdPreviewCreate200ResponseInner(
        CampaignAdPreviewCreate200ResponseInnerData data
    ) {
        this.data = data;
    }



    /**
     * Get data
     * @return data
     */
    public CampaignAdPreviewCreate200ResponseInnerData getData() {
        return data;
    }

    public void setData(CampaignAdPreviewCreate200ResponseInnerData data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignAdPreviewCreate200ResponseInner {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

