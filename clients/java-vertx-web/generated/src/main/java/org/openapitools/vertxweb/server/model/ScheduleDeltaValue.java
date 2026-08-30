package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BidOptionsAgeBucketMultipliers;
import org.openapitools.vertxweb.server.model.BidOptionsAppTypeMultipliers;
import org.openapitools.vertxweb.server.model.BidOptionsAudienceMultipliers;
import org.openapitools.vertxweb.server.model.BidOptionsGenderMultipliers;
import org.openapitools.vertxweb.server.model.BidOptionsPlacementMultipliers;
import org.openapitools.vertxweb.server.model.ScheduleBidMultipliers;

/**
 * The value of the scheduled adjustment.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleDeltaValue   {
  
  private BidOptionsAgeBucketMultipliers ageBucketMultipliers;
  private BidOptionsAppTypeMultipliers appTypeMultipliers;
  private List<BidOptionsAudienceMultipliers> audienceMultipliers = new ArrayList<>();
  private BidOptionsGenderMultipliers genderMultipliers;
  private BidOptionsPlacementMultipliers placementMultipliers;

  public ScheduleDeltaValue () {

  }

  public ScheduleDeltaValue (BidOptionsAgeBucketMultipliers ageBucketMultipliers, BidOptionsAppTypeMultipliers appTypeMultipliers, List<BidOptionsAudienceMultipliers> audienceMultipliers, BidOptionsGenderMultipliers genderMultipliers, BidOptionsPlacementMultipliers placementMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    this.appTypeMultipliers = appTypeMultipliers;
    this.audienceMultipliers = audienceMultipliers;
    this.genderMultipliers = genderMultipliers;
    this.placementMultipliers = placementMultipliers;
  }

    
  @JsonProperty("age_bucket_multipliers")
  public BidOptionsAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }
  public void setAgeBucketMultipliers(BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

    
  @JsonProperty("app_type_multipliers")
  public BidOptionsAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }
  public void setAppTypeMultipliers(BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

    
  @JsonProperty("audience_multipliers")
  public List<BidOptionsAudienceMultipliers> getAudienceMultipliers() {
    return audienceMultipliers;
  }
  public void setAudienceMultipliers(List<BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

    
  @JsonProperty("gender_multipliers")
  public BidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }
  public void setGenderMultipliers(BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

    
  @JsonProperty("placement_multipliers")
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
    ScheduleDeltaValue scheduleDeltaValue = (ScheduleDeltaValue) o;
    return Objects.equals(ageBucketMultipliers, scheduleDeltaValue.ageBucketMultipliers) &&
        Objects.equals(appTypeMultipliers, scheduleDeltaValue.appTypeMultipliers) &&
        Objects.equals(audienceMultipliers, scheduleDeltaValue.audienceMultipliers) &&
        Objects.equals(genderMultipliers, scheduleDeltaValue.genderMultipliers) &&
        Objects.equals(placementMultipliers, scheduleDeltaValue.placementMultipliers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageBucketMultipliers, appTypeMultipliers, audienceMultipliers, genderMultipliers, placementMultipliers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleDeltaValue {\n");
    
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
