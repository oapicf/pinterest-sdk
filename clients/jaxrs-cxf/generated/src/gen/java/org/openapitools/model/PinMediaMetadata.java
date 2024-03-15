package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageMetadata;
import org.openapitools.model.ImageMetadataImages;
import org.openapitools.model.VideoMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinMediaMetadata  {
  
  @ApiModelProperty(value = "")
  private String itemType;

  @ApiModelProperty(value = "")
  private String title;

  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  private String link;

  @ApiModelProperty(value = "")
  @Valid
  private ImageMetadataImages images;

  @ApiModelProperty(value = "")
  private String coverImageUrl;

  @ApiModelProperty(value = "Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.")
 /**
   * Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
  **/
  private String videoUrl;

  @ApiModelProperty(value = "Duration (in milliseconds)")
  @Valid
 /**
   * Duration (in milliseconds)
  **/
  private BigDecimal duration;

  @ApiModelProperty(value = "Height (in pixels)")
 /**
   * Height (in pixels)
  **/
  private Integer height;

  @ApiModelProperty(value = "Width (in pixels)")
 /**
   * Width (in pixels)
  **/
  private Integer width;
 /**
   * Get itemType
   * @return itemType
  **/
  @JsonProperty("item_type")
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public PinMediaMetadata itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

 /**
   * Get title
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PinMediaMetadata title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Get description
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PinMediaMetadata description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get link
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PinMediaMetadata link(String link) {
    this.link = link;
    return this;
  }

 /**
   * Get images
   * @return images
  **/
  @JsonProperty("images")
  public ImageMetadataImages getImages() {
    return images;
  }

  public void setImages(ImageMetadataImages images) {
    this.images = images;
  }

  public PinMediaMetadata images(ImageMetadataImages images) {
    this.images = images;
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

  public PinMediaMetadata coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

 /**
   * Video url (720p). &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; This field is limited and not available to all apps.
   * @return videoUrl
  **/
  @JsonProperty("video_url")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public PinMediaMetadata videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

 /**
   * Duration (in milliseconds)
   * @return duration
  **/
  @JsonProperty("duration")
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public PinMediaMetadata duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

 /**
   * Height (in pixels)
   * @return height
  **/
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PinMediaMetadata height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Width (in pixels)
   * @return width
  **/
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

