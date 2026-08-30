package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AdAdsAnalyticsAsyncTargetingTypes;
import com.prokarma.pkmst.model.AdGroupSummaryStatus;
import com.prokarma.pkmst.model.AdsAnalyticsMetricsFilter;
import com.prokarma.pkmst.model.CampaignObjectiveType;
import com.prokarma.pkmst.model.CampaignSummaryStatus;
import com.prokarma.pkmst.model.ConversionAttributionWindowDays;
import com.prokarma.pkmst.model.ConversionReportAttributionType;
import com.prokarma.pkmst.model.ConversionReportTimeType;
import com.prokarma.pkmst.model.CustomConversionEventMetrics;
import com.prokarma.pkmst.model.DataOutputFormat;
import com.prokarma.pkmst.model.Granularity;
import com.prokarma.pkmst.model.MetricsReportingLevel;
import com.prokarma.pkmst.model.PinPromotionSummaryStatus;
import com.prokarma.pkmst.model.PrimarySort;
import com.prokarma.pkmst.model.ProductGroupSummaryStatus;
import com.prokarma.pkmst.model.ReportingColumnAsync;
import com.prokarma.pkmst.model.ReportingTimeZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AdsAnalyticsCreateAsyncRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdsAnalyticsCreateAsyncRequest   {
  @JsonProperty("ad_group_ids")
  
  private List<String> adGroupIds = null;

  @JsonProperty("ad_group_statuses")
  
  private List<AdGroupSummaryStatus> adGroupStatuses = null;

  @JsonProperty("ad_ids")
  
  private List<String> adIds = null;

  @JsonProperty("ad_statuses")
  
  private List<PinPromotionSummaryStatus> adStatuses = null;

  @JsonProperty("attribution_types")
  
  private List<ConversionReportAttributionType> attributionTypes = null;

  @JsonProperty("campaign_brand_label")
  private String campaignBrandLabel;

  @JsonProperty("campaign_custom_label")
  private String campaignCustomLabel;

  @JsonProperty("campaign_ids")
  
  private List<String> campaignIds = null;

  @JsonProperty("campaign_objective_types")
  
  private List<CampaignObjectiveType> campaignObjectiveTypes = null;

  @JsonProperty("campaign_statuses")
  
  private List<CampaignSummaryStatus> campaignStatuses = null;

  @JsonProperty("click_window_days")
  private ConversionAttributionWindowDays clickWindowDays;

  @JsonProperty("columns")
  
  private List<ReportingColumnAsync> columns = null;

  @JsonProperty("combine_targeting_types")
  private Boolean combineTargetingTypes = false;

  @JsonProperty("conversion_report_time")
  private ConversionReportTimeType conversionReportTime;

  @JsonProperty("custom_conversion_event_metrics")
  
  private List<CustomConversionEventMetrics> customConversionEventMetrics = null;

  @JsonProperty("end_date")
  private String endDate;

  @JsonProperty("end_hour")
  private Integer endHour;

  @JsonProperty("engagement_window_days")
  private ConversionAttributionWindowDays engagementWindowDays;

  @JsonProperty("granularity")
  private Granularity granularity;

  @JsonProperty("level")
  private MetricsReportingLevel level;

  @JsonProperty("metrics_filters")
  
  private List<AdsAnalyticsMetricsFilter> metricsFilters = null;

  @JsonProperty("primary_sort")
  private PrimarySort primarySort;

  @JsonProperty("product_group_ids")
  
  private List<String> productGroupIds = null;

  @JsonProperty("product_group_statuses")
  
  private List<ProductGroupSummaryStatus> productGroupStatuses = null;

  @JsonProperty("product_item_ids")
  
  private List<String> productItemIds = null;

  @JsonProperty("report_format")
  private DataOutputFormat reportFormat;

  @JsonProperty("reporting_timezone")
  private ReportingTimeZone reportingTimezone;

  @JsonProperty("start_date")
  private String startDate;

  @JsonProperty("start_hour")
  private Integer startHour;

  @JsonProperty("targeting_types")
  
  private List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes = null;

  @JsonProperty("view_window_days")
  private ConversionAttributionWindowDays viewWindowDays;

  public AdsAnalyticsCreateAsyncRequest adGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addAdGroupIdsItem(String adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<>();
    }
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

  /**
   * List of ad group ids
   * @return adGroupIds
   */
  @ApiModelProperty(value = "List of ad group ids")
  public List<String> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdsAnalyticsCreateAsyncRequest adGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addAdGroupStatusesItem(AdGroupSummaryStatus adGroupStatusesItem) {
    if (this.adGroupStatuses == null) {
      this.adGroupStatuses = new ArrayList<>();
    }
    this.adGroupStatuses.add(adGroupStatusesItem);
    return this;
  }

  /**
   * List of values for filtering
   * @return adGroupStatuses
   */
  @ApiModelProperty(value = "List of values for filtering")
  public List<AdGroupSummaryStatus> getAdGroupStatuses() {
    return adGroupStatuses;
  }

  public void setAdGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest adIds(List<String> adIds) {
    this.adIds = adIds;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addAdIdsItem(String adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

  /**
   * List of ad ids. This parameter is not supported for Product Item level reports.
   * @return adIds
   */
  @ApiModelProperty(value = "List of ad ids. This parameter is not supported for Product Item level reports.")
  public List<String> getAdIds() {
    return adIds;
  }

  public void setAdIds(List<String> adIds) {
    this.adIds = adIds;
  }

  public AdsAnalyticsCreateAsyncRequest adStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addAdStatusesItem(PinPromotionSummaryStatus adStatusesItem) {
    if (this.adStatuses == null) {
      this.adStatuses = new ArrayList<>();
    }
    this.adStatuses.add(adStatusesItem);
    return this;
  }

  /**
   * List of values for filtering. This parameter is not supported for Product Item level reports.
   * @return adStatuses
   */
  @ApiModelProperty(value = "List of values for filtering. This parameter is not supported for Product Item level reports.")
  public List<PinPromotionSummaryStatus> getAdStatuses() {
    return adStatuses;
  }

  public void setAdStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest attributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addAttributionTypesItem(ConversionReportAttributionType attributionTypesItem) {
    if (this.attributionTypes == null) {
      this.attributionTypes = new ArrayList<>();
    }
    this.attributionTypes.add(attributionTypesItem);
    return this;
  }

  /**
   * List of attribution types for the conversion report.
   * @return attributionTypes
   */
  @ApiModelProperty(value = "List of attribution types for the conversion report.")
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }

  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
  }

  public AdsAnalyticsCreateAsyncRequest campaignBrandLabel(String campaignBrandLabel) {
    this.campaignBrandLabel = campaignBrandLabel;
    return this;
  }

  /**
   * Campaign brand label for filtering.
   * @return campaignBrandLabel
   */
  @ApiModelProperty(value = "Campaign brand label for filtering.")
  public String getCampaignBrandLabel() {
    return campaignBrandLabel;
  }

  public void setCampaignBrandLabel(String campaignBrandLabel) {
    this.campaignBrandLabel = campaignBrandLabel;
  }

  public AdsAnalyticsCreateAsyncRequest campaignCustomLabel(String campaignCustomLabel) {
    this.campaignCustomLabel = campaignCustomLabel;
    return this;
  }

  /**
   * Campaign custom label for filtering.
   * @return campaignCustomLabel
   */
  @ApiModelProperty(value = "Campaign custom label for filtering.")
  public String getCampaignCustomLabel() {
    return campaignCustomLabel;
  }

  public void setCampaignCustomLabel(String campaignCustomLabel) {
    this.campaignCustomLabel = campaignCustomLabel;
  }

  public AdsAnalyticsCreateAsyncRequest campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  /**
   * List of campaign ids
   * @return campaignIds
   */
  @ApiModelProperty(value = "List of campaign ids")
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AdsAnalyticsCreateAsyncRequest campaignObjectiveTypes(List<CampaignObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addCampaignObjectiveTypesItem(CampaignObjectiveType campaignObjectiveTypesItem) {
    if (this.campaignObjectiveTypes == null) {
      this.campaignObjectiveTypes = new ArrayList<>();
    }
    this.campaignObjectiveTypes.add(campaignObjectiveTypesItem);
    return this;
  }

  /**
   * List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
   * @return campaignObjectiveTypes
   */
  @ApiModelProperty(value = "List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.")
  public List<CampaignObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  public void setCampaignObjectiveTypes(List<CampaignObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  public AdsAnalyticsCreateAsyncRequest campaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addCampaignStatusesItem(CampaignSummaryStatus campaignStatusesItem) {
    if (this.campaignStatuses == null) {
      this.campaignStatuses = new ArrayList<>();
    }
    this.campaignStatuses.add(campaignStatusesItem);
    return this;
  }

  /**
   * List of status values for filtering
   * @return campaignStatuses
   */
  @ApiModelProperty(value = "List of status values for filtering")
  public List<CampaignSummaryStatus> getCampaignStatuses() {
    return campaignStatuses;
  }

  public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action.
   * @return clickWindowDays
   */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action.")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public AdsAnalyticsCreateAsyncRequest columns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addColumnsItem(ReportingColumnAsync columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<>();
    }
    this.columns.add(columnsItem);
    return this;
  }

  /**
   * Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
   * @return columns
   */
  @ApiModelProperty(value = "Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.")
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }

  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

  public AdsAnalyticsCreateAsyncRequest combineTargetingTypes(Boolean combineTargetingTypes) {
    this.combineTargetingTypes = combineTargetingTypes;
    return this;
  }

  /**
   * Determines if the targeting types included in the request should be consolidated into a single breakdown.
   * @return combineTargetingTypes
   */
  @ApiModelProperty(value = "Determines if the targeting types included in the request should be consolidated into a single breakdown.")
  public Boolean getCombineTargetingTypes() {
    return combineTargetingTypes;
  }

  public void setCombineTargetingTypes(Boolean combineTargetingTypes) {
    this.combineTargetingTypes = combineTargetingTypes;
  }

  public AdsAnalyticsCreateAsyncRequest conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

  /**
   * Date dimension for conversion metrics.
   * @return conversionReportTime
   */
  @ApiModelProperty(value = "Date dimension for conversion metrics.")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  public AdsAnalyticsCreateAsyncRequest customConversionEventMetrics(List<CustomConversionEventMetrics> customConversionEventMetrics) {
    this.customConversionEventMetrics = customConversionEventMetrics;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addCustomConversionEventMetricsItem(CustomConversionEventMetrics customConversionEventMetricsItem) {
    if (this.customConversionEventMetrics == null) {
      this.customConversionEventMetrics = new ArrayList<>();
    }
    this.customConversionEventMetrics.add(customConversionEventMetricsItem);
    return this;
  }

  /**
   * List of advertiser-defined custom conversion event metrics to include in the report
   * @return customConversionEventMetrics
   */
  @ApiModelProperty(value = "List of advertiser-defined custom conversion event metrics to include in the report")
  public List<CustomConversionEventMetrics> getCustomConversionEventMetrics() {
    return customConversionEventMetrics;
  }

  public void setCustomConversionEventMetrics(List<CustomConversionEventMetrics> customConversionEventMetrics) {
    this.customConversionEventMetrics = customConversionEventMetrics;
  }

  public AdsAnalyticsCreateAsyncRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   * @return endDate
   */
  @ApiModelProperty(required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public AdsAnalyticsCreateAsyncRequest endHour(Integer endHour) {
    this.endHour = endHour;
    return this;
  }

  /**
   * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
   * minimum: 0
   * maximum: 23
   * @return endHour
   */
  @ApiModelProperty(value = "Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.")
  public Integer getEndHour() {
    return endHour;
  }

  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }

  public AdsAnalyticsCreateAsyncRequest engagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for an engagement action.
   * @return engagementWindowDays
   */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for an engagement action.")
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public AdsAnalyticsCreateAsyncRequest granularity(Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

  /**
   *   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
   * @return granularity
   */
  @ApiModelProperty(required = true, value = "  TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.")
  public Granularity getGranularity() {
    return granularity;
  }

  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  public AdsAnalyticsCreateAsyncRequest level(MetricsReportingLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Level of the report
   * @return level
   */
  @ApiModelProperty(value = "Level of the report")
  public MetricsReportingLevel getLevel() {
    return level;
  }

  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

  public AdsAnalyticsCreateAsyncRequest metricsFilters(List<AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addMetricsFiltersItem(AdsAnalyticsMetricsFilter metricsFiltersItem) {
    if (this.metricsFilters == null) {
      this.metricsFilters = new ArrayList<>();
    }
    this.metricsFilters.add(metricsFiltersItem);
    return this;
  }

  /**
   * List of metrics filters
   * @return metricsFilters
   */
  @ApiModelProperty(value = "List of metrics filters")
  public List<AdsAnalyticsMetricsFilter> getMetricsFilters() {
    return metricsFilters;
  }

  public void setMetricsFilters(List<AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  public AdsAnalyticsCreateAsyncRequest primarySort(PrimarySort primarySort) {
    this.primarySort = primarySort;
    return this;
  }

  /**
   * Get primarySort
   * @return primarySort
   */
  @ApiModelProperty(value = "")
  public PrimarySort getPrimarySort() {
    return primarySort;
  }

  public void setPrimarySort(PrimarySort primarySort) {
    this.primarySort = primarySort;
  }

  public AdsAnalyticsCreateAsyncRequest productGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addProductGroupIdsItem(String productGroupIdsItem) {
    if (this.productGroupIds == null) {
      this.productGroupIds = new ArrayList<>();
    }
    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

  /**
   * List of product group ids
   * @return productGroupIds
   */
  @ApiModelProperty(value = "List of product group ids")
  public List<String> getProductGroupIds() {
    return productGroupIds;
  }

  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdsAnalyticsCreateAsyncRequest productGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addProductGroupStatusesItem(ProductGroupSummaryStatus productGroupStatusesItem) {
    if (this.productGroupStatuses == null) {
      this.productGroupStatuses = new ArrayList<>();
    }
    this.productGroupStatuses.add(productGroupStatusesItem);
    return this;
  }

  /**
   * List of values for filtering
   * @return productGroupStatuses
   */
  @ApiModelProperty(value = "List of values for filtering")
  public List<ProductGroupSummaryStatus> getProductGroupStatuses() {
    return productGroupStatuses;
  }

  public void setProductGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest productItemIds(List<String> productItemIds) {
    this.productItemIds = productItemIds;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addProductItemIdsItem(String productItemIdsItem) {
    if (this.productItemIds == null) {
      this.productItemIds = new ArrayList<>();
    }
    this.productItemIds.add(productItemIdsItem);
    return this;
  }

  /**
   * List of product item ids
   * @return productItemIds
   */
  @ApiModelProperty(value = "List of product item ids")
  public List<String> getProductItemIds() {
    return productItemIds;
  }

  public void setProductItemIds(List<String> productItemIds) {
    this.productItemIds = productItemIds;
  }

  public AdsAnalyticsCreateAsyncRequest reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

  /**
   * Get reportFormat
   * @return reportFormat
   */
  @ApiModelProperty(value = "")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  public AdsAnalyticsCreateAsyncRequest reportingTimezone(ReportingTimeZone reportingTimezone) {
    this.reportingTimezone = reportingTimezone;
    return this;
  }

  /**
   * Specify the timezone to be applied for the reporting.
   * @return reportingTimezone
   */
  @ApiModelProperty(value = "Specify the timezone to be applied for the reporting.")
  public ReportingTimeZone getReportingTimezone() {
    return reportingTimezone;
  }

  public void setReportingTimezone(ReportingTimeZone reportingTimezone) {
    this.reportingTimezone = reportingTimezone;
  }

  public AdsAnalyticsCreateAsyncRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   * @return startDate
   */
  @ApiModelProperty(required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public AdsAnalyticsCreateAsyncRequest startHour(Integer startHour) {
    this.startHour = startHour;
    return this;
  }

  /**
   * Which hour of the start date to begin the report. Only allowed for hourly reports.
   * minimum: 0
   * maximum: 23
   * @return startHour
   */
  @ApiModelProperty(value = "Which hour of the start date to begin the report. Only allowed for hourly reports.")
  public Integer getStartHour() {
    return startHour;
  }

  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }

  public AdsAnalyticsCreateAsyncRequest targetingTypes(List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addTargetingTypesItem(AdAdsAnalyticsAsyncTargetingTypes targetingTypesItem) {
    if (this.targetingTypes == null) {
      this.targetingTypes = new ArrayList<>();
    }
    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

  /**
   * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
   * @return targetingTypes
   */
  @ApiModelProperty(value = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`.")
  public List<AdAdsAnalyticsAsyncTargetingTypes> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public AdsAnalyticsCreateAsyncRequest viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action.
   * @return viewWindowDays
   */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action.")
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

