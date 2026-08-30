package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AttributionWindows;
import org.openapitools.model.ConversionEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionTagV3GoalMetadata  {
  
  @ApiModelProperty(value = "")
  @Valid
  private AttributionWindows attributionWindows;

  @ApiModelProperty(value = "")
  @Valid
  private ConversionEvent conversionEvent;

  @ApiModelProperty(value = "")
  private String conversionTagId;

  @ApiModelProperty(value = "")
  private String cpaGoalValueInMicroCurrency;

 /**
  * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
  */
  @ApiModelProperty(value = "Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).")
  private Boolean isRoasOptimized;

 /**
  * Event name for custom or standard events mapped to an oCPM model
  */
  @ApiModelProperty(value = "Event name for custom or standard events mapped to an oCPM model")
  private String reportingEvent;
 /**
  * Get attributionWindows
  * @return attributionWindows
  */
  @JsonProperty("attribution_windows")
  public AttributionWindows getAttributionWindows() {
    return attributionWindows;
  }

  /**
   * Sets the <code>attributionWindows</code> property.
   */
 public void setAttributionWindows(AttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

  /**
   * Sets the <code>attributionWindows</code> property.
   */
  public ConversionTagV3GoalMetadata attributionWindows(AttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
    return this;
  }

 /**
  * Get conversionEvent
  * @return conversionEvent
  */
  @JsonProperty("conversion_event")
  public ConversionEvent getConversionEvent() {
    return conversionEvent;
  }

  /**
   * Sets the <code>conversionEvent</code> property.
   */
 public void setConversionEvent(ConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  /**
   * Sets the <code>conversionEvent</code> property.
   */
  public ConversionTagV3GoalMetadata conversionEvent(ConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
    return this;
  }

 /**
  * Get conversionTagId
  * @return conversionTagId
  */
  @JsonProperty("conversion_tag_id")
 @Pattern(regexp="^\\d+$")  public String getConversionTagId() {
    return conversionTagId;
  }

  /**
   * Sets the <code>conversionTagId</code> property.
   */
 public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  /**
   * Sets the <code>conversionTagId</code> property.
   */
  public ConversionTagV3GoalMetadata conversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
    return this;
  }

 /**
  * Get cpaGoalValueInMicroCurrency
  * @return cpaGoalValueInMicroCurrency
  */
  @JsonProperty("cpa_goal_value_in_micro_currency")
 @Pattern(regexp="^\\d+$")  public String getCpaGoalValueInMicroCurrency() {
    return cpaGoalValueInMicroCurrency;
  }

  /**
   * Sets the <code>cpaGoalValueInMicroCurrency</code> property.
   */
 public void setCpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
  }

  /**
   * Sets the <code>cpaGoalValueInMicroCurrency</code> property.
   */
  public ConversionTagV3GoalMetadata cpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
    return this;
  }

 /**
  * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
  * @return isRoasOptimized
  */
  @JsonProperty("is_roas_optimized")
  public Boolean getIsRoasOptimized() {
    return isRoasOptimized;
  }

  /**
   * Sets the <code>isRoasOptimized</code> property.
   */
 public void setIsRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
  }

  /**
   * Sets the <code>isRoasOptimized</code> property.
   */
  public ConversionTagV3GoalMetadata isRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
    return this;
  }

 /**
  * Event name for custom or standard events mapped to an oCPM model
  * @return reportingEvent
  */
  @JsonProperty("reporting_event")
  public String getReportingEvent() {
    return reportingEvent;
  }

  /**
   * Sets the <code>reportingEvent</code> property.
   */
 public void setReportingEvent(String reportingEvent) {
    this.reportingEvent = reportingEvent;
  }

  /**
   * Sets the <code>reportingEvent</code> property.
   */
  public ConversionTagV3GoalMetadata reportingEvent(String reportingEvent) {
    this.reportingEvent = reportingEvent;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

