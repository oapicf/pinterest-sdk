package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.TopVideoPinsAnalyticsResponseDateAvailability;
import org.openapitools.server.model.TopVideoPinsAnalyticsResponsePinsItems;
import org.openapitools.server.model.TopVideoPinsSortBy;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TopVideoPinsAnalyticsResponse   {

    private TopVideoPinsAnalyticsResponseDateAvailability dateAvailability;
    private List<@Valid TopVideoPinsAnalyticsResponsePinsItems> pins = new ArrayList<>();
    private TopVideoPinsSortBy sortBy;

    /**
     * Default constructor.
     */
    public TopVideoPinsAnalyticsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create TopVideoPinsAnalyticsResponse.
     *
     * @param dateAvailability dateAvailability
     * @param pins pins
     * @param sortBy sortBy
     */
    public TopVideoPinsAnalyticsResponse(
        TopVideoPinsAnalyticsResponseDateAvailability dateAvailability, 
        List<@Valid TopVideoPinsAnalyticsResponsePinsItems> pins, 
        TopVideoPinsSortBy sortBy
    ) {
        this.dateAvailability = dateAvailability;
        this.pins = pins;
        this.sortBy = sortBy;
    }



    /**
     * Get dateAvailability
     * @return dateAvailability
     */
    public TopVideoPinsAnalyticsResponseDateAvailability getDateAvailability() {
        return dateAvailability;
    }

    public void setDateAvailability(TopVideoPinsAnalyticsResponseDateAvailability dateAvailability) {
        this.dateAvailability = dateAvailability;
    }

    /**
     * Get pins
     * @return pins
     */
    public List<@Valid TopVideoPinsAnalyticsResponsePinsItems> getPins() {
        return pins;
    }

    public void setPins(List<@Valid TopVideoPinsAnalyticsResponsePinsItems> pins) {
        this.pins = pins;
    }

    /**
     * Get sortBy
     * @return sortBy
     */
    public TopVideoPinsSortBy getSortBy() {
        return sortBy;
    }

    public void setSortBy(TopVideoPinsSortBy sortBy) {
        this.sortBy = sortBy;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopVideoPinsAnalyticsResponse {\n");
        
        sb.append("    dateAvailability: ").append(toIndentedString(dateAvailability)).append("\n");
        sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
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

