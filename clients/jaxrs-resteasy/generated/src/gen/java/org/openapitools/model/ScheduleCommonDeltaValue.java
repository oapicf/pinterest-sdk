package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ScheduleAgeBucketMultipliers;
import org.openapitools.model.ScheduleAppTypeMultipliers;
import org.openapitools.model.ScheduleAudienceMultipliers;
import org.openapitools.model.ScheduleBidOptions;
import org.openapitools.model.ScheduleBidOptionsGenderMultipliers;
import org.openapitools.model.ScheduleBidOptionsPlacementMultipliers;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleCommonDeltaValue   {
  
  private ScheduleAgeBucketMultipliers ageBucketMultipliers;
  private ScheduleAppTypeMultipliers appTypeMultipliers;
  private ScheduleAudienceMultipliers audienceMultipliers;
  private ScheduleBidOptionsGenderMultipliers genderMultipliers;
  private ScheduleBidOptionsPlacementMultipliers placementMultipliers;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("age_bucket_multipliers")
  @Valid
  public ScheduleAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }
  public void setAgeBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("app_type_multipliers")
  @Valid
  public ScheduleAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }
  public void setAppTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("audience_multipliers")
  @Valid
  public ScheduleAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }
  public void setAudienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("gender_multipliers")
  @Valid
  public ScheduleBidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }
  public void setGenderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("placement_multipliers")
  @Valid
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
    ScheduleCommonDeltaValue scheduleCommonDeltaValue = (ScheduleCommonDeltaValue) o;
    return Objects.equals(this.ageBucketMultipliers, scheduleCommonDeltaValue.ageBucketMultipliers) &&
        Objects.equals(this.appTypeMultipliers, scheduleCommonDeltaValue.appTypeMultipliers) &&
        Objects.equals(this.audienceMultipliers, scheduleCommonDeltaValue.audienceMultipliers) &&
        Objects.equals(this.genderMultipliers, scheduleCommonDeltaValue.genderMultipliers) &&
        Objects.equals(this.placementMultipliers, scheduleCommonDeltaValue.placementMultipliers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageBucketMultipliers, appTypeMultipliers, audienceMultipliers, genderMultipliers, placementMultipliers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleCommonDeltaValue {\n");
    
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

