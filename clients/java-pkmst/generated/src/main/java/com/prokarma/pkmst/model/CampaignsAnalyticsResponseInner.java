package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CampaignsAnalyticsResponseInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CampaignsAnalyticsResponseInner extends HashMap<String, Object>  {
  @JsonProperty("CAMPAIGN_ID")
  private String CAMPAIGN_ID;

  @JsonProperty("DATE")
  private LocalDate DATE;

  public CampaignsAnalyticsResponseInner CAMPAIGN_ID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
    return this;
  }

   /**
   * The ID of the campaing that this metrics belongs to.
   * @return CAMPAIGN_ID
  **/
  @ApiModelProperty(required = true, value = "The ID of the campaing that this metrics belongs to.")
  public String getCAMPAIGNID() {
    return CAMPAIGN_ID;
  }

  public void setCAMPAIGNID(String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
  }

  public CampaignsAnalyticsResponseInner DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

   /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   * @return DATE
  **/
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

