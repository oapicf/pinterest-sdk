package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * ID of the bulk request.
 */
public class BulkUpsertResponse   {

    private String requestId;

    /**
     * Default constructor.
     */
    public BulkUpsertResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create BulkUpsertResponse.
     *
     * @param requestId requestId
     */
    public BulkUpsertResponse(
        String requestId
    ) {
        this.requestId = requestId;
    }



    /**
     * Get requestId
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
        sb.append("class BulkUpsertResponse {\n");
        
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

