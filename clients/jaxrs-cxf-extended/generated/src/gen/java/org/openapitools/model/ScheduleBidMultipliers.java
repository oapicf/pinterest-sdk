package org.openapitools.model;

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

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
 */
@ApiModel(description="The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.")

public class ScheduleBidMultipliers  {
  
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
  */
  @JsonProperty("age_bucket_multipliers")
  public BidOptionsAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  /**
   * Sets the <code>ageBucketMultipliers</code> property.
   */
 public void setAgeBucketMultipliers(BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  /**
   * Sets the <code>ageBucketMultipliers</code> property.
   */
  public ScheduleBidMultipliers ageBucketMultipliers(BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

 /**
  * Get appTypeMultipliers
  * @return appTypeMultipliers
  */
  @JsonProperty("app_type_multipliers")
  public BidOptionsAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  /**
   * Sets the <code>appTypeMultipliers</code> property.
   */
 public void setAppTypeMultipliers(BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  /**
   * Sets the <code>appTypeMultipliers</code> property.
   */
  public ScheduleBidMultipliers appTypeMultipliers(BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

 /**
  * Get audienceMultipliers
  * @return audienceMultipliers
  */
  @JsonProperty("audience_multipliers")
  public List<@Valid BidOptionsAudienceMultipliers> getAudienceMultipliers() {
    return audienceMultipliers;
  }

  /**
   * Sets the <code>audienceMultipliers</code> property.
   */
 public void setAudienceMultipliers(List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  /**
   * Sets the <code>audienceMultipliers</code> property.
   */
  public ScheduleBidMultipliers audienceMultipliers(List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  /**
   * Adds a new item to the <code>audienceMultipliers</code> list.
   */
  public ScheduleBidMultipliers addAudienceMultipliersItem(BidOptionsAudienceMultipliers audienceMultipliersItem) {
    this.audienceMultipliers.add(audienceMultipliersItem);
    return this;
  }

 /**
  * Get genderMultipliers
  * @return genderMultipliers
  */
  @JsonProperty("gender_multipliers")
  public BidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  /**
   * Sets the <code>genderMultipliers</code> property.
   */
 public void setGenderMultipliers(BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  /**
   * Sets the <code>genderMultipliers</code> property.
   */
  public ScheduleBidMultipliers genderMultipliers(BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

 /**
  * Get placementMultipliers
  * @return placementMultipliers
  */
  @JsonProperty("placement_multipliers")
  public BidOptionsPlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  /**
   * Sets the <code>placementMultipliers</code> property.
   */
 public void setPlacementMultipliers(BidOptionsPlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

  /**
   * Sets the <code>placementMultipliers</code> property.
   */
  public ScheduleBidMultipliers placementMultipliers(BidOptionsPlacementMultipliers placementMultipliers) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

