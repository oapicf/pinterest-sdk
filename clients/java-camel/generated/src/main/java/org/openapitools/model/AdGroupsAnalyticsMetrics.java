package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdGroupsAnalyticsMetrics
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupsAnalyticsMetrics {

  private String AD_GROUP_ID;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date DATE;

  public AdGroupsAnalyticsMetrics AD_GROUP_ID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
    return this;
  }

  /**
   * The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
   * @return AD_GROUP_ID
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "AD_GROUP_ID", description = "The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AD_GROUP_ID")
  public String getADGROUPID() {
    return AD_GROUP_ID;
  }

  public void setADGROUPID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
  }

  public AdGroupsAnalyticsMetrics DATE(Date DATE) {
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
  public Date getDATE() {
    return DATE;
  }

  public void setDATE(Date DATE) {
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
    AdGroupsAnalyticsMetrics adGroupsAnalyticsMetrics = (AdGroupsAnalyticsMetrics) o;
    return Objects.equals(this.AD_GROUP_ID, adGroupsAnalyticsMetrics.AD_GROUP_ID) &&
        Objects.equals(this.DATE, adGroupsAnalyticsMetrics.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_GROUP_ID, DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupsAnalyticsMetrics {\n");
    sb.append("    AD_GROUP_ID: ").append(toIndentedString(AD_GROUP_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
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

