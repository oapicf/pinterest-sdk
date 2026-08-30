package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CampaignBatchResponseData;
import org.openapitools.server.model.Exception;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Item in a batch campaign response.
 */
public class CampaignBatchItem   {

    private CampaignBatchResponseData data;
    private List<@Valid Exception> exceptions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CampaignBatchItem() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignBatchItem.
     *
     * @param data Campaign data on success.
     * @param exceptions Exceptions on failure.
     */
    public CampaignBatchItem(
        CampaignBatchResponseData data, 
        List<@Valid Exception> exceptions
    ) {
        this.data = data;
        this.exceptions = exceptions;
    }



    /**
     * Campaign data on success.
     * @return data
     */
    public CampaignBatchResponseData getData() {
        return data;
    }

    public void setData(CampaignBatchResponseData data) {
        this.data = data;
    }

    /**
     * Exceptions on failure.
     * @return exceptions
     */
    public List<@Valid Exception> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<@Valid Exception> exceptions) {
        this.exceptions = exceptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignBatchItem {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

