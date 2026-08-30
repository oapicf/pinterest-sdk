package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CampaignBatchItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Response model for batch campaign write operations.
 */
public class CampaignBatchWriteResponseModel   {

    private List<@Valid CampaignBatchItem> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CampaignBatchWriteResponseModel() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignBatchWriteResponseModel.
     *
     * @param items items
     */
    public CampaignBatchWriteResponseModel(
        List<@Valid CampaignBatchItem> items
    ) {
        this.items = items;
    }



    /**
     * Get items
     * @return items
     */
    public List<@Valid CampaignBatchItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid CampaignBatchItem> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignBatchWriteResponseModel {\n");
        
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

