package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Derived metrics for an ad campaign.
 */
public class CampaignDeliveryEstimatesDerivedMetrics implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Estimated cost per click.
   */
  @JsonProperty("cpc")
  private Float cpc;

  /**
   * Lower estimate of the cost per click.
   */
  @JsonProperty("cpc_lower")
  private Float cpcLower;

  /**
   * Upper estimate of the cost per click.
   */
  @JsonProperty("cpc_upper")
  private Float cpcUpper;

  /**
   * Estimated cost per thousand impressions.
   */
  @JsonProperty("cpm")
  private Float cpm;

  /**
   * Lower estimate of cost per thousand impressions.
   */
  @JsonProperty("cpm_lower")
  private Float cpmLower;

  /**
   * Upper estimate of cost per thousand impressions.
   */
  @JsonProperty("cpm_upper")
  private Float cpmUpper;

  /**
   * Estimated lifetime frequency.
   */
  @JsonProperty("lifetime_frequency")
  private Float lifetimeFrequency;

  /**
   * Lower estimate of lifetime frequency.
   */
  @JsonProperty("lifetime_frequency_lower")
  private Float lifetimeFrequencyLower;

  /**
   * Upper estimate of lifetime frequency.
   */
  @JsonProperty("lifetime_frequency_upper")
  private Float lifetimeFrequencyUpper;

  /**
   * Estimated lifetime impressions.
   */
  @JsonProperty("lifetime_impression")
  private Float lifetimeImpression;

  /**
   * Lower estimate of lifetime impressions.
   */
  @JsonProperty("lifetime_impression_lower")
  private Float lifetimeImpressionLower;

  /**
   * Upper estimate of lifetime impressions.
   */
  @JsonProperty("lifetime_impression_upper")
  private Float lifetimeImpressionUpper;

  /**
   * Estimated lifetime reach.
   */
  @JsonProperty("lifetime_reach")
  private Float lifetimeReach;

  /**
   * Lower estimate of lifetime reach.
   */
  @JsonProperty("lifetime_reach_lower")
  private Float lifetimeReachLower;

  /**
   * Upper estimate of lifetime reach.
   */
  @JsonProperty("lifetime_reach_upper")
  private Float lifetimeReachUpper;

  /**
   * Estimated weekly clicks.
   */
  @JsonProperty("weekly_click")
  private Float weeklyClick;

  /**
   * Lower estimate of weekly clicks.
   */
  @JsonProperty("weekly_click_lower")
  private Float weeklyClickLower;

  /**
   * Upper estimate of weekly clicks.
   */
  @JsonProperty("weekly_click_upper")
  private Float weeklyClickUpper;

  /**
   * Estimated weekly frequency.
   */
  @JsonProperty("weekly_frequency")
  private Float weeklyFrequency;

  /**
   * Lower estimate of weekly frequency.
   */
  @JsonProperty("weekly_frequency_lower")
  private Float weeklyFrequencyLower;

  /**
   * Upper estimate of weekly frequency.
   */
  @JsonProperty("weekly_frequency_upper")
  private Float weeklyFrequencyUpper;

  /**
   * Estimated weekly impressions.
   */
  @JsonProperty("weekly_impression")
  private Float weeklyImpression;

  /**
   * Lower estimate of weekly impressions.
   */
  @JsonProperty("weekly_impression_lower")
  private Float weeklyImpressionLower;

  /**
   * Upper estimate of weekly impressions.
   */
  @JsonProperty("weekly_impression_upper")
  private Float weeklyImpressionUpper;

  /**
   * Estimated weekly reach.
   */
  @JsonProperty("weekly_reach")
  private Float weeklyReach;

  /**
   * Lower estimate of weekly reach.
   */
  @JsonProperty("weekly_reach_lower")
  private Float weeklyReachLower;

  /**
   * Upper estimate of weekly reach.
   */
  @JsonProperty("weekly_reach_upper")
  private Float weeklyReachUpper;

  /**
   * Estimated cost per click.
   * @return cpc
   */
  public Float getCpc() {
    return cpc;
  }

  public void setCpc(Float cpc) {
    this.cpc = cpc;
  }

  /**
   * Lower estimate of the cost per click.
   * @return cpcLower
   */
  public Float getCpcLower() {
    return cpcLower;
  }

  public void setCpcLower(Float cpcLower) {
    this.cpcLower = cpcLower;
  }

  /**
   * Upper estimate of the cost per click.
   * @return cpcUpper
   */
  public Float getCpcUpper() {
    return cpcUpper;
  }

  public void setCpcUpper(Float cpcUpper) {
    this.cpcUpper = cpcUpper;
  }

  /**
   * Estimated cost per thousand impressions.
   * @return cpm
   */
  public Float getCpm() {
    return cpm;
  }

  public void setCpm(Float cpm) {
    this.cpm = cpm;
  }

  /**
   * Lower estimate of cost per thousand impressions.
   * @return cpmLower
   */
  public Float getCpmLower() {
    return cpmLower;
  }

  public void setCpmLower(Float cpmLower) {
    this.cpmLower = cpmLower;
  }

  /**
   * Upper estimate of cost per thousand impressions.
   * @return cpmUpper
   */
  public Float getCpmUpper() {
    return cpmUpper;
  }

  public void setCpmUpper(Float cpmUpper) {
    this.cpmUpper = cpmUpper;
  }

  /**
   * Estimated lifetime frequency.
   * @return lifetimeFrequency
   */
  public Float getLifetimeFrequency() {
    return lifetimeFrequency;
  }

  public void setLifetimeFrequency(Float lifetimeFrequency) {
    this.lifetimeFrequency = lifetimeFrequency;
  }

  /**
   * Lower estimate of lifetime frequency.
   * @return lifetimeFrequencyLower
   */
  public Float getLifetimeFrequencyLower() {
    return lifetimeFrequencyLower;
  }

  public void setLifetimeFrequencyLower(Float lifetimeFrequencyLower) {
    this.lifetimeFrequencyLower = lifetimeFrequencyLower;
  }

  /**
   * Upper estimate of lifetime frequency.
   * @return lifetimeFrequencyUpper
   */
  public Float getLifetimeFrequencyUpper() {
    return lifetimeFrequencyUpper;
  }

  public void setLifetimeFrequencyUpper(Float lifetimeFrequencyUpper) {
    this.lifetimeFrequencyUpper = lifetimeFrequencyUpper;
  }

  /**
   * Estimated lifetime impressions.
   * @return lifetimeImpression
   */
  public Float getLifetimeImpression() {
    return lifetimeImpression;
  }

  public void setLifetimeImpression(Float lifetimeImpression) {
    this.lifetimeImpression = lifetimeImpression;
  }

  /**
   * Lower estimate of lifetime impressions.
   * @return lifetimeImpressionLower
   */
  public Float getLifetimeImpressionLower() {
    return lifetimeImpressionLower;
  }

  public void setLifetimeImpressionLower(Float lifetimeImpressionLower) {
    this.lifetimeImpressionLower = lifetimeImpressionLower;
  }

  /**
   * Upper estimate of lifetime impressions.
   * @return lifetimeImpressionUpper
   */
  public Float getLifetimeImpressionUpper() {
    return lifetimeImpressionUpper;
  }

  public void setLifetimeImpressionUpper(Float lifetimeImpressionUpper) {
    this.lifetimeImpressionUpper = lifetimeImpressionUpper;
  }

  /**
   * Estimated lifetime reach.
   * @return lifetimeReach
   */
  public Float getLifetimeReach() {
    return lifetimeReach;
  }

  public void setLifetimeReach(Float lifetimeReach) {
    this.lifetimeReach = lifetimeReach;
  }

  /**
   * Lower estimate of lifetime reach.
   * @return lifetimeReachLower
   */
  public Float getLifetimeReachLower() {
    return lifetimeReachLower;
  }

  public void setLifetimeReachLower(Float lifetimeReachLower) {
    this.lifetimeReachLower = lifetimeReachLower;
  }

  /**
   * Upper estimate of lifetime reach.
   * @return lifetimeReachUpper
   */
  public Float getLifetimeReachUpper() {
    return lifetimeReachUpper;
  }

  public void setLifetimeReachUpper(Float lifetimeReachUpper) {
    this.lifetimeReachUpper = lifetimeReachUpper;
  }

  /**
   * Estimated weekly clicks.
   * @return weeklyClick
   */
  public Float getWeeklyClick() {
    return weeklyClick;
  }

  public void setWeeklyClick(Float weeklyClick) {
    this.weeklyClick = weeklyClick;
  }

  /**
   * Lower estimate of weekly clicks.
   * @return weeklyClickLower
   */
  public Float getWeeklyClickLower() {
    return weeklyClickLower;
  }

  public void setWeeklyClickLower(Float weeklyClickLower) {
    this.weeklyClickLower = weeklyClickLower;
  }

  /**
   * Upper estimate of weekly clicks.
   * @return weeklyClickUpper
   */
  public Float getWeeklyClickUpper() {
    return weeklyClickUpper;
  }

  public void setWeeklyClickUpper(Float weeklyClickUpper) {
    this.weeklyClickUpper = weeklyClickUpper;
  }

  /**
   * Estimated weekly frequency.
   * @return weeklyFrequency
   */
  public Float getWeeklyFrequency() {
    return weeklyFrequency;
  }

  public void setWeeklyFrequency(Float weeklyFrequency) {
    this.weeklyFrequency = weeklyFrequency;
  }

  /**
   * Lower estimate of weekly frequency.
   * @return weeklyFrequencyLower
   */
  public Float getWeeklyFrequencyLower() {
    return weeklyFrequencyLower;
  }

  public void setWeeklyFrequencyLower(Float weeklyFrequencyLower) {
    this.weeklyFrequencyLower = weeklyFrequencyLower;
  }

  /**
   * Upper estimate of weekly frequency.
   * @return weeklyFrequencyUpper
   */
  public Float getWeeklyFrequencyUpper() {
    return weeklyFrequencyUpper;
  }

  public void setWeeklyFrequencyUpper(Float weeklyFrequencyUpper) {
    this.weeklyFrequencyUpper = weeklyFrequencyUpper;
  }

  /**
   * Estimated weekly impressions.
   * @return weeklyImpression
   */
  public Float getWeeklyImpression() {
    return weeklyImpression;
  }

  public void setWeeklyImpression(Float weeklyImpression) {
    this.weeklyImpression = weeklyImpression;
  }

  /**
   * Lower estimate of weekly impressions.
   * @return weeklyImpressionLower
   */
  public Float getWeeklyImpressionLower() {
    return weeklyImpressionLower;
  }

  public void setWeeklyImpressionLower(Float weeklyImpressionLower) {
    this.weeklyImpressionLower = weeklyImpressionLower;
  }

  /**
   * Upper estimate of weekly impressions.
   * @return weeklyImpressionUpper
   */
  public Float getWeeklyImpressionUpper() {
    return weeklyImpressionUpper;
  }

  public void setWeeklyImpressionUpper(Float weeklyImpressionUpper) {
    this.weeklyImpressionUpper = weeklyImpressionUpper;
  }

  /**
   * Estimated weekly reach.
   * @return weeklyReach
   */
  public Float getWeeklyReach() {
    return weeklyReach;
  }

  public void setWeeklyReach(Float weeklyReach) {
    this.weeklyReach = weeklyReach;
  }

  /**
   * Lower estimate of weekly reach.
   * @return weeklyReachLower
   */
  public Float getWeeklyReachLower() {
    return weeklyReachLower;
  }

  public void setWeeklyReachLower(Float weeklyReachLower) {
    this.weeklyReachLower = weeklyReachLower;
  }

  /**
   * Upper estimate of weekly reach.
   * @return weeklyReachUpper
   */
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
    return Objects.equals(this.cpc, campaignDeliveryEstimatesDerivedMetrics.cpc) &&
        Objects.equals(this.cpcLower, campaignDeliveryEstimatesDerivedMetrics.cpcLower) &&
        Objects.equals(this.cpcUpper, campaignDeliveryEstimatesDerivedMetrics.cpcUpper) &&
        Objects.equals(this.cpm, campaignDeliveryEstimatesDerivedMetrics.cpm) &&
        Objects.equals(this.cpmLower, campaignDeliveryEstimatesDerivedMetrics.cpmLower) &&
        Objects.equals(this.cpmUpper, campaignDeliveryEstimatesDerivedMetrics.cpmUpper) &&
        Objects.equals(this.lifetimeFrequency, campaignDeliveryEstimatesDerivedMetrics.lifetimeFrequency) &&
        Objects.equals(this.lifetimeFrequencyLower, campaignDeliveryEstimatesDerivedMetrics.lifetimeFrequencyLower) &&
        Objects.equals(this.lifetimeFrequencyUpper, campaignDeliveryEstimatesDerivedMetrics.lifetimeFrequencyUpper) &&
        Objects.equals(this.lifetimeImpression, campaignDeliveryEstimatesDerivedMetrics.lifetimeImpression) &&
        Objects.equals(this.lifetimeImpressionLower, campaignDeliveryEstimatesDerivedMetrics.lifetimeImpressionLower) &&
        Objects.equals(this.lifetimeImpressionUpper, campaignDeliveryEstimatesDerivedMetrics.lifetimeImpressionUpper) &&
        Objects.equals(this.lifetimeReach, campaignDeliveryEstimatesDerivedMetrics.lifetimeReach) &&
        Objects.equals(this.lifetimeReachLower, campaignDeliveryEstimatesDerivedMetrics.lifetimeReachLower) &&
        Objects.equals(this.lifetimeReachUpper, campaignDeliveryEstimatesDerivedMetrics.lifetimeReachUpper) &&
        Objects.equals(this.weeklyClick, campaignDeliveryEstimatesDerivedMetrics.weeklyClick) &&
        Objects.equals(this.weeklyClickLower, campaignDeliveryEstimatesDerivedMetrics.weeklyClickLower) &&
        Objects.equals(this.weeklyClickUpper, campaignDeliveryEstimatesDerivedMetrics.weeklyClickUpper) &&
        Objects.equals(this.weeklyFrequency, campaignDeliveryEstimatesDerivedMetrics.weeklyFrequency) &&
        Objects.equals(this.weeklyFrequencyLower, campaignDeliveryEstimatesDerivedMetrics.weeklyFrequencyLower) &&
        Objects.equals(this.weeklyFrequencyUpper, campaignDeliveryEstimatesDerivedMetrics.weeklyFrequencyUpper) &&
        Objects.equals(this.weeklyImpression, campaignDeliveryEstimatesDerivedMetrics.weeklyImpression) &&
        Objects.equals(this.weeklyImpressionLower, campaignDeliveryEstimatesDerivedMetrics.weeklyImpressionLower) &&
        Objects.equals(this.weeklyImpressionUpper, campaignDeliveryEstimatesDerivedMetrics.weeklyImpressionUpper) &&
        Objects.equals(this.weeklyReach, campaignDeliveryEstimatesDerivedMetrics.weeklyReach) &&
        Objects.equals(this.weeklyReachLower, campaignDeliveryEstimatesDerivedMetrics.weeklyReachLower) &&
        Objects.equals(this.weeklyReachUpper, campaignDeliveryEstimatesDerivedMetrics.weeklyReachUpper);
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
