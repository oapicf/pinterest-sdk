package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.LeadsExportStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LeadsExportResponseData   {

    private String downloadUrl;
    private LeadsExportStatus exportStatus;

    /**
     * Default constructor.
     */
    public LeadsExportResponseData() {
    // JSON-B / Jackson
    }

    /**
     * Create LeadsExportResponseData.
     *
     * @param downloadUrl downloadUrl
     * @param exportStatus exportStatus
     */
    public LeadsExportResponseData(
        String downloadUrl, 
        LeadsExportStatus exportStatus
    ) {
        this.downloadUrl = downloadUrl;
        this.exportStatus = exportStatus;
    }



    /**
     * Get downloadUrl
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * Get exportStatus
     * @return exportStatus
     */
    public LeadsExportStatus getExportStatus() {
        return exportStatus;
    }

    public void setExportStatus(LeadsExportStatus exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LeadsExportResponseData {\n");
        
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    exportStatus: ").append(toIndentedString(exportStatus)).append("\n");
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

