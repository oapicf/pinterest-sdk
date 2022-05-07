package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.Granularity;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;



public class AdsAnalyticsCreateAsyncRequestAllOf   {
  
  private String startDate;

  private String endDate;

  private Granularity granularity;

  private ConversionAttributionWindowDays clickWindowDays = 30;

  private ConversionAttributionWindowDays engagementWindowDays = 30;

  private ConversionAttributionWindowDays viewWindowDays = 1;

  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";

  private List<ConversionReportAttributionType> attributionTypes = null;


  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   **/
  public AdsAnalyticsCreateAsyncRequestAllOf startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   **/
  public AdsAnalyticsCreateAsyncRequestAllOf endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  /**
   * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
   **/
  public AdsAnalyticsCreateAsyncRequestAllOf granularity(Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly")
  @JsonProperty("granularity")
  @NotNull
  public Granularity getGranularity() {
    return granularity;
  }
  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }


  /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
   **/
  public AdsAnalyticsCreateAsyncRequestAllOf clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }


  /**
   * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
   **/
  public AdsAnalyticsCreateAsyncRequestAllOf engagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @JsonProperty("engagement_window_days")
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }


  /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
   **/
  public AdsAnalyticsCreateAsyncRequestAllOf viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
  @JsonProperty("view_window_days")
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }
  public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }


  /**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   **/
  public AdsAnalyticsCreateAsyncRequestAllOf conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

  
  @ApiModelProperty(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }
  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }


  /**
   * List of types of attribution for the conversion report
   **/
  public AdsAnalyticsCreateAsyncRequestAllOf attributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
    return this;
  }

  
  @ApiModelProperty(value = "List of types of attribution for the conversion report")
  @JsonProperty("attribution_types")
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }
  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf addAttributionTypesItem(ConversionReportAttributionType attributionTypesItem) {
    if (this.attributionTypes == null) {
      this.attributionTypes = new ArrayList<ConversionReportAttributionType>();
    }
    this.attributionTypes.add(attributionTypesItem);
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
    AdsAnalyticsCreateAsyncRequestAllOf adsAnalyticsCreateAsyncRequestAllOf = (AdsAnalyticsCreateAsyncRequestAllOf) o;
    return Objects.equals(startDate, adsAnalyticsCreateAsyncRequestAllOf.startDate) &&
        Objects.equals(endDate, adsAnalyticsCreateAsyncRequestAllOf.endDate) &&
        Objects.equals(granularity, adsAnalyticsCreateAsyncRequestAllOf.granularity) &&
        Objects.equals(clickWindowDays, adsAnalyticsCreateAsyncRequestAllOf.clickWindowDays) &&
        Objects.equals(engagementWindowDays, adsAnalyticsCreateAsyncRequestAllOf.engagementWindowDays) &&
        Objects.equals(viewWindowDays, adsAnalyticsCreateAsyncRequestAllOf.viewWindowDays) &&
        Objects.equals(conversionReportTime, adsAnalyticsCreateAsyncRequestAllOf.conversionReportTime) &&
        Objects.equals(attributionTypes, adsAnalyticsCreateAsyncRequestAllOf.attributionTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

