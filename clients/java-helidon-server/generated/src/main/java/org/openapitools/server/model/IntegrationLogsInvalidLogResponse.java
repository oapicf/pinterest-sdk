package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.IntegrationLogsInvalidLogResponseRejectedLogsItems;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Schema describing the response when a log has invalid fields.
 */
public class IntegrationLogsInvalidLogResponse   {

    private List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs = new ArrayList<>();

    /**
     * Default constructor.
     */
    public IntegrationLogsInvalidLogResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create IntegrationLogsInvalidLogResponse.
     *
     * @param rejectedLogs rejectedLogs
     */
    public IntegrationLogsInvalidLogResponse(
        List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs
    ) {
        this.rejectedLogs = rejectedLogs;
    }



    /**
     * Get rejectedLogs
     * @return rejectedLogs
     */
    public List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> getRejectedLogs() {
        return rejectedLogs;
    }

    public void setRejectedLogs(List<@Valid IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs) {
        this.rejectedLogs = rejectedLogs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegrationLogsInvalidLogResponse {\n");
        
        sb.append("    rejectedLogs: ").append(toIndentedString(rejectedLogs)).append("\n");
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

