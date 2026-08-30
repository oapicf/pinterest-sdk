package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageMetadata;
import org.openapitools.model.ImageSize;
import org.openapitools.model.VideoMetadataWithItemType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "item_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = ImageMetadata.class, name = "image"),
  @JsonSubTypes.Type(value = VideoMetadataWithItemType.class, name = "video"),
})

/**
 * Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.
 */
@ApiModel(description="Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.")

public class PinMediaMetadata  {
  
  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private ImageSize images;

public enum ItemTypeEnum {

    @JsonProperty("video") VIDEO(String.valueOf("video"));

    private String value;

    ItemTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ItemTypeEnum fromValue(String value) {
        for (ItemTypeEnum b : ItemTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
  */
  @ApiModelProperty(required = true, value = "Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.")
  private ItemTypeEnum itemType;

  @ApiModelProperty(value = "")
  private String link;

  @ApiModelProperty(value = "")
  private String title;

  @ApiModelProperty(value = "")
  private String coverImageUrl;

 /**
  * Duration (in miliseconds). Field maybe null after creation due to video processing time.
  */
  @ApiModelProperty(value = "Duration (in miliseconds). Field maybe null after creation due to video processing time.")
  @Valid
  private BigDecimal duration;

 /**
  * Height (in pixels). Field maybe null after creation due to video processing time.
  */
  @ApiModelProperty(value = "Height (in pixels). Field maybe null after creation due to video processing time.")
  private Integer height;

 /**
  * Video url (720p).  **Note:** This field is limited and not available to all apps.
  */
  @ApiModelProperty(value = "Video url (720p).  **Note:** This field is limited and not available to all apps.")
  private String videoUrl;

 /**
  * Video url (HLS).  **Note:** This field is limited and not available to all apps.
  */
  @ApiModelProperty(value = "Video url (HLS).  **Note:** This field is limited and not available to all apps.")
  private String videoUrlHls;

 /**
  * Width (in pixels). Field maybe null after creation due to video processing time.
  */
  @ApiModelProperty(value = "Width (in pixels). Field maybe null after creation due to video processing time.")
  private Integer width;
 /**
  * Get description
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public PinMediaMetadata description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get images
  * @return images
  */
  @JsonProperty("images")
  public ImageSize getImages() {
    return images;
  }

  /**
   * Sets the <code>images</code> property.
   */
 public void setImages(ImageSize images) {
    this.images = images;
  }

  /**
   * Sets the <code>images</code> property.
   */
  public PinMediaMetadata images(ImageSize images) {
    this.images = images;
    return this;
  }

 /**
  * Discriminator literal identifying this as video metadata inside a &#x60;PinMediaMetadata&#x60; payload.
  * @return itemType
  */
  @JsonProperty("item_type")
  @NotNull
  public String getItemType() {
    return itemType == null ? null : itemType.value();
  }

  /**
   * Sets the <code>itemType</code> property.
   */
 public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  /**
   * Sets the <code>itemType</code> property.
   */
  public PinMediaMetadata itemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
    return this;
  }

 /**
  * Get link
  * @return link
  */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * Sets the <code>link</code> property.
   */
 public void setLink(String link) {
    this.link = link;
  }

  /**
   * Sets the <code>link</code> property.
   */
  public PinMediaMetadata link(String link) {
    this.link = link;
    return this;
  }

 /**
  * Get title
  * @return title
  */
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public PinMediaMetadata title(String title) {
    this.title = title;
    return this;
  }

 /**
  * Get coverImageUrl
  * @return coverImageUrl
  */
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  /**
   * Sets the <code>coverImageUrl</code> property.
   */
 public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Sets the <code>coverImageUrl</code> property.
   */
  public PinMediaMetadata coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

 /**
  * Duration (in miliseconds). Field maybe null after creation due to video processing time.
  * @return duration
  */
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }

  /**
   * Sets the <code>duration</code> property.
   */
 public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  /**
   * Sets the <code>duration</code> property.
   */
  public PinMediaMetadata duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

 /**
  * Height (in pixels). Field maybe null after creation due to video processing time.
  * @return height
  */
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  /**
   * Sets the <code>height</code> property.
   */
 public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Sets the <code>height</code> property.
   */
  public PinMediaMetadata height(Integer height) {
    this.height = height;
    return this;
  }

 /**
  * Video url (720p).  **Note:** This field is limited and not available to all apps.
  * @return videoUrl
  */
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }

  /**
   * Sets the <code>videoUrl</code> property.
   */
 public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  /**
   * Sets the <code>videoUrl</code> property.
   */
  public PinMediaMetadata videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

 /**
  * Video url (HLS).  **Note:** This field is limited and not available to all apps.
  * @return videoUrlHls
  */
  @JsonProperty("video_url_hls")
  public String getVideoUrlHls() {
    return videoUrlHls;
  }

  /**
   * Sets the <code>videoUrlHls</code> property.
   */
 public void setVideoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

  /**
   * Sets the <code>videoUrlHls</code> property.
   */
  public PinMediaMetadata videoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
    return this;
  }

 /**
  * Width (in pixels). Field maybe null after creation due to video processing time.
  * @return width
  */
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  /**
   * Sets the <code>width</code> property.
   */
 public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   * Sets the <code>width</code> property.
   */
  public PinMediaMetadata width(Integer width) {
    this.width = width;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaMetadata pinMediaMetadata = (PinMediaMetadata) o;
    return Objects.equals(this.description, pinMediaMetadata.description) &&
        Objects.equals(this.images, pinMediaMetadata.images) &&
        Objects.equals(this.itemType, pinMediaMetadata.itemType) &&
        Objects.equals(this.link, pinMediaMetadata.link) &&
        Objects.equals(this.title, pinMediaMetadata.title) &&
        Objects.equals(this.coverImageUrl, pinMediaMetadata.coverImageUrl) &&
        Objects.equals(this.duration, pinMediaMetadata.duration) &&
        Objects.equals(this.height, pinMediaMetadata.height) &&
        Objects.equals(this.videoUrl, pinMediaMetadata.videoUrl) &&
        Objects.equals(this.videoUrlHls, pinMediaMetadata.videoUrlHls) &&
        Objects.equals(this.width, pinMediaMetadata.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, images, itemType, link, title, coverImageUrl, duration, height, videoUrl, videoUrlHls, width);
  }

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

