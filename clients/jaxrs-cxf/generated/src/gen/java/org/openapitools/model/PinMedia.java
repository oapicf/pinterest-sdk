package org.openapitools.model;

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
import org.openapitools.model.ImageSize;
import org.openapitools.model.PinMediaMetadata;
import org.openapitools.model.PinMediaWithImage;
import org.openapitools.model.PinMediaWithImageAndVideo;
import org.openapitools.model.PinMediaWithImages;
import org.openapitools.model.PinMediaWithVideo;
import org.openapitools.model.PinMediaWithVideos;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pin media that can be an image, video, or a mix of both.
 */
@ApiModel(description="Pin media that can be an image, video, or a mix of both.")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "media_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = PinMediaWithImage.class, name = "image"),
  @JsonSubTypes.Type(value = PinMediaWithImages.class, name = "multiple_images"),
  @JsonSubTypes.Type(value = PinMediaWithImageAndVideo.class, name = "multiple_mixed"),
  @JsonSubTypes.Type(value = PinMediaWithVideos.class, name = "multiple_videos"),
  @JsonSubTypes.Type(value = PinMediaWithVideo.class, name = "video"),
})

public class PinMedia  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ImageSize images;

public enum MediaTypeEnum {

MULTIPLE_MIXED(String.valueOf("multiple_mixed"));


    private String value;

    MediaTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static MediaTypeEnum fromValue(String value) {
        for (MediaTypeEnum b : MediaTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")

  private MediaTypeEnum mediaType;

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

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid PinMediaMetadata> items = new ArrayList<>();
 /**
   * Get images
   * @return images
  **/
  @JsonProperty("images")
  public ImageSize getImages() {
    return images;
  }

  public void setImages(ImageSize images) {
    this.images = images;
  }

  public PinMedia images(ImageSize images) {
    this.images = images;
    return this;
  }

 /**
   * Get mediaType
   * @return mediaType
  **/
  @JsonProperty("media_type")
  @NotNull
  public String getMediaType() {
    if (mediaType == null) {
      return null;
    }
    return mediaType.value();
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public PinMedia mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

 /**
   * Get coverImageUrl
   * @return coverImageUrl
  **/
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMedia coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

 /**
   * Duration (in miliseconds). Field maybe null after creation due to video processing time.
   * @return duration
  **/
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public PinMedia duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Height (in pixels). Field maybe null after creation due to video processing time.
   * @return height
  **/
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PinMedia height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Video url (720p).  **Note:** This field is limited and not available to all apps.
   * @return videoUrl
  **/
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public PinMedia videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

 /**
   * Video url (HLS).  **Note:** This field is limited and not available to all apps.
   * @return videoUrlHls
  **/
  @JsonProperty("video_url_hls")
  public String getVideoUrlHls() {
    return videoUrlHls;
  }

  public void setVideoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

  public PinMedia videoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
    return this;
  }

 /**
   * Width (in pixels). Field maybe null after creation due to video processing time.
   * @return width
  **/
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PinMedia width(Integer width) {
    this.width = width;
    return this;
  }

 /**
   * Get items
   * @return items
  **/
  @JsonProperty("items")
  public List<@Valid PinMediaMetadata> getItems() {
    return items;
  }

  public void setItems(List<@Valid PinMediaMetadata> items) {
    this.items = items;
  }

  public PinMedia items(List<@Valid PinMediaMetadata> items) {
    this.items = items;
    return this;
  }

  public PinMedia addItemsItem(PinMediaMetadata itemsItem) {
    this.items.add(itemsItem);
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
    PinMedia pinMedia = (PinMedia) o;
    return Objects.equals(this.images, pinMedia.images) &&
        Objects.equals(this.mediaType, pinMedia.mediaType) &&
        Objects.equals(this.coverImageUrl, pinMedia.coverImageUrl) &&
        Objects.equals(this.duration, pinMedia.duration) &&
        Objects.equals(this.height, pinMedia.height) &&
        Objects.equals(this.videoUrl, pinMedia.videoUrl) &&
        Objects.equals(this.videoUrlHls, pinMedia.videoUrlHls) &&
        Objects.equals(this.width, pinMedia.width) &&
        Objects.equals(this.items, pinMedia.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images, mediaType, coverImageUrl, duration, height, videoUrl, videoUrlHls, width, items);
  }

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

