package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageSize;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class ImageMetadata   {
  
  private String description;

  private ImageSize images;


public enum ItemTypeEnum {

    @JsonProperty("image") IMAGE(String.valueOf("image"));


    private String value;

    ItemTypeEnum(String v) {
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

  private ItemTypeEnum itemType;

  private String link;

  private String title;

  /**
   **/
  public ImageMetadata description(String description) {
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
  public ImageMetadata images(ImageSize images) {
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
   * Discriminator literal identifying this as image metadata inside a &#x60;PinMediaMetadata&#x60; payload.
   **/
  public ImageMetadata itemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.")
  @JsonProperty("item_type")
  @NotNull
  public ItemTypeEnum getItemType() {
    return itemType;
  }
  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }


  /**
   **/
  public ImageMetadata link(String link) {
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
  public ImageMetadata title(String title) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

