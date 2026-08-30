package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.PinterestLibError;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SchedulesCreate200ResponseInnerDataOneOf   {

    private String id;
    private String scheduleId;
    private PinterestLibError exceptions;

    /**
     * Default constructor.
     */
    public SchedulesCreate200ResponseInnerDataOneOf() {
    // JSON-B / Jackson
    }

    /**
     * Create SchedulesCreate200ResponseInnerDataOneOf.
     *
     * @param id id
     * @param scheduleId Schedule ID.
     * @param exceptions exceptions
     */
    public SchedulesCreate200ResponseInnerDataOneOf(
        String id, 
        String scheduleId, 
        PinterestLibError exceptions
    ) {
        this.id = id;
        this.scheduleId = scheduleId;
        this.exceptions = exceptions;
    }



    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Schedule ID.
     * @return scheduleId
     */
    public String getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }

    /**
     * Get exceptions
     * @return exceptions
     */
    public PinterestLibError getExceptions() {
        return exceptions;
    }

    public void setExceptions(PinterestLibError exceptions) {
        this.exceptions = exceptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SchedulesCreate200ResponseInnerDataOneOf {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
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

