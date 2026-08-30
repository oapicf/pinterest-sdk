package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AgeBucketMultipliers;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.CampaignAudienceMultipliers;
import org.openapitools.model.CampaignBidOptionsUpdateMaskItems;
import org.openapitools.model.FreqBidMultiplierTimeWindow;
import org.openapitools.model.FrequencyMultipliers;
import org.openapitools.model.GenderMultipliers;
import org.openapitools.model.PlacementMultipliers;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Object describing an update to the campaign level bid multipliers.
 */
public class CampaignBidOptionsUpdate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Age bucket multipliers for bid adjustments.
   */
  @JsonProperty("age_bucket_multipliers")
  private AgeBucketMultipliers ageBucketMultipliers;

  /**
   * App type multipliers for bid adjustments.
   */
  @JsonProperty("app_type_multipliers")
  private AppTypeMultipliers appTypeMultipliers;

  /**
   * Audience multipliers for bid adjustments.
   */
  @JsonProperty("audience_multipliers")
  private CampaignAudienceMultipliers audienceMultipliers;

  /**
   * The time window for frequency bid multipliers.
   */
  @JsonProperty("freq_bid_multiplier_time_window")
  private FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow;

  /**
   * Frequency multipliers for bid adjustments.
   */
  @JsonProperty("frequency_multipliers")
  private FrequencyMultipliers frequencyMultipliers;

  /**
   * Gender multipliers for bid adjustments.
   */
  @JsonProperty("gender_multipliers")
  private GenderMultipliers genderMultipliers;

  /**
   * Placement multipliers for bid adjustments.
   */
  @JsonProperty("placement_multipliers")
  private PlacementMultipliers placementMultipliers;

  /**
   * List of fields to update. Only the fields in the list will be updated.
   */
  @JsonProperty("update_mask")
  private List<CampaignBidOptionsUpdateMaskItems> updateMask = new ArrayList<>();

  /**
   * Age bucket multipliers for bid adjustments.
   * @return ageBucketMultipliers
   */
  public AgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  public void setAgeBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  /**
   * App type multipliers for bid adjustments.
   * @return appTypeMultipliers
   */
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  /**
   * Audience multipliers for bid adjustments.
   * @return audienceMultipliers
   */
  public CampaignAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  /**
   * The time window for frequency bid multipliers.
   * @return freqBidMultiplierTimeWindow
   */
  public FreqBidMultiplierTimeWindow getFreqBidMultiplierTimeWindow() {
    return freqBidMultiplierTimeWindow;
  }

  public void setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
  }

  /**
   * Frequency multipliers for bid adjustments.
   * @return frequencyMultipliers
   */
  public FrequencyMultipliers getFrequencyMultipliers() {
    return frequencyMultipliers;
  }

  public void setFrequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
  }

  /**
   * Gender multipliers for bid adjustments.
   * @return genderMultipliers
   */
  public GenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  public void setGenderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  /**
   * Placement multipliers for bid adjustments.
   * @return placementMultipliers
   */
  public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

  /**
   * List of fields to update. Only the fields in the list will be updated.
   * @return updateMask
   */
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
