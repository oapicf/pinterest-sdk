package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdsAnalytics   {

    private String AD_ID;
    private LocalDate DATE;

    /**
     * Default constructor.
     */
    public AdsAnalytics() {
    // JSON-B / Jackson
    }

    /**
     * Create AdsAnalytics.
     *
     * @param AD_ID AD_ID
     * @param DATE DATE
     */
    public AdsAnalytics(
        String AD_ID, 
        LocalDate DATE
    ) {
        this.AD_ID = AD_ID;
        this.DATE = DATE;
    }



    /**
     * Get AD_ID
     * @return AD_ID
     */
    public String getADID() {
        return AD_ID;
    }

    public void setADID(String AD_ID) {
        this.AD_ID = AD_ID;
    }

    /**
     * Get DATE
     * @return DATE
     */
    public LocalDate getDATE() {
        return DATE;
    }

    public void setDATE(LocalDate DATE) {
        this.DATE = DATE;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdsAnalytics {\n");
        
        sb.append("    AD_ID: ").append(toIndentedString(AD_ID)).append("\n");
        sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
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

