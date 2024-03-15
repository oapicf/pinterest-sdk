package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.ImageMetadataImages;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageMetadata   {
  
  private String itemType;
  private String title;
  private String description;
  private String link;
  private ImageMetadataImages images;

  public ImageMetadata () {

  }

  public ImageMetadata (String itemType, String title, String description, String link, ImageMetadataImages images) {
    this.itemType = itemType;
    this.title = title;
    this.description = description;
    this.link = link;
    this.images = images;
  }

    
  @JsonProperty("item_type")
  public String getItemType() {
    return itemType;
  }
  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

    
  @JsonProperty("images")
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
    return Objects.equals(itemType, imageMetadata.itemType) &&
        Objects.equals(title, imageMetadata.title) &&
        Objects.equals(description, imageMetadata.description) &&
        Objects.equals(link, imageMetadata.link) &&
        Objects.equals(images, imageMetadata.images);
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
