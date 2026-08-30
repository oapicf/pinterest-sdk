package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AgeBucketMultipliers;
import org.openapitools.vertxweb.server.model.AppTypeMultipliers;
import org.openapitools.vertxweb.server.model.CampaignAudienceMultipliers;
import org.openapitools.vertxweb.server.model.FreqBidMultiplierTimeWindow;
import org.openapitools.vertxweb.server.model.FrequencyMultipliers;
import org.openapitools.vertxweb.server.model.GenderMultipliers;
import org.openapitools.vertxweb.server.model.PlacementMultipliers;

/**
 * Object describing the campaign level bid multipliers for create operations.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignBidOptionsCreate   {
  
  private AgeBucketMultipliers ageBucketMultipliers;
  private AppTypeMultipliers appTypeMultipliers;
  private CampaignAudienceMultipliers audienceMultipliers;
  private FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow;
  private FrequencyMultipliers frequencyMultipliers;
  private GenderMultipliers genderMultipliers;
  private PlacementMultipliers placementMultipliers;

  public CampaignBidOptionsCreate () {

  }

  public CampaignBidOptionsCreate (AgeBucketMultipliers ageBucketMultipliers, AppTypeMultipliers appTypeMultipliers, CampaignAudienceMultipliers audienceMultipliers, FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow, FrequencyMultipliers frequencyMultipliers, GenderMultipliers genderMultipliers, PlacementMultipliers placementMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    this.appTypeMultipliers = appTypeMultipliers;
    this.audienceMultipliers = audienceMultipliers;
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
    this.frequencyMultipliers = frequencyMultipliers;
    this.genderMultipliers = genderMultipliers;
    this.placementMultipliers = placementMultipliers;
  }

    
  @JsonProperty("age_bucket_multipliers")
  public AgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }
  public void setAgeBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

    
  @JsonProperty("app_type_multipliers")
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }
  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

    
  @JsonProperty("audience_multipliers")
  public CampaignAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }
  public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

    
  @JsonProperty("freq_bid_multiplier_time_window")
  public FreqBidMultiplierTimeWindow getFreqBidMultiplierTimeWindow() {
    return freqBidMultiplierTimeWindow;
  }
  public void setFreqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
  }

    
  @JsonProperty("frequency_multipliers")
  public FrequencyMultipliers getFrequencyMultipliers() {
    return frequencyMultipliers;
  }
  public void setFrequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
  }

    
  @JsonProperty("gender_multipliers")
  public GenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }
  public void setGenderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

    
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
    return Objects.equals(ageBucketMultipliers, campaignBidOptionsCreate.ageBucketMultipliers) &&
        Objects.equals(appTypeMultipliers, campaignBidOptionsCreate.appTypeMultipliers) &&
        Objects.equals(audienceMultipliers, campaignBidOptionsCreate.audienceMultipliers) &&
        Objects.equals(freqBidMultiplierTimeWindow, campaignBidOptionsCreate.freqBidMultiplierTimeWindow) &&
        Objects.equals(frequencyMultipliers, campaignBidOptionsCreate.frequencyMultipliers) &&
        Objects.equals(genderMultipliers, campaignBidOptionsCreate.genderMultipliers) &&
        Objects.equals(placementMultipliers, campaignBidOptionsCreate.placementMultipliers);
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
