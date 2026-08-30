package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdPinAnalytics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdPinAnalytics {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate DATE;

  private String PIN_ID;

  public AdPinAnalytics() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdPinAnalytics(String PIN_ID) {
    this.PIN_ID = PIN_ID;
  }

  public AdPinAnalytics DATE(@Nullable LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   * @return DATE
   */
  @Valid 
  @Schema(name = "DATE", description = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DATE")
  public @Nullable LocalDate getDATE() {
    return DATE;
  }

  @JsonProperty("DATE")
  public void setDATE(@Nullable LocalDate DATE) {
    this.DATE = DATE;
  }

  public AdPinAnalytics PIN_ID(String PIN_ID) {
    this.PIN_ID = PIN_ID;
    return this;
  }

  /**
   * The ID of the pin that the metric belongs to.
   * @return PIN_ID
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "PIN_ID", description = "The ID of the pin that the metric belongs to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PIN_ID")
  public String getPINID() {
    return PIN_ID;
  }

  @JsonProperty("PIN_ID")
  public void setPINID(String PIN_ID) {
    this.PIN_ID = PIN_ID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdPinAnalytics adPinAnalytics = (AdPinAnalytics) o;
    return Objects.equals(this.DATE, adPinAnalytics.DATE) &&
        Objects.equals(this.PIN_ID, adPinAnalytics.PIN_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DATE, PIN_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPinAnalytics {\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("    PIN_ID: ").append(toIndentedString(PIN_ID)).append("\n");
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

