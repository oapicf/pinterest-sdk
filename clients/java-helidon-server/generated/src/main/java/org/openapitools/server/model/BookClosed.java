package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class BookClosed   {

    private Boolean conversionMetricsReady;
    private Boolean nonConversionMetricsReady;

    /**
     * Default constructor.
     */
    public BookClosed() {
    // JSON-B / Jackson
    }

    /**
     * Create BookClosed.
     *
     * @param conversionMetricsReady Are conversion metrics ready?
     * @param nonConversionMetricsReady Are non-conversion metrics ready?
     */
    public BookClosed(
        Boolean conversionMetricsReady, 
        Boolean nonConversionMetricsReady
    ) {
        this.conversionMetricsReady = conversionMetricsReady;
        this.nonConversionMetricsReady = nonConversionMetricsReady;
    }



    /**
     * Are conversion metrics ready?
     * @return conversionMetricsReady
     */
    public Boolean getConversionMetricsReady() {
        return conversionMetricsReady;
    }

    public void setConversionMetricsReady(Boolean conversionMetricsReady) {
        this.conversionMetricsReady = conversionMetricsReady;
    }

    /**
     * Are non-conversion metrics ready?
     * @return nonConversionMetricsReady
     */
    public Boolean getNonConversionMetricsReady() {
        return nonConversionMetricsReady;
    }

    public void setNonConversionMetricsReady(Boolean nonConversionMetricsReady) {
        this.nonConversionMetricsReady = nonConversionMetricsReady;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BookClosed {\n");
        
        sb.append("    conversionMetricsReady: ").append(toIndentedString(conversionMetricsReady)).append("\n");
        sb.append("    nonConversionMetricsReady: ").append(toIndentedString(nonConversionMetricsReady)).append("\n");
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

