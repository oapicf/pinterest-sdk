package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Derived metrics for an ad campaign.
 */
@ApiModel(description="Derived metrics for an ad campaign.")

public class CampaignDeliveryEstimatesDerivedMetrics  {
  
 /**
  * Estimated cost per click.
  */
  @ApiModelProperty(example = "0.56", value = "Estimated cost per click.")
  private Float cpc;

 /**
  * Lower estimate of the cost per click.
  */
  @ApiModelProperty(example = "0.47", value = "Lower estimate of the cost per click.")
  private Float cpcLower;

 /**
  * Upper estimate of the cost per click.
  */
  @ApiModelProperty(example = "0.65", value = "Upper estimate of the cost per click.")
  private Float cpcUpper;

 /**
  * Estimated cost per thousand impressions.
  */
  @ApiModelProperty(example = "10", value = "Estimated cost per thousand impressions.")
  private Float cpm;

 /**
  * Lower estimate of cost per thousand impressions.
  */
  @ApiModelProperty(example = "8", value = "Lower estimate of cost per thousand impressions.")
  private Float cpmLower;

 /**
  * Upper estimate of cost per thousand impressions.
  */
  @ApiModelProperty(example = "12", value = "Upper estimate of cost per thousand impressions.")
  private Float cpmUpper;

 /**
  * Estimated lifetime frequency.
  */
  @ApiModelProperty(value = "Estimated lifetime frequency.")
  private Float lifetimeFrequency;

 /**
  * Lower estimate of lifetime frequency.
  */
  @ApiModelProperty(value = "Lower estimate of lifetime frequency.")
  private Float lifetimeFrequencyLower;

 /**
  * Upper estimate of lifetime frequency.
  */
  @ApiModelProperty(value = "Upper estimate of lifetime frequency.")
  private Float lifetimeFrequencyUpper;

 /**
  * Estimated lifetime impressions.
  */
  @ApiModelProperty(value = "Estimated lifetime impressions.")
  private Float lifetimeImpression;

 /**
  * Lower estimate of lifetime impressions.
  */
  @ApiModelProperty(value = "Lower estimate of lifetime impressions.")
  private Float lifetimeImpressionLower;

 /**
  * Upper estimate of lifetime impressions.
  */
  @ApiModelProperty(value = "Upper estimate of lifetime impressions.")
  private Float lifetimeImpressionUpper;

 /**
  * Estimated lifetime reach.
  */
  @ApiModelProperty(value = "Estimated lifetime reach.")
  private Float lifetimeReach;

 /**
  * Lower estimate of lifetime reach.
  */
  @ApiModelProperty(value = "Lower estimate of lifetime reach.")
  private Float lifetimeReachLower;

 /**
  * Upper estimate of lifetime reach.
  */
  @ApiModelProperty(value = "Upper estimate of lifetime reach.")
  private Float lifetimeReachUpper;

 /**
  * Estimated weekly clicks.
  */
  @ApiModelProperty(example = "1000", value = "Estimated weekly clicks.")
  private Float weeklyClick;

 /**
  * Lower estimate of weekly clicks.
  */
  @ApiModelProperty(example = "800", value = "Lower estimate of weekly clicks.")
  private Float weeklyClickLower;

 /**
  * Upper estimate of weekly clicks.
  */
  @ApiModelProperty(example = "1200", value = "Upper estimate of weekly clicks.")
  private Float weeklyClickUpper;

 /**
  * Estimated weekly frequency.
  */
  @ApiModelProperty(example = "3", value = "Estimated weekly frequency.")
  private Float weeklyFrequency;

 /**
  * Lower estimate of weekly frequency.
  */
  @ApiModelProperty(example = "2.5", value = "Lower estimate of weekly frequency.")
  private Float weeklyFrequencyLower;

 /**
  * Upper estimate of weekly frequency.
  */
  @ApiModelProperty(example = "3.5", value = "Upper estimate of weekly frequency.")
  private Float weeklyFrequencyUpper;

 /**
  * Estimated weekly impressions.
  */
  @ApiModelProperty(example = "400000", value = "Estimated weekly impressions.")
  private Float weeklyImpression;

 /**
  * Lower estimate of weekly impressions.
  */
  @ApiModelProperty(example = "350000", value = "Lower estimate of weekly impressions.")
  private Float weeklyImpressionLower;

