package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.TopPinsAnalyticsResponseDateAvailability;
import org.openapitools.server.model.TopPinsAnalyticsResponsePinsItems;
import org.openapitools.server.model.TopPinsSortBy;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TopPinsAnalyticsResponse   {

    private TopPinsAnalyticsResponseDateAvailability dateAvailability;
    private List<@Valid TopPinsAnalyticsResponsePinsItems> pins = new ArrayList<>();
    private TopPinsSortBy sortBy;

    /**
     * Default constructor.
     */
    public TopPinsAnalyticsResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create TopPinsAnalyticsResponse.
     *
     * @param dateAvailability dateAvailability
     * @param pins pins
     * @param sortBy sortBy
     */
    public TopPinsAnalyticsResponse(
        TopPinsAnalyticsResponseDateAvailability dateAvailability, 
        List<@Valid TopPinsAnalyticsResponsePinsItems> pins, 
        TopPinsSortBy sortBy
    ) {
        this.dateAvailability = dateAvailability;
        this.pins = pins;
        this.sortBy = sortBy;
    }



    /**
     * Get dateAvailability
     * @return dateAvailability
     */
    public TopPinsAnalyticsResponseDateAvailability getDateAvailability() {
        return dateAvailability;
    }

    public void setDateAvailability(TopPinsAnalyticsResponseDateAvailability dateAvailability) {
        this.dateAvailability = dateAvailability;
    }

    /**
     * Get pins
     * @return pins
     */
    public List<@Valid TopPinsAnalyticsResponsePinsItems> getPins() {
        return pins;
    }

    public void setPins(List<@Valid TopPinsAnalyticsResponsePinsItems> pins) {
        this.pins = pins;
    }

    /**
     * Get sortBy
     * @return sortBy
     */
    public TopPinsSortBy getSortBy() {
        return sortBy;
    }

    public void setSortBy(TopPinsSortBy sortBy) {
        this.sortBy = sortBy;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopPinsAnalyticsResponse {\n");
        
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

