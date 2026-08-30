package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BidOptionsAgeBucketMultipliers;
import org.openapitools.model.BidOptionsAppTypeMultipliers;
import org.openapitools.model.BidOptionsAudienceMultipliers;
import org.openapitools.model.BidOptionsGenderMultipliers;
import org.openapitools.model.BidOptionsPlacementMultipliers;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.")
public class ScheduleBidMultipliers   {
  
  private BidOptionsAgeBucketMultipliers ageBucketMultipliers;

  private BidOptionsAppTypeMultipliers appTypeMultipliers;

  private List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers = new ArrayList<>();

  private BidOptionsGenderMultipliers genderMultipliers;

  private BidOptionsPlacementMultipliers placementMultipliers;

  /**
   **/
  public ScheduleBidMultipliers ageBucketMultipliers(BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("age_bucket_multipliers")
  public BidOptionsAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }
  public void setAgeBucketMultipliers(BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }


  /**
   **/
  public ScheduleBidMultipliers appTypeMultipliers(BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("app_type_multipliers")
  public BidOptionsAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }
  public void setAppTypeMultipliers(BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }


  /**
   **/
  public ScheduleBidMultipliers audienceMultipliers(List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("audience_multipliers")
  public List<@Valid BidOptionsAudienceMultipliers> getAudienceMultipliers() {
    return audienceMultipliers;
  }
  public void setAudienceMultipliers(List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  public ScheduleBidMultipliers addAudienceMultipliersItem(BidOptionsAudienceMultipliers audienceMultipliersItem) {
    if (this.audienceMultipliers == null) {
      this.audienceMultipliers = new ArrayList<>();
    }
    this.audienceMultipliers.add(audienceMultipliersItem);
    return this;
  }


  /**
   **/
  public ScheduleBidMultipliers genderMultipliers(BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("gender_multipliers")
  public BidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }
  public void setGenderMultipliers(BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }


  /**
   **/
  public ScheduleBidMultipliers placementMultipliers(BidOptionsPlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
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
    ScheduleBidMultipliers scheduleBidMultipliers = (ScheduleBidMultipliers) o;
    return Objects.equals(this.ageBucketMultipliers, scheduleBidMultipliers.ageBucketMultipliers) &&
        Objects.equals(this.appTypeMultipliers, scheduleBidMultipliers.appTypeMultipliers) &&
        Objects.equals(this.audienceMultipliers, scheduleBidMultipliers.audienceMultipliers) &&
        Objects.equals(this.genderMultipliers, scheduleBidMultipliers.genderMultipliers) &&
        Objects.equals(this.placementMultipliers, scheduleBidMultipliers.placementMultipliers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageBucketMultipliers, appTypeMultipliers, audienceMultipliers, genderMultipliers, placementMultipliers);
  }

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

