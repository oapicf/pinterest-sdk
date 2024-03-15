package org.openapitools.model;

import java.util.HashMap;
import java.util.Map;
import org.joda.time.LocalDate;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CampaignsAnalyticsResponseInner extends HashMap<String, Object> {
  
  @ApiModelProperty(required = true, value = "The ID of the campaing that this metrics belongs to.")
 /**
   * The ID of the campaing that this metrics belongs to.
  **/
  private String CAMPAIGN_ID;

  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
 /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  **/
  private LocalDate DATE;
 /**
   * The ID of the campaing that this metrics belongs to.
   * @return CAMPAIGN_ID
  **/
  @JsonProperty("CAMPAIGN_ID")
  public String getCAMPAIGNID() {
    return CAMPAIGN_ID;
  }

  public void setCAMPAIGNID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
  }

  public CampaignsAnalyticsResponseInner CAMPAIGN_ID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
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

  public CampaignsAnalyticsResponseInner DATE(LocalDate DATE) {
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
    CampaignsAnalyticsResponseInner campaignsAnalyticsResponseInner = (CampaignsAnalyticsResponseInner) o;
    return Objects.equals(this.CAMPAIGN_ID, campaignsAnalyticsResponseInner.CAMPAIGN_ID) &&
        Objects.equals(this.DATE, campaignsAnalyticsResponseInner.DATE) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CAMPAIGN_ID, DATE, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsAnalyticsResponseInner {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    CAMPAIGN_ID: ").append(toIndentedString(CAMPAIGN_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

