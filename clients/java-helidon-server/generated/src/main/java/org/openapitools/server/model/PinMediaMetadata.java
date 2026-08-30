package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ImageMetadata;
import org.openapitools.server.model.ImageSize;
import org.openapitools.server.model.VideoMetadataWithItemType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.
 */
public class PinMediaMetadata   {

    private String description;
    private ImageSize images;

    /**
    * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
    */
    public enum ItemTypeEnum {
        VIDEO("video");

        private String value;

        ItemTypeEnum(String value) {
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
        public static ItemTypeEnum fromValue(String text) {
            for (ItemTypeEnum b : ItemTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ItemTypeEnum itemType;
    private String link;
    private String title;
    private String coverImageUrl;
    private BigDecimal duration;
    private Integer height;
    private String videoUrl;
    private String videoUrlHls;
    private Integer width;

    /**
     * Default constructor.
     */
    public PinMediaMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaMetadata.
     *
     * @param description description
     * @param images images
     * @param itemType Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload.
     * @param link link
     * @param title title
     * @param coverImageUrl coverImageUrl
     * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
     * @param height Height (in pixels). Field maybe null after creation due to video processing time.
     * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps.
     * @param videoUrlHls Video url (HLS).  **Note:** This field is limited and not available to all apps.
     * @param width Width (in pixels). Field maybe null after creation due to video processing time.
     */
    public PinMediaMetadata(
        String description, 
        ImageSize images, 
        ItemTypeEnum itemType, 
        String link, 
        String title, 
        String coverImageUrl, 
        BigDecimal duration, 
        Integer height, 
        String videoUrl, 
        String videoUrlHls, 
        Integer width
    ) {
        this.description = description;
        this.images = images;
        this.itemType = itemType;
        this.link = link;
        this.title = title;
        this.coverImageUrl = coverImageUrl;
        this.duration = duration;
        this.height = height;
        this.videoUrl = videoUrl;
        this.videoUrlHls = videoUrlHls;
        this.width = width;
    }



    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
     * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
     * @return itemType
     */
    public ItemTypeEnum getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypeEnum itemType) {
        this.itemType = itemType;
    }

    /**
     * Get link
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Get title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinMediaMetadata {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
        sb.append("    videoUrlHls: ").append(toIndentedString(videoUrlHls)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

