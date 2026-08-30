package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ImageDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ImageDetails {

  private JsonNullable<Integer> height = JsonNullable.<Integer>undefined();

  private String url;

  private JsonNullable<Integer> width = JsonNullable.<Integer>undefined();

  public ImageDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ImageDetails(Integer height, String url, Integer width) {
    this.height = JsonNullable.of(height);
    this.url = url;
    this.width = JsonNullable.of(width);
  }

  public ImageDetails height(Integer height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * Get height
   * @return height
   */
  @NotNull 
  @Schema(name = "height", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("height")
  public JsonNullable<Integer> getHeight() {
    return height;
  }

  @JsonProperty("height")
  public void setHeight(JsonNullable<Integer> height) {
    this.height = height;
  }

  public ImageDetails url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @NotNull 
  @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  public ImageDetails width(Integer width) {
    this.width = JsonNullable.of(width);
    return this;
  }

  /**
   * Get width
   * @return width
   */
  @NotNull 
  @Schema(name = "width", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("width")
  public JsonNullable<Integer> getWidth() {
    return width;
  }

  @JsonProperty("width")
  public void setWidth(JsonNullable<Integer> width) {
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageDetails imageDetails = (ImageDetails) o;
    return Objects.equals(this.height, imageDetails.height) &&
        Objects.equals(this.url, imageDetails.url) &&
        Objects.equals(this.width, imageDetails.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDetails {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

