package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class VideoMetadata   {
  
  private String itemType;
  private String coverImageUrl;
  private String videoUrl;
  private BigDecimal duration;
  private Integer height;
  private Integer width;

  public VideoMetadata () {

  }

  public VideoMetadata (String itemType, String coverImageUrl, String videoUrl, BigDecimal duration, Integer height, Integer width) {
    this.itemType = itemType;
    this.coverImageUrl = coverImageUrl;
    this.videoUrl = videoUrl;
    this.duration = duration;
    this.height = height;
    this.width = width;
  }

    
  @JsonProperty("item_type")
  public String getItemType() {
    return itemType;
  }
  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

    
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

    
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
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
    VideoMetadata videoMetadata = (VideoMetadata) o;
    return Objects.equals(itemType, videoMetadata.itemType) &&
        Objects.equals(coverImageUrl, videoMetadata.coverImageUrl) &&
        Objects.equals(videoUrl, videoMetadata.videoUrl) &&
        Objects.equals(duration, videoMetadata.duration) &&
        Objects.equals(height, videoMetadata.height) &&
        Objects.equals(width, videoMetadata.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemType, coverImageUrl, videoUrl, duration, height, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoMetadata {\n");
    
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
