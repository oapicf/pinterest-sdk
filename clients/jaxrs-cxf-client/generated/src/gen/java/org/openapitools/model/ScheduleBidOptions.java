package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ScheduleAgeBucketMultipliers;
import org.openapitools.model.ScheduleAppTypeMultipliers;
import org.openapitools.model.ScheduleAudienceMultipliers;
import org.openapitools.model.ScheduleBidOptionsGenderMultipliers;
import org.openapitools.model.ScheduleBidOptionsPlacementMultipliers;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object describing the schedule level bid level changes.
 */
@ApiModel(description="Object describing the schedule level bid level changes.")

public class ScheduleBidOptions  {
  
  @ApiModelProperty(value = "")

  private ScheduleAgeBucketMultipliers ageBucketMultipliers;

  @ApiModelProperty(value = "")

  private ScheduleAppTypeMultipliers appTypeMultipliers;

  @ApiModelProperty(value = "")

  private ScheduleAudienceMultipliers audienceMultipliers;

  @ApiModelProperty(value = "")

  private ScheduleBidOptionsGenderMultipliers genderMultipliers;

  @ApiModelProperty(value = "")

  private ScheduleBidOptionsPlacementMultipliers placementMultipliers;
 /**
   * Get ageBucketMultipliers
   * @return ageBucketMultipliers
  **/
  @JsonProperty("age_bucket_multipliers")
  public ScheduleAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  public void setAgeBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  public ScheduleBidOptions ageBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

 /**
   * Get appTypeMultipliers
   * @return appTypeMultipliers
  **/
  @JsonProperty("app_type_multipliers")
  public ScheduleAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  public ScheduleBidOptions appTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

 /**
   * Get audienceMultipliers
   * @return audienceMultipliers
  **/
  @JsonProperty("audience_multipliers")
  public ScheduleAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  public void setAudienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  public ScheduleBidOptions audienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

 /**
   * Get genderMultipliers
   * @return genderMultipliers
  **/
  @JsonProperty("gender_multipliers")
  public ScheduleBidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  public void setGenderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  public ScheduleBidOptions genderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

 /**
   * Get placementMultipliers
   * @return placementMultipliers
  **/
  @JsonProperty("placement_multipliers")
  public ScheduleBidOptionsPlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  public void setPlacementMultipliers(ScheduleBidOptionsPlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

  public ScheduleBidOptions placementMultipliers(ScheduleBidOptionsPlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
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
    return Objects.equals(this.ageBucketMultipliers, scheduleBidOptions.ageBucketMultipliers) &&
        Objects.equals(this.appTypeMultipliers, scheduleBidOptions.appTypeMultipliers) &&
        Objects.equals(this.audienceMultipliers, scheduleBidOptions.audienceMultipliers) &&
        Objects.equals(this.genderMultipliers, scheduleBidOptions.genderMultipliers) &&
        Objects.equals(this.placementMultipliers, scheduleBidOptions.placementMultipliers);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

