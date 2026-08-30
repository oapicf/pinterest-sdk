package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageSize;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImageMetadata  {
  
  @ApiModelProperty(value = "")
  private String description;

  @ApiModelProperty(value = "")
  @Valid
  private ImageSize images;

public enum ItemTypeEnum {

    @JsonProperty("image") IMAGE(String.valueOf("image"));

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
  * Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
  */
  @ApiModelProperty(required = true, value = "Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.")
  private ItemTypeEnum itemType;

  @ApiModelProperty(value = "")
  private String link;

  @ApiModelProperty(value = "")
  private String title;
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
  public ImageMetadata images(ImageSize images) {
    this.images = images;
    return this;
  }

 /**
  * Discriminator literal identifying this as image metadata inside a &#x60;PinMediaMetadata&#x60; payload.
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
  public ImageMetadata itemType(ItemTypeEnum itemType) {
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
  public ImageMetadata link(String link) {
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
  public ImageMetadata title(String title) {
    this.title = title;
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
    return Objects.equals(this.description, imageMetadata.description) &&
        Objects.equals(this.images, imageMetadata.images) &&
        Objects.equals(this.itemType, imageMetadata.itemType) &&
        Objects.equals(this.link, imageMetadata.link) &&
        Objects.equals(this.title, imageMetadata.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, images, itemType, link, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageMetadata {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

