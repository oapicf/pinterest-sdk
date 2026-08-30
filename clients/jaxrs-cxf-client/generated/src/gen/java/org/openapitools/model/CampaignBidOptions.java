package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AgeBucketMultipliers;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.CampaignAudienceMultipliers;
import org.openapitools.model.FreqBidMultiplierTimeWindow;
import org.openapitools.model.FrequencyMultipliers;
import org.openapitools.model.GenderMultipliers;
import org.openapitools.model.PlacementMultipliers;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object describing the campaign level bid multipliers.
 */
@ApiModel(description="Object describing the campaign level bid multipliers.")

public class CampaignBidOptions  {
  
 /**
  * Age bucket multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "Age bucket multipliers for bid adjustments.")

  private AgeBucketMultipliers ageBucketMultipliers;

 /**
  * App type multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "App type multipliers for bid adjustments.")

  private AppTypeMultipliers appTypeMultipliers;

 /**
  * Audience multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "Audience multipliers for bid adjustments.")

  private CampaignAudienceMultipliers audienceMultipliers;

 /**
  * The time window for frequency bid multipliers.
  */
  @ApiModelProperty(value = "The time window for frequency bid multipliers.")

  private FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow;

 /**
  * Frequency multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "Frequency multipliers for bid adjustments.")

  private FrequencyMultipliers frequencyMultipliers;

 /**
  * Gender multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "Gender multipliers for bid adjustments.")

  private GenderMultipliers genderMultipliers;

 /**
  * Placement multipliers for bid adjustments.
  */
  @ApiModelProperty(value = "Placement multipliers for bid adjustments.")

  private PlacementMultipliers placementMultipliers;
 /**
   * Age bucket multipliers for bid adjustments.
   * @return ageBucketMultipliers
  **/
  @JsonProperty("age_bucket_multipliers")
  public AgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  public void setAgeBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  public CampaignBidOptions ageBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

 /**
   * App type multipliers for bid adjustments.
   * @return appTypeMultipliers
  **/
  @JsonProperty("app_type_multipliers")
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  public CampaignBidOptions appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

 /**
   * Audience multipliers for bid adjustments.
   * @return audienceMultipliers
  **/
  @JsonProperty("audience_multipliers")
  public CampaignAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  public CampaignBidOptions audienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

 /**
   * The time window for frequency bid multipliers.
   * @return freqBidMultiplierTimeWindow
  **/
  @JsonProperty("freq_bid_multiplier_time_window")
  public FreqBidMultiplierTimeWindow getFreqBidMultiplierTimeWindow() {
    return freqBidMultiplierTimeWindow;
  }

  public void setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
  }

  public CampaignBidOptions freqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
    return this;
  }

 /**
   * Frequency multipliers for bid adjustments.
   * @return frequencyMultipliers
  **/
  @JsonProperty("frequency_multipliers")
  public FrequencyMultipliers getFrequencyMultipliers() {
    return frequencyMultipliers;
  }

  public void setFrequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
  }

  public CampaignBidOptions frequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
    return this;
  }

 /**
   * Gender multipliers for bid adjustments.
   * @return genderMultipliers
  **/
  @JsonProperty("gender_multipliers")
  public GenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  public void setGenderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  public CampaignBidOptions genderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

 /**
   * Placement multipliers for bid adjustments.
   * @return placementMultipliers
  **/
  @JsonProperty("placement_multipliers")
  public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

  public CampaignBidOptions placementMultipliers(PlacementMultipliers placementMultipliers) {
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
    CampaignBidOptions campaignBidOptions = (CampaignBidOptions) o;
    return Objects.equals(this.ageBucketMultipliers, campaignBidOptions.ageBucketMultipliers) &&
        Objects.equals(this.appTypeMultipliers, campaignBidOptions.appTypeMultipliers) &&
        Objects.equals(this.audienceMultipliers, campaignBidOptions.audienceMultipliers) &&
        Objects.equals(this.freqBidMultiplierTimeWindow, campaignBidOptions.freqBidMultiplierTimeWindow) &&
        Objects.equals(this.frequencyMultipliers, campaignBidOptions.frequencyMultipliers) &&
        Objects.equals(this.genderMultipliers, campaignBidOptions.genderMultipliers) &&
        Objects.equals(this.placementMultipliers, campaignBidOptions.placementMultipliers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageBucketMultipliers, appTypeMultipliers, audienceMultipliers, freqBidMultiplierTimeWindow, frequencyMultipliers, genderMultipliers, placementMultipliers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBidOptions {\n");
    
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

