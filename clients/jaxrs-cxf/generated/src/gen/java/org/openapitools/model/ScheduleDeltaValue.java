package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BidOptionsAgeBucketMultipliers;
import org.openapitools.model.BidOptionsAppTypeMultipliers;
import org.openapitools.model.BidOptionsAudienceMultipliers;
import org.openapitools.model.BidOptionsGenderMultipliers;
import org.openapitools.model.BidOptionsPlacementMultipliers;
import org.openapitools.model.ScheduleBidMultipliers;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The value of the scheduled adjustment.
 */
@ApiModel(description="The value of the scheduled adjustment.")

public class ScheduleDeltaValue  {
  
  @ApiModelProperty(value = "")

  @Valid

  private BidOptionsAgeBucketMultipliers ageBucketMultipliers;

  @ApiModelProperty(value = "")

  @Valid

  private BidOptionsAppTypeMultipliers appTypeMultipliers;

  @ApiModelProperty(value = "")

  @Valid

  private List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private BidOptionsGenderMultipliers genderMultipliers;

  @ApiModelProperty(value = "")

  @Valid

  private BidOptionsPlacementMultipliers placementMultipliers;
 /**
   * Get ageBucketMultipliers
   * @return ageBucketMultipliers
  **/
  @JsonProperty("age_bucket_multipliers")
  public BidOptionsAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  public void setAgeBucketMultipliers(BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  public ScheduleDeltaValue ageBucketMultipliers(BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

 /**
   * Get appTypeMultipliers
   * @return appTypeMultipliers
  **/
  @JsonProperty("app_type_multipliers")
  public BidOptionsAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  public ScheduleDeltaValue appTypeMultipliers(BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

 /**
   * Get audienceMultipliers
   * @return audienceMultipliers
  **/
  @JsonProperty("audience_multipliers")
  public List<@Valid BidOptionsAudienceMultipliers> getAudienceMultipliers() {
    return audienceMultipliers;
  }

  public void setAudienceMultipliers(List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  public ScheduleDeltaValue audienceMultipliers(List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  public ScheduleDeltaValue addAudienceMultipliersItem(BidOptionsAudienceMultipliers audienceMultipliersItem) {
    this.audienceMultipliers.add(audienceMultipliersItem);
    return this;
  }

 /**
   * Get genderMultipliers
   * @return genderMultipliers
  **/
  @JsonProperty("gender_multipliers")
  public BidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  public void setGenderMultipliers(BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  public ScheduleDeltaValue genderMultipliers(BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

 /**
   * Get placementMultipliers
   * @return placementMultipliers
  **/
  @JsonProperty("placement_multipliers")
  public BidOptionsPlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  public void setPlacementMultipliers(BidOptionsPlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

  public ScheduleDeltaValue placementMultipliers(BidOptionsPlacementMultipliers placementMultipliers) {
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
    ScheduleDeltaValue scheduleDeltaValue = (ScheduleDeltaValue) o;
    return Objects.equals(this.ageBucketMultipliers, scheduleDeltaValue.ageBucketMultipliers) &&
        Objects.equals(this.appTypeMultipliers, scheduleDeltaValue.appTypeMultipliers) &&
        Objects.equals(this.audienceMultipliers, scheduleDeltaValue.audienceMultipliers) &&
        Objects.equals(this.genderMultipliers, scheduleDeltaValue.genderMultipliers) &&
        Objects.equals(this.placementMultipliers, scheduleDeltaValue.placementMultipliers);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

