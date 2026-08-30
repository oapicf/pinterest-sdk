package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdsAnalyticsCreateAsyncRequest  {
  
 /**
  * List of ad group ids
  */
  @ApiModelProperty(value = "List of ad group ids")

  private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();

 /**
  * List of values for filtering
  */
  @ApiModelProperty(value = "List of values for filtering")

  @Valid

  private List<AdGroupSummaryStatus> adGroupStatuses = new ArrayList<>();

 /**
  * List of ad ids. This parameter is not supported for Product Item level reports.
  */
  @ApiModelProperty(value = "List of ad ids. This parameter is not supported for Product Item level reports.")

  private List<@Pattern(regexp = "^\\d+$")String> adIds = new ArrayList<>();

 /**
  * List of values for filtering. This parameter is not supported for Product Item level reports.
  */
  @ApiModelProperty(value = "List of values for filtering. This parameter is not supported for Product Item level reports.")

  @Valid

  private List<PinPromotionSummaryStatus> adStatuses = new ArrayList<>();

 /**
  * List of attribution types for the conversion report.
  */
  @ApiModelProperty(value = "List of attribution types for the conversion report.")

  @Valid

  private List<ConversionReportAttributionType> attributionTypes = new ArrayList<>();

 /**
  * Campaign brand label for filtering.
  */
  @ApiModelProperty(value = "Campaign brand label for filtering.")

  private String campaignBrandLabel;

 /**
  * Campaign custom label for filtering.
  */
  @ApiModelProperty(value = "Campaign custom label for filtering.")

  private String campaignCustomLabel;

 /**
  * List of campaign ids
  */
  @ApiModelProperty(value = "List of campaign ids")

  private List<@Pattern(regexp = "^\\d+$")String> campaignIds = new ArrayList<>();

 /**
  * List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
  */
  @ApiModelProperty(value = "List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.")

  @Valid

  private List<CampaignObjectiveType> campaignObjectiveTypes = new ArrayList<>();

 /**
  * List of status values for filtering
  */
  @ApiModelProperty(value = "List of status values for filtering")

  @Valid

  private List<CampaignSummaryStatus> campaignStatuses = new ArrayList<>();

 /**
  * Number of days to use as the conversion attribution window for a pin click action.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action.")

  @Valid

  private ConversionAttributionWindowDays clickWindowDays;

 /**
  * Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
  */
  @ApiModelProperty(value = "Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.")

  @Valid

  private List<ReportingColumnAsync> columns = new ArrayList<>();

 /**
  * Determines if the targeting types included in the request should be consolidated into a single breakdown.
  */
  @ApiModelProperty(value = "Determines if the targeting types included in the request should be consolidated into a single breakdown.")

  private Boolean combineTargetingTypes = false;

 /**
  * Date dimension for conversion metrics.
  */
  @ApiModelProperty(value = "Date dimension for conversion metrics.")

  @Valid

  private ConversionReportTimeType conversionReportTime;

 /**
  * List of advertiser-defined custom conversion event metrics to include in the report
  */
  @ApiModelProperty(value = "List of advertiser-defined custom conversion event metrics to include in the report")

  @Valid

  private List<@Valid CustomConversionEventMetrics> customConversionEventMetrics = new ArrayList<>();

 /**
  * Metric report end date (UTC). Format: YYYY-MM-DD
  */
  @ApiModelProperty(required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")

  private String endDate;

 /**
  * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
  */
  @ApiModelProperty(value = "Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.")

  private Integer endHour;

 /**
  * Number of days to use as the conversion attribution window for an engagement action.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for an engagement action.")

  @Valid

  private ConversionAttributionWindowDays engagementWindowDays;

 /**
  *   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
  */
  @ApiModelProperty(required = true, value = "  TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.")

  @Valid

  private Granularity granularity;

 /**
  * Level of the report
  */
  @ApiModelProperty(value = "Level of the report")

  @Valid

  private MetricsReportingLevel level;

 /**
  * List of metrics filters
  */
  @ApiModelProperty(value = "List of metrics filters")

  @Valid

  private List<@Valid AdsAnalyticsMetricsFilter> metricsFilters = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private PrimarySort primarySort;

 /**
  * List of product group ids
  */
  @ApiModelProperty(value = "List of product group ids")

  private List<@Pattern(regexp = "^\\d+$")String> productGroupIds = new ArrayList<>();

 /**
  * List of values for filtering
  */
  @ApiModelProperty(value = "List of values for filtering")

  @Valid

  private List<ProductGroupSummaryStatus> productGroupStatuses = new ArrayList<>();

 /**
  * List of product item ids
  */
  @ApiModelProperty(value = "List of product item ids")

  private List<@Pattern(regexp = "^\\d+$")String> productItemIds = new ArrayList<>();

  @ApiModelProperty(value = "")

  @Valid

  private DataOutputFormat reportFormat;

 /**
  * Specify the timezone to be applied for the reporting.
  */
  @ApiModelProperty(value = "Specify the timezone to be applied for the reporting.")

  @Valid

  private ReportingTimeZone reportingTimezone;

 /**
  * Metric report start date (UTC). Format: YYYY-MM-DD
  */
  @ApiModelProperty(required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")

  private String startDate;

 /**
  * Which hour of the start date to begin the report. Only allowed for hourly reports.
  */
  @ApiModelProperty(value = "Which hour of the start date to begin the report. Only allowed for hourly reports.")

  private Integer startHour;

 /**
  * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
  */
  @ApiModelProperty(value = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`.")

  @Valid

  private List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes = new ArrayList<>();

 /**
  * Number of days to use as the conversion attribution window for a view action.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action.")

  @Valid

  private ConversionAttributionWindowDays viewWindowDays;
 /**
   * List of ad group ids
   * @return adGroupIds
  **/
  @JsonProperty("ad_group_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }

  public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdsAnalyticsCreateAsyncRequest adGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addAdGroupIdsItem(String adGroupIdsItem) {
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

 /**
   * List of values for filtering
   * @return adGroupStatuses
  **/
  @JsonProperty("ad_group_statuses")
 @Size(min=1,max=6)  public List<AdGroupSummaryStatus> getAdGroupStatuses() {
    return adGroupStatuses;
  }

  public void setAdGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest adGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addAdGroupStatusesItem(AdGroupSummaryStatus adGroupStatusesItem) {
    this.adGroupStatuses.add(adGroupStatusesItem);
    return this;
  }

 /**
   * List of ad ids. This parameter is not supported for Product Item level reports.
   * @return adIds
  **/
  @JsonProperty("ad_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getAdIds() {
    return adIds;
  }

  public void setAdIds(List<@Pattern(regexp = "^\\d+$")String> adIds) {
    this.adIds = adIds;
  }

  public AdsAnalyticsCreateAsyncRequest adIds(List<@Pattern(regexp = "^\\d+$")String> adIds) {
    this.adIds = adIds;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addAdIdsItem(String adIdsItem) {
    this.adIds.add(adIdsItem);
    return this;
  }

 /**
   * List of values for filtering. This parameter is not supported for Product Item level reports.
   * @return adStatuses
  **/
  @JsonProperty("ad_statuses")
 @Size(min=1,max=6)  public List<PinPromotionSummaryStatus> getAdStatuses() {
    return adStatuses;
  }

  public void setAdStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest adStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addAdStatusesItem(PinPromotionSummaryStatus adStatusesItem) {
    this.adStatuses.add(adStatusesItem);
    return this;
  }

 /**
   * List of attribution types for the conversion report.
   * @return attributionTypes
  **/
  @JsonProperty("attribution_types")
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }

  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
  }

  public AdsAnalyticsCreateAsyncRequest attributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addAttributionTypesItem(ConversionReportAttributionType attributionTypesItem) {
    this.attributionTypes.add(attributionTypesItem);
    return this;
  }

 /**
   * Campaign brand label for filtering.
   * @return campaignBrandLabel
  **/
  @JsonProperty("campaign_brand_label")
  public String getCampaignBrandLabel() {
    return campaignBrandLabel;
  }

  public void setCampaignBrandLabel(String campaignBrandLabel) {
    this.campaignBrandLabel = campaignBrandLabel;
  }

  public AdsAnalyticsCreateAsyncRequest campaignBrandLabel(String campaignBrandLabel) {
    this.campaignBrandLabel = campaignBrandLabel;
    return this;
  }

 /**
   * Campaign custom label for filtering.
   * @return campaignCustomLabel
  **/
  @JsonProperty("campaign_custom_label")
  public String getCampaignCustomLabel() {
    return campaignCustomLabel;
  }

  public void setCampaignCustomLabel(String campaignCustomLabel) {
    this.campaignCustomLabel = campaignCustomLabel;
  }

  public AdsAnalyticsCreateAsyncRequest campaignCustomLabel(String campaignCustomLabel) {
    this.campaignCustomLabel = campaignCustomLabel;
    return this;
  }

 /**
   * List of campaign ids
   * @return campaignIds
  **/
  @JsonProperty("campaign_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AdsAnalyticsCreateAsyncRequest campaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addCampaignIdsItem(String campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

 /**
   * List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA.
   * @return campaignObjectiveTypes
  **/
  @JsonProperty("campaign_objective_types")
 @Size(min=1,max=7)  public List<CampaignObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  public void setCampaignObjectiveTypes(List<CampaignObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  public AdsAnalyticsCreateAsyncRequest campaignObjectiveTypes(List<CampaignObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addCampaignObjectiveTypesItem(CampaignObjectiveType campaignObjectiveTypesItem) {
    this.campaignObjectiveTypes.add(campaignObjectiveTypesItem);
    return this;
  }

 /**
   * List of status values for filtering
   * @return campaignStatuses
  **/
  @JsonProperty("campaign_statuses")
 @Size(min=1,max=6)  public List<CampaignSummaryStatus> getCampaignStatuses() {
    return campaignStatuses;
  }

  public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest campaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addCampaignStatusesItem(CampaignSummaryStatus campaignStatusesItem) {
    this.campaignStatuses.add(campaignStatusesItem);
    return this;
  }

 /**
   * Number of days to use as the conversion attribution window for a pin click action.
   * @return clickWindowDays
  **/
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public AdsAnalyticsCreateAsyncRequest clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

 /**
   * Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
   * @return columns
  **/
  @JsonProperty("columns")
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }

  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

  public AdsAnalyticsCreateAsyncRequest columns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addColumnsItem(ReportingColumnAsync columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

 /**
   * Determines if the targeting types included in the request should be consolidated into a single breakdown.
   * @return combineTargetingTypes
  **/
  @JsonProperty("combine_targeting_types")
  public Boolean getCombineTargetingTypes() {
    return combineTargetingTypes;
  }

  public void setCombineTargetingTypes(Boolean combineTargetingTypes) {
    this.combineTargetingTypes = combineTargetingTypes;
  }

  public AdsAnalyticsCreateAsyncRequest combineTargetingTypes(Boolean combineTargetingTypes) {
    this.combineTargetingTypes = combineTargetingTypes;
    return this;
  }

 /**
   * Date dimension for conversion metrics.
   * @return conversionReportTime
  **/
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  public AdsAnalyticsCreateAsyncRequest conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

 /**
   * List of advertiser-defined custom conversion event metrics to include in the report
   * @return customConversionEventMetrics
  **/
  @JsonProperty("custom_conversion_event_metrics")
  public List<@Valid CustomConversionEventMetrics> getCustomConversionEventMetrics() {
    return customConversionEventMetrics;
  }

  public void setCustomConversionEventMetrics(List<@Valid CustomConversionEventMetrics> customConversionEventMetrics) {
    this.customConversionEventMetrics = customConversionEventMetrics;
  }

  public AdsAnalyticsCreateAsyncRequest customConversionEventMetrics(List<@Valid CustomConversionEventMetrics> customConversionEventMetrics) {
    this.customConversionEventMetrics = customConversionEventMetrics;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addCustomConversionEventMetricsItem(CustomConversionEventMetrics customConversionEventMetricsItem) {
    this.customConversionEventMetrics.add(customConversionEventMetricsItem);
    return this;
  }

 /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   * @return endDate
  **/
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public AdsAnalyticsCreateAsyncRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
   * minimum: 0
   * maximum: 23
   * @return endHour
  **/
  @JsonProperty("end_hour")
 @Min(0) @Max(23)  public Integer getEndHour() {
    return endHour;
  }

  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }

  public AdsAnalyticsCreateAsyncRequest endHour(Integer endHour) {
    this.endHour = endHour;
    return this;
  }

 /**
   * Number of days to use as the conversion attribution window for an engagement action.
   * @return engagementWindowDays
  **/
  @JsonProperty("engagement_window_days")
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public AdsAnalyticsCreateAsyncRequest engagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

 /**
   *   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
   * @return granularity
  **/
  @JsonProperty("granularity")
  @NotNull
  public Granularity getGranularity() {
    return granularity;
  }

  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  public AdsAnalyticsCreateAsyncRequest granularity(Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

 /**
   * Level of the report
   * @return level
  **/
  @JsonProperty("level")
  public MetricsReportingLevel getLevel() {
    return level;
  }

  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

  public AdsAnalyticsCreateAsyncRequest level(MetricsReportingLevel level) {
    this.level = level;
    return this;
  }

 /**
   * List of metrics filters
   * @return metricsFilters
  **/
  @JsonProperty("metrics_filters")
 @Size(min=1)  public List<@Valid AdsAnalyticsMetricsFilter> getMetricsFilters() {
    return metricsFilters;
  }

  public void setMetricsFilters(List<@Valid AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  public AdsAnalyticsCreateAsyncRequest metricsFilters(List<@Valid AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addMetricsFiltersItem(AdsAnalyticsMetricsFilter metricsFiltersItem) {
    this.metricsFilters.add(metricsFiltersItem);
    return this;
  }

 /**
   * Get primarySort
   * @return primarySort
  **/
  @JsonProperty("primary_sort")
  public PrimarySort getPrimarySort() {
    return primarySort;
  }

  public void setPrimarySort(PrimarySort primarySort) {
    this.primarySort = primarySort;
  }

  public AdsAnalyticsCreateAsyncRequest primarySort(PrimarySort primarySort) {
    this.primarySort = primarySort;
    return this;
  }

 /**
   * List of product group ids
   * @return productGroupIds
  **/
  @JsonProperty("product_group_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }

  public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdsAnalyticsCreateAsyncRequest productGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addProductGroupIdsItem(String productGroupIdsItem) {
    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

 /**
   * List of values for filtering
   * @return productGroupStatuses
  **/
  @JsonProperty("product_group_statuses")
 @Size(min=1,max=6)  public List<ProductGroupSummaryStatus> getProductGroupStatuses() {
    return productGroupStatuses;
  }

  public void setProductGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest productGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addProductGroupStatusesItem(ProductGroupSummaryStatus productGroupStatusesItem) {
    this.productGroupStatuses.add(productGroupStatusesItem);
    return this;
  }

 /**
   * List of product item ids
   * @return productItemIds
  **/
  @JsonProperty("product_item_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getProductItemIds() {
    return productItemIds;
  }

  public void setProductItemIds(List<@Pattern(regexp = "^\\d+$")String> productItemIds) {
    this.productItemIds = productItemIds;
  }

  public AdsAnalyticsCreateAsyncRequest productItemIds(List<@Pattern(regexp = "^\\d+$")String> productItemIds) {
    this.productItemIds = productItemIds;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addProductItemIdsItem(String productItemIdsItem) {
    this.productItemIds.add(productItemIdsItem);
    return this;
  }

 /**
   * Get reportFormat
   * @return reportFormat
  **/
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  public AdsAnalyticsCreateAsyncRequest reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

 /**
   * Specify the timezone to be applied for the reporting.
   * @return reportingTimezone
  **/
  @JsonProperty("reporting_timezone")
  public ReportingTimeZone getReportingTimezone() {
    return reportingTimezone;
  }

  public void setReportingTimezone(ReportingTimeZone reportingTimezone) {
    this.reportingTimezone = reportingTimezone;
  }

  public AdsAnalyticsCreateAsyncRequest reportingTimezone(ReportingTimeZone reportingTimezone) {
    this.reportingTimezone = reportingTimezone;
    return this;
  }

 /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   * @return startDate
  **/
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public AdsAnalyticsCreateAsyncRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Which hour of the start date to begin the report. Only allowed for hourly reports.
   * minimum: 0
   * maximum: 23
   * @return startHour
  **/
  @JsonProperty("start_hour")
 @Min(0) @Max(23)  public Integer getStartHour() {
    return startHour;
  }

  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }

  public AdsAnalyticsCreateAsyncRequest startHour(Integer startHour) {
    this.startHour = startHour;
    return this;
  }

 /**
   * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.
   * @return targetingTypes
  **/
  @JsonProperty("targeting_types")
 @Size(min=1,max=5)  public List<AdAdsAnalyticsAsyncTargetingTypes> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public AdsAnalyticsCreateAsyncRequest targetingTypes(List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addTargetingTypesItem(AdAdsAnalyticsAsyncTargetingTypes targetingTypesItem) {
    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

 /**
   * Number of days to use as the conversion attribution window for a view action.
   * @return viewWindowDays
  **/
  @JsonProperty("view_window_days")
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

  public AdsAnalyticsCreateAsyncRequest viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

