package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DynamicTitlesDownloadCSV   {

    private String downloadUrl;

    /**
     * Default constructor.
     */
    public DynamicTitlesDownloadCSV() {
    // JSON-B / Jackson
    }

    /**
     * Create DynamicTitlesDownloadCSV.
     *
     * @param downloadUrl Pre-signed S3 URL to download the CSV file.
     */
    public DynamicTitlesDownloadCSV(
        String downloadUrl
    ) {
        this.downloadUrl = downloadUrl;
    }



    /**
     * Pre-signed S3 URL to download the CSV file.
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DynamicTitlesDownloadCSV {\n");
        
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
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

