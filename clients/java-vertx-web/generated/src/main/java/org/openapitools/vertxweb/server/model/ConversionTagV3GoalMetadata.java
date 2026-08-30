package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AttributionWindows;
import org.openapitools.vertxweb.server.model.ConversionEvent;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionTagV3GoalMetadata   {
  
  private AttributionWindows attributionWindows;
  private ConversionEvent conversionEvent;
  private String conversionTagId;
  private String cpaGoalValueInMicroCurrency;
  private Boolean isRoasOptimized;
  private String reportingEvent;

  public ConversionTagV3GoalMetadata () {

  }

  public ConversionTagV3GoalMetadata (AttributionWindows attributionWindows, ConversionEvent conversionEvent, String conversionTagId, String cpaGoalValueInMicroCurrency, Boolean isRoasOptimized, String reportingEvent) {
    this.attributionWindows = attributionWindows;
    this.conversionEvent = conversionEvent;
    this.conversionTagId = conversionTagId;
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
    this.isRoasOptimized = isRoasOptimized;
    this.reportingEvent = reportingEvent;
  }

    
  @JsonProperty("attribution_windows")
  public AttributionWindows getAttributionWindows() {
    return attributionWindows;
  }
  public void setAttributionWindows(AttributionWindows attributionWindows) {
    this.attributionWindows = attributionWindows;
  }

    
  @JsonProperty("conversion_event")
  public ConversionEvent getConversionEvent() {
    return conversionEvent;
  }
  public void setConversionEvent(ConversionEvent conversionEvent) {
    this.conversionEvent = conversionEvent;
  }

    
  @JsonProperty("conversion_tag_id")
  public String getConversionTagId() {
    return conversionTagId;
  }
  public void setConversionTagId(String conversionTagId) {
    this.conversionTagId = conversionTagId;
  }

    
  @JsonProperty("cpa_goal_value_in_micro_currency")
  public String getCpaGoalValueInMicroCurrency() {
    return cpaGoalValueInMicroCurrency;
  }
  public void setCpaGoalValueInMicroCurrency(String cpaGoalValueInMicroCurrency) {
    this.cpaGoalValueInMicroCurrency = cpaGoalValueInMicroCurrency;
  }

    
  @JsonProperty("is_roas_optimized")
  public Boolean getIsRoasOptimized() {
    return isRoasOptimized;
  }
  public void setIsRoasOptimized(Boolean isRoasOptimized) {
    this.isRoasOptimized = isRoasOptimized;
  }

    
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
