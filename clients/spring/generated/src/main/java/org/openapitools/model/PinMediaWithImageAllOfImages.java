package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PinMediaWithImageAllOfImages
 */

@JsonTypeName("PinMediaWithImage_allOf_images")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class PinMediaWithImageAllOfImages {

  private Object _150x150;

  private Object _400x300;

  private Object _600x;

  private Object _1200x;

  public PinMediaWithImageAllOfImages _150x150(Object _150x150) {
    this._150x150 = _150x150;
    return this;
  }

  /**
   * Get _150x150
   * @return _150x150
   */
  
  @Schema(name = "150x150", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("150x150")
  public Object get150x150() {
    return _150x150;
  }

  public void set150x150(Object _150x150) {
    this._150x150 = _150x150;
  }

  public PinMediaWithImageAllOfImages _400x300(Object _400x300) {
    this._400x300 = _400x300;
    return this;
  }

  /**
   * Get _400x300
   * @return _400x300
   */
  
  @Schema(name = "400x300", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("400x300")
  public Object get400x300() {
    return _400x300;
  }

  public void set400x300(Object _400x300) {
    this._400x300 = _400x300;
  }

  public PinMediaWithImageAllOfImages _600x(Object _600x) {
    this._600x = _600x;
    return this;
  }

  /**
   * Get _600x
   * @return _600x
   */
  
  @Schema(name = "600x", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("600x")
  public Object get600x() {
    return _600x;
  }

  public void set600x(Object _600x) {
    this._600x = _600x;
  }

  public PinMediaWithImageAllOfImages _1200x(Object _1200x) {
    this._1200x = _1200x;
    return this;
  }

  /**
   * Get _1200x
   * @return _1200x
   */
  
  @Schema(name = "1200x", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("1200x")
  public Object get1200x() {
    return _1200x;
  }

  public void set1200x(Object _1200x) {
    this._1200x = _1200x;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaWithImageAllOfImages pinMediaWithImageAllOfImages = (PinMediaWithImageAllOfImages) o;
    return Objects.equals(this._150x150, pinMediaWithImageAllOfImages._150x150) &&
        Objects.equals(this._400x300, pinMediaWithImageAllOfImages._400x300) &&
        Objects.equals(this._600x, pinMediaWithImageAllOfImages._600x) &&
        Objects.equals(this._1200x, pinMediaWithImageAllOfImages._1200x);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_150x150, _400x300, _600x, _1200x);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImageAllOfImages {\n");
    sb.append("    _150x150: ").append(toIndentedString(_150x150)).append("\n");
    sb.append("    _400x300: ").append(toIndentedString(_400x300)).append("\n");
    sb.append("    _600x: ").append(toIndentedString(_600x)).append("\n");
    sb.append("    _1200x: ").append(toIndentedString(_1200x)).append("\n");
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

