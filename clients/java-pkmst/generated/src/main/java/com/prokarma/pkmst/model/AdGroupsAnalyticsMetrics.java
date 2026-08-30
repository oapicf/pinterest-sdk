package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AdGroupsAnalyticsMetrics
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdGroupsAnalyticsMetrics   {
  @JsonProperty("AD_GROUP_ID")
  private String AD_GROUP_ID;

  @JsonProperty("DATE")
  private LocalDate DATE;

  public AdGroupsAnalyticsMetrics AD_GROUP_ID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
    return this;
  }

  /**
   * The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
   * @return AD_GROUP_ID
   */
  @ApiModelProperty(value = "The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.")
  public String getADGROUPID() {
    return AD_GROUP_ID;
  }

  public void setADGROUPID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
  }

  public AdGroupsAnalyticsMetrics DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   * @return DATE
   */
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
  public LocalDate getDATE() {
    return DATE;
  }

  public void setDATE(LocalDate DATE) {
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

