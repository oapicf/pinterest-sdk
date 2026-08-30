package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.S3FilePart;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class S3MultipartUploadData   {

    private List<@Valid S3FilePart> fileParts = new ArrayList<>();

    /**
     * Default constructor.
     */
    public S3MultipartUploadData() {
    // JSON-B / Jackson
    }

    /**
     * Create S3MultipartUploadData.
     *
     * @param fileParts Array of file parts with pre-signed URLs.
     */
    public S3MultipartUploadData(
        List<@Valid S3FilePart> fileParts
    ) {
        this.fileParts = fileParts;
    }



    /**
     * Array of file parts with pre-signed URLs.
     * @return fileParts
     */
    public List<@Valid S3FilePart> getFileParts() {
        return fileParts;
    }

    public void setFileParts(List<@Valid S3FilePart> fileParts) {
        this.fileParts = fileParts;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class S3MultipartUploadData {\n");
        
        sb.append("    fileParts: ").append(toIndentedString(fileParts)).append("\n");
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

