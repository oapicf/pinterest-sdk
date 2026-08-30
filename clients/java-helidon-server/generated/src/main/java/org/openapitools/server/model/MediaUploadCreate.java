package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MediaUploadType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class MediaUploadCreate   {

    private MediaUploadType mediaType;

    /**
     * Default constructor.
     */
    public MediaUploadCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create MediaUploadCreate.
     *
     * @param mediaType mediaType
     */
    public MediaUploadCreate(
        MediaUploadType mediaType
    ) {
        this.mediaType = mediaType;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MediaUploadCreate {\n");
        
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

