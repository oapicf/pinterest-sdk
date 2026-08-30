package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.CampaignAdPreviewDelete200ResponseInnerStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsLocalStoresDelete200ResponseInner   {

    private String id;
    private CampaignAdPreviewDelete200ResponseInnerStatus status;

    /**
     * Default constructor.
     */
    public CatalogsLocalStoresDelete200ResponseInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsLocalStoresDelete200ResponseInner.
     *
     * @param id The ID of the local store.
     * @param status status
     */
    public CatalogsLocalStoresDelete200ResponseInner(
        String id, 
        CampaignAdPreviewDelete200ResponseInnerStatus status
    ) {
        this.id = id;
        this.status = status;
    }



    /**
     * The ID of the local store.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        sb.append("class CatalogsLocalStoresDelete200ResponseInner {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

