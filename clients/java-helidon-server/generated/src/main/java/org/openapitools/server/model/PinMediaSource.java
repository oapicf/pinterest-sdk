package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ContentType;
import org.openapitools.server.model.PinMediaSourceImageBase64;
import org.openapitools.server.model.PinMediaSourceImageURL;
import org.openapitools.server.model.PinMediaSourceImagesBase64;
import org.openapitools.server.model.PinMediaSourceImagesURL;
import org.openapitools.server.model.PinMediaSourceImagesURLItem;
import org.openapitools.server.model.PinMediaSourcePinURL;
import org.openapitools.server.model.PinMediaSourceVideoID;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 */
public class PinMediaSource   {

    private ContentType contentType;
    private String data;
    private Boolean isStandard = true;

    /**
    * Gets or Sets sourceType
    */
    public enum SourceTypeEnum {
        PIN_URL("pin_url");

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
    private String url;
    private ContentType coverImageContentType;
    private String coverImageData;
    private Integer coverImageKeyFrameTime;
    private String coverImageUrl;
    private String mediaId;
    private Integer index;
    private List<@Valid PinMediaSourceImagesURLItem> items = new ArrayList<>();
    private Boolean isAffiliateLink = false;

    /**
     * Default constructor.
     */
    public PinMediaSource() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaSource.
     *
     * @param contentType contentType
     * @param data data
     * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
     * @param sourceType sourceType
     * @param url url
     * @param coverImageContentType Content type for cover image Base64.
     * @param coverImageData Cover image Base64.
     * @param coverImageKeyFrameTime Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
     * @param coverImageUrl Cover image URL.
     * @param mediaId mediaId
     * @param index index
     * @param items Array with image objects.
     * @param isAffiliateLink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
     */
    public PinMediaSource(
        ContentType contentType, 
        String data, 
        Boolean isStandard, 
        SourceTypeEnum sourceType, 
        String url, 
        ContentType coverImageContentType, 
        String coverImageData, 
        Integer coverImageKeyFrameTime, 
        String coverImageUrl, 
        String mediaId, 
        Integer index, 
        List<@Valid PinMediaSourceImagesURLItem> items, 
        Boolean isAffiliateLink
    ) {
        this.contentType = contentType;
        this.data = data;
        this.isStandard = isStandard;
        this.sourceType = sourceType;
        this.url = url;
        this.coverImageContentType = coverImageContentType;
        this.coverImageData = coverImageData;
        this.coverImageKeyFrameTime = coverImageKeyFrameTime;
        this.coverImageUrl = coverImageUrl;
        this.mediaId = mediaId;
        this.index = index;
        this.items = items;
        this.isAffiliateLink = isAffiliateLink;
    }



    /**
     * Get contentType
     * @return contentType
     */
    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    /**
     * Get data
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
     * Get url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
     * Get index
     * minimum: 0
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Array with image objects.
     * @return items
     */
    public List<@Valid PinMediaSourceImagesURLItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid PinMediaSourceImagesURLItem> items) {
        this.items = items;
    }

    /**
     * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
     * @return isAffiliateLink
     */
    public Boolean getIsAffiliateLink() {
        return isAffiliateLink;
    }

    public void setIsAffiliateLink(Boolean isAffiliateLink) {
        this.isAffiliateLink = isAffiliateLink;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinMediaSource {\n");
        
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    coverImageContentType: ").append(toIndentedString(coverImageContentType)).append("\n");
        sb.append("    coverImageData: ").append(toIndentedString(coverImageData)).append("\n");
        sb.append("    coverImageKeyFrameTime: ").append(toIndentedString(coverImageKeyFrameTime)).append("\n");
        sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
        sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    isAffiliateLink: ").append(toIndentedString(isAffiliateLink)).append("\n");
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

