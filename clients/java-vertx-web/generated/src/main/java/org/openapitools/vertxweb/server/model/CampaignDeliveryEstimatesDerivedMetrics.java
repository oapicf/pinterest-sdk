package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Derived metrics for an ad campaign.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignDeliveryEstimatesDerivedMetrics   {
  
  private Float cpc;
  private Float cpcLower;
  private Float cpcUpper;
  private Float cpm;
  private Float cpmLower;
  private Float cpmUpper;
  private Float lifetimeFrequency;
  private Float lifetimeFrequencyLower;
  private Float lifetimeFrequencyUpper;
  private Float lifetimeImpression;
  private Float lifetimeImpressionLower;
  private Float lifetimeImpressionUpper;
  private Float lifetimeReach;
  private Float lifetimeReachLower;
  private Float lifetimeReachUpper;
  private Float weeklyClick;
  private Float weeklyClickLower;
  private Float weeklyClickUpper;
  private Float weeklyFrequency;
  private Float weeklyFrequencyLower;
  private Float weeklyFrequencyUpper;
  private Float weeklyImpression;
  private Float weeklyImpressionLower;
  private Float weeklyImpressionUpper;
  private Float weeklyReach;
  private Float weeklyReachLower;
  private Float weeklyReachUpper;

  public CampaignDeliveryEstimatesDerivedMetrics () {

  }

  public CampaignDeliveryEstimatesDerivedMetrics (Float cpc, Float cpcLower, Float cpcUpper, Float cpm, Float cpmLower, Float cpmUpper, Float lifetimeFrequency, Float lifetimeFrequencyLower, Float lifetimeFrequencyUpper, Float lifetimeImpression, Float lifetimeImpressionLower, Float lifetimeImpressionUpper, Float lifetimeReach, Float lifetimeReachLower, Float lifetimeReachUpper, Float weeklyClick, Float weeklyClickLower, Float weeklyClickUpper, Float weeklyFrequency, Float weeklyFrequencyLower, Float weeklyFrequencyUpper, Float weeklyImpression, Float weeklyImpressionLower, Float weeklyImpressionUpper, Float weeklyReach, Float weeklyReachLower, Float weeklyReachUpper) {
    this.cpc = cpc;
    this.cpcLower = cpcLower;
    this.cpcUpper = cpcUpper;
    this.cpm = cpm;
    this.cpmLower = cpmLower;
    this.cpmUpper = cpmUpper;
    this.lifetimeFrequency = lifetimeFrequency;
    this.lifetimeFrequencyLower = lifetimeFrequencyLower;
    this.lifetimeFrequencyUpper = lifetimeFrequencyUpper;
    this.lifetimeImpression = lifetimeImpression;
    this.lifetimeImpressionLower = lifetimeImpressionLower;
    this.lifetimeImpressionUpper = lifetimeImpressionUpper;
    this.lifetimeReach = lifetimeReach;
    this.lifetimeReachLower = lifetimeReachLower;
    this.lifetimeReachUpper = lifetimeReachUpper;
    this.weeklyClick = weeklyClick;
    this.weeklyClickLower = weeklyClickLower;
    this.weeklyClickUpper = weeklyClickUpper;
    this.weeklyFrequency = weeklyFrequency;
    this.weeklyFrequencyLower = weeklyFrequencyLower;
    this.weeklyFrequencyUpper = weeklyFrequencyUpper;
    this.weeklyImpression = weeklyImpression;
    this.weeklyImpressionLower = weeklyImpressionLower;
    this.weeklyImpressionUpper = weeklyImpressionUpper;
    this.weeklyReach = weeklyReach;
    this.weeklyReachLower = weeklyReachLower;
    this.weeklyReachUpper = weeklyReachUpper;
  }

    
  @JsonProperty("cpc")
  public Float getCpc() {
    return cpc;
  }
  public void setCpc(Float cpc) {
    this.cpc = cpc;
  }

    
  @JsonProperty("cpc_lower")
  public Float getCpcLower() {
    return cpcLower;
  }
  public void setCpcLower(Float cpcLower) {
    this.cpcLower = cpcLower;
  }

    
  @JsonProperty("cpc_upper")
  public Float getCpcUpper() {
    return cpcUpper;
  }
  public void setCpcUpper(Float cpcUpper) {
    this.cpcUpper = cpcUpper;
  }

    
  @JsonProperty("cpm")
  public Float getCpm() {
    return cpm;
  }
  public void setCpm(Float cpm) {
    this.cpm = cpm;
  }

    
  @JsonProperty("cpm_lower")
  public Float getCpmLower() {
    return cpmLower;
  }
  public void setCpmLower(Float cpmLower) {
    this.cpmLower = cpmLower;
  }

    
  @JsonProperty("cpm_upper")
  public Float getCpmUpper() {
    return cpmUpper;
  }
  public void setCpmUpper(Float cpmUpper) {
    this.cpmUpper = cpmUpper;
  }

    
  @JsonProperty("lifetime_frequency")
  public Float getLifetimeFrequency() {
    return lifetimeFrequency;
  }
  public void setLifetimeFrequency(Float lifetimeFrequency) {
    this.lifetimeFrequency = lifetimeFrequency;
  }

    
  @JsonProperty("lifetime_frequency_lower")
  public Float getLifetimeFrequencyLower() {
    return lifetimeFrequencyLower;
  }
  public void setLifetimeFrequencyLower(Float lifetimeFrequencyLower) {
    this.lifetimeFrequencyLower = lifetimeFrequencyLower;
  }

    
  @JsonProperty("lifetime_frequency_upper")
  public Float getLifetimeFrequencyUpper() {
    return lifetimeFrequencyUpper;
  }
  public void setLifetimeFrequencyUpper(Float lifetimeFrequencyUpper) {
    this.lifetimeFrequencyUpper = lifetimeFrequencyUpper;
  }

    
  @JsonProperty("lifetime_impression")
  public Float getLifetimeImpression() {
    return lifetimeImpression;
  }
  public void setLifetimeImpression(Float lifetimeImpression) {
    this.lifetimeImpression = lifetimeImpression;
  }

    
  @JsonProperty("lifetime_impression_lower")
  public Float getLifetimeImpressionLower() {
    return lifetimeImpressionLower;
  }
  public void setLifetimeImpressionLower(Float lifetimeImpressionLower) {
    this.lifetimeImpressionLower = lifetimeImpressionLower;
  }

    
  @JsonProperty("lifetime_impression_upper")
  public Float getLifetimeImpressionUpper() {
    return lifetimeImpressionUpper;
  }
  public void setLifetimeImpressionUpper(Float lifetimeImpressionUpper) {
    this.lifetimeImpressionUpper = lifetimeImpressionUpper;
  }

    
  @JsonProperty("lifetime_reach")
  public Float getLifetimeReach() {
    return lifetimeReach;
  }
  public void setLifetimeReach(Float lifetimeReach) {
    this.lifetimeReach = lifetimeReach;
  }

    
  @JsonProperty("lifetime_reach_lower")
  public Float getLifetimeReachLower() {
    return lifetimeReachLower;
  }
  public void setLifetimeReachLower(Float lifetimeReachLower) {
    this.lifetimeReachLower = lifetimeReachLower;
  }

    
  @JsonProperty("lifetime_reach_upper")
  public Float getLifetimeReachUpper() {
    return lifetimeReachUpper;
  }
  public void setLifetimeReachUpper(Float lifetimeReachUpper) {
    this.lifetimeReachUpper = lifetimeReachUpper;
  }

    
  @JsonProperty("weekly_click")
  public Float getWeeklyClick() {
    return weeklyClick;
  }
  public void setWeeklyClick(Float weeklyClick) {
    this.weeklyClick = weeklyClick;
  }

    
  @JsonProperty("weekly_click_lower")
  public Float getWeeklyClickLower() {
    return weeklyClickLower;
  }
  public void setWeeklyClickLower(Float weeklyClickLower) {
    this.weeklyClickLower = weeklyClickLower;
  }

    
  @JsonProperty("weekly_click_upper")
  public Float getWeeklyClickUpper() {
    return weeklyClickUpper;
  }
  public void setWeeklyClickUpper(Float weeklyClickUpper) {
    this.weeklyClickUpper = weeklyClickUpper;
  }

    
  @JsonProperty("weekly_frequency")
  public Float getWeeklyFrequency() {
    return weeklyFrequency;
  }
  public void setWeeklyFrequency(Float weeklyFrequency) {
    this.weeklyFrequency = weeklyFrequency;
  }

    
  @JsonProperty("weekly_frequency_lower")
  public Float getWeeklyFrequencyLower() {
    return weeklyFrequencyLower;
  }
  public void setWeeklyFrequencyLower(Float weeklyFrequencyLower) {
    this.weeklyFrequencyLower = weeklyFrequencyLower;
  }

    
  @JsonProperty("weekly_frequency_upper")
  public Float getWeeklyFrequencyUpper() {
    return weeklyFrequencyUpper;
  }
  public void setWeeklyFrequencyUpper(Float weeklyFrequencyUpper) {
    this.weeklyFrequencyUpper = weeklyFrequencyUpper;
  }

    
  @JsonProperty("weekly_impression")
  public Float getWeeklyImpression() {
    return weeklyImpression;
  }
  public void setWeeklyImpression(Float weeklyImpression) {
    this.weeklyImpression = weeklyImpression;
  }

    
  @JsonProperty("weekly_impression_lower")
  public Float getWeeklyImpressionLower() {
    return weeklyImpressionLower;
  }
  public void setWeeklyImpressionLower(Float weeklyImpressionLower) {
    this.weeklyImpressionLower = weeklyImpressionLower;
  }

    
  @JsonProperty("weekly_impression_upper")
  public Float getWeeklyImpressionUpper() {
    return weeklyImpressionUpper;
  }
  public void setWeeklyImpressionUpper(Float weeklyImpressionUpper) {
    this.weeklyImpressionUpper = weeklyImpressionUpper;
  }

    
  @JsonProperty("weekly_reach")
  public Float getWeeklyReach() {
    return weeklyReach;
  }
  public void setWeeklyReach(Float weeklyReach) {
    this.weeklyReach = weeklyReach;
  }

    
  @JsonProperty("weekly_reach_lower")
  public Float getWeeklyReachLower() {
    return weeklyReachLower;
  }
  public void setWeeklyReachLower(Float weeklyReachLower) {
    this.weeklyReachLower = weeklyReachLower;
  }

    
  @JsonProperty("weekly_reach_upper")
  public Float getWeeklyReachUpper() {
    return weeklyReachUpper;
  }
  public void setWeeklyReachUpper(Float weeklyReachUpper) {
    this.weeklyReachUpper = weeklyReachUpper;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignDeliveryEstimatesDerivedMetrics campaignDeliveryEstimatesDerivedMetrics = (CampaignDeliveryEstimatesDerivedMetrics) o;
    return Objects.equals(cpc, campaignDeliveryEstimatesDerivedMetrics.cpc) &&
        Objects.equals(cpcLower, campaignDeliveryEstimatesDerivedMetrics.cpcLower) &&
        Objects.equals(cpcUpper, campaignDeliveryEstimatesDerivedMetrics.cpcUpper) &&
        Objects.equals(cpm, campaignDeliveryEstimatesDerivedMetrics.cpm) &&
        Objects.equals(cpmLower, campaignDeliveryEstimatesDerivedMetrics.cpmLower) &&
        Objects.equals(cpmUpper, campaignDeliveryEstimatesDerivedMetrics.cpmUpper) &&
        Objects.equals(lifetimeFrequency, campaignDeliveryEstimatesDerivedMetrics.lifetimeFrequency) &&
        Objects.equals(lifetimeFrequencyLower, campaignDeliveryEstimatesDerivedMetrics.lifetimeFrequencyLower) &&
        Objects.equals(lifetimeFrequencyUpper, campaignDeliveryEstimatesDerivedMetrics.lifetimeFrequencyUpper) &&
        Objects.equals(lifetimeImpression, campaignDeliveryEstimatesDerivedMetrics.lifetimeImpression) &&
        Objects.equals(lifetimeImpressionLower, campaignDeliveryEstimatesDerivedMetrics.lifetimeImpressionLower) &&
        Objects.equals(lifetimeImpressionUpper, campaignDeliveryEstimatesDerivedMetrics.lifetimeImpressionUpper) &&
        Objects.equals(lifetimeReach, campaignDeliveryEstimatesDerivedMetrics.lifetimeReach) &&
        Objects.equals(lifetimeReachLower, campaignDeliveryEstimatesDerivedMetrics.lifetimeReachLower) &&
        Objects.equals(lifetimeReachUpper, campaignDeliveryEstimatesDerivedMetrics.lifetimeReachUpper) &&
        Objects.equals(weeklyClick, campaignDeliveryEstimatesDerivedMetrics.weeklyClick) &&
        Objects.equals(weeklyClickLower, campaignDeliveryEstimatesDerivedMetrics.weeklyClickLower) &&
        Objects.equals(weeklyClickUpper, campaignDeliveryEstimatesDerivedMetrics.weeklyClickUpper) &&
        Objects.equals(weeklyFrequency, campaignDeliveryEstimatesDerivedMetrics.weeklyFrequency) &&
        Objects.equals(weeklyFrequencyLower, campaignDeliveryEstimatesDerivedMetrics.weeklyFrequencyLower) &&
        Objects.equals(weeklyFrequencyUpper, campaignDeliveryEstimatesDerivedMetrics.weeklyFrequencyUpper) &&
        Objects.equals(weeklyImpression, campaignDeliveryEstimatesDerivedMetrics.weeklyImpression) &&
        Objects.equals(weeklyImpressionLower, campaignDeliveryEstimatesDerivedMetrics.weeklyImpressionLower) &&
        Objects.equals(weeklyImpressionUpper, campaignDeliveryEstimatesDerivedMetrics.weeklyImpressionUpper) &&
        Objects.equals(weeklyReach, campaignDeliveryEstimatesDerivedMetrics.weeklyReach) &&
        Objects.equals(weeklyReachLower, campaignDeliveryEstimatesDerivedMetrics.weeklyReachLower) &&
        Objects.equals(weeklyReachUpper, campaignDeliveryEstimatesDerivedMetrics.weeklyReachUpper);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpc, cpcLower, cpcUpper, cpm, cpmLower, cpmUpper, lifetimeFrequency, lifetimeFrequencyLower, lifetimeFrequencyUpper, lifetimeImpression, lifetimeImpressionLower, lifetimeImpressionUpper, lifetimeReach, lifetimeReachLower, lifetimeReachUpper, weeklyClick, weeklyClickLower, weeklyClickUpper, weeklyFrequency, weeklyFrequencyLower, weeklyFrequencyUpper, weeklyImpression, weeklyImpressionLower, weeklyImpressionUpper, weeklyReach, weeklyReachLower, weeklyReachUpper);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDeliveryEstimatesDerivedMetrics {\n");
    
    sb.append("    cpc: ").append(toIndentedString(cpc)).append("\n");
    sb.append("    cpcLower: ").append(toIndentedString(cpcLower)).append("\n");
    sb.append("    cpcUpper: ").append(toIndentedString(cpcUpper)).append("\n");
    sb.append("    cpm: ").append(toIndentedString(cpm)).append("\n");
    sb.append("    cpmLower: ").append(toIndentedString(cpmLower)).append("\n");
    sb.append("    cpmUpper: ").append(toIndentedString(cpmUpper)).append("\n");
    sb.append("    lifetimeFrequency: ").append(toIndentedString(lifetimeFrequency)).append("\n");
    sb.append("    lifetimeFrequencyLower: ").append(toIndentedString(lifetimeFrequencyLower)).append("\n");
    sb.append("    lifetimeFrequencyUpper: ").append(toIndentedString(lifetimeFrequencyUpper)).append("\n");
    sb.append("    lifetimeImpression: ").append(toIndentedString(lifetimeImpression)).append("\n");
    sb.append("    lifetimeImpressionLower: ").append(toIndentedString(lifetimeImpressionLower)).append("\n");
    sb.append("    lifetimeImpressionUpper: ").append(toIndentedString(lifetimeImpressionUpper)).append("\n");
    sb.append("    lifetimeReach: ").append(toIndentedString(lifetimeReach)).append("\n");
    sb.append("    lifetimeReachLower: ").append(toIndentedString(lifetimeReachLower)).append("\n");
    sb.append("    lifetimeReachUpper: ").append(toIndentedString(lifetimeReachUpper)).append("\n");
    sb.append("    weeklyClick: ").append(toIndentedString(weeklyClick)).append("\n");
    sb.append("    weeklyClickLower: ").append(toIndentedString(weeklyClickLower)).append("\n");
    sb.append("    weeklyClickUpper: ").append(toIndentedString(weeklyClickUpper)).append("\n");
    sb.append("    weeklyFrequency: ").append(toIndentedString(weeklyFrequency)).append("\n");
    sb.append("    weeklyFrequencyLower: ").append(toIndentedString(weeklyFrequencyLower)).append("\n");
    sb.append("    weeklyFrequencyUpper: ").append(toIndentedString(weeklyFrequencyUpper)).append("\n");
    sb.append("    weeklyImpression: ").append(toIndentedString(weeklyImpression)).append("\n");
    sb.append("    weeklyImpressionLower: ").append(toIndentedString(weeklyImpressionLower)).append("\n");
    sb.append("    weeklyImpressionUpper: ").append(toIndentedString(weeklyImpressionUpper)).append("\n");
    sb.append("    weeklyReach: ").append(toIndentedString(weeklyReach)).append("\n");
    sb.append("    weeklyReachLower: ").append(toIndentedString(weeklyReachLower)).append("\n");
    sb.append("    weeklyReachUpper: ").append(toIndentedString(weeklyReachUpper)).append("\n");
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
