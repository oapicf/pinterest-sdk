package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ScheduleAgeBucketMultipliers;
import com.prokarma.pkmst.model.ScheduleAppTypeMultipliers;
import com.prokarma.pkmst.model.ScheduleAudienceMultipliers;
import com.prokarma.pkmst.model.ScheduleBidOptionsGenderMultipliers;
import com.prokarma.pkmst.model.ScheduleBidOptionsPlacementMultipliers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Object describing the schedule level bid level changes.
 */
@ApiModel(description = "Object describing the schedule level bid level changes.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleBidOptions   {
  @JsonProperty("age_bucket_multipliers")
  private ScheduleAgeBucketMultipliers ageBucketMultipliers;

  @JsonProperty("app_type_multipliers")
  private ScheduleAppTypeMultipliers appTypeMultipliers;

  @JsonProperty("audience_multipliers")
  private ScheduleAudienceMultipliers audienceMultipliers;

  @JsonProperty("gender_multipliers")
  private ScheduleBidOptionsGenderMultipliers genderMultipliers;

  @JsonProperty("placement_multipliers")
  private ScheduleBidOptionsPlacementMultipliers placementMultipliers;

  public ScheduleBidOptions ageBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

  /**
   * Get ageBucketMultipliers
   * @return ageBucketMultipliers
   */
  @ApiModelProperty(value = "")
  public ScheduleAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  public void setAgeBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  public ScheduleBidOptions appTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

  /**
   * Get appTypeMultipliers
   * @return appTypeMultipliers
   */
  @ApiModelProperty(value = "")
  public ScheduleAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  public ScheduleBidOptions audienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  /**
   * Get audienceMultipliers
   * @return audienceMultipliers
   */
  @ApiModelProperty(value = "")
  public ScheduleAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  public void setAudienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  public ScheduleBidOptions genderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

  /**
   * Get genderMultipliers
   * @return genderMultipliers
   */
  @ApiModelProperty(value = "")
  public ScheduleBidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  public void setGenderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  public ScheduleBidOptions placementMultipliers(ScheduleBidOptionsPlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

  /**
   * Get placementMultipliers
   * @return placementMultipliers
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

