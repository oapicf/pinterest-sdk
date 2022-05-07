package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.ConversionAttributionWindowDays;
import org.openapitools.server.api.model.ConversionReportAttributionType;
import org.openapitools.server.api.model.ConversionReportTimeType;
import org.openapitools.server.api.model.Granularity;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsAnalyticsCreateAsyncRequestAllOf   {
  
  private String startDate;
  private String endDate;
  private Granularity granularity;
  private ConversionAttributionWindowDays clickWindowDays = 30;
  private ConversionAttributionWindowDays engagementWindowDays = 30;
  private ConversionAttributionWindowDays viewWindowDays = 1;
  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";
  private List<ConversionReportAttributionType> attributionTypes = new ArrayList<>();

  public AdsAnalyticsCreateAsyncRequestAllOf () {

  }

  public AdsAnalyticsCreateAsyncRequestAllOf (String startDate, String endDate, Granularity granularity, ConversionAttributionWindowDays clickWindowDays, ConversionAttributionWindowDays engagementWindowDays, ConversionAttributionWindowDays viewWindowDays, ConversionReportTimeType conversionReportTime, List<ConversionReportAttributionType> attributionTypes) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.granularity = granularity;
    this.clickWindowDays = clickWindowDays;
    this.engagementWindowDays = engagementWindowDays;
    this.viewWindowDays = viewWindowDays;
    this.conversionReportTime = conversionReportTime;
    this.attributionTypes = attributionTypes;
  }

    
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

    
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("granularity")
  public Granularity getGranularity() {
    return granularity;
  }
  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

    
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

    
  @JsonProperty("engagement_window_days")
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

    
  @JsonProperty("view_window_days")
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }
  public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

    
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }
  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

    
  @JsonProperty("attribution_types")
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }
  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
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
