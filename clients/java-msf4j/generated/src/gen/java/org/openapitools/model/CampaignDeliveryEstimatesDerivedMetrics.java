package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Derived metrics for an ad campaign.
 */
@ApiModel(description = "Derived metrics for an ad campaign.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignDeliveryEstimatesDerivedMetrics   {
  @JsonProperty("cpc")
  private Float cpc;

  @JsonProperty("cpc_lower")
  private Float cpcLower;

  @JsonProperty("cpc_upper")
  private Float cpcUpper;

  @JsonProperty("cpm")
  private Float cpm;

  @JsonProperty("cpm_lower")
  private Float cpmLower;

  @JsonProperty("cpm_upper")
  private Float cpmUpper;

  @JsonProperty("lifetime_frequency")
  private Float lifetimeFrequency;

  @JsonProperty("lifetime_frequency_lower")
  private Float lifetimeFrequencyLower;

  @JsonProperty("lifetime_frequency_upper")
  private Float lifetimeFrequencyUpper;

  @JsonProperty("lifetime_impression")
  private Float lifetimeImpression;

  @JsonProperty("lifetime_impression_lower")
  private Float lifetimeImpressionLower;

  @JsonProperty("lifetime_impression_upper")
  private Float lifetimeImpressionUpper;

  @JsonProperty("lifetime_reach")
  private Float lifetimeReach;

  @JsonProperty("lifetime_reach_lower")
  private Float lifetimeReachLower;

  @JsonProperty("lifetime_reach_upper")
  private Float lifetimeReachUpper;

  @JsonProperty("weekly_click")
  private Float weeklyClick;

  @JsonProperty("weekly_click_lower")
  private Float weeklyClickLower;

  @JsonProperty("weekly_click_upper")
  private Float weeklyClickUpper;

  @JsonProperty("weekly_frequency")
  private Float weeklyFrequency;

  @JsonProperty("weekly_frequency_lower")
  private Float weeklyFrequencyLower;

  @JsonProperty("weekly_frequency_upper")
  private Float weeklyFrequencyUpper;

  @JsonProperty("weekly_impression")
  private Float weeklyImpression;

  @JsonProperty("weekly_impression_lower")
  private Float weeklyImpressionLower;

  @JsonProperty("weekly_impression_upper")
  private Float weeklyImpressionUpper;

  @JsonProperty("weekly_reach")
  private Float weeklyReach;

  @JsonProperty("weekly_reach_lower")
  private Float weeklyReachLower;

  @JsonProperty("weekly_reach_upper")
  private Float weeklyReachUpper;

  public CampaignDeliveryEstimatesDerivedMetrics cpc(Float cpc) {
    this.cpc = cpc;
    return this;
  }

   /**
   * Estimated cost per click.
   * @return cpc
  **/
  @ApiModelProperty(example = "0.56", value = "Estimated cost per click.")
  public Float getCpc() {
    return cpc;
  }

  public void setCpc(Float cpc) {
    this.cpc = cpc;
  }

  public CampaignDeliveryEstimatesDerivedMetrics cpcLower(Float cpcLower) {
    this.cpcLower = cpcLower;
    return this;
  }

   /**
   * Lower estimate of the cost per click.
   * @return cpcLower
  **/
  @ApiModelProperty(example = "0.47", value = "Lower estimate of the cost per click.")
  public Float getCpcLower() {
    return cpcLower;
  }

  public void setCpcLower(Float cpcLower) {
    this.cpcLower = cpcLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics cpcUpper(Float cpcUpper) {
    this.cpcUpper = cpcUpper;
    return this;
  }

   /**
   * Upper estimate of the cost per click.
   * @return cpcUpper
  **/
  @ApiModelProperty(example = "0.65", value = "Upper estimate of the cost per click.")
  public Float getCpcUpper() {
    return cpcUpper;
  }

  public void setCpcUpper(Float cpcUpper) {
    this.cpcUpper = cpcUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics cpm(Float cpm) {
    this.cpm = cpm;
    return this;
  }

   /**
   * Estimated cost per thousand impressions.
   * @return cpm
  **/
  @ApiModelProperty(example = "10", value = "Estimated cost per thousand impressions.")
  public Float getCpm() {
    return cpm;
  }

  public void setCpm(Float cpm) {
    this.cpm = cpm;
  }

  public CampaignDeliveryEstimatesDerivedMetrics cpmLower(Float cpmLower) {
    this.cpmLower = cpmLower;
    return this;
  }

   /**
   * Lower estimate of cost per thousand impressions.
   * @return cpmLower
  **/
  @ApiModelProperty(example = "8", value = "Lower estimate of cost per thousand impressions.")
  public Float getCpmLower() {
    return cpmLower;
  }

  public void setCpmLower(Float cpmLower) {
    this.cpmLower = cpmLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics cpmUpper(Float cpmUpper) {
    this.cpmUpper = cpmUpper;
    return this;
  }

   /**
   * Upper estimate of cost per thousand impressions.
   * @return cpmUpper
  **/
  @ApiModelProperty(example = "12", value = "Upper estimate of cost per thousand impressions.")
  public Float getCpmUpper() {
    return cpmUpper;
  }

  public void setCpmUpper(Float cpmUpper) {
    this.cpmUpper = cpmUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeFrequency(Float lifetimeFrequency) {
    this.lifetimeFrequency = lifetimeFrequency;
    return this;
  }

   /**
   * Estimated lifetime frequency.
   * @return lifetimeFrequency
  **/
  @ApiModelProperty(value = "Estimated lifetime frequency.")
  public Float getLifetimeFrequency() {
    return lifetimeFrequency;
  }

  public void setLifetimeFrequency(Float lifetimeFrequency) {
    this.lifetimeFrequency = lifetimeFrequency;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeFrequencyLower(Float lifetimeFrequencyLower) {
    this.lifetimeFrequencyLower = lifetimeFrequencyLower;
    return this;
  }

   /**
   * Lower estimate of lifetime frequency.
   * @return lifetimeFrequencyLower
  **/
  @ApiModelProperty(value = "Lower estimate of lifetime frequency.")
  public Float getLifetimeFrequencyLower() {
    return lifetimeFrequencyLower;
  }

  public void setLifetimeFrequencyLower(Float lifetimeFrequencyLower) {
    this.lifetimeFrequencyLower = lifetimeFrequencyLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeFrequencyUpper(Float lifetimeFrequencyUpper) {
    this.lifetimeFrequencyUpper = lifetimeFrequencyUpper;
    return this;
  }

   /**
   * Upper estimate of lifetime frequency.
   * @return lifetimeFrequencyUpper
  **/
  @ApiModelProperty(value = "Upper estimate of lifetime frequency.")
  public Float getLifetimeFrequencyUpper() {
    return lifetimeFrequencyUpper;
  }

  public void setLifetimeFrequencyUpper(Float lifetimeFrequencyUpper) {
    this.lifetimeFrequencyUpper = lifetimeFrequencyUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeImpression(Float lifetimeImpression) {
    this.lifetimeImpression = lifetimeImpression;
    return this;
  }

   /**
   * Estimated lifetime impressions.
   * @return lifetimeImpression
  **/
  @ApiModelProperty(value = "Estimated lifetime impressions.")
  public Float getLifetimeImpression() {
    return lifetimeImpression;
  }

  public void setLifetimeImpression(Float lifetimeImpression) {
    this.lifetimeImpression = lifetimeImpression;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeImpressionLower(Float lifetimeImpressionLower) {
    this.lifetimeImpressionLower = lifetimeImpressionLower;
    return this;
  }

   /**
   * Lower estimate of lifetime impressions.
   * @return lifetimeImpressionLower
  **/
  @ApiModelProperty(value = "Lower estimate of lifetime impressions.")
  public Float getLifetimeImpressionLower() {
    return lifetimeImpressionLower;
  }

  public void setLifetimeImpressionLower(Float lifetimeImpressionLower) {
    this.lifetimeImpressionLower = lifetimeImpressionLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeImpressionUpper(Float lifetimeImpressionUpper) {
    this.lifetimeImpressionUpper = lifetimeImpressionUpper;
    return this;
  }

   /**
   * Upper estimate of lifetime impressions.
   * @return lifetimeImpressionUpper
  **/
  @ApiModelProperty(value = "Upper estimate of lifetime impressions.")
  public Float getLifetimeImpressionUpper() {
    return lifetimeImpressionUpper;
  }

  public void setLifetimeImpressionUpper(Float lifetimeImpressionUpper) {
    this.lifetimeImpressionUpper = lifetimeImpressionUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeReach(Float lifetimeReach) {
    this.lifetimeReach = lifetimeReach;
    return this;
  }

   /**
   * Estimated lifetime reach.
   * @return lifetimeReach
  **/
  @ApiModelProperty(value = "Estimated lifetime reach.")
  public Float getLifetimeReach() {
    return lifetimeReach;
  }

  public void setLifetimeReach(Float lifetimeReach) {
    this.lifetimeReach = lifetimeReach;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeReachLower(Float lifetimeReachLower) {
    this.lifetimeReachLower = lifetimeReachLower;
    return this;
  }

   /**
   * Lower estimate of lifetime reach.
   * @return lifetimeReachLower
  **/
  @ApiModelProperty(value = "Lower estimate of lifetime reach.")
  public Float getLifetimeReachLower() {
    return lifetimeReachLower;
  }

  public void setLifetimeReachLower(Float lifetimeReachLower) {
    this.lifetimeReachLower = lifetimeReachLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeReachUpper(Float lifetimeReachUpper) {
    this.lifetimeReachUpper = lifetimeReachUpper;
    return this;
  }

   /**
   * Upper estimate of lifetime reach.
   * @return lifetimeReachUpper
  **/
  @ApiModelProperty(value = "Upper estimate of lifetime reach.")
  public Float getLifetimeReachUpper() {
    return lifetimeReachUpper;
  }

  public void setLifetimeReachUpper(Float lifetimeReachUpper) {
    this.lifetimeReachUpper = lifetimeReachUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyClick(Float weeklyClick) {
    this.weeklyClick = weeklyClick;
    return this;
  }

   /**
   * Estimated weekly clicks.
   * @return weeklyClick
  **/
  @ApiModelProperty(example = "1000", value = "Estimated weekly clicks.")
  public Float getWeeklyClick() {
    return weeklyClick;
  }

  public void setWeeklyClick(Float weeklyClick) {
    this.weeklyClick = weeklyClick;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyClickLower(Float weeklyClickLower) {
    this.weeklyClickLower = weeklyClickLower;
    return this;
  }

   /**
   * Lower estimate of weekly clicks.
   * @return weeklyClickLower
  **/
  @ApiModelProperty(example = "800", value = "Lower estimate of weekly clicks.")
  public Float getWeeklyClickLower() {
    return weeklyClickLower;
  }

  public void setWeeklyClickLower(Float weeklyClickLower) {
    this.weeklyClickLower = weeklyClickLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyClickUpper(Float weeklyClickUpper) {
    this.weeklyClickUpper = weeklyClickUpper;
    return this;
  }

   /**
   * Upper estimate of weekly clicks.
   * @return weeklyClickUpper
  **/
  @ApiModelProperty(example = "1200", value = "Upper estimate of weekly clicks.")
  public Float getWeeklyClickUpper() {
    return weeklyClickUpper;
  }

  public void setWeeklyClickUpper(Float weeklyClickUpper) {
    this.weeklyClickUpper = weeklyClickUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyFrequency(Float weeklyFrequency) {
    this.weeklyFrequency = weeklyFrequency;
    return this;
  }

   /**
   * Estimated weekly frequency.
   * @return weeklyFrequency
  **/
  @ApiModelProperty(example = "3", value = "Estimated weekly frequency.")
  public Float getWeeklyFrequency() {
    return weeklyFrequency;
  }

  public void setWeeklyFrequency(Float weeklyFrequency) {
    this.weeklyFrequency = weeklyFrequency;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyFrequencyLower(Float weeklyFrequencyLower) {
    this.weeklyFrequencyLower = weeklyFrequencyLower;
    return this;
  }

   /**
   * Lower estimate of weekly frequency.
   * @return weeklyFrequencyLower
  **/
  @ApiModelProperty(example = "2.5", value = "Lower estimate of weekly frequency.")
  public Float getWeeklyFrequencyLower() {
    return weeklyFrequencyLower;
  }

  public void setWeeklyFrequencyLower(Float weeklyFrequencyLower) {
    this.weeklyFrequencyLower = weeklyFrequencyLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyFrequencyUpper(Float weeklyFrequencyUpper) {
    this.weeklyFrequencyUpper = weeklyFrequencyUpper;
    return this;
  }

   /**
   * Upper estimate of weekly frequency.
   * @return weeklyFrequencyUpper
  **/
  @ApiModelProperty(example = "3.5", value = "Upper estimate of weekly frequency.")
  public Float getWeeklyFrequencyUpper() {
    return weeklyFrequencyUpper;
  }

  public void setWeeklyFrequencyUpper(Float weeklyFrequencyUpper) {
    this.weeklyFrequencyUpper = weeklyFrequencyUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyImpression(Float weeklyImpression) {
    this.weeklyImpression = weeklyImpression;
    return this;
  }

   /**
   * Estimated weekly impressions.
   * @return weeklyImpression
  **/
  @ApiModelProperty(example = "400000", value = "Estimated weekly impressions.")
  public Float getWeeklyImpression() {
    return weeklyImpression;
  }

  public void setWeeklyImpression(Float weeklyImpression) {
    this.weeklyImpression = weeklyImpression;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyImpressionLower(Float weeklyImpressionLower) {
    this.weeklyImpressionLower = weeklyImpressionLower;
    return this;
  }

   /**
   * Lower estimate of weekly impressions.
   * @return weeklyImpressionLower
  **/
  @ApiModelProperty(example = "350000", value = "Lower estimate of weekly impressions.")
  public Float getWeeklyImpressionLower() {
    return weeklyImpressionLower;
  }

  public void setWeeklyImpressionLower(Float weeklyImpressionLower) {
    this.weeklyImpressionLower = weeklyImpressionLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyImpressionUpper(Float weeklyImpressionUpper) {
    this.weeklyImpressionUpper = weeklyImpressionUpper;
    return this;
  }

   /**
   * Upper estimate of weekly impressions.
   * @return weeklyImpressionUpper
  **/
  @ApiModelProperty(example = "450000", value = "Upper estimate of weekly impressions.")
  public Float getWeeklyImpressionUpper() {
    return weeklyImpressionUpper;
  }

  public void setWeeklyImpressionUpper(Float weeklyImpressionUpper) {
    this.weeklyImpressionUpper = weeklyImpressionUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyReach(Float weeklyReach) {
    this.weeklyReach = weeklyReach;
    return this;
  }

   /**
   * Estimated weekly reach.
   * @return weeklyReach
  **/
  @ApiModelProperty(example = "102074.85050444445", value = "Estimated weekly reach.")
  public Float getWeeklyReach() {
    return weeklyReach;
  }

  public void setWeeklyReach(Float weeklyReach) {
    this.weeklyReach = weeklyReach;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyReachLower(Float weeklyReachLower) {
    this.weeklyReachLower = weeklyReachLower;
    return this;
  }

   /**
   * Lower estimate of weekly reach.
   * @return weeklyReachLower
  **/
  @ApiModelProperty(example = "90000", value = "Lower estimate of weekly reach.")
  public Float getWeeklyReachLower() {
    return weeklyReachLower;
  }

  public void setWeeklyReachLower(Float weeklyReachLower) {
    this.weeklyReachLower = weeklyReachLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyReachUpper(Float weeklyReachUpper) {
    this.weeklyReachUpper = weeklyReachUpper;
    return this;
  }

   /**
   * Upper estimate of weekly reach.
   * @return weeklyReachUpper
  **/
  @ApiModelProperty(example = "150000", value = "Upper estimate of weekly reach.")
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

