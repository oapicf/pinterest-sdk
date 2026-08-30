package org.openapitools.server.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PredictedTimeSeries extends HashMap<String, Integer>  {

    private LocalDate date;

    /**
     * Default constructor.
     */
    public PredictedTimeSeries() {
    // JSON-B / Jackson
    }

    /**
     * Create PredictedTimeSeries.
     *
     * @param date date
     */
    public PredictedTimeSeries(
        LocalDate date
    ) {
        this.date = date;
    }



    /**
     * Get date
     * @return date
     */
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PredictedTimeSeries {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

