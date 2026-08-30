package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ImageMetadata;
import org.openapitools.vertxweb.server.model.ImageSize;
import org.openapitools.vertxweb.server.model.VideoMetadataWithItemType;

/**
 * Per-item entry inside &#x60;PinMedia.items&#x60; for mixed image/video pins. Discriminated by &#x60;item_type&#x60;.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaMetadata   {
  
  private String description;
  private ImageSize images;


  public enum ItemTypeEnum {
    VIDEO("video");

    private String value;

    ItemTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
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

  public PinMediaMetadata () {

  }

  public PinMediaMetadata (String description, ImageSize images, ItemTypeEnum itemType, String link, String title, String coverImageUrl, BigDecimal duration, Integer height, String videoUrl, String videoUrlHls, Integer width) {
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

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("images")
  public ImageSize getImages() {
    return images;
  }
  public void setImages(ImageSize images) {
    this.images = images;
  }

    
  @JsonProperty("item_type")
  public ItemTypeEnum getItemType() {
    return itemType;
  }
  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

    
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

    
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

    
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

    
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

    
  @JsonProperty("video_url_hls")
  public String getVideoUrlHls() {
    return videoUrlHls;
  }
  public void setVideoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

    
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
