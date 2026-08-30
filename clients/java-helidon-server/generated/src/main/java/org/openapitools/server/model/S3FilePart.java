package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class S3FilePart   {

    private Integer partNumber;
    private String presignedUrl;

    /**
     * Default constructor.
     */
    public S3FilePart() {
    // JSON-B / Jackson
    }

    /**
     * Create S3FilePart.
     *
     * @param partNumber Part number for upload.
     * @param presignedUrl Pre-signed URL.
     */
    public S3FilePart(
        Integer partNumber, 
        String presignedUrl
    ) {
        this.partNumber = partNumber;
        this.presignedUrl = presignedUrl;
    }



    /**
     * Part number for upload.
     * @return partNumber
     */
    public Integer getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(Integer partNumber) {
        this.partNumber = partNumber;
    }

    /**
     * Pre-signed URL.
     * @return presignedUrl
     */
    public String getPresignedUrl() {
        return presignedUrl;
    }

    public void setPresignedUrl(String presignedUrl) {
        this.presignedUrl = presignedUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class S3FilePart {\n");
        
        sb.append("    partNumber: ").append(toIndentedString(partNumber)).append("\n");
        sb.append("    presignedUrl: ").append(toIndentedString(presignedUrl)).append("\n");
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

