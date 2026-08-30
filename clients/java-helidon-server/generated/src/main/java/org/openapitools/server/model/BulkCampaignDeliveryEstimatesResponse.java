package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BulkCampaignDeliveryEstimatesItem;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Bulk campaign delivery estimates response.
 */
public class BulkCampaignDeliveryEstimatesResponse   {

    private List<@Valid BulkCampaignDeliveryEstimatesItem> data = new ArrayList<>();

    /**
     * Default constructor.
     */
    public BulkCampaignDeliveryEstimatesResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create BulkCampaignDeliveryEstimatesResponse.
     *
     * @param data Per-campaign delivery estimate results, in the same order as the request.
     */
    public BulkCampaignDeliveryEstimatesResponse(
        List<@Valid BulkCampaignDeliveryEstimatesItem> data
    ) {
        this.data = data;
    }



    /**
     * Per-campaign delivery estimate results, in the same order as the request.
     * @return data
     */
    public List<@Valid BulkCampaignDeliveryEstimatesItem> getData() {
        return data;
    }

    public void setData(List<@Valid BulkCampaignDeliveryEstimatesItem> data) {
        this.data = data;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkCampaignDeliveryEstimatesResponse {\n");
        
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

