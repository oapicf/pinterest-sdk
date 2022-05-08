package apimodels;

import apimodels.ConversionAttributionWindowDays;
import apimodels.ConversionReportAttributionType;
import apimodels.ConversionReportTimeType;
import apimodels.Granularity;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * AdsAnalyticsCreateAsyncRequestAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2022-05-08T00:31:58.024547Z[Etc/UTC]")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdsAnalyticsCreateAsyncRequestAllOf   {
  @JsonProperty("start_date")
  @NotNull
@Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")

  private String startDate;

  @JsonProperty("end_date")
  @NotNull
@Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")

  private String endDate;

  @JsonProperty("granularity")
  @NotNull
@Valid

  private Granularity granularity;

  @JsonProperty("click_window_days")
  @Valid

  private ConversionAttributionWindowDays clickWindowDays = 30;

  @JsonProperty("engagement_window_days")
  @Valid

  private ConversionAttributionWindowDays engagementWindowDays = 30;

  @JsonProperty("view_window_days")
  @Valid

  private ConversionAttributionWindowDays viewWindowDays = 1;

  @JsonProperty("conversion_report_time")
  @Valid

  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";

  @JsonProperty("attribution_types")
  @Valid

  private List<ConversionReportAttributionType> attributionTypes = null;

  public AdsAnalyticsCreateAsyncRequestAllOf startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   * @return startDate
  **/
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   * @return endDate
  **/
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf granularity(Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

   /**
   * TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
   * @return granularity
  **/
  public Granularity getGranularity() {
    return granularity;
  }

  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

   /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @return clickWindowDays
  **/
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf engagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

   /**
   * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @return engagementWindowDays
  **/
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

   /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
   * @return viewWindowDays
  **/
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

   /**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   * @return conversionReportTime
  **/
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf attributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequestAllOf addAttributionTypesItem(ConversionReportAttributionType attributionTypesItem) {
    if (attributionTypes == null) {
      attributionTypes = new ArrayList<>();
    }
    attributionTypes.add(attributionTypesItem);
    return this;
  }

   /**
   * List of types of attribution for the conversion report
   * @return attributionTypes
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

