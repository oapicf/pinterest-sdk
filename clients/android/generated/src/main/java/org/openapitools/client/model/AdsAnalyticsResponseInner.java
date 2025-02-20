/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.OasAnyTypeNotMapped;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class AdsAnalyticsResponseInner extends HashMap<String, OasAnyTypeNotMapped> {
  
  @SerializedName("AD_ID")
  private String AD_ID = null;
  @SerializedName("DATE")
  private Date DATE = null;

  /**
   * The ID of the ad that this metrics belongs to.
   **/
  @ApiModelProperty(required = true, value = "The ID of the ad that this metrics belongs to.")
  public String getADID() {
    return AD_ID;
  }
  public void setADID(String AD_ID) {
    this.AD_ID = AD_ID;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
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
    return (this.AD_ID == null ? adsAnalyticsResponseInner.AD_ID == null : this.AD_ID.equals(adsAnalyticsResponseInner.AD_ID)) &&
        (this.DATE == null ? adsAnalyticsResponseInner.DATE == null : this.DATE.equals(adsAnalyticsResponseInner.DATE));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.AD_ID == null ? 0: this.AD_ID.hashCode());
    result = 31 * result + (this.DATE == null ? 0: this.DATE.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsResponseInner {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  AD_ID: ").append(AD_ID).append("\n");
    sb.append("  DATE: ").append(DATE).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
