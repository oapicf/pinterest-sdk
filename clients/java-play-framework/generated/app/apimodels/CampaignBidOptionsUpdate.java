package apimodels;

import apimodels.AgeBucketMultipliers;
import apimodels.AppTypeMultipliers;
import apimodels.CampaignAudienceMultipliers;
import apimodels.CampaignBidOptionsUpdateMaskItems;
import apimodels.FreqBidMultiplierTimeWindow;
import apimodels.FrequencyMultipliers;
import apimodels.GenderMultipliers;
import apimodels.PlacementMultipliers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object describing an update to the campaign level bid multipliers.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignBidOptionsUpdate   {
  @JsonProperty("age_bucket_multipliers")
  @Valid

  private AgeBucketMultipliers ageBucketMultipliers;

  @JsonProperty("app_type_multipliers")
  @Valid

  private AppTypeMultipliers appTypeMultipliers;

  @JsonProperty("audience_multipliers")
  @Valid

  private CampaignAudienceMultipliers audienceMultipliers;

  @JsonProperty("freq_bid_multiplier_time_window")
  @Valid

  private FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow;

  @JsonProperty("frequency_multipliers")
  @Valid

  private FrequencyMultipliers frequencyMultipliers;

  @JsonProperty("gender_multipliers")
  @Valid

  private GenderMultipliers genderMultipliers;

  @JsonProperty("placement_multipliers")
  @Valid

  private PlacementMultipliers placementMultipliers;

  @JsonProperty("update_mask")
  @NotNull
@Valid

  private List<CampaignBidOptionsUpdateMaskItems> updateMask = new ArrayList<>();

  public CampaignBidOptionsUpdate ageBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

   /**
   * Age bucket multipliers for bid adjustments.
   * @return ageBucketMultipliers
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

