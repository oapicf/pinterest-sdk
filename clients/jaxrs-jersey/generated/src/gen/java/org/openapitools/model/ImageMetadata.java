/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ImageMetadataImages;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * ImageMetadata
 */
@JsonPropertyOrder({
  ImageMetadata.JSON_PROPERTY_ITEM_TYPE,
  ImageMetadata.JSON_PROPERTY_TITLE,
  ImageMetadata.JSON_PROPERTY_DESCRIPTION,
  ImageMetadata.JSON_PROPERTY_LINK,
  ImageMetadata.JSON_PROPERTY_IMAGES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-03-14T23:04:30.273794609Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ImageMetadata   {
  public static final String JSON_PROPERTY_ITEM_TYPE = "item_type";
  @JsonProperty(JSON_PROPERTY_ITEM_TYPE)
  private String itemType;

  public static final String JSON_PROPERTY_TITLE = "title";
  @JsonProperty(JSON_PROPERTY_TITLE)
  private String title;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  private String description;

  public static final String JSON_PROPERTY_LINK = "link";
  @JsonProperty(JSON_PROPERTY_LINK)
  private String link;

  public static final String JSON_PROPERTY_IMAGES = "images";
  @JsonProperty(JSON_PROPERTY_IMAGES)
  private ImageMetadataImages images;

  public ImageMetadata itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

  /**
   * Get itemType
   * @return itemType
   **/
  @JsonProperty(value = "item_type")
  @ApiModelProperty(value = "")
  
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public ImageMetadata title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @JsonProperty(value = "title")
  @ApiModelProperty(value = "")
  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ImageMetadata description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @JsonProperty(value = "description")
  @ApiModelProperty(value = "")
  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ImageMetadata link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
   **/
  @JsonProperty(value = "link")
  @ApiModelProperty(value = "")
  
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public ImageMetadata images(ImageMetadataImages images) {
    this.images = images;
    return this;
  }

  /**
   * Get images
   * @return images
   **/
  @JsonProperty(value = "images")
  @ApiModelProperty(value = "")
  @Valid 
  public ImageMetadataImages getImages() {
    return images;
  }

  public void setImages(ImageMetadataImages images) {
    this.images = images;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
