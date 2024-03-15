package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ImageDetails
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ImageDetails {

  private Integer width;

  private JsonNullable<@Min(100) Integer> height = JsonNullable.<Integer>undefined();

  private String url;

  public ImageDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ImageDetails(Integer width, Integer height, String url) {
    this.width = width;
    this.height = JsonNullable.of(height);
    this.url = url;
  }

  public ImageDetails width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * minimum: 100
   * @return width
  */
  @NotNull @Min(100) 
  @Schema(name = "width", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public ImageDetails height(Integer height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * Get height
   * minimum: 100
   * @return height
  */
  @NotNull @Min(100) 
  @Schema(name = "height", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("height")
  public JsonNullable<@Min(100) Integer> getHeight() {
    return height;
  }

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

  public void setUrl(String url) {
    this.url = url;
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
    return Objects.equals(this.width, imageDetails.width) &&
        Objects.equals(this.height, imageDetails.height) &&
        Objects.equals(this.url, imageDetails.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDetails {\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

