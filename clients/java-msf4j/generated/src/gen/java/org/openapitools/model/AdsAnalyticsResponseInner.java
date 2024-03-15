package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * AdsAnalyticsResponseInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdsAnalyticsResponseInner extends HashMap<String, Object>  {
  @JsonProperty("AD_ID")
  private String AD_ID;

  @JsonProperty("DATE")
  private Date DATE;

  public AdsAnalyticsResponseInner AD_ID(String AD_ID) {
    this.AD_ID = AD_ID;
    return this;
  }

   /**
   * The ID of the ad that this metrics belongs to.
   * @return AD_ID
  **/
  @ApiModelProperty(required = true, value = "The ID of the ad that this metrics belongs to.")
  public String getADID() {
    return AD_ID;
  }

  public void setADID(String AD_ID) {
    this.AD_ID = AD_ID;
  }

  public AdsAnalyticsResponseInner DATE(Date DATE) {
    this.DATE = DATE;
    return this;
  }

   /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   * @return DATE
  **/
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
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
    return Objects.equals(this.AD_ID, adsAnalyticsResponseInner.AD_ID) &&
        Objects.equals(this.DATE, adsAnalyticsResponseInner.DATE) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_ID, DATE, super.hashCode());
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

