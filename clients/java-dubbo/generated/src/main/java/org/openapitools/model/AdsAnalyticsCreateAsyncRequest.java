package org.openapitools.model;

import org.openapitools.model.AdAdsAnalyticsAsyncTargetingTypes;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.AdsAnalyticsMetricsFilter;
import org.openapitools.model.CampaignObjectiveType;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.CustomConversionEventMetrics;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.Granularity;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.PrimarySort;
import org.openapitools.model.ProductGroupSummaryStatus;
import org.openapitools.model.ReportingColumnAsync;
import org.openapitools.model.ReportingTimeZone;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AdsAnalyticsCreateAsyncRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of ad group ids
   */
  @JsonProperty("ad_group_ids")
  private List<String> adGroupIds = new ArrayList<>();

  /**
   * List of values for filtering
   */
  @JsonProperty("ad_group_statuses")
  private List<AdGroupSummaryStatus> adGroupStatuses = new ArrayList<>();

  /**
   * List of ad ids. This parameter is not supported for Product Item level reports.
   */
  @JsonProperty("ad_ids")
  private List<String> adIds = new ArrayList<>();

  /**
   * List of values for filtering. This parameter is not supported for Product Item level reports.
   */
  @JsonProperty("ad_statuses")
  private List<PinPromotionSummaryStatus> adStatuses = new ArrayList<>();

  /**
   * List of attribution types for the conversion report.
   */
  @JsonProperty("attribution_types")
  private List<ConversionReportAttributionType> attributionTypes = new ArrayList<>();

  /**
   * Campaign brand label for filtering.
   */
  @JsonProperty("campaign_brand_label")
  private String campaignBrandLabel;

  /**
   * Campaign custom label for filtering.
   */
  @JsonProperty("campaign_custom_label")
  private String campaignCustomLabel;

  /**
   * List of campaign ids
   */
  @JsonProperty("campaign_ids")
  private List<String> campaignIds = new ArrayList<>();

  /**
   * List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA.
   */
  @JsonProperty("campaign_objective_types")
  private List<CampaignObjectiveType> campaignObjectiveTypes = new ArrayList<>();

  /**
   * List of status values for filtering
   */
  @JsonProperty("campaign_statuses")
  private List<CampaignSummaryStatus> campaignStatuses = new ArrayList<>();

  /**
   * Number of days to use as the conversion attribution window for a pin click action.
   */
  @JsonProperty("click_window_days")
  private ConversionAttributionWindowDays clickWindowDays;

  /**
   * Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
   */
  @JsonProperty("columns")
  private List<ReportingColumnAsync> columns = new ArrayList<>();

  /**
   * Determines if the targeting types included in the request should be consolidated into a single breakdown.
   */
  @JsonProperty("combine_targeting_types")
  private Boolean combineTargetingTypes = false;

  /**
   * Date dimension for conversion metrics.
   */
  @JsonProperty("conversion_report_time")
  private ConversionReportTimeType conversionReportTime;

  /**
   * List of advertiser-defined custom conversion event metrics to include in the report
   */
  @JsonProperty("custom_conversion_event_metrics")
  private List<CustomConversionEventMetrics> customConversionEventMetrics = new ArrayList<>();

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   */
  @JsonProperty("end_date")
  private String endDate;

  /**
   * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
   */
  @JsonProperty("end_hour")
  private Integer endHour;

  /**
   * Number of days to use as the conversion attribution window for an engagement action.
   */
  @JsonProperty("engagement_window_days")
  private ConversionAttributionWindowDays engagementWindowDays;

  /**
   *   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
   */
  @JsonProperty("granularity")
  private Granularity granularity;

  /**
   * Level of the report
   */
  @JsonProperty("level")
  private MetricsReportingLevel level;

  /**
   * List of metrics filters
   */
  @JsonProperty("metrics_filters")
  private List<AdsAnalyticsMetricsFilter> metricsFilters = new ArrayList<>();

  @JsonProperty("primary_sort")
  private PrimarySort primarySort;

  /**
   * List of product group ids
   */
  @JsonProperty("product_group_ids")
  private List<String> productGroupIds = new ArrayList<>();

  /**
   * List of values for filtering
   */
  @JsonProperty("product_group_statuses")
  private List<ProductGroupSummaryStatus> productGroupStatuses = new ArrayList<>();

  /**
   * List of product item ids
   */
  @JsonProperty("product_item_ids")
  private List<String> productItemIds = new ArrayList<>();

  @JsonProperty("report_format")
  private DataOutputFormat reportFormat;

  /**
   * Specify the timezone to be applied for the reporting.
   */
  @JsonProperty("reporting_timezone")
  private ReportingTimeZone reportingTimezone;

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   */
  @JsonProperty("start_date")
  private String startDate;

  /**
   * Which hour of the start date to begin the report. Only allowed for hourly reports.
   */
  @JsonProperty("start_hour")
  private Integer startHour;

  /**
   * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.
   */
  @JsonProperty("targeting_types")
  private List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes = new ArrayList<>();

  /**
   * Number of days to use as the conversion attribution window for a view action.
   */
  @JsonProperty("view_window_days")
  private ConversionAttributionWindowDays viewWindowDays;

  /**
   * List of ad group ids
   * @return adGroupIds
   */
  public List<String> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   * List of values for filtering
   * @return adGroupStatuses
   */
  public List<AdGroupSummaryStatus> getAdGroupStatuses() {
    return adGroupStatuses;
  }

  public void setAdGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
  }

  /**
   * List of ad ids. This parameter is not supported for Product Item level reports.
   * @return adIds
   */
  public List<String> getAdIds() {
    return adIds;
  }

  public void setAdIds(List<String> adIds) {
    this.adIds = adIds;
  }

  /**
   * List of values for filtering. This parameter is not supported for Product Item level reports.
   * @return adStatuses
   */
  public List<PinPromotionSummaryStatus> getAdStatuses() {
    return adStatuses;
  }

  public void setAdStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
  }

  /**
   * List of attribution types for the conversion report.
   * @return attributionTypes
   */
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }

  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
  }

  /**
   * Campaign brand label for filtering.
   * @return campaignBrandLabel
   */
  public String getCampaignBrandLabel() {
    return campaignBrandLabel;
  }

  public void setCampaignBrandLabel(String campaignBrandLabel) {
    this.campaignBrandLabel = campaignBrandLabel;
  }

  /**
   * Campaign custom label for filtering.
   * @return campaignCustomLabel
   */
  public String getCampaignCustomLabel() {
    return campaignCustomLabel;
  }

  public void setCampaignCustomLabel(String campaignCustomLabel) {
    this.campaignCustomLabel = campaignCustomLabel;
  }

  /**
   * List of campaign ids
   * @return campaignIds
   */
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA.
   * @return campaignObjectiveTypes
   */
  public List<CampaignObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  public void setCampaignObjectiveTypes(List<CampaignObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  /**
   * List of status values for filtering
   * @return campaignStatuses
   */
  public List<CampaignSummaryStatus> getCampaignStatuses() {
    return campaignStatuses;
  }

  public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action.
   * @return clickWindowDays
   */
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   * Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
   * @return columns
   */
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }

  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

  /**
   * Determines if the targeting types included in the request should be consolidated into a single breakdown.
   * @return combineTargetingTypes
   */
  public Boolean getCombineTargetingTypes() {
    return combineTargetingTypes;
  }

  public void setCombineTargetingTypes(Boolean combineTargetingTypes) {
    this.combineTargetingTypes = combineTargetingTypes;
  }

  /**
   * Date dimension for conversion metrics.
   * @return conversionReportTime
   */
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  /**
   * List of advertiser-defined custom conversion event metrics to include in the report
   * @return customConversionEventMetrics
   */
  public List<CustomConversionEventMetrics> getCustomConversionEventMetrics() {
    return customConversionEventMetrics;
  }

  public void setCustomConversionEventMetrics(List<CustomConversionEventMetrics> customConversionEventMetrics) {
    this.customConversionEventMetrics = customConversionEventMetrics;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   * @return endDate
   */
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
   * @return endHour
   */
  public Integer getEndHour() {
    return endHour;
  }

  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }

  /**
   * Number of days to use as the conversion attribution window for an engagement action.
   * @return engagementWindowDays
   */
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  /**
   *   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
   * @return granularity
   */
  public Granularity getGranularity() {
    return granularity;
  }

  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   * @return level
   */
  public MetricsReportingLevel getLevel() {
    return level;
  }

  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

  /**
   * List of metrics filters
   * @return metricsFilters
   */
  public List<AdsAnalyticsMetricsFilter> getMetricsFilters() {
    return metricsFilters;
  }

  public void setMetricsFilters(List<AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  /**
   * 
   * @return primarySort
   */
  public PrimarySort getPrimarySort() {
    return primarySort;
  }

  public void setPrimarySort(PrimarySort primarySort) {
    this.primarySort = primarySort;
  }

  /**
   * List of product group ids
   * @return productGroupIds
   */
  public List<String> getProductGroupIds() {
    return productGroupIds;
  }

  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  /**
   * List of values for filtering
   * @return productGroupStatuses
   */
  public List<ProductGroupSummaryStatus> getProductGroupStatuses() {
    return productGroupStatuses;
  }

  public void setProductGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
  }

  /**
   * List of product item ids
   * @return productItemIds
   */
  public List<String> getProductItemIds() {
    return productItemIds;
  }

  public void setProductItemIds(List<String> productItemIds) {
    this.productItemIds = productItemIds;
  }

  /**
   * 
   * @return reportFormat
   */
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  /**
   * Specify the timezone to be applied for the reporting.
   * @return reportingTimezone
   */
  public ReportingTimeZone getReportingTimezone() {
    return reportingTimezone;
  }

  public void setReportingTimezone(ReportingTimeZone reportingTimezone) {
    this.reportingTimezone = reportingTimezone;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   * @return startDate
   */
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Which hour of the start date to begin the report. Only allowed for hourly reports.
   * @return startHour
   */
  public Integer getStartHour() {
    return startHour;
  }

  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }

  /**
   * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.
   * @return targetingTypes
   */
  public List<AdAdsAnalyticsAsyncTargetingTypes> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action.
   * @return viewWindowDays
   */
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = (AdsAnalyticsCreateAsyncRequest) o;
    return Objects.equals(this.adGroupIds, adsAnalyticsCreateAsyncRequest.adGroupIds) &&
        Objects.equals(this.adGroupStatuses, adsAnalyticsCreateAsyncRequest.adGroupStatuses) &&
        Objects.equals(this.adIds, adsAnalyticsCreateAsyncRequest.adIds) &&
        Objects.equals(this.adStatuses, adsAnalyticsCreateAsyncRequest.adStatuses) &&
        Objects.equals(this.attributionTypes, adsAnalyticsCreateAsyncRequest.attributionTypes) &&
        Objects.equals(this.campaignBrandLabel, adsAnalyticsCreateAsyncRequest.campaignBrandLabel) &&
        Objects.equals(this.campaignCustomLabel, adsAnalyticsCreateAsyncRequest.campaignCustomLabel) &&
        Objects.equals(this.campaignIds, adsAnalyticsCreateAsyncRequest.campaignIds) &&
        Objects.equals(this.campaignObjectiveTypes, adsAnalyticsCreateAsyncRequest.campaignObjectiveTypes) &&
        Objects.equals(this.campaignStatuses, adsAnalyticsCreateAsyncRequest.campaignStatuses) &&
        Objects.equals(this.clickWindowDays, adsAnalyticsCreateAsyncRequest.clickWindowDays) &&
        Objects.equals(this.columns, adsAnalyticsCreateAsyncRequest.columns) &&
        Objects.equals(this.combineTargetingTypes, adsAnalyticsCreateAsyncRequest.combineTargetingTypes) &&
        Objects.equals(this.conversionReportTime, adsAnalyticsCreateAsyncRequest.conversionReportTime) &&
        Objects.equals(this.customConversionEventMetrics, adsAnalyticsCreateAsyncRequest.customConversionEventMetrics) &&
        Objects.equals(this.endDate, adsAnalyticsCreateAsyncRequest.endDate) &&
        Objects.equals(this.endHour, adsAnalyticsCreateAsyncRequest.endHour) &&
        Objects.equals(this.engagementWindowDays, adsAnalyticsCreateAsyncRequest.engagementWindowDays) &&
        Objects.equals(this.granularity, adsAnalyticsCreateAsyncRequest.granularity) &&
        Objects.equals(this.level, adsAnalyticsCreateAsyncRequest.level) &&
        Objects.equals(this.metricsFilters, adsAnalyticsCreateAsyncRequest.metricsFilters) &&
        Objects.equals(this.primarySort, adsAnalyticsCreateAsyncRequest.primarySort) &&
        Objects.equals(this.productGroupIds, adsAnalyticsCreateAsyncRequest.productGroupIds) &&
        Objects.equals(this.productGroupStatuses, adsAnalyticsCreateAsyncRequest.productGroupStatuses) &&
        Objects.equals(this.productItemIds, adsAnalyticsCreateAsyncRequest.productItemIds) &&
        Objects.equals(this.reportFormat, adsAnalyticsCreateAsyncRequest.reportFormat) &&
        Objects.equals(this.reportingTimezone, adsAnalyticsCreateAsyncRequest.reportingTimezone) &&
        Objects.equals(this.startDate, adsAnalyticsCreateAsyncRequest.startDate) &&
        Objects.equals(this.startHour, adsAnalyticsCreateAsyncRequest.startHour) &&
        Objects.equals(this.targetingTypes, adsAnalyticsCreateAsyncRequest.targetingTypes) &&
        Objects.equals(this.viewWindowDays, adsAnalyticsCreateAsyncRequest.viewWindowDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroupIds, adGroupStatuses, adIds, adStatuses, attributionTypes, campaignBrandLabel, campaignCustomLabel, campaignIds, campaignObjectiveTypes, campaignStatuses, clickWindowDays, columns, combineTargetingTypes, conversionReportTime, customConversionEventMetrics, endDate, endHour, engagementWindowDays, granularity, level, metricsFilters, primarySort, productGroupIds, productGroupStatuses, productItemIds, reportFormat, reportingTimezone, startDate, startHour, targetingTypes, viewWindowDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsCreateAsyncRequest {\n");
    
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    adGroupStatuses: ").append(toIndentedString(adGroupStatuses)).append("\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    adStatuses: ").append(toIndentedString(adStatuses)).append("\n");
    sb.append("    attributionTypes: ").append(toIndentedString(attributionTypes)).append("\n");
    sb.append("    campaignBrandLabel: ").append(toIndentedString(campaignBrandLabel)).append("\n");
    sb.append("    campaignCustomLabel: ").append(toIndentedString(campaignCustomLabel)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignObjectiveTypes: ").append(toIndentedString(campaignObjectiveTypes)).append("\n");
    sb.append("    campaignStatuses: ").append(toIndentedString(campaignStatuses)).append("\n");
    sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    combineTargetingTypes: ").append(toIndentedString(combineTargetingTypes)).append("\n");
    sb.append("    conversionReportTime: ").append(toIndentedString(conversionReportTime)).append("\n");
    sb.append("    customConversionEventMetrics: ").append(toIndentedString(customConversionEventMetrics)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    metricsFilters: ").append(toIndentedString(metricsFilters)).append("\n");
    sb.append("    primarySort: ").append(toIndentedString(primarySort)).append("\n");
    sb.append("    productGroupIds: ").append(toIndentedString(productGroupIds)).append("\n");
    sb.append("    productGroupStatuses: ").append(toIndentedString(productGroupStatuses)).append("\n");
    sb.append("    productItemIds: ").append(toIndentedString(productItemIds)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
    sb.append("    reportingTimezone: ").append(toIndentedString(reportingTimezone)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    targetingTypes: ").append(toIndentedString(targetingTypes)).append("\n");
    sb.append("    viewWindowDays: ").append(toIndentedString(viewWindowDays)).append("\n");
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
