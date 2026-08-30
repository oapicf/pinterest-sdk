package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AgeBucketMultipliers;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.CampaignAudienceMultipliers;
import org.openapitools.model.FreqBidMultiplierTimeWindow;
import org.openapitools.model.FrequencyMultipliers;
import org.openapitools.model.GenderMultipliers;
import org.openapitools.model.PlacementMultipliers;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Object describing the campaign level bid multipliers for create operations.
 */

@Schema(name = "CampaignBidOptionsCreate", description = "Object describing the campaign level bid multipliers for create operations.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignBidOptionsCreate {

  private JsonNullable<AgeBucketMultipliers> ageBucketMultipliers = JsonNullable.<AgeBucketMultipliers>undefined();

  private JsonNullable<AppTypeMultipliers> appTypeMultipliers = JsonNullable.<AppTypeMultipliers>undefined();

  private CampaignAudienceMultipliers audienceMultipliers;

  private JsonNullable<FreqBidMultiplierTimeWindow> freqBidMultiplierTimeWindow = JsonNullable.<FreqBidMultiplierTimeWindow>undefined();

  private JsonNullable<FrequencyMultipliers> frequencyMultipliers = JsonNullable.<FrequencyMultipliers>undefined();

  private JsonNullable<GenderMultipliers> genderMultipliers = JsonNullable.<GenderMultipliers>undefined();

  private JsonNullable<PlacementMultipliers> placementMultipliers = JsonNullable.<PlacementMultipliers>undefined();

  public CampaignBidOptionsCreate ageBucketMultipliers(AgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = JsonNullable.of(ageBucketMultipliers);
    return this;
  }

  /**
   * Age bucket multipliers for bid adjustments.
   * @return ageBucketMultipliers
   */
  @Valid 
  @Schema(name = "age_bucket_multipliers", description = "Age bucket multipliers for bid adjustments.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age_bucket_multipliers")
  public JsonNullable<AgeBucketMultipliers> getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  public void setAgeBucketMultipliers(JsonNullable<AgeBucketMultipliers> ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  public CampaignBidOptionsCreate appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = JsonNullable.of(appTypeMultipliers);
    return this;
  }

  /**
   * App type multipliers for bid adjustments.
   * @return appTypeMultipliers
   */
  @Valid 
  @Schema(name = "app_type_multipliers", description = "App type multipliers for bid adjustments.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_type_multipliers")
  public JsonNullable<AppTypeMultipliers> getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(JsonNullable<AppTypeMultipliers> appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  public CampaignBidOptionsCreate audienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  /**
   * Audience multipliers for bid adjustments.
   * @return audienceMultipliers
   */
  @Valid 
  @Schema(name = "audience_multipliers", description = "Audience multipliers for bid adjustments.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audience_multipliers")
  public CampaignAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  public CampaignBidOptionsCreate freqBidMultiplierTimeWindow(FreqBidMultiplierTimeWindow freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = JsonNullable.of(freqBidMultiplierTimeWindow);
    return this;
  }

  /**
   * The time window for frequency bid multipliers.
   * @return freqBidMultiplierTimeWindow
   */
  @Valid 
  @Schema(name = "freq_bid_multiplier_time_window", description = "The time window for frequency bid multipliers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("freq_bid_multiplier_time_window")
  public JsonNullable<FreqBidMultiplierTimeWindow> getFreqBidMultiplierTimeWindow() {
    return freqBidMultiplierTimeWindow;
  }

  public void setFreqBidMultiplierTimeWindow(JsonNullable<FreqBidMultiplierTimeWindow> freqBidMultiplierTimeWindow) {
    this.freqBidMultiplierTimeWindow = freqBidMultiplierTimeWindow;
  }

  public CampaignBidOptionsCreate frequencyMultipliers(FrequencyMultipliers frequencyMultipliers) {
    this.frequencyMultipliers = JsonNullable.of(frequencyMultipliers);
    return this;
  }

  /**
   * Frequency multipliers for bid adjustments.
   * @return frequencyMultipliers
   */
  @Valid 
  @Schema(name = "frequency_multipliers", description = "Frequency multipliers for bid adjustments.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frequency_multipliers")
  public JsonNullable<FrequencyMultipliers> getFrequencyMultipliers() {
    return frequencyMultipliers;
  }

  public void setFrequencyMultipliers(JsonNullable<FrequencyMultipliers> frequencyMultipliers) {
    this.frequencyMultipliers = frequencyMultipliers;
  }

  public CampaignBidOptionsCreate genderMultipliers(GenderMultipliers genderMultipliers) {
    this.genderMultipliers = JsonNullable.of(genderMultipliers);
    return this;
  }

  /**
   * Gender multipliers for bid adjustments.
   * @return genderMultipliers
   */
  @Valid 
  @Schema(name = "gender_multipliers", description = "Gender multipliers for bid adjustments.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender_multipliers")
  public JsonNullable<GenderMultipliers> getGenderMultipliers() {
    return genderMultipliers;
  }

  public void setGenderMultipliers(JsonNullable<GenderMultipliers> genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  public CampaignBidOptionsCreate placementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = JsonNullable.of(placementMultipliers);
    return this;
  }

  /**
   * Placement multipliers for bid adjustments.
   * @return placementMultipliers
   */
  @Valid 
  @Schema(name = "placement_multipliers", description = "Placement multipliers for bid adjustments.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_multipliers")
  public JsonNullable<PlacementMultipliers> getPlacementMultipliers() {
    return placementMultipliers;
  }

  public void setPlacementMultipliers(JsonNullable<PlacementMultipliers> placementMultipliers) {
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
    return equalsNullable(this.ageBucketMultipliers, campaignBidOptionsCreate.ageBucketMultipliers) &&
        equalsNullable(this.appTypeMultipliers, campaignBidOptionsCreate.appTypeMultipliers) &&
        Objects.equals(this.audienceMultipliers, campaignBidOptionsCreate.audienceMultipliers) &&
        equalsNullable(this.freqBidMultiplierTimeWindow, campaignBidOptionsCreate.freqBidMultiplierTimeWindow) &&
        equalsNullable(this.frequencyMultipliers, campaignBidOptionsCreate.frequencyMultipliers) &&
        equalsNullable(this.genderMultipliers, campaignBidOptionsCreate.genderMultipliers) &&
        equalsNullable(this.placementMultipliers, campaignBidOptionsCreate.placementMultipliers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(ageBucketMultipliers), hashCodeNullable(appTypeMultipliers), audienceMultipliers, hashCodeNullable(freqBidMultiplierTimeWindow), hashCodeNullable(frequencyMultipliers), hashCodeNullable(genderMultipliers), hashCodeNullable(placementMultipliers));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

