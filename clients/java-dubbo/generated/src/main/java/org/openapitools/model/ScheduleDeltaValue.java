package org.openapitools.model;

import org.openapitools.model.BidOptionsAgeBucketMultipliers;
import org.openapitools.model.BidOptionsAppTypeMultipliers;
import org.openapitools.model.BidOptionsAudienceMultipliers;
import org.openapitools.model.BidOptionsGenderMultipliers;
import org.openapitools.model.BidOptionsPlacementMultipliers;
import org.openapitools.model.ScheduleBidMultipliers;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * The value of the scheduled adjustment.
 */
public class ScheduleDeltaValue implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("age_bucket_multipliers")
  private BidOptionsAgeBucketMultipliers ageBucketMultipliers;

  @JsonProperty("app_type_multipliers")
  private BidOptionsAppTypeMultipliers appTypeMultipliers;

  @JsonProperty("audience_multipliers")
  private List<BidOptionsAudienceMultipliers> audienceMultipliers = new ArrayList<>();

  @JsonProperty("gender_multipliers")
  private BidOptionsGenderMultipliers genderMultipliers;

  @JsonProperty("placement_multipliers")
  private BidOptionsPlacementMultipliers placementMultipliers;

  /**
   * 
   * @return ageBucketMultipliers
   */
  public BidOptionsAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  public void setAgeBucketMultipliers(BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  /**
   * 
   * @return appTypeMultipliers
   */
  public BidOptionsAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  /**
   * 
   * @return audienceMultipliers
   */
  public List<BidOptionsAudienceMultipliers> getAudienceMultipliers() {
    return audienceMultipliers;
  }

  public void setAudienceMultipliers(List<BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  /**
   * 
   * @return genderMultipliers
   */
  public BidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  public void setGenderMultipliers(BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  /**
   * 
   * @return placementMultipliers
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
