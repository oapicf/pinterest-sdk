package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class AdAccountAnalyticsItems   {

    private String AD_ACCOUNT_ID;
    private LocalDate DATE;

    /**
     * Default constructor.
     */
    public AdAccountAnalyticsItems() {
    // JSON-B / Jackson
    }

    /**
     * Create AdAccountAnalyticsItems.
     *
     * @param AD_ACCOUNT_ID AD_ACCOUNT_ID
     * @param DATE DATE
     */
    public AdAccountAnalyticsItems(
        String AD_ACCOUNT_ID, 
        LocalDate DATE
    ) {
        this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
        this.DATE = DATE;
    }



    /**
     * Get AD_ACCOUNT_ID
     * @return AD_ACCOUNT_ID
     */
    public String getADACCOUNTID() {
        return AD_ACCOUNT_ID;
    }

    public void setADACCOUNTID(String AD_ACCOUNT_ID) {
        this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
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
        sb.append("class AdAccountAnalyticsItems {\n");
        
        sb.append("    AD_ACCOUNT_ID: ").append(toIndentedString(AD_ACCOUNT_ID)).append("\n");
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

