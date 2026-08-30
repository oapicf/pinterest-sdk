package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ScheduleAgeBucketMultipliers;
import org.openapitools.model.ScheduleAppTypeMultipliers;
import org.openapitools.model.ScheduleAudienceMultipliers;
import org.openapitools.model.ScheduleBidOptionsGenderMultipliers;
import org.openapitools.model.ScheduleBidOptionsPlacementMultipliers;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Object describing the schedule level bid level changes.
 */

@Schema(name = "ScheduleBidOptions", description = "Object describing the schedule level bid level changes.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleBidOptions implements ScheduleCommonDeltaValue {

  private JsonNullable<ScheduleAgeBucketMultipliers> ageBucketMultipliers = JsonNullable.<ScheduleAgeBucketMultipliers>undefined();

  private JsonNullable<ScheduleAppTypeMultipliers> appTypeMultipliers = JsonNullable.<ScheduleAppTypeMultipliers>undefined();

  private ScheduleAudienceMultipliers audienceMultipliers;

  private JsonNullable<ScheduleBidOptionsGenderMultipliers> genderMultipliers = JsonNullable.<ScheduleBidOptionsGenderMultipliers>undefined();

  private JsonNullable<ScheduleBidOptionsPlacementMultipliers> placementMultipliers = JsonNullable.<ScheduleBidOptionsPlacementMultipliers>undefined();

  public ScheduleBidOptions ageBucketMultipliers(ScheduleAgeBucketMultipliers ageBucketMultipliers) {
    this.ageBucketMultipliers = JsonNullable.of(ageBucketMultipliers);
    return this;
  }

  /**
   * Get ageBucketMultipliers
   * @return ageBucketMultipliers
   */
  @Valid 
  @Schema(name = "age_bucket_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("age_bucket_multipliers")
  public JsonNullable<ScheduleAgeBucketMultipliers> getAgeBucketMultipliers() {
    return ageBucketMultipliers;
  }

  public void setAgeBucketMultipliers(JsonNullable<ScheduleAgeBucketMultipliers> ageBucketMultipliers) {
    this.ageBucketMultipliers = ageBucketMultipliers;
  }

  public ScheduleBidOptions appTypeMultipliers(ScheduleAppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = JsonNullable.of(appTypeMultipliers);
    return this;
  }

  /**
   * Get appTypeMultipliers
   * @return appTypeMultipliers
   */
  @Valid 
  @Schema(name = "app_type_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_type_multipliers")
  public JsonNullable<ScheduleAppTypeMultipliers> getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(JsonNullable<ScheduleAppTypeMultipliers> appTypeMultipliers) {
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
  @Valid 
  @Schema(name = "audience_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("audience_multipliers")
  public ScheduleAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  public void setAudienceMultipliers(ScheduleAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  public ScheduleBidOptions genderMultipliers(ScheduleBidOptionsGenderMultipliers genderMultipliers) {
    this.genderMultipliers = JsonNullable.of(genderMultipliers);
    return this;
  }

  /**
   * Get genderMultipliers
   * @return genderMultipliers
   */
  @Valid 
  @Schema(name = "gender_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gender_multipliers")
  public JsonNullable<ScheduleBidOptionsGenderMultipliers> getGenderMultipliers() {
    return genderMultipliers;
  }

  public void setGenderMultipliers(JsonNullable<ScheduleBidOptionsGenderMultipliers> genderMultipliers) {
    this.genderMultipliers = genderMultipliers;
  }

  public ScheduleBidOptions placementMultipliers(ScheduleBidOptionsPlacementMultipliers placementMultipliers) {
    this.placementMultipliers = JsonNullable.of(placementMultipliers);
    return this;
  }

  /**
   * Get placementMultipliers
   * @return placementMultipliers
   */
  @Valid 
  @Schema(name = "placement_multipliers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("placement_multipliers")
  public JsonNullable<ScheduleBidOptionsPlacementMultipliers> getPlacementMultipliers() {
    return placementMultipliers;
  }

  public void setPlacementMultipliers(JsonNullable<ScheduleBidOptionsPlacementMultipliers> placementMultipliers) {
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
    return equalsNullable(this.ageBucketMultipliers, scheduleBidOptions.ageBucketMultipliers) &&
        equalsNullable(this.appTypeMultipliers, scheduleBidOptions.appTypeMultipliers) &&
        Objects.equals(this.audienceMultipliers, scheduleBidOptions.audienceMultipliers) &&
        equalsNullable(this.genderMultipliers, scheduleBidOptions.genderMultipliers) &&
        equalsNullable(this.placementMultipliers, scheduleBidOptions.placementMultipliers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(ageBucketMultipliers), hashCodeNullable(appTypeMultipliers), audienceMultipliers, hashCodeNullable(genderMultipliers), hashCodeNullable(placementMultipliers));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

