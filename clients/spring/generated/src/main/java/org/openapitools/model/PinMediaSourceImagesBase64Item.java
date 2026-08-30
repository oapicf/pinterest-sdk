package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ContentType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * PinMediaSourceImagesBase64Item
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinMediaSourceImagesBase64Item {

  private ContentType contentType;

  private String data;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String description;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String link;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String title;

  public PinMediaSourceImagesBase64Item() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PinMediaSourceImagesBase64Item(ContentType contentType, String data) {
    this.contentType = contentType;
    this.data = data;
  }

  public PinMediaSourceImagesBase64Item contentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  @NotNull @Valid 
  @Schema(name = "content_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content_type")
  public ContentType getContentType() {
    return contentType;
  }

  @JsonProperty("content_type")
  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }

  public PinMediaSourceImagesBase64Item data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @NotNull @Pattern(regexp = "^[a-zA-Z0-9+/=]+$") 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(String data) {
    this.data = data;
  }

  public PinMediaSourceImagesBase64Item description(@Nullable String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public @Nullable String getDescription() {
    return description;
  }

  @JsonProperty("description")
  public void setDescription(@Nullable String description) {
    this.description = description;
  }

  public PinMediaSourceImagesBase64Item link(@Nullable String link) {
    this.link = link;
    return this;
  }

  /**
   * Get link
   * @return link
   */
  
  @Schema(name = "link", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public @Nullable String getLink() {
    return link;
  }

  @JsonProperty("link")
  public void setLink(@Nullable String link) {
    this.link = link;
  }

  public PinMediaSourceImagesBase64Item title(@Nullable String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public @Nullable String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(@Nullable String title) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

