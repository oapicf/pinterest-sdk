package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdPinAnalytics   {

    private LocalDate DATE;
    private String PIN_ID;

    /**
     * Default constructor.
     */
    public AdPinAnalytics() {
    // JSON-B / Jackson
    }

    /**
     * Create AdPinAnalytics.
     *
     * @param DATE Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
     * @param PIN_ID The ID of the pin that the metric belongs to.
     */
    public AdPinAnalytics(
        LocalDate DATE, 
        String PIN_ID
    ) {
        this.DATE = DATE;
        this.PIN_ID = PIN_ID;
    }



    /**
     * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
     * @return DATE
     */
    public LocalDate getDATE() {
        return DATE;
    }

    public void setDATE(LocalDate DATE) {
        this.DATE = DATE;
    }

    /**
     * The ID of the pin that the metric belongs to.
     * @return PIN_ID
     */
    public String getPINID() {
        return PIN_ID;
    }

    public void setPINID(String PIN_ID) {
        this.PIN_ID = PIN_ID;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdPinAnalytics {\n");
        
        sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
        sb.append("    PIN_ID: ").append(toIndentedString(PIN_ID)).append("\n");
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

