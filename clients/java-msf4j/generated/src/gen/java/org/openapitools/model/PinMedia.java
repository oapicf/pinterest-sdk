package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

/**
 * Pin media that can be an image, video, or a mix of both.
 */
@ApiModel(description = "Pin media that can be an image, video, or a mix of both.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinMedia   {
  @JsonProperty("images")
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

    @Override
    @JsonValue
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

  @JsonProperty("media_type")
  private MediaTypeEnum mediaType;

  @JsonProperty("cover_image_url")
  private String coverImageUrl;

  @JsonProperty("duration")
  private BigDecimal duration;

  @JsonProperty("height")
  private Integer height;

  @JsonProperty("video_url")
  private String videoUrl;

  @JsonProperty("video_url_hls")
  private String videoUrlHls;

  @JsonProperty("width")
  private Integer width;

  @JsonProperty("items")
  private List<@Valid PinMediaMetadata> items = null;

  public PinMedia images(ImageSize images) {
    this.images = images;
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  @ApiModelProperty(value = "")
  public ImageSize getImages() {
    return images;
  }

  public void setImages(ImageSize images) {
    this.images = images;
  }

  public PinMedia mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * Get mediaType
   * @return mediaType
  **/
  @ApiModelProperty(required = true, value = "")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }

  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  public PinMedia coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

   /**
   * Get coverImageUrl
   * @return coverImageUrl
  **/
  @ApiModelProperty(value = "")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMedia duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration (in miliseconds). Field maybe null after creation due to video processing time.
   * @return duration
  **/
  @ApiModelProperty(value = "Duration (in miliseconds). Field maybe null after creation due to video processing time.")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public PinMedia height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height (in pixels). Field maybe null after creation due to video processing time.
   * @return height
  **/
  @ApiModelProperty(value = "Height (in pixels). Field maybe null after creation due to video processing time.")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PinMedia videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Video url (720p).  **Note:** This field is limited and not available to all apps.
   * @return videoUrl
  **/
  @ApiModelProperty(value = "Video url (720p).  **Note:** This field is limited and not available to all apps.")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public PinMedia videoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
    return this;
  }

   /**
   * Video url (HLS).  **Note:** This field is limited and not available to all apps.
   * @return videoUrlHls
  **/
  @ApiModelProperty(value = "Video url (HLS).  **Note:** This field is limited and not available to all apps.")
  public String getVideoUrlHls() {
    return videoUrlHls;
  }

  public void setVideoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

  public PinMedia width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width (in pixels). Field maybe null after creation due to video processing time.
   * @return width
  **/
  @ApiModelProperty(value = "Width (in pixels). Field maybe null after creation due to video processing time.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public PinMedia items(List<@Valid PinMediaMetadata> items) {
    this.items = items;
    return this;
  }

  public PinMedia addItemsItem(PinMediaMetadata itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<@Valid PinMediaMetadata> getItems() {
    return items;
  }

  public void setItems(List<@Valid PinMediaMetadata> items) {
    this.items = items;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

