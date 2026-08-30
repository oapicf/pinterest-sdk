package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ImageDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ImageSize
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ImageSize {

  private ImageDetails _1200x;

  private ImageDetails _150x150;

  private ImageDetails _400x300;

  private ImageDetails _600x;

  public ImageSize _1200x(ImageDetails _1200x) {
    this._1200x = _1200x;
    return this;
  }

  /**
   * Get _1200x
   * @return _1200x
   */
  @Valid 
  @Schema(name = "1200x", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("1200x")
  public ImageDetails get1200x() {
    return _1200x;
  }

  public void set1200x(ImageDetails _1200x) {
    this._1200x = _1200x;
  }

  public ImageSize _150x150(ImageDetails _150x150) {
    this._150x150 = _150x150;
    return this;
  }

  /**
   * Get _150x150
   * @return _150x150
   */
  @Valid 
  @Schema(name = "150x150", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("150x150")
  public ImageDetails get150x150() {
    return _150x150;
  }

  public void set150x150(ImageDetails _150x150) {
    this._150x150 = _150x150;
  }

  public ImageSize _400x300(ImageDetails _400x300) {
    this._400x300 = _400x300;
    return this;
  }

  /**
   * Get _400x300
   * @return _400x300
   */
  @Valid 
  @Schema(name = "400x300", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("400x300")
  public ImageDetails get400x300() {
    return _400x300;
  }

  public void set400x300(ImageDetails _400x300) {
    this._400x300 = _400x300;
  }

  public ImageSize _600x(ImageDetails _600x) {
    this._600x = _600x;
    return this;
  }

  /**
   * Get _600x
   * @return _600x
   */
  @Valid 
  @Schema(name = "600x", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("600x")
  public ImageDetails get600x() {
    return _600x;
  }

  public void set600x(ImageDetails _600x) {
    this._600x = _600x;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSize imageSize = (ImageSize) o;
    return Objects.equals(this._1200x, imageSize._1200x) &&
        Objects.equals(this._150x150, imageSize._150x150) &&
        Objects.equals(this._400x300, imageSize._400x300) &&
        Objects.equals(this._600x, imageSize._600x);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1200x, _150x150, _400x300, _600x);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSize {\n");
    sb.append("    _1200x: ").append(toIndentedString(_1200x)).append("\n");
    sb.append("    _150x150: ").append(toIndentedString(_150x150)).append("\n");
    sb.append("    _400x300: ").append(toIndentedString(_400x300)).append("\n");
    sb.append("    _600x: ").append(toIndentedString(_600x)).append("\n");
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

