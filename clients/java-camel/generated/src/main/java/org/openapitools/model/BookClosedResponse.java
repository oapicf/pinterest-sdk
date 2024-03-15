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
 * Creation fields
 */

@Schema(name = "BookClosedResponse", description = "Creation fields")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BookClosedResponse {

  private Boolean conversionMetricsReady;

  private Boolean nonConversionMetricsReady;

  public BookClosedResponse conversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
    return this;
  }

  /**
   * Are conversion metrics ready?
   * @return conversionMetricsReady
  */
  
  @Schema(name = "conversion_metrics_ready", example = "false", description = "Are conversion metrics ready?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_metrics_ready")
  public Boolean getConversionMetricsReady() {
    return conversionMetricsReady;
  }

  public void setConversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
  }

  public BookClosedResponse nonConversionMetricsReady(Boolean nonConversionMetricsReady) {
    this.nonConversionMetricsReady = nonConversionMetricsReady;
    return this;
  }

  /**
   * Are non-conversion metrics ready?
   * @return nonConversionMetricsReady
  */
  
  @Schema(name = "non_conversion_metrics_ready", example = "false", description = "Are non-conversion metrics ready?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("non_conversion_metrics_ready")
  public Boolean getNonConversionMetricsReady() {
    return nonConversionMetricsReady;
  }

  public void setNonConversionMetricsReady(Boolean nonConversionMetricsReady) {
    this.nonConversionMetricsReady = nonConversionMetricsReady;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookClosedResponse bookClosedResponse = (BookClosedResponse) o;
    return Objects.equals(this.conversionMetricsReady, bookClosedResponse.conversionMetricsReady) &&
        Objects.equals(this.nonConversionMetricsReady, bookClosedResponse.nonConversionMetricsReady);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionMetricsReady, nonConversionMetricsReady);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookClosedResponse {\n");
    sb.append("    conversionMetricsReady: ").append(toIndentedString(conversionMetricsReady)).append("\n");
    sb.append("    nonConversionMetricsReady: ").append(toIndentedString(nonConversionMetricsReady)).append("\n");
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

