package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AttributionWindows;
import org.openapitools.model.ConversionEvent;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConversionTagV3GoalMetadata
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionTagV3GoalMetadata {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AttributionWindows attributionWindows;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionEvent conversionEvent;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String conversionTagId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String cpaGoalValueInMicroCurrency;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isRoasOptimized = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String reportingEvent;

  public ConversionTagV3GoalMetadata attributionWindows(@Nullable AttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

  /**
   * Get attributionWindows
   * @return attributionWindows
   */
  @Valid 
  @Schema(name = "attribution_windows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution_windows")
  public @Nullable AttributionWindows getAttributionWindows() {
    return attributionWindows;
  }

  @JsonProperty("attribution_windows")
  public void setAttributionWindows(@Nullable AttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

  public ConversionTagV3GoalMetadata conversionEvent(@Nullable ConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

  /**
   * Get conversionEvent
   * @return conversionEvent
   */
  @Valid 
  @Schema(name = "conversion_event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_event")
  public @Nullable ConversionEvent getConversionEvent() {
    return conversionEvent;
  }

  @JsonProperty("conversion_event")
  public void setConversionEvent(@Nullable ConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  public ConversionTagV3GoalMetadata conversionTagId(@Nullable String conversionTagId) {
    this.conversionTagId = conversionTagId;
    return this;
  }

  /**
   * Get conversionTagId
   * @return conversionTagId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "conversion_tag_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_tag_id")
  public @Nullable String getConversionTagId() {
    return conversionTagId;
  }

  @JsonProperty("conversion_tag_id")
  public void setConversionTagId(@Nullable String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  public ConversionTagV3GoalMetadata cpaGoalValueInMicroCurrency(@Nullable String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
    return this;
  }

  /**
   * Get cpaGoalValueInMicroCurrency
   * @return cpaGoalValueInMicroCurrency
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "cpa_goal_value_in_micro_currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cpa_goal_value_in_micro_currency")
  public @Nullable String getCpaGoalValueInMicroCurrency() {
    return cpaGoalValueInMicroCurrency;
  }

  @JsonProperty("cpa_goal_value_in_micro_currency")
  public void setCpaGoalValueInMicroCurrency(@Nullable String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
  }

  public ConversionTagV3GoalMetadata isRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = JsonNullable.of(isRoasOptimized);
    return this;
  }

  /**
   * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
   * @return isRoasOptimized
   */
  
  @Schema(name = "is_roas_optimized", description = "Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_roas_optimized")
  public JsonNullable<Boolean> getIsRoasOptimized() {
    return isRoasOptimized;
  }

  public void setIsRoasOptimized(JsonNullable<Boolean> isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
  }

  public ConversionTagV3GoalMetadata reportingEvent(@Nullable String reportingEvent) {
    this.reportingEvent = reportingEvent;
    return this;
  }

  /**
   * Event name for custom or standard events mapped to an oCPM model
   * @return reportingEvent
   */
  
  @Schema(name = "reporting_event", description = "Event name for custom or standard events mapped to an oCPM model", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reporting_event")
  public @Nullable String getReportingEvent() {
    return reportingEvent;
  }

  @JsonProperty("reporting_event")
  public void setReportingEvent(@Nullable String reportingEvent) {
    this.reportingEvent = reportingEvent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionTagV3GoalMetadata conversionTagV3GoalMetadata = (ConversionTagV3GoalMetadata) o;
    return Objects.equals(this.attributionWindows, conversionTagV3GoalMetadata.attributionWindows) &&
        Objects.equals(this.conversionEvent, conversionTagV3GoalMetadata.conversionEvent) &&
        Objects.equals(this.conversionTagId, conversionTagV3GoalMetadata.conversionTagId) &&
        Objects.equals(this.cpaGoalValueInMicroCurrency, conversionTagV3GoalMetadata.cpaGoalValueInMicroCurrency) &&
        equalsNullable(this.isRoasOptimized, conversionTagV3GoalMetadata.isRoasOptimized) &&
        Objects.equals(this.reportingEvent, conversionTagV3GoalMetadata.reportingEvent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionWindows, conversionEvent, conversionTagId, cpaGoalValueInMicroCurrency, hashCodeNullable(isRoasOptimized), reportingEvent);
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
    sb.append("class ConversionTagV3GoalMetadata {\n");
    sb.append("    attributionWindows: ").append(toIndentedString(attributionWindows)).append("\n");
    sb.append("    conversionEvent: ").append(toIndentedString(conversionEvent)).append("\n");
    sb.append("    conversionTagId: ").append(toIndentedString(conversionTagId)).append("\n");
    sb.append("    cpaGoalValueInMicroCurrency: ").append(toIndentedString(cpaGoalValueInMicroCurrency)).append("\n");
    sb.append("    isRoasOptimized: ").append(toIndentedString(isRoasOptimized)).append("\n");
    sb.append("    reportingEvent: ").append(toIndentedString(reportingEvent)).append("\n");
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

