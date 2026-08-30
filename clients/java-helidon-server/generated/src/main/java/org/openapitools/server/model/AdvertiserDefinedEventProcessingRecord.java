package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Processing record for an advertiser defined event operation
 */
public class AdvertiserDefinedEventProcessingRecord   {

    private List<String> exceptions = new ArrayList<>();
    private String name;
    private String status;

    /**
     * Default constructor.
     */
    public AdvertiserDefinedEventProcessingRecord() {
    // JSON-B / Jackson
    }

    /**
     * Create AdvertiserDefinedEventProcessingRecord.
     *
     * @param exceptions List of exception messages if the operation failed
     * @param name Name of the advertiser defined event
     * @param status Processing status (success or failure)
     */
    public AdvertiserDefinedEventProcessingRecord(
        List<String> exceptions, 
        String name, 
        String status
    ) {
        this.exceptions = exceptions;
        this.name = name;
        this.status = status;
    }



    /**
     * List of exception messages if the operation failed
     * @return exceptions
     */
    public List<String> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<String> exceptions) {
        this.exceptions = exceptions;
    }

    /**
     * Name of the advertiser defined event
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Processing status (success or failure)
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvertiserDefinedEventProcessingRecord {\n");
        
        sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

