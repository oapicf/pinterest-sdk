package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MediaUploadStatus;
import org.openapitools.server.model.MediaUploadType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class Media   {

    private String mediaId;
    private MediaUploadType mediaType;
    private MediaUploadStatus status;

    /**
     * Default constructor.
     */
    public Media() {
    // JSON-B / Jackson
    }

    /**
     * Create Media.
     *
     * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
     * @param mediaType mediaType
     * @param status status
     */
    public Media(
        String mediaId, 
        MediaUploadType mediaType, 
        MediaUploadStatus status
    ) {
        this.mediaId = mediaId;
        this.mediaType = mediaType;
        this.status = status;
    }



    /**
     * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
     * @return mediaId
     */
    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * Get mediaType
     * @return mediaType
     */
    public MediaUploadType getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaUploadType mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * Get status
     * @return status
     */
    public MediaUploadStatus getStatus() {
        return status;
    }

    public void setStatus(MediaUploadStatus status) {
        this.status = status;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Media {\n");
        
        sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

