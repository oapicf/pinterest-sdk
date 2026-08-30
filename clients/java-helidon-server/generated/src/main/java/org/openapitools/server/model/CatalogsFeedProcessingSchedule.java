package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsFeedProcessingScheduleTimezone;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
 */
public class CatalogsFeedProcessingSchedule   {

    private String time;
    private CatalogsFeedProcessingScheduleTimezone timezone;

    /**
     * Default constructor.
     */
    public CatalogsFeedProcessingSchedule() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsFeedProcessingSchedule.
     *
     * @param time A time in format HH:MM with leading 0 (zero)
     * @param timezone The timezone considered for the processing schedule time.
     */
    public CatalogsFeedProcessingSchedule(
        String time, 
        CatalogsFeedProcessingScheduleTimezone timezone
    ) {
        this.time = time;
        this.timezone = timezone;
    }



    /**
     * A time in format HH:MM with leading 0 (zero)
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    /**
     * The timezone considered for the processing schedule time.
     * @return timezone
     */
    public CatalogsFeedProcessingScheduleTimezone getTimezone() {
        return timezone;
    }

    public void setTimezone(CatalogsFeedProcessingScheduleTimezone timezone) {
        this.timezone = timezone;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsFeedProcessingSchedule {\n");
        
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

