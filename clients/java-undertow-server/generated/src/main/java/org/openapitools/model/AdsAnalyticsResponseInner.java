/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdsAnalyticsResponseInner extends HashMap<String, Object>  {
  
  private String AD_ID;
  private Date DATE;

  /**
   * The ID of the ad that this metrics belongs to.
   */
  public AdsAnalyticsResponseInner AD_ID(String AD_ID) {
    this.AD_ID = AD_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the ad that this metrics belongs to.")
  @JsonProperty("AD_ID")
  public String getADID() {
    return AD_ID;
  }
  public void setADID(String AD_ID) {
    this.AD_ID = AD_ID;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   */
  public AdsAnalyticsResponseInner DATE(Date DATE) {
    this.DATE = DATE;
    return this;
  }

  
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
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
    AdsAnalyticsResponseInner adsAnalyticsResponseInner = (AdsAnalyticsResponseInner) o;
    return Objects.equals(AD_ID, adsAnalyticsResponseInner.AD_ID) &&
        Objects.equals(DATE, adsAnalyticsResponseInner.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_ID, DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsResponseInner {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    AD_ID: ").append(toIndentedString(AD_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
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

