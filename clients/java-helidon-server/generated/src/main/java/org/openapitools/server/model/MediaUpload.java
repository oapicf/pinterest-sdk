package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.MediaUploadParameters;
import org.openapitools.server.model.MediaUploadType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Media upload that has been registered but not uploaded/processed yet.
 */
public class MediaUpload   {

    private String mediaId;
    private MediaUploadType mediaType;
    private MediaUploadParameters uploadParameters;
    private String uploadUrl;

    /**
     * Default constructor.
     */
    public MediaUpload() {
    // JSON-B / Jackson
    }

    /**
     * Create MediaUpload.
     *
     * @param mediaId Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
     * @param mediaType mediaType
     * @param uploadParameters The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
     * @param uploadUrl The URL where you will POST your media file.
     */
    public MediaUpload(
        String mediaId, 
        MediaUploadType mediaType, 
        MediaUploadParameters uploadParameters, 
        String uploadUrl
    ) {
        this.mediaId = mediaId;
        this.mediaType = mediaType;
        this.uploadParameters = uploadParameters;
        this.uploadUrl = uploadUrl;
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
     * The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
     * @return uploadParameters
     */
    public MediaUploadParameters getUploadParameters() {
        return uploadParameters;
    }

    public void setUploadParameters(MediaUploadParameters uploadParameters) {
        this.uploadParameters = uploadParameters;
    }

    /**
     * The URL where you will POST your media file.
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
        sb.append("class MediaUpload {\n");
        
        sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    uploadParameters: ").append(toIndentedString(uploadParameters)).append("\n");
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