 /**
  * Upper estimate of weekly impressions.
  */
  @ApiModelProperty(example = "450000", value = "Upper estimate of weekly impressions.")
  private Float weeklyImpressionUpper;

 /**
  * Estimated weekly reach.
  */
  @ApiModelProperty(example = "102074.85050444445", value = "Estimated weekly reach.")
  private Float weeklyReach;

 /**
  * Lower estimate of weekly reach.
  */
  @ApiModelProperty(example = "90000", value = "Lower estimate of weekly reach.")
  private Float weeklyReachLower;

 /**
  * Upper estimate of weekly reach.
  */
  @ApiModelProperty(example = "150000", value = "Upper estimate of weekly reach.")
  private Float weeklyReachUpper;
 /**
  * Estimated cost per click.
  * @return cpc
  */
  @JsonProperty("cpc")
  public Float getCpc() {
    return cpc;
  }

  /**
   * Sets the <code>cpc</code> property.
   */
 public void setCpc(Float cpc) {
    this.cpc = cpc;
  }

  /**
   * Sets the <code>cpc</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics cpc(Float cpc) {
    this.cpc = cpc;
    return this;
  }

 /**
  * Lower estimate of the cost per click.
  * @return cpcLower
  */
  @JsonProperty("cpc_lower")
  public Float getCpcLower() {
    return cpcLower;
  }

  /**
   * Sets the <code>cpcLower</code> property.
   */
 public void setCpcLower(Float cpcLower) {
    this.cpcLower = cpcLower;
  }

  /**
   * Sets the <code>cpcLower</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics cpcLower(Float cpcLower) {
    this.cpcLower = cpcLower;
    return this;
  }

 /**
  * Upper estimate of the cost per click.
  * @return cpcUpper
  */
  @JsonProperty("cpc_upper")
  public Float getCpcUpper() {
    return cpcUpper;
  }

  /**
   * Sets the <code>cpcUpper</code> property.
   */
 public void setCpcUpper(Float cpcUpper) {
    this.cpcUpper = cpcUpper;
  }

  /**
   * Sets the <code>cpcUpper</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics cpcUpper(Float cpcUpper) {
    this.cpcUpper = cpcUpper;
    return this;
  }

 /**
  * Estimated cost per thousand impressions.
  * @return cpm
  */
  @JsonProperty("cpm")
  public Float getCpm() {
    return cpm;
  }

  /**
   * Sets the <code>cpm</code> property.
   */
 public void setCpm(Float cpm) {
    this.cpm = cpm;
  }

  /**
   * Sets the <code>cpm</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics cpm(Float cpm) {
    this.cpm = cpm;
    return this;
  }

 /**
  * Lower estimate of cost per thousand impressions.
  * @return cpmLower
  */
  @JsonProperty("cpm_lower")
  public Float getCpmLower() {
    return cpmLower;
  }

  /**
   * Sets the <code>cpmLower</code> property.
   */
 public void setCpmLower(Float cpmLower) {
    this.cpmLower = cpmLower;
  }

  /**
   * Sets the <code>cpmLower</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics cpmLower(Float cpmLower) {
    this.cpmLower = cpmLower;
    return this;
  }

 /**
  * Upper estimate of cost per thousand impressions.
  * @return cpmUpper
  */
  @JsonProperty("cpm_upper")
  public Float getCpmUpper() {
    return cpmUpper;
  }

  /**
   * Sets the <code>cpmUpper</code> property.
   */
 public void setCpmUpper(Float cpmUpper) {
    this.cpmUpper = cpmUpper;
  }

  /**
   * Sets the <code>cpmUpper</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics cpmUpper(Float cpmUpper) {
    this.cpmUpper = cpmUpper;
    return this;
  }

 /**
  * Estimated lifetime frequency.
  * @return lifetimeFrequency
  */
  @JsonProperty("lifetime_frequency")
  public Float getLifetimeFrequency() {
    return lifetimeFrequency;
  }

  /**
   * Sets the <code>lifetimeFrequency</code> property.
   */
 public void setLifetimeFrequency(Float lifetimeFrequency) {
    this.lifetimeFrequency = lifetimeFrequency;
  }

  /**
   * Sets the <code>lifetimeFrequency</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics lifetimeFrequency(Float lifetimeFrequency) {
    this.lifetimeFrequency = lifetimeFrequency;
    return this;
  }

 /**
  * Lower estimate of lifetime frequency.
  * @return lifetimeFrequencyLower
  */
  @JsonProperty("lifetime_frequency_lower")
  public Float getLifetimeFrequencyLower() {
    return lifetimeFrequencyLower;
  }

