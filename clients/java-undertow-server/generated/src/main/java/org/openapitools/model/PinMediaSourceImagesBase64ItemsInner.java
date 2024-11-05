/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PinMediaSourceImagesBase64ItemsInner   {
  
  private String title;
  private String description;
  private String link;


  public enum ContentTypeEnum {
    JPEG("image/jpeg"),
    PNG("image/png");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ContentTypeEnum contentType;
  private String data;

  /**
   */
  public PinMediaSourceImagesBase64ItemsInner title(String title) {
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

  /**
   */
  public PinMediaSourceImagesBase64ItemsInner description(String description) {
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
   * Destination link for the image.
   */
  public PinMediaSourceImagesBase64ItemsInner link(String link) {
    this.link = link;
    return this;
  }

  
  @ApiModelProperty(value = "Destination link for the image.")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  /**
   */
  public PinMediaSourceImagesBase64ItemsInner contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("content_type")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   * Image to upload as base64 string.
   */
  public PinMediaSourceImagesBase64ItemsInner data(String data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Image to upload as base64 string.")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaSourceImagesBase64ItemsInner pinMediaSourceImagesBase64ItemsInner = (PinMediaSourceImagesBase64ItemsInner) o;
    return Objects.equals(title, pinMediaSourceImagesBase64ItemsInner.title) &&
        Objects.equals(description, pinMediaSourceImagesBase64ItemsInner.description) &&
        Objects.equals(link, pinMediaSourceImagesBase64ItemsInner.link) &&
        Objects.equals(contentType, pinMediaSourceImagesBase64ItemsInner.contentType) &&
        Objects.equals(data, pinMediaSourceImagesBase64ItemsInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, link, contentType, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesBase64ItemsInner {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

