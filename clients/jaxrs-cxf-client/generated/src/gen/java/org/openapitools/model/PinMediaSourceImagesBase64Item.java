package org.openapitools.model;

import org.openapitools.model.ContentType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class PinMediaSourceImagesBase64Item  {
  
  @ApiModelProperty(required = true, value = "")

  private ContentType contentType;

  @ApiModelProperty(required = true, value = "")

  private String data;

  @ApiModelProperty(value = "")

  private String description;

  @ApiModelProperty(value = "")

  private String link;

  @ApiModelProperty(value = "")

  private String title;
 /**
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("content_type")
  public ContentType getContentType() {
    return contentType;
  }

  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }

  public PinMediaSourceImagesBase64Item contentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public PinMediaSourceImagesBase64Item data(String data) {
    this.data = data;
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

  public PinMediaSourceImagesBase64Item description(String description) {
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

  public PinMediaSourceImagesBase64Item link(String link) {
    this.link = link;
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

  public PinMediaSourceImagesBase64Item title(String title) {
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
    PinMediaSourceImagesBase64Item pinMediaSourceImagesBase64Item = (PinMediaSourceImagesBase64Item) o;
    return Objects.equals(this.contentType, pinMediaSourceImagesBase64Item.contentType) &&
        Objects.equals(this.data, pinMediaSourceImagesBase64Item.data) &&
        Objects.equals(this.description, pinMediaSourceImagesBase64Item.description) &&
        Objects.equals(this.link, pinMediaSourceImagesBase64Item.link) &&
        Objects.equals(this.title, pinMediaSourceImagesBase64Item.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, data, description, link, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesBase64Item {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