  /**
   * Sets the <code>lifetimeFrequencyLower</code> property.
   */
 public void setLifetimeFrequencyLower(Float lifetimeFrequencyLower) {
    this.lifetimeFrequencyLower = lifetimeFrequencyLower;
  }

  /**
   * Sets the <code>lifetimeFrequencyLower</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics lifetimeFrequencyLower(Float lifetimeFrequencyLower) {
    this.lifetimeFrequencyLower = lifetimeFrequencyLower;
    return this;
  }

 /**
  * Upper estimate of lifetime frequency.
  * @return lifetimeFrequencyUpper
  */
  @JsonProperty("lifetime_frequency_upper")
  public Float getLifetimeFrequencyUpper() {
    return lifetimeFrequencyUpper;
  }

  /**
   * Sets the <code>lifetimeFrequencyUpper</code> property.
   */
 public void setLifetimeFrequencyUpper(Float lifetimeFrequencyUpper) {
    this.lifetimeFrequencyUpper = lifetimeFrequencyUpper;
  }

  /**
   * Sets the <code>lifetimeFrequencyUpper</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics lifetimeFrequencyUpper(Float lifetimeFrequencyUpper) {
    this.lifetimeFrequencyUpper = lifetimeFrequencyUpper;
    return this;
  }

 /**
  * Estimated lifetime impressions.
  * @return lifetimeImpression
  */
  @JsonProperty("lifetime_impression")
  public Float getLifetimeImpression() {
    return lifetimeImpression;
  }

  /**
   * Sets the <code>lifetimeImpression</code> property.
   */
 public void setLifetimeImpression(Float lifetimeImpression) {
    this.lifetimeImpression = lifetimeImpression;
  }

  /**
   * Sets the <code>lifetimeImpression</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics lifetimeImpression(Float lifetimeImpression) {
    this.lifetimeImpression = lifetimeImpression;
    return this;
  }

 /**
  * Lower estimate of lifetime impressions.
  * @return lifetimeImpressionLower
  */
  @JsonProperty("lifetime_impression_lower")
  public Float getLifetimeImpressionLower() {
    return lifetimeImpressionLower;
  }

  /**
   * Sets the <code>lifetimeImpressionLower</code> property.
   */
 public void setLifetimeImpressionLower(Float lifetimeImpressionLower) {
    this.lifetimeImpressionLower = lifetimeImpressionLower;
  }

  /**
   * Sets the <code>lifetimeImpressionLower</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics lifetimeImpressionLower(Float lifetimeImpressionLower) {
    this.lifetimeImpressionLower = lifetimeImpressionLower;
    return this;
  }

 /**
  * Upper estimate of lifetime impressions.
  * @return lifetimeImpressionUpper
  */
  @JsonProperty("lifetime_impression_upper")
  public Float getLifetimeImpressionUpper() {
    return lifetimeImpressionUpper;
  }

  /**
   * Sets the <code>lifetimeImpressionUpper</code> property.
   */
 public void setLifetimeImpressionUpper(Float lifetimeImpressionUpper) {
    this.lifetimeImpressionUpper = lifetimeImpressionUpper;
  }

  /**
   * Sets the <code>lifetimeImpressionUpper</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics lifetimeImpressionUpper(Float lifetimeImpressionUpper) {
    this.lifetimeImpressionUpper = lifetimeImpressionUpper;
    return this;
  }

 /**
  * Estimated lifetime reach.
  * @return lifetimeReach
  */
  @JsonProperty("lifetime_reach")
  public Float getLifetimeReach() {
    return lifetimeReach;
  }

  /**
   * Sets the <code>lifetimeReach</code> property.
   */
 public void setLifetimeReach(Float lifetimeReach) {
    this.lifetimeReach = lifetimeReach;
  }

  /**
   * Sets the <code>lifetimeReach</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics lifetimeReach(Float lifetimeReach) {
    this.lifetimeReach = lifetimeReach;
    return this;
  }

 /**
  * Lower estimate of lifetime reach.
  * @return lifetimeReachLower
  */
  @JsonProperty("lifetime_reach_lower")
  public Float getLifetimeReachLower() {
    return lifetimeReachLower;
  }

