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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdAccountAnalyticsResponseInner extends HashMap<String, Object>  {
  @JsonProperty("AD_ACCOUNT_ID")
  private String AD_ACCOUNT_ID;

  @JsonProperty("DATE")
  private Date DATE;

  /**
   * The ID of the advertiser that this metrics belongs to.
   **/
  public AdAccountAnalyticsResponseInner AD_ACCOUNT_ID(String AD_ACCOUNT_ID) {
    this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the advertiser that this metrics belongs to.")
  @JsonProperty("AD_ACCOUNT_ID")
  public String getADACCOUNTID() {
    return AD_ACCOUNT_ID;
  }
  public void setADACCOUNTID(String AD_ACCOUNT_ID) {
    this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   **/
  public AdAccountAnalyticsResponseInner DATE(Date DATE) {
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
    AdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner = (AdAccountAnalyticsResponseInner) o;
    return super.equals(o) && Objects.equals(AD_ACCOUNT_ID, adAccountAnalyticsResponseInner.AD_ACCOUNT_ID) &&
        Objects.equals(DATE, adAccountAnalyticsResponseInner.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), AD_ACCOUNT_ID, super.hashCode(), DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountAnalyticsResponseInner {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    AD_ACCOUNT_ID: ").append(toIndentedString(AD_ACCOUNT_ID)).append("\n");
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

