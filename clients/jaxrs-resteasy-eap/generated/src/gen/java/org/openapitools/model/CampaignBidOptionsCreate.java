package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
import io.swagger.annotations.*;

@ApiModel(description="Object describing the campaign level bid multipliers for create operations.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignBidOptionsCreate   {
  
  private AgeBucketMultipliers ageBucketMultipliers;
  private AppTypeMultipliers appTypeMultipliers;
  private CampaignAudienceMultipliers audienceMultipliers;
  private FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow;
  private FrequencyMultipliers frequencyMultipliers;
  private GenderMultipliers genderMultipliers;
  private PlacementMultipliers placementMultipliers;

  /**
   * Age bucket multipliers for bid adjustments.
   **/
  
  @ApiModelProperty(value = "Age bucket multipliers for bid adjustments.")
  @JsonProperty("age_bucket_multipliers")
  public AgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }
  public void setAgeBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  /**
   * App type multipliers for bid adjustments.
   **/
  
  @ApiModelProperty(value = "App type multipliers for bid adjustments.")
  @JsonProperty("app_type_multipliers")
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }
  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  /**
   * Audience multipliers for bid adjustments.
   **/
  
  @ApiModelProperty(value = "Audience multipliers for bid adjustments.")
  @JsonProperty("audience_multipliers")
  public CampaignAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }
  public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  /**
   * The time window for frequency bid multipliers.
   **/
  
  @ApiModelProperty(value = "The time window for frequency bid multipliers.")
  @JsonProperty("freq_bid_multiplier_time_window")
  public FreqBidMultiplierTimeWindow getFreqBidMultiplierTimeWindow() {
    return freqBidMultiplierTimeWindow;
  }
  public void setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
  }

  /**
   * Frequency multipliers for bid adjustments.
   **/
  
  @ApiModelProperty(value = "Frequency multipliers for bid adjustments.")
  @JsonProperty("frequency_multipliers")
  public FrequencyMultipliers getFrequencyMultipliers() {
    return frequencyMultipliers;
  }
  public void setFrequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
  }

  /**
   * Gender multipliers for bid adjustments.
   **/
  
  @ApiModelProperty(value = "Gender multipliers for bid adjustments.")
  @JsonProperty("gender_multipliers")
  public GenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }
  public void setGenderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  /**
   * Placement multipliers for bid adjustments.
   **/
  
  @ApiModelProperty(value = "Placement multipliers for bid adjustments.")
  @JsonProperty("placement_multipliers")
  public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }
  public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

