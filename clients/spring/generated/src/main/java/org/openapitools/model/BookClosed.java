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
 * BookClosed
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BookClosed {

  private Boolean conversionMetricsReady;

  private Boolean nonConversionMetricsReady;

  public BookClosed() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BookClosed(Boolean conversionMetricsReady, Boolean nonConversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
    this.nonConversionMetricsReady = nonConversionMetricsReady;
  }

  public BookClosed conversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
    return this;
  }

  /**
   * Are conversion metrics ready?
   * @return conversionMetricsReady
   */
  @NotNull 
  @Schema(name = "conversion_metrics_ready", example = "false", description = "Are conversion metrics ready?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("conversion_metrics_ready")
  public Boolean getConversionMetricsReady() {
    return conversionMetricsReady;
  }

  @JsonProperty("conversion_metrics_ready")
  public void setConversionMetricsReady(Boolean conversionMetricsReady) {
    this.conversionMetricsReady = conversionMetricsReady;
  }

  public BookClosed nonConversionMetricsReady(Boolean nonConversionMetricsReady) {
    this.nonConversionMetricsReady = nonConversionMetricsReady;
    return this;
  }

  /**
   * Are non-conversion metrics ready?
   * @return nonConversionMetricsReady
   */
  @NotNull 
  @Schema(name = "non_conversion_metrics_ready", example = "false", description = "Are non-conversion metrics ready?", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("non_conversion_metrics_ready")
  public Boolean getNonConversionMetricsReady() {
    return nonConversionMetricsReady;
  }

  @JsonProperty("non_conversion_metrics_ready")
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
    BookClosed bookClosed = (BookClosed) o;
    return Objects.equals(this.conversionMetricsReady, bookClosed.conversionMetricsReady) &&
        Objects.equals(this.nonConversionMetricsReady, bookClosed.nonConversionMetricsReady);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversionMetricsReady, nonConversionMetricsReady);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookClosed {\n");
    sb.append("    conversionMetricsReady: ").append(toIndentedString(conversionMetricsReady)).append("\n");
    sb.append("    nonConversionMetricsReady: ").append(toIndentedString(nonConversionMetricsReady)).append("\n");
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

