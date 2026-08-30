package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class LeadsExportsCreate   {

    private String adId;
    private String endDate;
    private String startDate;

    /**
     * Default constructor.
     */
    public LeadsExportsCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadsExportsCreate.
     *
     * @param adId ID for the ad collecting leads.
     * @param endDate Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
     * @param startDate Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
     */
    public LeadsExportsCreate(
        String adId, 
        String endDate, 
        String startDate
    ) {
        this.adId = adId;
        this.endDate = endDate;
        this.startDate = startDate;
    }



    /**
     * ID for the ad collecting leads.
     * @return adId
     */
    public String getAdId() {
        return adId;
    }

    public void setAdId(String adId) {
        this.adId = adId;
    }

    /**
     * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
     * @return endDate
     */
    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
     * @return startDate
     */
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadsExportsCreate {\n");
        
        sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

