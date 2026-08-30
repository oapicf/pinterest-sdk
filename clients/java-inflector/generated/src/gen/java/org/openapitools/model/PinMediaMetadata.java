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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageMetadata;
import org.openapitools.model.ImageSize;
import org.openapitools.model.VideoMetadataWithItemType;



/**
 * Per-item entry inside &#x60;PinMedia.items&#x60; for mixed image/video pins. Discriminated by &#x60;item_type&#x60;.
 **/

@ApiModel(description = "Per-item entry inside `PinMedia.items` for mixed image/video pins. Discriminated by `item_type`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinMediaMetadata   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("images")
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

    @Override
    @JsonValue
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

  @JsonProperty("item_type")
  private ItemTypeEnum itemType;

  @JsonProperty("link")
  private String link;

  @JsonProperty("title")
  private String title;

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

  /**
   **/
  public PinMediaMetadata description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  public PinMediaMetadata images(ImageSize images) {
    this.images = images;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("images")
  public ImageSize getImages() {
    return images;
  }
  public void setImages(ImageSize images) {
    this.images = images;
  }

  /**
   * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
   **/
  public PinMediaMetadata itemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.")
  @JsonProperty("item_type")
  public ItemTypeEnum getItemType() {
    return itemType;
  }
  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  /**
   **/
  public PinMediaMetadata link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   **/
  public PinMediaMetadata title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  public PinMediaMetadata coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Duration (in miliseconds). Field maybe null after creation due to video processing time.
   **/
  public PinMediaMetadata duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

  
  @ApiModelProperty(value = "Duration (in miliseconds). Field maybe null after creation due to video processing time.")
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  /**
   * Height (in pixels). Field maybe null after creation due to video processing time.
   **/
  public PinMediaMetadata height(Integer height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(value = "Height (in pixels). Field maybe null after creation due to video processing time.")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Video url (720p).  **Note:** This field is limited and not available to all apps.
   **/
  public PinMediaMetadata videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Video url (720p).  **Note:** This field is limited and not available to all apps.")
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  /**
   * Video url (HLS).  **Note:** This field is limited and not available to all apps.
   **/
  public PinMediaMetadata videoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
    return this;
  }

  
  @ApiModelProperty(value = "Video url (HLS).  **Note:** This field is limited and not available to all apps.")
  @JsonProperty("video_url_hls")
  public String getVideoUrlHls() {
    return videoUrlHls;
  }
  public void setVideoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

  /**
   * Width (in pixels). Field maybe null after creation due to video processing time.
   **/
  public PinMediaMetadata width(Integer width) {
    this.width = width;
    return this;
  }

  
  @ApiModelProperty(value = "Width (in pixels). Field maybe null after creation due to video processing time.")
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
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
    return Objects.equals(description, pinMediaMetadata.description) &&
        Objects.equals(images, pinMediaMetadata.images) &&
        Objects.equals(itemType, pinMediaMetadata.itemType) &&
        Objects.equals(link, pinMediaMetadata.link) &&
        Objects.equals(title, pinMediaMetadata.title) &&
        Objects.equals(coverImageUrl, pinMediaMetadata.coverImageUrl) &&
        Objects.equals(duration, pinMediaMetadata.duration) &&
        Objects.equals(height, pinMediaMetadata.height) &&
        Objects.equals(videoUrl, pinMediaMetadata.videoUrl) &&
        Objects.equals(videoUrlHls, pinMediaMetadata.videoUrlHls) &&
        Objects.equals(width, pinMediaMetadata.width);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

