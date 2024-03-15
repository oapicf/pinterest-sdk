package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AdResponse;
import org.openapitools.model.Exception;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdArrayResponseElement
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdArrayResponseElement {

  private AdResponse data;

  private Exception exceptions;

  public AdArrayResponseElement data(AdResponse data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  */
  @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public AdResponse getData() {
    return data;
  }

  public void setData(AdResponse data) {
    this.data = data;
  }

  public AdArrayResponseElement exceptions(Exception exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  /**
   * Get exceptions
   * @return exceptions
  */
  @Valid 
  @Schema(name = "exceptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptions")
  public Exception getExceptions() {
    return exceptions;
  }

  public void setExceptions(Exception exceptions) {
    this.exceptions = exceptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdArrayResponseElement adArrayResponseElement = (AdArrayResponseElement) o;
    return Objects.equals(this.data, adArrayResponseElement.data) &&
        Objects.equals(this.exceptions, adArrayResponseElement.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdArrayResponseElement {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

