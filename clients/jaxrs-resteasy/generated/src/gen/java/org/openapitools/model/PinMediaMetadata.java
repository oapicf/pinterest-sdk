package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageMetadata;
import org.openapitools.model.ImageMetadataImages;
import org.openapitools.model.VideoMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PinMediaMetadata   {
  
  private String itemType;
  private String title;
  private String description;
  private String link;
  private ImageMetadataImages images;
  private String coverImageUrl;
  private String videoUrl;
  private BigDecimal duration;
  private Integer height;
  private Integer width;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("item_type")
  public String getItemType() {
    return itemType;
  }
  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("images")
  @Valid
  public ImageMetadataImages getImages() {
    return images;
  }
  public void setImages(ImageMetadataImages images) {
    this.images = images;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.
   **/
  
  @ApiModelProperty(value = "Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.")
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  /**
   * Duration (in milliseconds)
   **/
  
  @ApiModelProperty(value = "Duration (in milliseconds)")
  @JsonProperty("duration")
  @Valid
  public BigDecimal getDuration() {
    return duration;
  }
  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  /**
   * Height (in pixels)
   **/
  
  @ApiModelProperty(value = "Height (in pixels)")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Width (in pixels)
   **/
  
  @ApiModelProperty(value = "Width (in pixels)")
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
    return Objects.equals(this.itemType, pinMediaMetadata.itemType) &&
        Objects.equals(this.title, pinMediaMetadata.title) &&
        Objects.equals(this.description, pinMediaMetadata.description) &&
        Objects.equals(this.link, pinMediaMetadata.link) &&
        Objects.equals(this.images, pinMediaMetadata.images) &&
        Objects.equals(this.coverImageUrl, pinMediaMetadata.coverImageUrl) &&
        Objects.equals(this.videoUrl, pinMediaMetadata.videoUrl) &&
        Objects.equals(this.duration, pinMediaMetadata.duration) &&
        Objects.equals(this.height, pinMediaMetadata.height) &&
        Objects.equals(this.width, pinMediaMetadata.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemType, title, description, link, images, coverImageUrl, videoUrl, duration, height, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaMetadata {\n");
    
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

