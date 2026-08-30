package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AgeBucketMultipliers;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.CampaignAudienceMultipliers;
import org.openapitools.model.FreqBidMultiplierTimeWindow;
import org.openapitools.model.FrequencyMultipliers;
import org.openapitools.model.GenderMultipliers;
import org.openapitools.model.PlacementMultipliers;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing the campaign level bid multipliers for create operations.
 */
@ApiModel(description="Object describing the campaign level bid multipliers for create operations.")

public class CampaignBidOptionsCreate  {
  
 /**
  * Age bucket multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "Age bucket multipliers for bid adjustments.")
  @Valid
  private AgeBucketMultipliers ageBucketMultipliers;

 /**
  * App type multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "App type multipliers for bid adjustments.")
  @Valid
  private AppTypeMultipliers appTypeMultipliers;

 /**
  * Audience multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "Audience multipliers for bid adjustments.")
  @Valid
  private CampaignAudienceMultipliers audienceMultipliers;

 /**
  * The time window for frequency bid multipliers.
  */
  @ApiModelProperty(value = "The time window for frequency bid multipliers.")
  @Valid
  private FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow;

 /**
  * Frequency multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "Frequency multipliers for bid adjustments.")
  @Valid
  private FrequencyMultipliers frequencyMultipliers;

 /**
  * Gender multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "Gender multipliers for bid adjustments.")
  @Valid
  private GenderMultipliers genderMultipliers;

 /**
  * Placement multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "Placement multipliers for bid adjustments.")
  @Valid
  private PlacementMultipliers placementMultipliers;
 /**
  * Age bucket multipliers for bid adjustments.
  * @return ageBucketMultipliers
  */
  @JsonProperty("age_bucket_multipliers")
  public AgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  /**
   * Sets the <code>ageBucketMultipliers</code> property.
   */
 public void setAgeBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  /**
   * Sets the <code>ageBucketMultipliers</code> property.
   */
  public CampaignBidOptionsCreate ageBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

 /**
  * App type multipliers for bid adjustments.
  * @return appTypeMultipliers
  */
  @JsonProperty("app_type_multipliers")
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  /**
   * Sets the <code>appTypeMultipliers</code> property.
   */
 public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  /**
   * Sets the <code>appTypeMultipliers</code> property.
   */
  public CampaignBidOptionsCreate appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

 /**
  * Audience multipliers for bid adjustments.
  * @return audienceMultipliers
  */
  @JsonProperty("audience_multipliers")
  public CampaignAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  /**
   * Sets the <code>audienceMultipliers</code> property.
   */
 public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  /**
   * Sets the <code>audienceMultipliers</code> property.
   */
  public CampaignBidOptionsCreate audienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

 /**
  * The time window for frequency bid multipliers.
  * @return freqBidMultiplierTimeWindow
  */
  @JsonProperty("freq_bid_multiplier_time_window")
  public FreqBidMultiplierTimeWindow getFreqBidMultiplierTimeWindow() {
    return freqBidMultiplierTimeWindow;
  }

  /**
   * Sets the <code>freqBidMultiplierTimeWindow</code> property.
   */
 public void setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
  }

  /**
   * Sets the <code>freqBidMultiplierTimeWindow</code> property.
   */
  public CampaignBidOptionsCreate freqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
    return this;
  }

 /**
  * Frequency multipliers for bid adjustments.
  * @return frequencyMultipliers
  */
  @JsonProperty("frequency_multipliers")
  public FrequencyMultipliers getFrequencyMultipliers() {
    return frequencyMultipliers;
  }

  /**
   * Sets the <code>frequencyMultipliers</code> property.
   */
 public void setFrequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
  }

  /**
   * Sets the <code>frequencyMultipliers</code> property.
   */
  public CampaignBidOptionsCreate frequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
    return this;
  }

 /**
  * Gender multipliers for bid adjustments.
  * @return genderMultipliers
  */
  @JsonProperty("gender_multipliers")
  public GenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  /**
   * Sets the <code>genderMultipliers</code> property.
   */
 public void setGenderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  /**
   * Sets the <code>genderMultipliers</code> property.
   */
  public CampaignBidOptionsCreate genderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

 /**
  * Placement multipliers for bid adjustments.
  * @return placementMultipliers
  */
  @JsonProperty("placement_multipliers")
  public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  /**
   * Sets the <code>placementMultipliers</code> property.
   */
 public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

  /**
   * Sets the <code>placementMultipliers</code> property.
   */
  public CampaignBidOptionsCreate placementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
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
    CampaignBidOptionsCreate campaignBidOptionsCreate = (CampaignBidOptionsCreate) o;
    return Objects.equals(this.ageBucketMultipliers, campaignBidOptionsCreate.ageBucketMultipliers) &&
        Objects.equals(this.appTypeMultipliers, campaignBidOptionsCreate.appTypeMultipliers) &&
        Objects.equals(this.audienceMultipliers, campaignBidOptionsCreate.audienceMultipliers) &&
        Objects.equals(this.freqBidMultiplierTimeWindow, campaignBidOptionsCreate.freqBidMultiplierTimeWindow) &&
        Objects.equals(this.frequencyMultipliers, campaignBidOptionsCreate.frequencyMultipliers) &&
        Objects.equals(this.genderMultipliers, campaignBidOptionsCreate.genderMultipliers) &&
        Objects.equals(this.placementMultipliers, campaignBidOptionsCreate.placementMultipliers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageBucketMultipliers, appTypeMultipliers, audienceMultipliers, freqBidMultiplierTimeWindow, frequencyMultipliers, genderMultipliers, placementMultipliers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBidOptionsCreate {\n");
    
    sb.append("    ageBucketMultipliers: ").append(toIndentedString(ageBucketMultipliers)).append("\n");
    sb.append("    appTypeMultipliers: ").append(toIndentedString(appTypeMultipliers)).append("\n");
    sb.append("    audienceMultipliers: ").append(toIndentedString(audienceMultipliers)).append("\n");
    sb.append("    freqBidMultiplierTimeWindow: ").append(toIndentedString(freqBidMultiplierTimeWindow)).append("\n");
    sb.append("    frequencyMultipliers: ").append(toIndentedString(frequencyMultipliers)).append("\n");
    sb.append("    genderMultipliers: ").append(toIndentedString(genderMultipliers)).append("\n");
    sb.append("    placementMultipliers: ").append(toIndentedString(placementMultipliers)).append("\n");
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

