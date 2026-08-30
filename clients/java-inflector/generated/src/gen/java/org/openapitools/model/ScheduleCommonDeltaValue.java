package org.openapitools.model;

import java.util.Objects;
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleCommonDeltaValue   {
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

  /**
   **/
  public ScheduleCommonDeltaValue ageBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("age_bucket_multipliers")
  public ScheduleAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }
  public void setAgeBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  /**
   **/
  public ScheduleCommonDeltaValue appTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("app_type_multipliers")
  public ScheduleAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }
  public void setAppTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  /**
   **/
  public ScheduleCommonDeltaValue audienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("audience_multipliers")
  public ScheduleAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }
  public void setAudienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  /**
   **/
  public ScheduleCommonDeltaValue genderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("gender_multipliers")
  public ScheduleBidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }
  public void setGenderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  /**
   **/
  public ScheduleCommonDeltaValue placementMultipliers(ScheduleBidOptionsPlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    ScheduleCommonDeltaValue scheduleCommonDeltaValue = (ScheduleCommonDeltaValue) o;
    return Objects.equals(ageBucketMultipliers, scheduleCommonDeltaValue.ageBucketMultipliers) &&
        Objects.equals(appTypeMultipliers, scheduleCommonDeltaValue.appTypeMultipliers) &&
        Objects.equals(audienceMultipliers, scheduleCommonDeltaValue.audienceMultipliers) &&
        Objects.equals(genderMultipliers, scheduleCommonDeltaValue.genderMultipliers) &&
        Objects.equals(placementMultipliers, scheduleCommonDeltaValue.placementMultipliers);
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

