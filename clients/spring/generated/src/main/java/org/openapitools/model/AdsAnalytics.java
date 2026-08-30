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
 * AdsAnalytics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdsAnalytics {

  private String AD_ID;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate DATE;

  public AdsAnalytics() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdsAnalytics(String AD_ID) {
    this.AD_ID = AD_ID;
  }

  public AdsAnalytics AD_ID(String AD_ID) {
    this.AD_ID = AD_ID;
    return this;
  }

  /**
   * Get AD_ID
   * @return AD_ID
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "AD_ID", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AD_ID")
  public String getADID() {
    return AD_ID;
  }

  @JsonProperty("AD_ID")
  public void setADID(String AD_ID) {
    this.AD_ID = AD_ID;
  }

  public AdsAnalytics DATE(@Nullable LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

  /**
   * Get DATE
   * @return DATE
   */
  @Valid 
  @Schema(name = "DATE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DATE")
  public @Nullable LocalDate getDATE() {
    return DATE;
  }

  @JsonProperty("DATE")
  public void setDATE(@Nullable LocalDate DATE) {
    this.DATE = DATE;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsAnalytics adsAnalytics = (AdsAnalytics) o;
    return Objects.equals(this.AD_ID, adsAnalytics.AD_ID) &&
        Objects.equals(this.DATE, adsAnalytics.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_ID, DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalytics {\n");
    sb.append("    AD_ID: ").append(toIndentedString(AD_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
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

