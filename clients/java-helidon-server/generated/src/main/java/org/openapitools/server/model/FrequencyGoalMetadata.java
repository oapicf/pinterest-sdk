package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.FrequencyGoalMetadataTimerange;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Frequency target can only be between 2 and 20
 */
public class FrequencyGoalMetadata   {

    private Integer frequency;
    private FrequencyGoalMetadataTimerange timerange;

    /**
     * Default constructor.
     */
    public FrequencyGoalMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create FrequencyGoalMetadata.
     *
     * @param frequency frequency
     * @param timerange timerange
     */
    public FrequencyGoalMetadata(
        Integer frequency, 
        FrequencyGoalMetadataTimerange timerange
    ) {
        this.frequency = frequency;
        this.timerange = timerange;
    }



    /**
     * Get frequency
     * minimum: 2
     * maximum: 20
     * @return frequency
     */
    public Integer getFrequency() {
        return frequency;
    }

    public void setFrequency(Integer frequency) {
        this.frequency = frequency;
    }

    /**
     * Get timerange
     * @return timerange
     */
    public FrequencyGoalMetadataTimerange getTimerange() {
        return timerange;
    }

    public void setTimerange(FrequencyGoalMetadataTimerange timerange) {
        this.timerange = timerange;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FrequencyGoalMetadata {\n");
        
        sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
        sb.append("    timerange: ").append(toIndentedString(timerange)).append("\n");
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

