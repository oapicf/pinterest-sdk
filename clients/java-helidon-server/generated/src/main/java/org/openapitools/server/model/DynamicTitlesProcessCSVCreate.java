package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class DynamicTitlesProcessCSVCreate   {

    private String requestId;

    /**
     * Default constructor.
     */
    public DynamicTitlesProcessCSVCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create DynamicTitlesProcessCSVCreate.
     *
     * @param requestId The request_id returned from the GET uploads endpoint.
     */
    public DynamicTitlesProcessCSVCreate(
        String requestId
    ) {
        this.requestId = requestId;
    }



    /**
     * The request_id returned from the GET uploads endpoint.
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DynamicTitlesProcessCSVCreate {\n");
        
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

