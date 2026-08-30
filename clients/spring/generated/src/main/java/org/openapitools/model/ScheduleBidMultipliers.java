package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BidOptionsAgeBucketMultipliers;
import org.openapitools.model.BidOptionsAppTypeMultipliers;
import org.openapitools.model.BidOptionsAudienceMultipliers;
import org.openapitools.model.BidOptionsGenderMultipliers;
import org.openapitools.model.BidOptionsPlacementMultipliers;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
 */

@Schema(name = "ScheduleBidMultipliers", description = "The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleBidMultipliers {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BidOptionsAgeBucketMultipliers ageBucketMultipliers;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BidOptionsAppTypeMultipliers appTypeMultipliers;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BidOptionsGenderMultipliers genderMultipliers;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BidOptionsPlacementMultipliers placementMultipliers;

  public ScheduleBidMultipliers ageBucketMultipliers(@Nullable BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
    return this;
  }

  /**
   * Get ageBucketMultipliers
   * @return ageBucketMultipliers
   */
  @Valid 
  @Schema(name = "age_bucket_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age_bucket_multipliers")
  public @Nullable BidOptionsAgeBucketMultipliers getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  @JsonProperty("age_bucket_multipliers")
  public void setAgeBucketMultipliers(@Nullable BidOptionsAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  public ScheduleBidMultipliers appTypeMultipliers(@Nullable BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

  /**
   * Get appTypeMultipliers
   * @return appTypeMultipliers
   */
  @Valid 
  @Schema(name = "app_type_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_type_multipliers")
  public @Nullable BidOptionsAppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  @JsonProperty("app_type_multipliers")
  public void setAppTypeMultipliers(@Nullable BidOptionsAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  public ScheduleBidMultipliers audienceMultipliers(List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  public ScheduleBidMultipliers addAudienceMultipliersItem(BidOptionsAudienceMultipliers audienceMultipliersItem) {
    if (this.audienceMultipliers == null) {
      this.audienceMultipliers = new ArrayList<>();
    }
    this.audienceMultipliers.add(audienceMultipliersItem);
    return this;
  }

  /**
   * Get audienceMultipliers
   * @return audienceMultipliers
   */
  @Valid 
  @Schema(name = "audience_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audience_multipliers")
  public List<@Valid BidOptionsAudienceMultipliers> getAudienceMultipliers() {
    return audienceMultipliers;
  }

  @JsonProperty("audience_multipliers")
  public void setAudienceMultipliers(List<@Valid BidOptionsAudienceMultipliers> audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  public ScheduleBidMultipliers genderMultipliers(@Nullable BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
    return this;
  }

  /**
   * Get genderMultipliers
   * @return genderMultipliers
   */
  @Valid 
  @Schema(name = "gender_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender_multipliers")
  public @Nullable BidOptionsGenderMultipliers getGenderMultipliers() {
    return genderMultipliers;
  }

  @JsonProperty("gender_multipliers")
  public void setGenderMultipliers(@Nullable BidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  public ScheduleBidMultipliers placementMultipliers(@Nullable BidOptionsPlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

  /**
   * Get placementMultipliers
   * @return placementMultipliers
   */
  @Valid 
  @Schema(name = "placement_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_multipliers")
  public @Nullable BidOptionsPlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  @JsonProperty("placement_multipliers")
  public void setPlacementMultipliers(@Nullable BidOptionsPlacementMultipliers placementMultipliers) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