  /**
   * Sets the <code>lifetimeReachLower</code> property.
   */
 public void setLifetimeReachLower(Float lifetimeReachLower) {
    this.lifetimeReachLower = lifetimeReachLower;
  }

  /**
   * Sets the <code>lifetimeReachLower</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics lifetimeReachLower(Float lifetimeReachLower) {
    this.lifetimeReachLower = lifetimeReachLower;
    return this;
  }

 /**
  * Upper estimate of lifetime reach.
  * @return lifetimeReachUpper
  */
  @JsonProperty("lifetime_reach_upper")
  public Float getLifetimeReachUpper() {
    return lifetimeReachUpper;
  }

  /**
   * Sets the <code>lifetimeReachUpper</code> property.
   */
 public void setLifetimeReachUpper(Float lifetimeReachUpper) {
    this.lifetimeReachUpper = lifetimeReachUpper;
  }

  /**
   * Sets the <code>lifetimeReachUpper</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics lifetimeReachUpper(Float lifetimeReachUpper) {
    this.lifetimeReachUpper = lifetimeReachUpper;
    return this;
  }

 /**
  * Estimated weekly clicks.
  * @return weeklyClick
  */
  @JsonProperty("weekly_click")
  public Float getWeeklyClick() {
    return weeklyClick;
  }

  /**
   * Sets the <code>weeklyClick</code> property.
   */
 public void setWeeklyClick(Float weeklyClick) {
    this.weeklyClick = weeklyClick;
  }

  /**
   * Sets the <code>weeklyClick</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyClick(Float weeklyClick) {
    this.weeklyClick = weeklyClick;
    return this;
  }

 /**
  * Lower estimate of weekly clicks.
  * @return weeklyClickLower
  */
  @JsonProperty("weekly_click_lower")
  public Float getWeeklyClickLower() {
    return weeklyClickLower;
  }

  /**
   * Sets the <code>weeklyClickLower</code> property.
   */
 public void setWeeklyClickLower(Float weeklyClickLower) {
    this.weeklyClickLower = weeklyClickLower;
  }

  /**
   * Sets the <code>weeklyClickLower</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyClickLower(Float weeklyClickLower) {
    this.weeklyClickLower = weeklyClickLower;
    return this;
  }

 /**
  * Upper estimate of weekly clicks.
  * @return weeklyClickUpper
  */
  @JsonProperty("weekly_click_upper")
  public Float getWeeklyClickUpper() {
    return weeklyClickUpper;
  }

  /**
   * Sets the <code>weeklyClickUpper</code> property.
   */
 public void setWeeklyClickUpper(Float weeklyClickUpper) {
    this.weeklyClickUpper = weeklyClickUpper;
  }

  /**
   * Sets the <code>weeklyClickUpper</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyClickUpper(Float weeklyClickUpper) {
    this.weeklyClickUpper = weeklyClickUpper;
    return this;
  }

 /**
  * Estimated weekly frequency.
  * @return weeklyFrequency
  */
  @JsonProperty("weekly_frequency")
  public Float getWeeklyFrequency() {
    return weeklyFrequency;
  }

  /**
   * Sets the <code>weeklyFrequency</code> property.
   */
 public void setWeeklyFrequency(Float weeklyFrequency) {
    this.weeklyFrequency = weeklyFrequency;
  }

  /**
   * Sets the <code>weeklyFrequency</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyFrequency(Float weeklyFrequency) {
    this.weeklyFrequency = weeklyFrequency;
    return this;
  }

 /**
  * Lower estimate of weekly frequency.
  * @return weeklyFrequencyLower
  */
  @JsonProperty("weekly_frequency_lower")
  public Float getWeeklyFrequencyLower() {
    return weeklyFrequencyLower;
  }

  /**
   * Sets the <code>weeklyFrequencyLower</code> property.
   */
 public void setWeeklyFrequencyLower(Float weeklyFrequencyLower) {
    this.weeklyFrequencyLower = weeklyFrequencyLower;
  }

  /**
   * Sets the <code>weeklyFrequencyLower</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyFrequencyLower(Float weeklyFrequencyLower) {
    this.weeklyFrequencyLower = weeklyFrequencyLower;
    return this;
  }

 /**
  * Upper estimate of weekly frequency.
  * @return weeklyFrequencyUpper
  */
  @JsonProperty("weekly_frequency_upper")
  public Float getWeeklyFrequencyUpper() {
    return weeklyFrequencyUpper;
  }

