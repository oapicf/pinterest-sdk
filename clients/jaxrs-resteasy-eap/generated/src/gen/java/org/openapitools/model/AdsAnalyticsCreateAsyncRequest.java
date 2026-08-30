package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdsAnalyticsCreateAsyncRequest   {
  
  private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();
  private List<AdGroupSummaryStatus> adGroupStatuses = new ArrayList<>();
  private List<@Pattern(regexp = "^\\d+$")String> adIds = new ArrayList<>();
  private List<PinPromotionSummaryStatus> adStatuses = new ArrayList<>();
  private List<ConversionReportAttributionType> attributionTypes = new ArrayList<>();
  private String campaignBrandLabel;
  private String campaignCustomLabel;
  private List<@Pattern(regexp = "^\\d+$")String> campaignIds = new ArrayList<>();
  private List<CampaignObjectiveType> campaignObjectiveTypes = new ArrayList<>();
  private List<CampaignSummaryStatus> campaignStatuses = new ArrayList<>();
  private ConversionAttributionWindowDays clickWindowDays;
  private List<ReportingColumnAsync> columns = new ArrayList<>();
  private Boolean combineTargetingTypes = false;
  private ConversionReportTimeType conversionReportTime;
  private List<@Valid CustomConversionEventMetrics> customConversionEventMetrics = new ArrayList<>();
  private String endDate;
  private Integer endHour;
  private ConversionAttributionWindowDays engagementWindowDays;
  private Granularity granularity;
  private MetricsReportingLevel level;
  private List<@Valid AdsAnalyticsMetricsFilter> metricsFilters = new ArrayList<>();
  private PrimarySort primarySort;
  private List<@Pattern(regexp = "^\\d+$")String> productGroupIds = new ArrayList<>();
  private List<ProductGroupSummaryStatus> productGroupStatuses = new ArrayList<>();
  private List<@Pattern(regexp = "^\\d+$")String> productItemIds = new ArrayList<>();
  private DataOutputFormat reportFormat;
  private ReportingTimeZone reportingTimezone;
  private String startDate;
  private Integer startHour;
  private List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes = new ArrayList<>();
  private ConversionAttributionWindowDays viewWindowDays;

  /**
   * List of ad group ids
   **/
  
  @ApiModelProperty(value = "List of ad group ids")
  @JsonProperty("ad_group_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }
  public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   * List of values for filtering
   **/
  
  @ApiModelProperty(value = "List of values for filtering")
  @JsonProperty("ad_group_statuses")
 @Size(min=1,max=6)  public List<AdGroupSummaryStatus> getAdGroupStatuses() {
    return adGroupStatuses;
  }
  public void setAdGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
  }

  /**
   * List of ad ids. This parameter is not supported for Product Item level reports.
   **/
  
  @ApiModelProperty(value = "List of ad ids. This parameter is not supported for Product Item level reports.")
  @JsonProperty("ad_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getAdIds() {
    return adIds;
  }
  public void setAdIds(List<@Pattern(regexp = "^\\d+$")String> adIds) {
    this.adIds = adIds;
  }

  /**
   * List of values for filtering. This parameter is not supported for Product Item level reports.
   **/
  
  @ApiModelProperty(value = "List of values for filtering. This parameter is not supported for Product Item level reports.")
  @JsonProperty("ad_statuses")
 @Size(min=1,max=6)  public List<PinPromotionSummaryStatus> getAdStatuses() {
    return adStatuses;
  }
  public void setAdStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
  }

  /**
   * List of attribution types for the conversion report.
   **/
  
  @ApiModelProperty(value = "List of attribution types for the conversion report.")
  @JsonProperty("attribution_types")
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }
  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
  }

  /**
   * Campaign brand label for filtering.
   **/
  
  @ApiModelProperty(value = "Campaign brand label for filtering.")
  @JsonProperty("campaign_brand_label")
  public String getCampaignBrandLabel() {
    return campaignBrandLabel;
  }
  public void setCampaignBrandLabel(String campaignBrandLabel) {
    this.campaignBrandLabel = campaignBrandLabel;
  }

  /**
   * Campaign custom label for filtering.
   **/
  
  @ApiModelProperty(value = "Campaign custom label for filtering.")
  @JsonProperty("campaign_custom_label")
  public String getCampaignCustomLabel() {
    return campaignCustomLabel;
  }
  public void setCampaignCustomLabel(String campaignCustomLabel) {
    this.campaignCustomLabel = campaignCustomLabel;
  }

  /**
   * List of campaign ids
   **/
  
  @ApiModelProperty(value = "List of campaign ids")
  @JsonProperty("campaign_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA.
   **/
  
  @ApiModelProperty(value = "List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.")
  @JsonProperty("campaign_objective_types")
 @Size(min=1,max=7)  public List<CampaignObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }
  public void setCampaignObjectiveTypes(List<CampaignObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  /**
   * List of status values for filtering
   **/
  
  @ApiModelProperty(value = "List of status values for filtering")
  @JsonProperty("campaign_statuses")
 @Size(min=1,max=6)  public List<CampaignSummaryStatus> getCampaignStatuses() {
    return campaignStatuses;
  }
  public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action.
   **/
  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action.")
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   * Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
   **/
  
  @ApiModelProperty(value = "Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.")
  @JsonProperty("columns")
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }
  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

  /**
   * Determines if the targeting types included in the request should be consolidated into a single breakdown.
   **/
  
  @ApiModelProperty(value = "Determines if the targeting types included in the request should be consolidated into a single breakdown.")
  @JsonProperty("combine_targeting_types")
  public Boolean getCombineTargetingTypes() {
    return combineTargetingTypes;
  }
  public void setCombineTargetingTypes(Boolean combineTargetingTypes) {
    this.combineTargetingTypes = combineTargetingTypes;
  }

  /**
   * Date dimension for conversion metrics.
   **/
  
  @ApiModelProperty(value = "Date dimension for conversion metrics.")
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }
  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  /**
   * List of advertiser-defined custom conversion event metrics to include in the report
   **/
  
  @ApiModelProperty(value = "List of advertiser-defined custom conversion event metrics to include in the report")
  @JsonProperty("custom_conversion_event_metrics")
  public List<@Valid CustomConversionEventMetrics> getCustomConversionEventMetrics() {
    return customConversionEventMetrics;
  }
  public void setCustomConversionEventMetrics(List<@Valid CustomConversionEventMetrics> customConversionEventMetrics) {
    this.customConversionEventMetrics = customConversionEventMetrics;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   **/
  
  @ApiModelProperty(required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
   * minimum: 0
   * maximum: 23
   **/
  
  @ApiModelProperty(value = "Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.")
  @JsonProperty("end_hour")
 @Min(0) @Max(23)  public Integer getEndHour() {
    return endHour;
  }
  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }

  /**
   * Number of days to use as the conversion attribution window for an engagement action.
   **/
  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for an engagement action.")
  @JsonProperty("engagement_window_days")
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  /**
   *   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
   **/
  
  @ApiModelProperty(required = true, value = "  TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.")
  @JsonProperty("granularity")
  @NotNull
  public Granularity getGranularity() {
    return granularity;
  }
  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Level of the report
   **/
  
  @ApiModelProperty(value = "Level of the report")
  @JsonProperty("level")
  public MetricsReportingLevel getLevel() {
    return level;
  }
  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

  /**
   * List of metrics filters
   **/
  
  @ApiModelProperty(value = "List of metrics filters")
  @JsonProperty("metrics_filters")
 @Size(min=1)  public List<@Valid AdsAnalyticsMetricsFilter> getMetricsFilters() {
    return metricsFilters;
  }
  public void setMetricsFilters(List<@Valid AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("primary_sort")
  public PrimarySort getPrimarySort() {
    return primarySort;
  }
  public void setPrimarySort(PrimarySort primarySort) {
    this.primarySort = primarySort;
  }

  /**
   * List of product group ids
   **/
  
  @ApiModelProperty(value = "List of product group ids")
  @JsonProperty("product_group_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }
  public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  /**
   * List of values for filtering
   **/
  
  @ApiModelProperty(value = "List of values for filtering")
  @JsonProperty("product_group_statuses")
 @Size(min=1,max=6)  public List<ProductGroupSummaryStatus> getProductGroupStatuses() {
    return productGroupStatuses;
  }
  public void setProductGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
  }

  /**
   * List of product item ids
   **/
  
  @ApiModelProperty(value = "List of product item ids")
  @JsonProperty("product_item_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getProductItemIds() {
    return productItemIds;
  }
  public void setProductItemIds(List<@Pattern(regexp = "^\\d+$")String> productItemIds) {
    this.productItemIds = productItemIds;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }
  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  /**
   * Specify the timezone to be applied for the reporting.
   **/
  
  @ApiModelProperty(value = "Specify the timezone to be applied for the reporting.")
  @JsonProperty("reporting_timezone")
  public ReportingTimeZone getReportingTimezone() {
    return reportingTimezone;
  }
  public void setReportingTimezone(ReportingTimeZone reportingTimezone) {
    this.reportingTimezone = reportingTimezone;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   **/
  
  @ApiModelProperty(required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Which hour of the start date to begin the report. Only allowed for hourly reports.
   * minimum: 0
   * maximum: 23
   **/
  
  @ApiModelProperty(value = "Which hour of the start date to begin the report. Only allowed for hourly reports.")
  @JsonProperty("start_hour")
 @Min(0) @Max(23)  public Integer getStartHour() {
    return startHour;
  }
  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }

  /**
   * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.
   **/
  
  @ApiModelProperty(value = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`.")
  @JsonProperty("targeting_types")
 @Size(min=1,max=5)  public List<AdAdsAnalyticsAsyncTargetingTypes> getTargetingTypes() {
    return targetingTypes;
  }
  public void setTargetingTypes(List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action.
   **/
  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action.")
  @JsonProperty("view_window_days")
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

