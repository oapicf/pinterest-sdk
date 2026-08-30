package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Derived metrics for an ad campaign.
 */

@Schema(name = "CampaignDeliveryEstimatesDerivedMetrics", description = "Derived metrics for an ad campaign.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignDeliveryEstimatesDerivedMetrics {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float cpc;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float cpcLower;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float cpcUpper;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float cpm;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float cpmLower;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float cpmUpper;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float lifetimeFrequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float lifetimeFrequencyLower;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float lifetimeFrequencyUpper;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float lifetimeImpression;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float lifetimeImpressionLower;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float lifetimeImpressionUpper;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float lifetimeReach;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float lifetimeReachLower;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float lifetimeReachUpper;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyClick;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyClickLower;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyClickUpper;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyFrequency;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyFrequencyLower;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyFrequencyUpper;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyImpression;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyImpressionLower;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyImpressionUpper;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyReach;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyReachLower;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Float weeklyReachUpper;

  public CampaignDeliveryEstimatesDerivedMetrics cpc(@Nullable Float cpc) {
    this.cpc = cpc;
    return this;
  }

  /**
   * Estimated cost per click.
   * @return cpc
   */
  
  @Schema(name = "cpc", example = "0.56", description = "Estimated cost per click.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpc")
  public @Nullable Float getCpc() {
    return cpc;
  }

  @JsonProperty("cpc")
  public void setCpc(@Nullable Float cpc) {
    this.cpc = cpc;
  }

  public CampaignDeliveryEstimatesDerivedMetrics cpcLower(@Nullable Float cpcLower) {
    this.cpcLower = cpcLower;
    return this;
  }

  /**
   * Lower estimate of the cost per click.
   * @return cpcLower
   */
  
  @Schema(name = "cpc_lower", example = "0.47", description = "Lower estimate of the cost per click.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpc_lower")
  public @Nullable Float getCpcLower() {
    return cpcLower;
  }

  @JsonProperty("cpc_lower")
  public void setCpcLower(@Nullable Float cpcLower) {
    this.cpcLower = cpcLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics cpcUpper(@Nullable Float cpcUpper) {
    this.cpcUpper = cpcUpper;
    return this;
  }

  /**
   * Upper estimate of the cost per click.
   * @return cpcUpper
   */
  
  @Schema(name = "cpc_upper", example = "0.65", description = "Upper estimate of the cost per click.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpc_upper")
  public @Nullable Float getCpcUpper() {
    return cpcUpper;
  }

  @JsonProperty("cpc_upper")
  public void setCpcUpper(@Nullable Float cpcUpper) {
    this.cpcUpper = cpcUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics cpm(@Nullable Float cpm) {
    this.cpm = cpm;
    return this;
  }

  /**
   * Estimated cost per thousand impressions.
   * @return cpm
   */
  
  @Schema(name = "cpm", example = "10", description = "Estimated cost per thousand impressions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpm")
  public @Nullable Float getCpm() {
    return cpm;
  }

  @JsonProperty("cpm")
  public void setCpm(@Nullable Float cpm) {
    this.cpm = cpm;
  }

  public CampaignDeliveryEstimatesDerivedMetrics cpmLower(@Nullable Float cpmLower) {
    this.cpmLower = cpmLower;
    return this;
  }

  /**
   * Lower estimate of cost per thousand impressions.
   * @return cpmLower
   */
  
  @Schema(name = "cpm_lower", example = "8", description = "Lower estimate of cost per thousand impressions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpm_lower")
  public @Nullable Float getCpmLower() {
    return cpmLower;
  }

  @JsonProperty("cpm_lower")
  public void setCpmLower(@Nullable Float cpmLower) {
    this.cpmLower = cpmLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics cpmUpper(@Nullable Float cpmUpper) {
    this.cpmUpper = cpmUpper;
    return this;
  }

  /**
   * Upper estimate of cost per thousand impressions.
   * @return cpmUpper
   */
  
  @Schema(name = "cpm_upper", example = "12", description = "Upper estimate of cost per thousand impressions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpm_upper")
  public @Nullable Float getCpmUpper() {
    return cpmUpper;
  }

  @JsonProperty("cpm_upper")
  public void setCpmUpper(@Nullable Float cpmUpper) {
    this.cpmUpper = cpmUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeFrequency(@Nullable Float lifetimeFrequency) {
    this.lifetimeFrequency = lifetimeFrequency;
    return this;
  }

  /**
   * Estimated lifetime frequency.
   * @return lifetimeFrequency
   */
  
  @Schema(name = "lifetime_frequency", description = "Estimated lifetime frequency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_frequency")
  public @Nullable Float getLifetimeFrequency() {
    return lifetimeFrequency;
  }

  @JsonProperty("lifetime_frequency")
  public void setLifetimeFrequency(@Nullable Float lifetimeFrequency) {
    this.lifetimeFrequency = lifetimeFrequency;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeFrequencyLower(@Nullable Float lifetimeFrequencyLower) {
    this.lifetimeFrequencyLower = lifetimeFrequencyLower;
    return this;
  }

  /**
   * Lower estimate of lifetime frequency.
   * @return lifetimeFrequencyLower
   */
  
  @Schema(name = "lifetime_frequency_lower", description = "Lower estimate of lifetime frequency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_frequency_lower")
  public @Nullable Float getLifetimeFrequencyLower() {
    return lifetimeFrequencyLower;
  }

  @JsonProperty("lifetime_frequency_lower")
  public void setLifetimeFrequencyLower(@Nullable Float lifetimeFrequencyLower) {
    this.lifetimeFrequencyLower = lifetimeFrequencyLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeFrequencyUpper(@Nullable Float lifetimeFrequencyUpper) {
    this.lifetimeFrequencyUpper = lifetimeFrequencyUpper;
    return this;
  }

  /**
   * Upper estimate of lifetime frequency.
   * @return lifetimeFrequencyUpper
   */
  
  @Schema(name = "lifetime_frequency_upper", description = "Upper estimate of lifetime frequency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_frequency_upper")
  public @Nullable Float getLifetimeFrequencyUpper() {
    return lifetimeFrequencyUpper;
  }

  @JsonProperty("lifetime_frequency_upper")
  public void setLifetimeFrequencyUpper(@Nullable Float lifetimeFrequencyUpper) {
    this.lifetimeFrequencyUpper = lifetimeFrequencyUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeImpression(@Nullable Float lifetimeImpression) {
    this.lifetimeImpression = lifetimeImpression;
    return this;
  }

  /**
   * Estimated lifetime impressions.
   * @return lifetimeImpression
   */
  
  @Schema(name = "lifetime_impression", description = "Estimated lifetime impressions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_impression")
  public @Nullable Float getLifetimeImpression() {
    return lifetimeImpression;
  }

  @JsonProperty("lifetime_impression")
  public void setLifetimeImpression(@Nullable Float lifetimeImpression) {
    this.lifetimeImpression = lifetimeImpression;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeImpressionLower(@Nullable Float lifetimeImpressionLower) {
    this.lifetimeImpressionLower = lifetimeImpressionLower;
    return this;
  }

  /**
   * Lower estimate of lifetime impressions.
   * @return lifetimeImpressionLower
   */
  
  @Schema(name = "lifetime_impression_lower", description = "Lower estimate of lifetime impressions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_impression_lower")
  public @Nullable Float getLifetimeImpressionLower() {
    return lifetimeImpressionLower;
  }

  @JsonProperty("lifetime_impression_lower")
  public void setLifetimeImpressionLower(@Nullable Float lifetimeImpressionLower) {
    this.lifetimeImpressionLower = lifetimeImpressionLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeImpressionUpper(@Nullable Float lifetimeImpressionUpper) {
    this.lifetimeImpressionUpper = lifetimeImpressionUpper;
    return this;
  }

  /**
   * Upper estimate of lifetime impressions.
   * @return lifetimeImpressionUpper
   */
  
  @Schema(name = "lifetime_impression_upper", description = "Upper estimate of lifetime impressions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_impression_upper")
  public @Nullable Float getLifetimeImpressionUpper() {
    return lifetimeImpressionUpper;
  }

  @JsonProperty("lifetime_impression_upper")
  public void setLifetimeImpressionUpper(@Nullable Float lifetimeImpressionUpper) {
    this.lifetimeImpressionUpper = lifetimeImpressionUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeReach(@Nullable Float lifetimeReach) {
    this.lifetimeReach = lifetimeReach;
    return this;
  }

  /**
   * Estimated lifetime reach.
   * @return lifetimeReach
   */
  
  @Schema(name = "lifetime_reach", description = "Estimated lifetime reach.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_reach")
  public @Nullable Float getLifetimeReach() {
    return lifetimeReach;
  }

  @JsonProperty("lifetime_reach")
  public void setLifetimeReach(@Nullable Float lifetimeReach) {
    this.lifetimeReach = lifetimeReach;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeReachLower(@Nullable Float lifetimeReachLower) {
    this.lifetimeReachLower = lifetimeReachLower;
    return this;
  }

  /**
   * Lower estimate of lifetime reach.
   * @return lifetimeReachLower
   */
  
  @Schema(name = "lifetime_reach_lower", description = "Lower estimate of lifetime reach.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_reach_lower")
  public @Nullable Float getLifetimeReachLower() {
    return lifetimeReachLower;
  }

  @JsonProperty("lifetime_reach_lower")
  public void setLifetimeReachLower(@Nullable Float lifetimeReachLower) {
    this.lifetimeReachLower = lifetimeReachLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics lifetimeReachUpper(@Nullable Float lifetimeReachUpper) {
    this.lifetimeReachUpper = lifetimeReachUpper;
    return this;
  }

  /**
   * Upper estimate of lifetime reach.
   * @return lifetimeReachUpper
   */
  
  @Schema(name = "lifetime_reach_upper", description = "Upper estimate of lifetime reach.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_reach_upper")
  public @Nullable Float getLifetimeReachUpper() {
    return lifetimeReachUpper;
  }

  @JsonProperty("lifetime_reach_upper")
  public void setLifetimeReachUpper(@Nullable Float lifetimeReachUpper) {
    this.lifetimeReachUpper = lifetimeReachUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyClick(@Nullable Float weeklyClick) {
    this.weeklyClick = weeklyClick;
    return this;
  }

  /**
   * Estimated weekly clicks.
   * @return weeklyClick
   */
  
  @Schema(name = "weekly_click", example = "1000", description = "Estimated weekly clicks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_click")
  public @Nullable Float getWeeklyClick() {
    return weeklyClick;
  }

  @JsonProperty("weekly_click")
  public void setWeeklyClick(@Nullable Float weeklyClick) {
    this.weeklyClick = weeklyClick;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyClickLower(@Nullable Float weeklyClickLower) {
    this.weeklyClickLower = weeklyClickLower;
    return this;
  }

  /**
   * Lower estimate of weekly clicks.
   * @return weeklyClickLower
   */
  
  @Schema(name = "weekly_click_lower", example = "800", description = "Lower estimate of weekly clicks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_click_lower")
  public @Nullable Float getWeeklyClickLower() {
    return weeklyClickLower;
  }

  @JsonProperty("weekly_click_lower")
  public void setWeeklyClickLower(@Nullable Float weeklyClickLower) {
    this.weeklyClickLower = weeklyClickLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyClickUpper(@Nullable Float weeklyClickUpper) {
    this.weeklyClickUpper = weeklyClickUpper;
    return this;
  }

  /**
   * Upper estimate of weekly clicks.
   * @return weeklyClickUpper
   */
  
  @Schema(name = "weekly_click_upper", example = "1200", description = "Upper estimate of weekly clicks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_click_upper")
  public @Nullable Float getWeeklyClickUpper() {
    return weeklyClickUpper;
  }

  @JsonProperty("weekly_click_upper")
  public void setWeeklyClickUpper(@Nullable Float weeklyClickUpper) {
    this.weeklyClickUpper = weeklyClickUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyFrequency(@Nullable Float weeklyFrequency) {
    this.weeklyFrequency = weeklyFrequency;
    return this;
  }

  /**
   * Estimated weekly frequency.
   * @return weeklyFrequency
   */
  
  @Schema(name = "weekly_frequency", example = "3", description = "Estimated weekly frequency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_frequency")
  public @Nullable Float getWeeklyFrequency() {
    return weeklyFrequency;
  }

  @JsonProperty("weekly_frequency")
  public void setWeeklyFrequency(@Nullable Float weeklyFrequency) {
    this.weeklyFrequency = weeklyFrequency;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyFrequencyLower(@Nullable Float weeklyFrequencyLower) {
    this.weeklyFrequencyLower = weeklyFrequencyLower;
    return this;
  }

  /**
   * Lower estimate of weekly frequency.
   * @return weeklyFrequencyLower
   */
  
  @Schema(name = "weekly_frequency_lower", example = "2.5", description = "Lower estimate of weekly frequency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_frequency_lower")
  public @Nullable Float getWeeklyFrequencyLower() {
    return weeklyFrequencyLower;
  }

  @JsonProperty("weekly_frequency_lower")
  public void setWeeklyFrequencyLower(@Nullable Float weeklyFrequencyLower) {
    this.weeklyFrequencyLower = weeklyFrequencyLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyFrequencyUpper(@Nullable Float weeklyFrequencyUpper) {
    this.weeklyFrequencyUpper = weeklyFrequencyUpper;
    return this;
  }

  /**
   * Upper estimate of weekly frequency.
   * @return weeklyFrequencyUpper
   */
  
  @Schema(name = "weekly_frequency_upper", example = "3.5", description = "Upper estimate of weekly frequency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_frequency_upper")
  public @Nullable Float getWeeklyFrequencyUpper() {
    return weeklyFrequencyUpper;
  }

  @JsonProperty("weekly_frequency_upper")
  public void setWeeklyFrequencyUpper(@Nullable Float weeklyFrequencyUpper) {
    this.weeklyFrequencyUpper = weeklyFrequencyUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyImpression(@Nullable Float weeklyImpression) {
    this.weeklyImpression = weeklyImpression;
    return this;
  }

  /**
   * Estimated weekly impressions.
   * @return weeklyImpression
   */
  
  @Schema(name = "weekly_impression", example = "400000", description = "Estimated weekly impressions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_impression")
  public @Nullable Float getWeeklyImpression() {
    return weeklyImpression;
  }

  @JsonProperty("weekly_impression")
  public void setWeeklyImpression(@Nullable Float weeklyImpression) {
    this.weeklyImpression = weeklyImpression;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyImpressionLower(@Nullable Float weeklyImpressionLower) {
    this.weeklyImpressionLower = weeklyImpressionLower;
    return this;
  }

  /**
   * Lower estimate of weekly impressions.
   * @return weeklyImpressionLower
   */
  
  @Schema(name = "weekly_impression_lower", example = "350000", description = "Lower estimate of weekly impressions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_impression_lower")
  public @Nullable Float getWeeklyImpressionLower() {
    return weeklyImpressionLower;
  }

  @JsonProperty("weekly_impression_lower")
  public void setWeeklyImpressionLower(@Nullable Float weeklyImpressionLower) {
    this.weeklyImpressionLower = weeklyImpressionLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyImpressionUpper(@Nullable Float weeklyImpressionUpper) {
    this.weeklyImpressionUpper = weeklyImpressionUpper;
    return this;
  }

  /**
   * Upper estimate of weekly impressions.
   * @return weeklyImpressionUpper
   */
  
  @Schema(name = "weekly_impression_upper", example = "450000", description = "Upper estimate of weekly impressions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_impression_upper")
  public @Nullable Float getWeeklyImpressionUpper() {
    return weeklyImpressionUpper;
  }

  @JsonProperty("weekly_impression_upper")
  public void setWeeklyImpressionUpper(@Nullable Float weeklyImpressionUpper) {
    this.weeklyImpressionUpper = weeklyImpressionUpper;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyReach(@Nullable Float weeklyReach) {
    this.weeklyReach = weeklyReach;
    return this;
  }

  /**
   * Estimated weekly reach.
   * @return weeklyReach
   */
  
  @Schema(name = "weekly_reach", example = "102074.85050444445", description = "Estimated weekly reach.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_reach")
  public @Nullable Float getWeeklyReach() {
    return weeklyReach;
  }

  @JsonProperty("weekly_reach")
  public void setWeeklyReach(@Nullable Float weeklyReach) {
    this.weeklyReach = weeklyReach;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyReachLower(@Nullable Float weeklyReachLower) {
    this.weeklyReachLower = weeklyReachLower;
    return this;
  }

  /**
   * Lower estimate of weekly reach.
   * @return weeklyReachLower
   */
  
  @Schema(name = "weekly_reach_lower", example = "90000", description = "Lower estimate of weekly reach.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_reach_lower")
  public @Nullable Float getWeeklyReachLower() {
    return weeklyReachLower;
  }

  @JsonProperty("weekly_reach_lower")
  public void setWeeklyReachLower(@Nullable Float weeklyReachLower) {
    this.weeklyReachLower = weeklyReachLower;
  }

  public CampaignDeliveryEstimatesDerivedMetrics weeklyReachUpper(@Nullable Float weeklyReachUpper) {
    this.weeklyReachUpper = weeklyReachUpper;
    return this;
  }

  /**
   * Upper estimate of weekly reach.
   * @return weeklyReachUpper
   */
  
  @Schema(name = "weekly_reach_upper", example = "150000", description = "Upper estimate of weekly reach.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weekly_reach_upper")
  public @Nullable Float getWeeklyReachUpper() {
    return weeklyReachUpper;
  }

  @JsonProperty("weekly_reach_upper")
  public void setWeeklyReachUpper(@Nullable Float weeklyReachUpper) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

