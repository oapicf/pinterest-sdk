package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AgeBucketMultipliers;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.CampaignAudienceMultipliers;
import org.openapitools.model.CampaignBidOptionsUpdateMaskItems;
import org.openapitools.model.FreqBidMultiplierTimeWindow;
import org.openapitools.model.FrequencyMultipliers;
import org.openapitools.model.GenderMultipliers;
import org.openapitools.model.PlacementMultipliers;



/**
 * Object describing an update to the campaign level bid multipliers.
 **/

@ApiModel(description = "Object describing an update to the campaign level bid multipliers.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignBidOptionsUpdate   {
  @JsonProperty("age_bucket_multipliers")
  private AgeBucketMultipliers ageBucketMultipliers;

  @JsonProperty("app_type_multipliers")
  private AppTypeMultipliers appTypeMultipliers;

  @JsonProperty("audience_multipliers")
  private CampaignAudienceMultipliers audienceMultipliers;

  @JsonProperty("freq_bid_multiplier_time_window")
  private FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow;

  @JsonProperty("frequency_multipliers")
  private FrequencyMultipliers frequencyMultipliers;

  @JsonProperty("gender_multipliers")
  private GenderMultipliers genderMultipliers;

  @JsonProperty("placement_multipliers")
  private PlacementMultipliers placementMultipliers;

  @JsonProperty("update_mask")
  private List<CampaignBidOptionsUpdateMaskItems> updateMask = new ArrayList<>();

  /**
   * Age bucket multipliers for bid adjustments.
   **/
  public CampaignBidOptionsUpdate ageBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

  
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
  public CampaignBidOptionsUpdate appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

  
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
  public CampaignBidOptionsUpdate audienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  
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
  public CampaignBidOptionsUpdate freqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
    return this;
  }

  
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
  public CampaignBidOptionsUpdate frequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
    return this;
  }

  
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
  public CampaignBidOptionsUpdate genderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

  
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
  public CampaignBidOptionsUpdate placementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "Placement multipliers for bid adjustments.")
  @JsonProperty("placement_multipliers")
  public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }
  public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

  /**
   * List of fields to update. Only the fields in the list will be updated.
   **/
  public CampaignBidOptionsUpdate updateMask(List<CampaignBidOptionsUpdateMaskItems> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of fields to update. Only the fields in the list will be updated.")
  @JsonProperty("update_mask")
  public List<CampaignBidOptionsUpdateMaskItems> getUpdateMask() {
    return updateMask;
  }
  public void setUpdateMask(List<CampaignBidOptionsUpdateMaskItems> updateMask) {
    this.updateMask = updateMask;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignBidOptionsUpdate campaignBidOptionsUpdate = (CampaignBidOptionsUpdate) o;
    return Objects.equals(ageBucketMultipliers, campaignBidOptionsUpdate.ageBucketMultipliers) &&
        Objects.equals(appTypeMultipliers, campaignBidOptionsUpdate.appTypeMultipliers) &&
        Objects.equals(audienceMultipliers, campaignBidOptionsUpdate.audienceMultipliers) &&
        Objects.equals(freqBidMultiplierTimeWindow, campaignBidOptionsUpdate.freqBidMultiplierTimeWindow) &&
        Objects.equals(frequencyMultipliers, campaignBidOptionsUpdate.frequencyMultipliers) &&
        Objects.equals(genderMultipliers, campaignBidOptionsUpdate.genderMultipliers) &&
        Objects.equals(placementMultipliers, campaignBidOptionsUpdate.placementMultipliers) &&
        Objects.equals(updateMask, campaignBidOptionsUpdate.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageBucketMultipliers, appTypeMultipliers, audienceMultipliers, freqBidMultiplierTimeWindow, frequencyMultipliers, genderMultipliers, placementMultipliers, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBidOptionsUpdate {\n");
    
    sb.append("    ageBucketMultipliers: ").append(toIndentedString(ageBucketMultipliers)).append("\n");
    sb.append("    appTypeMultipliers: ").append(toIndentedString(appTypeMultipliers)).append("\n");
    sb.append("    audienceMultipliers: ").append(toIndentedString(audienceMultipliers)).append("\n");
    sb.append("    freqBidMultiplierTimeWindow: ").append(toIndentedString(freqBidMultiplierTimeWindow)).append("\n");
    sb.append("    frequencyMultipliers: ").append(toIndentedString(frequencyMultipliers)).append("\n");
    sb.append("    genderMultipliers: ").append(toIndentedString(genderMultipliers)).append("\n");
    sb.append("    placementMultipliers: ").append(toIndentedString(placementMultipliers)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
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

