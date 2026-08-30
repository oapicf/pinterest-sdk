package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.IntegrationLog;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class IntegrationLogsRequestCreate   {

    private List<@Valid IntegrationLog> logs = new ArrayList<>();

    /**
     * Default constructor.
     */
    public IntegrationLogsRequestCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create IntegrationLogsRequestCreate.
     *
     * @param logs logs
     */
    public IntegrationLogsRequestCreate(
        List<@Valid IntegrationLog> logs
    ) {
        this.logs = logs;
    }



    /**
     * Get logs
     * @return logs
     */
    public List<@Valid IntegrationLog> getLogs() {
        return logs;
    }

    public void setLogs(List<@Valid IntegrationLog> logs) {
        this.logs = logs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntegrationLogsRequestCreate {\n");
        
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
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

