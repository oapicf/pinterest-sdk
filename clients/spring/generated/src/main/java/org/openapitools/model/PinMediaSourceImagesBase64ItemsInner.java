package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PinMediaSourceImagesBase64ItemsInner
 */

@JsonTypeName("PinMediaSourceImagesBase64_items_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinMediaSourceImagesBase64ItemsInner {

  private String title;

  private String description;

  private String link;

  /**
   * Gets or Sets contentType
   */
  public enum ContentTypeEnum {
    JPEG("image/jpeg"),
    
    PNG("image/png");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContentTypeEnum fromValue(String value) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ContentTypeEnum contentType;

  private String data;

  public PinMediaSourceImagesBase64ItemsInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PinMediaSourceImagesBase64ItemsInner(ContentTypeEnum contentType, String data) {
    this.contentType = contentType;
    this.data = data;
  }

  public PinMediaSourceImagesBase64ItemsInner title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PinMediaSourceImagesBase64ItemsInner description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PinMediaSourceImagesBase64ItemsInner link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Destination link for the image.
   * @return link
  */
  
  @Schema(name = "link", description = "Destination link for the image.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PinMediaSourceImagesBase64ItemsInner contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
  */
  @NotNull 
  @Schema(name = "content_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content_type")
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public PinMediaSourceImagesBase64ItemsInner data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Image to upload as base64 string.
   * @return data
  */
  @NotNull @Pattern(regexp = "[a-zA-Z0-9+/=]+") 
  @Schema(name = "data", description = "Image to upload as base64 string.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    return Objects.equals(this.title, pinMediaSourceImagesBase64ItemsInner.title) &&
        Objects.equals(this.description, pinMediaSourceImagesBase64ItemsInner.description) &&
        Objects.equals(this.link, pinMediaSourceImagesBase64ItemsInner.link) &&
        Objects.equals(this.contentType, pinMediaSourceImagesBase64ItemsInner.contentType) &&
        Objects.equals(this.data, pinMediaSourceImagesBase64ItemsInner.data);
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

