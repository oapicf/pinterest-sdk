package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ImageSize;
import org.openapitools.server.model.PinMediaMetadata;
import org.openapitools.server.model.PinMediaWithImage;
import org.openapitools.server.model.PinMediaWithImageAndVideo;
import org.openapitools.server.model.PinMediaWithImages;
import org.openapitools.server.model.PinMediaWithVideo;
import org.openapitools.server.model.PinMediaWithVideos;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Pin media that can be an image, video, or a mix of both.
 */
public class PinMedia   {

    private ImageSize images;

    /**
    * Gets or Sets mediaType
    */
    public enum MediaTypeEnum {
        MULTIPLE_MIXED("multiple_mixed");

        private String value;

        MediaTypeEnum(String value) {
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
        public static MediaTypeEnum fromValue(String text) {
            for (MediaTypeEnum b : MediaTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private MediaTypeEnum mediaType;
    private String coverImageUrl;
    private BigDecimal duration;
    private Integer height;
    private String videoUrl;
    private String videoUrlHls;
    private Integer width;
    private List<@Valid PinMediaMetadata> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PinMedia() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMedia.
     *
     * @param images images
     * @param mediaType mediaType
     * @param coverImageUrl coverImageUrl
     * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
     * @param height Height (in pixels). Field maybe null after creation due to video processing time.
     * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps.
     * @param videoUrlHls Video url (HLS).  **Note:** This field is limited and not available to all apps.
     * @param width Width (in pixels). Field maybe null after creation due to video processing time.
     * @param items items
     */
    public PinMedia(
        ImageSize images, 
        MediaTypeEnum mediaType, 
        String coverImageUrl, 
        BigDecimal duration, 
        Integer height, 
        String videoUrl, 
        String videoUrlHls, 
        Integer width, 
        List<@Valid PinMediaMetadata> items
    ) {
        this.images = images;
        this.mediaType = mediaType;
        this.coverImageUrl = coverImageUrl;
        this.duration = duration;
        this.height = height;
        this.videoUrl = videoUrl;
        this.videoUrlHls = videoUrlHls;
        this.width = width;
        this.items = items;
    }



    /**
     * Get images
     * @return images
     */
    public ImageSize getImages() {
        return images;
    }

    public void setImages(ImageSize images) {
        this.images = images;
    }

    /**
     * Get mediaType
     * @return mediaType
     */
    public MediaTypeEnum getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaTypeEnum mediaType) {
        this.mediaType = mediaType;
    }

    /**
     * Get coverImageUrl
     * @return coverImageUrl
     */
    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    /**
     * Duration (in miliseconds). Field maybe null after creation due to video processing time.
     * @return duration
     */
    public BigDecimal getDuration() {
        return duration;
    }

    public void setDuration(BigDecimal duration) {
        this.duration = duration;
    }

    /**
     * Height (in pixels). Field maybe null after creation due to video processing time.
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Video url (720p).  **Note:** This field is limited and not available to all apps.
     * @return videoUrl
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * Video url (HLS).  **Note:** This field is limited and not available to all apps.
     * @return videoUrlHls
     */
    public String getVideoUrlHls() {
        return videoUrlHls;
    }

    public void setVideoUrlHls(String videoUrlHls) {
        this.videoUrlHls = videoUrlHls;
    }

    /**
     * Width (in pixels). Field maybe null after creation due to video processing time.
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Get items
     * @return items
     */
    public List<@Valid PinMediaMetadata> getItems() {
        return items;
    }

    public void setItems(List<@Valid PinMediaMetadata> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinMedia {\n");
        
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
        sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
        sb.append("    videoUrlHls: ").append(toIndentedString(videoUrlHls)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

