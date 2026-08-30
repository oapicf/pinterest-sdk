package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AttributionWindows;
import com.prokarma.pkmst.model.ConversionEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ConversionTagV3GoalMetadata
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionTagV3GoalMetadata   {
  @JsonProperty("attribution_windows")
  private AttributionWindows attributionWindows;

  @JsonProperty("conversion_event")
  private ConversionEvent conversionEvent;

  @JsonProperty("conversion_tag_id")
  private String conversionTagId;

  @JsonProperty("cpa_goal_value_in_micro_currency")
  private String cpaGoalValueInMicroCurrency;

  @JsonProperty("is_roas_optimized")
  private Boolean isRoasOptimized;

  @JsonProperty("reporting_event")
  private String reportingEvent;

  public ConversionTagV3GoalMetadata attributionWindows(AttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

  /**
   * Get attributionWindows
   * @return attributionWindows
   */
  @ApiModelProperty(value = "")
  public AttributionWindows getAttributionWindows() {
    return attributionWindows;
  }

  public void setAttributionWindows(AttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

  public ConversionTagV3GoalMetadata conversionEvent(ConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

  /**
   * Get conversionEvent
   * @return conversionEvent
   */
  @ApiModelProperty(value = "")
  public ConversionEvent getConversionEvent() {
    return conversionEvent;
  }

  public void setConversionEvent(ConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  public ConversionTagV3GoalMetadata conversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
    return this;
  }

  /**
   * Get conversionTagId
   * @return conversionTagId
   */
  @ApiModelProperty(value = "")
  public String getConversionTagId() {
    return conversionTagId;
  }

  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  public ConversionTagV3GoalMetadata cpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
    return this;
  }

  /**
   * Get cpaGoalValueInMicroCurrency
   * @return cpaGoalValueInMicroCurrency
   */
  @ApiModelProperty(value = "")
  public String getCpaGoalValueInMicroCurrency() {
    return cpaGoalValueInMicroCurrency;
  }

  public void setCpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
  }

  public ConversionTagV3GoalMetadata isRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
    return this;
  }

  /**
   * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
   * @return isRoasOptimized
   */
  @ApiModelProperty(value = "Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).")
  public Boolean getIsRoasOptimized() {
    return isRoasOptimized;
  }

  public void setIsRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
  }

  public ConversionTagV3GoalMetadata reportingEvent(String reportingEvent) {
    this.reportingEvent = reportingEvent;
    return this;
  }

  /**
   * Event name for custom or standard events mapped to an oCPM model
   * @return reportingEvent
   */
  @ApiModelProperty(value = "Event name for custom or standard events mapped to an oCPM model")
  public String getReportingEvent() {
    return reportingEvent;
  }

  public void setReportingEvent(String reportingEvent) {
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
        Objects.equals(this.isRoasOptimized, conversionTagV3GoalMetadata.isRoasOptimized) &&
        Objects.equals(this.reportingEvent, conversionTagV3GoalMetadata.reportingEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionWindows, conversionEvent, conversionTagId, cpaGoalValueInMicroCurrency, isRoasOptimized, reportingEvent);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

