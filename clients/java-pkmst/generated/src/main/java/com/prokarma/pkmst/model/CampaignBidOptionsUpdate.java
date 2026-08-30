package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AgeBucketMultipliers;
import com.prokarma.pkmst.model.AppTypeMultipliers;
import com.prokarma.pkmst.model.CampaignAudienceMultipliers;
import com.prokarma.pkmst.model.CampaignBidOptionsUpdateMaskItems;
import com.prokarma.pkmst.model.FreqBidMultiplierTimeWindow;
import com.prokarma.pkmst.model.FrequencyMultipliers;
import com.prokarma.pkmst.model.GenderMultipliers;
import com.prokarma.pkmst.model.PlacementMultipliers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Object describing an update to the campaign level bid multipliers.
 */
@ApiModel(description = "Object describing an update to the campaign level bid multipliers.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  public CampaignBidOptionsUpdate ageBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

  /**
   * Age bucket multipliers for bid adjustments.
   * @return ageBucketMultipliers
   */
  @ApiModelProperty(value = "Age bucket multipliers for bid adjustments.")
  public AgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  public void setAgeBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  public CampaignBidOptionsUpdate appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

  /**
   * App type multipliers for bid adjustments.
   * @return appTypeMultipliers
   */
  @ApiModelProperty(value = "App type multipliers for bid adjustments.")
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  public CampaignBidOptionsUpdate audienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  /**
   * Audience multipliers for bid adjustments.
   * @return audienceMultipliers
   */
  @ApiModelProperty(value = "Audience multipliers for bid adjustments.")
  public CampaignAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  public CampaignBidOptionsUpdate freqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
    return this;
  }

  /**
   * The time window for frequency bid multipliers.
   * @return freqBidMultiplierTimeWindow
   */
  @ApiModelProperty(value = "The time window for frequency bid multipliers.")
  public FreqBidMultiplierTimeWindow getFreqBidMultiplierTimeWindow() {
    return freqBidMultiplierTimeWindow;
  }

  public void setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
  }

  public CampaignBidOptionsUpdate frequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
    return this;
  }

  /**
   * Frequency multipliers for bid adjustments.
   * @return frequencyMultipliers
   */
  @ApiModelProperty(value = "Frequency multipliers for bid adjustments.")
  public FrequencyMultipliers getFrequencyMultipliers() {
    return frequencyMultipliers;
  }

  public void setFrequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
  }

  public CampaignBidOptionsUpdate genderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

  /**
   * Gender multipliers for bid adjustments.
   * @return genderMultipliers
   */
  @ApiModelProperty(value = "Gender multipliers for bid adjustments.")
  public GenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  public void setGenderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  public CampaignBidOptionsUpdate placementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

  /**
   * Placement multipliers for bid adjustments.
   * @return placementMultipliers
   */
  @ApiModelProperty(value = "Placement multipliers for bid adjustments.")
  public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

  public CampaignBidOptionsUpdate updateMask(List<CampaignBidOptionsUpdateMaskItems> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public CampaignBidOptionsUpdate addUpdateMaskItem(CampaignBidOptionsUpdateMaskItems updateMaskItem) {
    if (this.updateMask == null) {
      this.updateMask = new ArrayList<>();
    }
    this.updateMask.add(updateMaskItem);
    return this;
  }

  /**
   * List of fields to update. Only the fields in the list will be updated.
   * @return updateMask
   */
  @ApiModelProperty(required = true, value = "List of fields to update. Only the fields in the list will be updated.")
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
    return Objects.equals(this.ageBucketMultipliers, campaignBidOptionsUpdate.ageBucketMultipliers) &&
        Objects.equals(this.appTypeMultipliers, campaignBidOptionsUpdate.appTypeMultipliers) &&
        Objects.equals(this.audienceMultipliers, campaignBidOptionsUpdate.audienceMultipliers) &&
        Objects.equals(this.freqBidMultiplierTimeWindow, campaignBidOptionsUpdate.freqBidMultiplierTimeWindow) &&
        Objects.equals(this.frequencyMultipliers, campaignBidOptionsUpdate.frequencyMultipliers) &&
        Objects.equals(this.genderMultipliers, campaignBidOptionsUpdate.genderMultipliers) &&
        Objects.equals(this.placementMultipliers, campaignBidOptionsUpdate.placementMultipliers) &&
        Objects.equals(this.updateMask, campaignBidOptionsUpdate.updateMask);
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

