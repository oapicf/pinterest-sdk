package apimodels;

import apimodels.BidOptionsAgeBucketMultipliers;
import apimodels.BidOptionsAppTypeMultipliers;
import apimodels.BidOptionsAudienceMultipliers;
import apimodels.BidOptionsGenderMultipliers;
import apimodels.BidOptionsPlacementMultipliers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ScheduleBidMultipliers   {
  @JsonProperty("age_bucket_multipliers")
  @Valid

  private BidOptionsAgeBucketMultipliers ageBucketMultipliers;

  @JsonProperty("app_type_multipliers")
  @Valid

  private BidOptionsAppTypeMultipliers appTypeMultipliers;

  @JsonProperty("audience_multipliers")
  @Valid

  private List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers = null;

  @JsonProperty("gender_multipliers")
  @Valid

  private BidOptionsGenderMultipliers genderMultipliers;

  @JsonProperty("placement_multipliers")
  @Valid

  private BidOptionsPlacementMultipliers placementMultipliers;

  public ScheduleBidMultipliers ageBucketMultipliers(BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

   /**
   * Get ageBucketMultipliers
   * @return ageBucketMultipliers
  **/
  public BidOptionsAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  public void setAgeBucketMultipliers(BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  public ScheduleBidMultipliers appTypeMultipliers(BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

   /**
   * Get appTypeMultipliers
   * @return appTypeMultipliers
  **/
  public BidOptionsAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  public ScheduleBidMultipliers audienceMultipliers(List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  public ScheduleBidMultipliers addAudienceMultipliersItem(BidOptionsAudienceMultipliers audienceMultipliersItem) {
    if (this.audienceMultipliers == null) {
      this.audienceMultipliers = new ArrayList<>();
    }
    this.audienceMultipliers.add(audienceMultipliersItem);
    return this;
  }

   /**
   * Get audienceMultipliers
   * @return audienceMultipliers
  **/
  public List<@Valid BidOptionsAudienceMultipliers> getAudienceMultipliers() {
    return audienceMultipliers;
  }

  public void setAudienceMultipliers(List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  public ScheduleBidMultipliers genderMultipliers(BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

   /**
   * Get genderMultipliers
   * @return genderMultipliers
  **/
  public BidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  public void setGenderMultipliers(BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  public ScheduleBidMultipliers placementMultipliers(BidOptionsPlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

   /**
   * Get placementMultipliers
   * @return placementMultipliers
  **/
  public BidOptionsPlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  public void setPlacementMultipliers(BidOptionsPlacementMultipliers placementMultipliers) {
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
    ScheduleBidMultipliers scheduleBidMultipliers = (ScheduleBidMultipliers) o;
    return Objects.equals(ageBucketMultipliers, scheduleBidMultipliers.ageBucketMultipliers) &&
        Objects.equals(appTypeMultipliers, scheduleBidMultipliers.appTypeMultipliers) &&
        Objects.equals(audienceMultipliers, scheduleBidMultipliers.audienceMultipliers) &&
        Objects.equals(genderMultipliers, scheduleBidMultipliers.genderMultipliers) &&
        Objects.equals(placementMultipliers, scheduleBidMultipliers.placementMultipliers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageBucketMultipliers, appTypeMultipliers, audienceMultipliers, genderMultipliers, placementMultipliers);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidMultipliers {\n");
    
    sb.append("    ageBucketMultipliers: ").append(toIndentedString(ageBucketMultipliers)).append("\n");
    sb.append("    appTypeMultipliers: ").append(toIndentedString(appTypeMultipliers)).append("\n");
    sb.append("    audienceMultipliers: ").append(toIndentedString(audienceMultipliers)).append("\n");
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

