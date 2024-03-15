package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageMetadataImages;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImageMetadata  {
  
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
 /**
  * Get itemType
  * @return itemType
  */
  @JsonProperty("item_type")
  public String getItemType() {
    return itemType;
  }

  /**
   * Sets the <code>itemType</code> property.
   */
 public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  /**
   * Sets the <code>itemType</code> property.
   */
  public ImageMetadata itemType(String itemType) {
    this.itemType = itemType;
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
  public ImageMetadata title(String title) {
    this.title = title;
    return this;
  }

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
  public ImageMetadata description(String description) {
    this.description = description;
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
  public ImageMetadata link(String link) {
    this.link = link;
    return this;
  }

 /**
  * Get images
  * @return images
  */
  @JsonProperty("images")
  public ImageMetadataImages getImages() {
    return images;
  }

  /**
   * Sets the <code>images</code> property.
   */
 public void setImages(ImageMetadataImages images) {
    this.images = images;
  }

  /**
   * Sets the <code>images</code> property.
   */
  public ImageMetadata images(ImageMetadataImages images) {
    this.images = images;
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
    ImageMetadata imageMetadata = (ImageMetadata) o;
    return Objects.equals(this.itemType, imageMetadata.itemType) &&
        Objects.equals(this.title, imageMetadata.title) &&
        Objects.equals(this.description, imageMetadata.description) &&
        Objects.equals(this.link, imageMetadata.link) &&
        Objects.equals(this.images, imageMetadata.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemType, title, description, link, images);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageMetadata {\n");
    
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

