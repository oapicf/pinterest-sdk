package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ScheduleAgeBucketMultipliers;
import org.openapitools.model.ScheduleAppTypeMultipliers;
import org.openapitools.model.ScheduleAudienceMultipliers;
import org.openapitools.model.ScheduleBidOptionsGenderMultipliers;
import org.openapitools.model.ScheduleBidOptionsPlacementMultipliers;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Object describing the schedule level bid level changes.
 **/
@ApiModel(description = "Object describing the schedule level bid level changes.")
@JsonTypeName("ScheduleBidOptions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleBidOptions   {
  private ScheduleAgeBucketMultipliers ageBucketMultipliers;
  private ScheduleAppTypeMultipliers appTypeMultipliers;
  private ScheduleAudienceMultipliers audienceMultipliers;
  private ScheduleBidOptionsGenderMultipliers genderMultipliers;
  private ScheduleBidOptionsPlacementMultipliers placementMultipliers;

  public ScheduleBidOptions() {
  }

  /**
   **/
  public ScheduleBidOptions ageBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("age_bucket_multipliers")
  @Valid public ScheduleAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  @JsonProperty("age_bucket_multipliers")
  public void setAgeBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  /**
   **/
  public ScheduleBidOptions appTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("app_type_multipliers")
  @Valid public ScheduleAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  @JsonProperty("app_type_multipliers")
  public void setAppTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  /**
   **/
  public ScheduleBidOptions audienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("audience_multipliers")
  @Valid public ScheduleAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  @JsonProperty("audience_multipliers")
  public void setAudienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  /**
   **/
  public ScheduleBidOptions genderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("gender_multipliers")
  @Valid public ScheduleBidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  @JsonProperty("gender_multipliers")
  public void setGenderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  /**
   **/
  public ScheduleBidOptions placementMultipliers(ScheduleBidOptionsPlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("placement_multipliers")
  @Valid public ScheduleBidOptionsPlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  @JsonProperty("placement_multipliers")
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
