package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.Granularity;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdsAnalyticsCreateAsyncRequestAllOf  {
  
 /**
  * Metric report start date (UTC). Format: YYYY-MM-DD
  */
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")
  private String startDate;

 /**
  * Metric report end date (UTC). Format: YYYY-MM-DD
  */
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
  private String endDate;

 /**
  * TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  */
  @ApiModelProperty(required = true, value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly")
  private Granularity granularity;

 /**
  * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @Valid
  private ConversionAttributionWindowDays clickWindowDays = 30;

 /**
  * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @Valid
  private ConversionAttributionWindowDays engagementWindowDays = 30;

 /**
  * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
  @Valid
  private ConversionAttributionWindowDays viewWindowDays = 1;

 /**
  * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  */
  @ApiModelProperty(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";

 /**
  * List of types of attribution for the conversion report
  */
  @ApiModelProperty(value = "List of types of attribution for the conversion report")
  @Valid
  private List<ConversionReportAttributionType> attributionTypes = null;
 /**
  * Metric report start date (UTC). Format: YYYY-MM-DD
  * @return startDate
  */
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
 public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
  public AdsAnalyticsCreateAsyncRequestAllOf startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
  * Metric report end date (UTC). Format: YYYY-MM-DD
  * @return endDate
  */
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
 public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
  public AdsAnalyticsCreateAsyncRequestAllOf endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
  * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
  * @return granularity
  */
  @JsonProperty("granularity")
  @NotNull
  public Granularity getGranularity() {
    return granularity;
  }

  /**
   * Sets the <code>granularity</code> property.
   */
 public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Sets the <code>granularity</code> property.
   */
  public AdsAnalyticsCreateAsyncRequestAllOf granularity(Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

 /**
  * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
  * @return clickWindowDays
  */
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  /**
   * Sets the <code>clickWindowDays</code> property.
   */
 public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   * Sets the <code>clickWindowDays</code> property.
   */
  public AdsAnalyticsCreateAsyncRequestAllOf clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

 /**
  * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
  * @return engagementWindowDays
  */
  @JsonProperty("engagement_window_days")
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }

  /**
   * Sets the <code>engagementWindowDays</code> property.
   */
 public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  /**
   * Sets the <code>engagementWindowDays</code> property.
   */
  public AdsAnalyticsCreateAsyncRequestAllOf engagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

 /**
  * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
  * @return viewWindowDays
  */
  @JsonProperty("view_window_days")
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  /**
   * Sets the <code>viewWindowDays</code> property.
   */
 public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

  /**
   * Sets the <code>viewWindowDays</code> property.
   */
  public AdsAnalyticsCreateAsyncRequestAllOf viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

 /**
  * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  * @return conversionReportTime
  */
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  /**
   * Sets the <code>conversionReportTime</code> property.
   */
 public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  /**
   * Sets the <code>conversionReportTime</code> property.
   */
  public AdsAnalyticsCreateAsyncRequestAllOf conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

 /**
  * List of types of attribution for the conversion report
  * @return attributionTypes
  */
  @JsonProperty("attribution_types")
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }

  /**
   * Sets the <code>attributionTypes</code> property.
   */
 public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
  }

  /**
   * Sets the <code>attributionTypes</code> property.
   */
  public AdsAnalyticsCreateAsyncRequestAllOf attributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>attributionTypes</code> list.
   */
  public AdsAnalyticsCreateAsyncRequestAllOf addAttributionTypesItem(ConversionReportAttributionType attributionTypesItem) {
    this.attributionTypes.add(attributionTypesItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsCreateAsyncRequestAllOf {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
    sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
    sb.append("    viewWindowDays: ").append(toIndentedString(viewWindowDays)).append("\n");
    sb.append("    conversionReportTime: ").append(toIndentedString(conversionReportTime)).append("\n");
    sb.append("    attributionTypes: ").append(toIndentedString(attributionTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

