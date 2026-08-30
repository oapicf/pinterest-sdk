package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ContentType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Video ID-based media source.
 */
public class PinMediaSourceVideoID   {

    private ContentType coverImageContentType;
    private String coverImageData;
    private Integer coverImageKeyFrameTime;
    private String coverImageUrl;
    private Boolean isStandard = true;
    private String mediaId;

    /**
    * Gets or Sets sourceType
    */
    public enum SourceTypeEnum {
        VIDEO_ID("video_id");

        private String value;

        SourceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static SourceTypeEnum fromValue(String text) {
            for (SourceTypeEnum b : SourceTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private SourceTypeEnum sourceType;

    /**
     * Default constructor.
     */
    public PinMediaSourceVideoID() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaSourceVideoID.
     *
     * @param coverImageContentType Content type for cover image Base64.
     * @param coverImageData Cover image Base64.
     * @param coverImageKeyFrameTime Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
     * @param coverImageUrl Cover image URL.
     * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @param mediaId mediaId
     * @param sourceType sourceType
     */
    public PinMediaSourceVideoID(
        ContentType coverImageContentType, 
        String coverImageData, 
        Integer coverImageKeyFrameTime, 
        String coverImageUrl, 
        Boolean isStandard, 
        String mediaId, 
        SourceTypeEnum sourceType
    ) {
        this.coverImageContentType = coverImageContentType;
        this.coverImageData = coverImageData;
        this.coverImageKeyFrameTime = coverImageKeyFrameTime;
        this.coverImageUrl = coverImageUrl;
        this.isStandard = isStandard;
        this.mediaId = mediaId;
        this.sourceType = sourceType;
    }



    /**
     * Content type for cover image Base64.
     * @return coverImageContentType
     */
    public ContentType getCoverImageContentType() {
        return coverImageContentType;
    }

    public void setCoverImageContentType(ContentType coverImageContentType) {
        this.coverImageContentType = coverImageContentType;
    }

    /**
     * Cover image Base64.
     * @return coverImageData
     */
    public String getCoverImageData() {
        return coverImageData;
    }

    public void setCoverImageData(String coverImageData) {
        this.coverImageData = coverImageData;
    }

    /**
     * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
     * minimum: 0
     * @return coverImageKeyFrameTime
     */
    public Integer getCoverImageKeyFrameTime() {
        return coverImageKeyFrameTime;
    }

    public void setCoverImageKeyFrameTime(Integer coverImageKeyFrameTime) {
        this.coverImageKeyFrameTime = coverImageKeyFrameTime;
    }

    /**
     * Cover image URL.
     * @return coverImageUrl
     */
    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    /**
     * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @return isStandard
     */
    public Boolean getIsStandard() {
        return isStandard;
    }

    public void setIsStandard(Boolean isStandard) {
        this.isStandard = isStandard;
    }

    /**
     * Get mediaId
     * @return mediaId
     */
    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    /**
     * Get sourceType
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinMediaSourceVideoID {\n");
        
        sb.append("    coverImageContentType: ").append(toIndentedString(coverImageContentType)).append("\n");
        sb.append("    coverImageData: ").append(toIndentedString(coverImageData)).append("\n");
        sb.append("    coverImageKeyFrameTime: ").append(toIndentedString(coverImageKeyFrameTime)).append("\n");
        sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
        sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
        sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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

