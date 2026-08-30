package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DynamicTitlesUploadURL   {

    private String existingFilename;
    private String requestId;
    private String uploadUrl;

    /**
     * Default constructor.
     */
    public DynamicTitlesUploadURL() {
    // JSON-B / Jackson
    }

    /**
     * Create DynamicTitlesUploadURL.
     *
     * @param existingFilename If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
     * @param requestId Unique identifier for this upload session. Must be passed to the process endpoint.
     * @param uploadUrl Pre-signed S3 PUT URL to upload the reviewed CSV file.
     */
    public DynamicTitlesUploadURL(
        String existingFilename, 
        String requestId, 
        String uploadUrl
    ) {
        this.existingFilename = existingFilename;
        this.requestId = requestId;
        this.uploadUrl = uploadUrl;
    }



    /**
     * If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
     * @return existingFilename
     */
    public String getExistingFilename() {
        return existingFilename;
    }

    public void setExistingFilename(String existingFilename) {
        this.existingFilename = existingFilename;
    }

    /**
     * Unique identifier for this upload session. Must be passed to the process endpoint.
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * Pre-signed S3 PUT URL to upload the reviewed CSV file.
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DynamicTitlesUploadURL {\n");
        
        sb.append("    existingFilename: ").append(toIndentedString(existingFilename)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    uploadUrl: ").append(toIndentedString(uploadUrl)).append("\n");
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

