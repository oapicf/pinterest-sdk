package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Derived metrics for an ad campaign.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

