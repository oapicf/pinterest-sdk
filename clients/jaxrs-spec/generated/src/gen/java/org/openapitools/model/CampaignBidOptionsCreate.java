package org.openapitools.model;

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
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Object describing the campaign level bid multipliers for create operations.
 **/
@ApiModel(description = "Object describing the campaign level bid multipliers for create operations.")
@JsonTypeName("CampaignBidOptionsCreate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignBidOptionsCreate   {
  private AgeBucketMultipliers ageBucketMultipliers;
  private AppTypeMultipliers appTypeMultipliers;
  private CampaignAudienceMultipliers audienceMultipliers;
  private FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow;
  private FrequencyMultipliers frequencyMultipliers;
  private GenderMultipliers genderMultipliers;
  private PlacementMultipliers placementMultipliers;

  public CampaignBidOptionsCreate() {
  }

  /**
   * Age bucket multipliers for bid adjustments.
   **/
  public CampaignBidOptionsCreate ageBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "Age bucket multipliers for bid adjustments.")
  @JsonProperty("age_bucket_multipliers")
  @Valid public AgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  @JsonProperty("age_bucket_multipliers")
  public void setAgeBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  /**
   * App type multipliers for bid adjustments.
   **/
  public CampaignBidOptionsCreate appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "App type multipliers for bid adjustments.")
  @JsonProperty("app_type_multipliers")
  @Valid public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  @JsonProperty("app_type_multipliers")
  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  /**
   * Audience multipliers for bid adjustments.
   **/
  public CampaignBidOptionsCreate audienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "Audience multipliers for bid adjustments.")
  @JsonProperty("audience_multipliers")
  @Valid public CampaignAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  @JsonProperty("audience_multipliers")
  public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  /**
   * The time window for frequency bid multipliers.
   **/
  public CampaignBidOptionsCreate freqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
    return this;
  }

  
  @ApiModelProperty(value = "The time window for frequency bid multipliers.")
  @JsonProperty("freq_bid_multiplier_time_window")
  public FreqBidMultiplierTimeWindow getFreqBidMultiplierTimeWindow() {
    return freqBidMultiplierTimeWindow;
  }

  @JsonProperty("freq_bid_multiplier_time_window")
  public void setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
  }

  /**
   * Frequency multipliers for bid adjustments.
   **/
  public CampaignBidOptionsCreate frequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "Frequency multipliers for bid adjustments.")
  @JsonProperty("frequency_multipliers")
  @Valid public FrequencyMultipliers getFrequencyMultipliers() {
    return frequencyMultipliers;
  }

  @JsonProperty("frequency_multipliers")
  public void setFrequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
  }

  /**
   * Gender multipliers for bid adjustments.
   **/
  public CampaignBidOptionsCreate genderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "Gender multipliers for bid adjustments.")
  @JsonProperty("gender_multipliers")
  @Valid public GenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  @JsonProperty("gender_multipliers")
  public void setGenderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  /**
   * Placement multipliers for bid adjustments.
   **/
  public CampaignBidOptionsCreate placementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "Placement multipliers for bid adjustments.")
  @JsonProperty("placement_multipliers")
  @Valid public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  @JsonProperty("placement_multipliers")
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
