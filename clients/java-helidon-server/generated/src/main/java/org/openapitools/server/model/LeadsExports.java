package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LeadsExports   {

    private String leadsExportId;

    /**
     * Default constructor.
     */
    public LeadsExports() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadsExports.
     *
     * @param leadsExportId ID for the leads export job.
     */
    public LeadsExports(
        String leadsExportId
    ) {
        this.leadsExportId = leadsExportId;
    }



    /**
     * ID for the leads export job.
     * @return leadsExportId
     */
    public String getLeadsExportId() {
        return leadsExportId;
    }

    public void setLeadsExportId(String leadsExportId) {
        this.leadsExportId = leadsExportId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadsExports {\n");
        
        sb.append("    leadsExportId: ").append(toIndentedString(leadsExportId)).append("\n");
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

