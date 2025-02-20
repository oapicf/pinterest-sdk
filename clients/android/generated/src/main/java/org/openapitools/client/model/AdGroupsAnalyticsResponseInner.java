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
public class AdGroupsAnalyticsResponseInner extends HashMap<String, OasAnyTypeNotMapped> {
  
  @SerializedName("AD_GROUP_ID")
  private String AD_GROUP_ID = null;
  @SerializedName("DATE")
  private Date DATE = null;

  /**
   * The ID of the ad group that this metrics belongs to.
   **/
  @ApiModelProperty(required = true, value = "The ID of the ad group that this metrics belongs to.")
  public String getADGROUPID() {
    return AD_GROUP_ID;
  }
  public void setADGROUPID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
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
    AdGroupsAnalyticsResponseInner adGroupsAnalyticsResponseInner = (AdGroupsAnalyticsResponseInner) o;
    return (this.AD_GROUP_ID == null ? adGroupsAnalyticsResponseInner.AD_GROUP_ID == null : this.AD_GROUP_ID.equals(adGroupsAnalyticsResponseInner.AD_GROUP_ID)) &&
        (this.DATE == null ? adGroupsAnalyticsResponseInner.DATE == null : this.DATE.equals(adGroupsAnalyticsResponseInner.DATE));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.AD_GROUP_ID == null ? 0: this.AD_GROUP_ID.hashCode());
    result = 31 * result + (this.DATE == null ? 0: this.DATE.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupsAnalyticsResponseInner {\n");
    sb.append("  " + super.toString()).append("\n");
    sb.append("  AD_GROUP_ID: ").append(AD_GROUP_ID).append("\n");
    sb.append("  DATE: ").append(DATE).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
