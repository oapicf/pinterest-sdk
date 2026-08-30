package org.openapitools.model;

import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdGroupsAnalyticsMetrics  {
  
 /**
  * The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
  */
  @ApiModelProperty(value = "The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.")

  private String AD_GROUP_ID;

 /**
  * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  */
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")

  private LocalDate DATE;
 /**
   * The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
   * @return AD_GROUP_ID
  **/
  @JsonProperty("AD_GROUP_ID")
 @Pattern(regexp="^\\d+$")  public String getADGROUPID() {
    return AD_GROUP_ID;
  }

  public void setADGROUPID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
  }

  public AdGroupsAnalyticsMetrics AD_GROUP_ID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
    return this;
  }

 /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   * @return DATE
  **/
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }

  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }

  public AdGroupsAnalyticsMetrics DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

