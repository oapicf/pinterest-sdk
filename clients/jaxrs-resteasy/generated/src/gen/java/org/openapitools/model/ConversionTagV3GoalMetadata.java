package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AttributionWindows;
import org.openapitools.model.ConversionEvent;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionTagV3GoalMetadata   {
  
  private AttributionWindows attributionWindows;
  private ConversionEvent conversionEvent;
  private String conversionTagId;
  private String cpaGoalValueInMicroCurrency;
  private Boolean isRoasOptimized;
  private String reportingEvent;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attribution_windows")
  @Valid
  public AttributionWindows getAttributionWindows() {
    return attributionWindows;
  }
  public void setAttributionWindows(AttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("conversion_event")
  @Valid
  public ConversionEvent getConversionEvent() {
    return conversionEvent;
  }
  public void setConversionEvent(ConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("conversion_tag_id")
 @Pattern(regexp="^\\d+$")  public String getConversionTagId() {
    return conversionTagId;
  }
  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cpa_goal_value_in_micro_currency")
 @Pattern(regexp="^\\d+$")  public String getCpaGoalValueInMicroCurrency() {
    return cpaGoalValueInMicroCurrency;
  }
  public void setCpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
  }

  /**
   * Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
   **/
  
  @ApiModelProperty(value = "Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).")
  @JsonProperty("is_roas_optimized")
  public Boolean getIsRoasOptimized() {
    return isRoasOptimized;
  }
  public void setIsRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
  }

  /**
   * Event name for custom or standard events mapped to an oCPM model
   **/
  
  @ApiModelProperty(value = "Event name for custom or standard events mapped to an oCPM model")
  @JsonProperty("reporting_event")
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