  /**
   * Sets the <code>weeklyFrequencyUpper</code> property.
   */
 public void setWeeklyFrequencyUpper(Float weeklyFrequencyUpper) {
    this.weeklyFrequencyUpper = weeklyFrequencyUpper;
  }

  /**
   * Sets the <code>weeklyFrequencyUpper</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyFrequencyUpper(Float weeklyFrequencyUpper) {
    this.weeklyFrequencyUpper = weeklyFrequencyUpper;
    return this;
  }

 /**
  * Estimated weekly impressions.
  * @return weeklyImpression
  */
  @JsonProperty("weekly_impression")
  public Float getWeeklyImpression() {
    return weeklyImpression;
  }

  /**
   * Sets the <code>weeklyImpression</code> property.
   */
 public void setWeeklyImpression(Float weeklyImpression) {
    this.weeklyImpression = weeklyImpression;
  }

  /**
   * Sets the <code>weeklyImpression</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyImpression(Float weeklyImpression) {
    this.weeklyImpression = weeklyImpression;
    return this;
  }

 /**
  * Lower estimate of weekly impressions.
  * @return weeklyImpressionLower
  */
  @JsonProperty("weekly_impression_lower")
  public Float getWeeklyImpressionLower() {
    return weeklyImpressionLower;
  }

  /**
   * Sets the <code>weeklyImpressionLower</code> property.
   */
 public void setWeeklyImpressionLower(Float weeklyImpressionLower) {
    this.weeklyImpressionLower = weeklyImpressionLower;
  }

  /**
   * Sets the <code>weeklyImpressionLower</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyImpressionLower(Float weeklyImpressionLower) {
    this.weeklyImpressionLower = weeklyImpressionLower;
    return this;
  }

 /**
  * Upper estimate of weekly impressions.
  * @return weeklyImpressionUpper
  */
  @JsonProperty("weekly_impression_upper")
  public Float getWeeklyImpressionUpper() {
    return weeklyImpressionUpper;
  }

  /**
   * Sets the <code>weeklyImpressionUpper</code> property.
   */
 public void setWeeklyImpressionUpper(Float weeklyImpressionUpper) {
    this.weeklyImpressionUpper = weeklyImpressionUpper;
  }

  /**
   * Sets the <code>weeklyImpressionUpper</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyImpressionUpper(Float weeklyImpressionUpper) {
    this.weeklyImpressionUpper = weeklyImpressionUpper;
    return this;
  }

 /**
  * Estimated weekly reach.
  * @return weeklyReach
  */
  @JsonProperty("weekly_reach")
  public Float getWeeklyReach() {
    return weeklyReach;
  }

  /**
   * Sets the <code>weeklyReach</code> property.
   */
 public void setWeeklyReach(Float weeklyReach) {
    this.weeklyReach = weeklyReach;
  }

  /**
   * Sets the <code>weeklyReach</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyReach(Float weeklyReach) {
    this.weeklyReach = weeklyReach;
    return this;
  }

 /**
  * Lower estimate of weekly reach.
  * @return weeklyReachLower
  */
  @JsonProperty("weekly_reach_lower")
  public Float getWeeklyReachLower() {
    return weeklyReachLower;
  }

  /**
   * Sets the <code>weeklyReachLower</code> property.
   */
 public void setWeeklyReachLower(Float weeklyReachLower) {
    this.weeklyReachLower = weeklyReachLower;
  }

  /**
   * Sets the <code>weeklyReachLower</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyReachLower(Float weeklyReachLower) {
    this.weeklyReachLower = weeklyReachLower;
    return this;
  }

 /**
  * Upper estimate of weekly reach.
  * @return weeklyReachUpper
  */
  @JsonProperty("weekly_reach_upper")
  public Float getWeeklyReachUpper() {
    return weeklyReachUpper;
  }

  /**
   * Sets the <code>weeklyReachUpper</code> property.
   */
 public void setWeeklyReachUpper(Float weeklyReachUpper) {
    this.weeklyReachUpper = weeklyReachUpper;
  }

  /**
   * Sets the <code>weeklyReachUpper</code> property.
   */
  public CampaignDeliveryEstimatesDerivedMetrics weeklyReachUpper(Float weeklyReachUpper) {
    this.weeklyReachUpper = weeklyReachUpper;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

