package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ScheduleAgeBucketMultipliers;
import org.openapitools.vertxweb.server.model.ScheduleAppTypeMultipliers;
import org.openapitools.vertxweb.server.model.ScheduleAudienceMultipliers;
import org.openapitools.vertxweb.server.model.ScheduleBidOptionsGenderMultipliers;
import org.openapitools.vertxweb.server.model.ScheduleBidOptionsPlacementMultipliers;

/**
 * Object describing the schedule level bid level changes.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleBidOptions   {
  
  private ScheduleAgeBucketMultipliers ageBucketMultipliers;
  private ScheduleAppTypeMultipliers appTypeMultipliers;
  private ScheduleAudienceMultipliers audienceMultipliers;
  private ScheduleBidOptionsGenderMultipliers genderMultipliers;
  private ScheduleBidOptionsPlacementMultipliers placementMultipliers;

  public ScheduleBidOptions () {

  }

  public ScheduleBidOptions (ScheduleAgeBucketMultipliers ageBucketMultipliers, ScheduleAppTypeMultipliers appTypeMultipliers, ScheduleAudienceMultipliers audienceMultipliers, ScheduleBidOptionsGenderMultipliers genderMultipliers, ScheduleBidOptionsPlacementMultipliers placementMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    this.appTypeMultipliers = appTypeMultipliers;
    this.audienceMultipliers = audienceMultipliers;
    this.genderMultipliers = genderMultipliers;
    this.placementMultipliers = placementMultipliers;
  }

    
  @JsonProperty("age_bucket_multipliers")
  public ScheduleAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }
  public void setAgeBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

    
  @JsonProperty("app_type_multipliers")
  public ScheduleAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }
  public void setAppTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

    
  @JsonProperty("audience_multipliers")
  public ScheduleAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }
  public void setAudienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

    
  @JsonProperty("gender_multipliers")
  public ScheduleBidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }
  public void setGenderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

    
  @JsonProperty("placement_multipliers")
  public ScheduleBidOptionsPlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }
  public void setPlacementMultipliers(ScheduleBidOptionsPlacementMultipliers placementMultipliers) {
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
    ScheduleBidOptions scheduleBidOptions = (ScheduleBidOptions) o;
    return Objects.equals(ageBucketMultipliers, scheduleBidOptions.ageBucketMultipliers) &&
        Objects.equals(appTypeMultipliers, scheduleBidOptions.appTypeMultipliers) &&
        Objects.equals(audienceMultipliers, scheduleBidOptions.audienceMultipliers) &&
        Objects.equals(genderMultipliers, scheduleBidOptions.genderMultipliers) &&
        Objects.equals(placementMultipliers, scheduleBidOptions.placementMultipliers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageBucketMultipliers, appTypeMultipliers, audienceMultipliers, genderMultipliers, placementMultipliers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidOptions {\n");
    
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
