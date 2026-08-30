package apimodels;

import apimodels.AttributionWindows;
import apimodels.ConversionEvent;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConversionTagV3GoalMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionTagV3GoalMetadata   {
  @JsonProperty("attribution_windows")
  @Valid

  private AttributionWindows attributionWindows;

  @JsonProperty("conversion_event")
  @Valid

  private ConversionEvent conversionEvent;

  @JsonProperty("conversion_tag_id")
  @Pattern(regexp="^\\d+$")

  private String conversionTagId;

  @JsonProperty("cpa_goal_value_in_micro_currency")
  @Pattern(regexp="^\\d+$")

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(attributionWindows, conversionTagV3GoalMetadata.attributionWindows) &&
        Objects.equals(conversionEvent, conversionTagV3GoalMetadata.conversionEvent) &&
        Objects.equals(conversionTagId, conversionTagV3GoalMetadata.conversionTagId) &&
        Objects.equals(cpaGoalValueInMicroCurrency, conversionTagV3GoalMetadata.cpaGoalValueInMicroCurrency) &&
        Objects.equals(isRoasOptimized, conversionTagV3GoalMetadata.isRoasOptimized) &&
        Objects.equals(reportingEvent, conversionTagV3GoalMetadata.reportingEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributionWindows, conversionEvent, conversionTagId, cpaGoalValueInMicroCurrency, isRoasOptimized, reportingEvent);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

