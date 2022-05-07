package org.openapitools.model;

import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AdGroupSummaryStatus;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequestAllOf;
import org.openapitools.model.AdsAnalyticsCreateAsyncRequestAllOf1;
import org.openapitools.model.AdsAnalyticsMetricsFilter;
import org.openapitools.model.AdsAnalyticsTargetingType;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.ConversionAttributionWindowDays;
import org.openapitools.model.ConversionReportAttributionType;
import org.openapitools.model.ConversionReportTimeType;
import org.openapitools.model.DataOutputFormat;
import org.openapitools.model.Granularity;
import org.openapitools.model.MetricsReportingLevel;
import org.openapitools.model.ObjectiveType;
import org.openapitools.model.PinPromotionSummaryStatus;
import org.openapitools.model.ProductGroupSummaryStatus;
import org.openapitools.model.ReportingColumnAsync;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdsAnalyticsCreateAsyncRequest  {
  
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
  * Metric and entity columns
  */
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @Valid
  private List<ReportingColumnAsync> columns = new ArrayList<ReportingColumnAsync>();

 /**
  * Level of the report
  */
  @ApiModelProperty(example = "CAMPAIGN", required = true, value = "Level of the report")
  private MetricsReportingLevel level;

 /**
  * Specification for formatting report data
  */
  @ApiModelProperty(value = "Specification for formatting report data")
  private DataOutputFormat reportFormat = "JSON";

 /**
  * List of campaign ids
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of campaign ids")
  private List<String> campaignIds = null;

 /**
  * List of status values for filtering
  */
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of status values for filtering")
  @Valid
  private List<CampaignSummaryStatus> campaignStatuses = null;

 /**
  * List of values for filtering
  */
  @ApiModelProperty(example = "[\"AWARENESS\",\"VIDEO_VIEW\"]", value = "List of values for filtering")
  @Valid
  private List<ObjectiveType> campaignObjectiveTypes = null;

 /**
  * List of ad group ids
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad group ids")
  private List<String> adGroupIds = null;

 /**
  * List of values for filtering
  */
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of values for filtering")
  @Valid
  private List<AdGroupSummaryStatus> adGroupStatuses = null;

 /**
  * List of ad ids
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad ids")
  private List<String> adIds = null;

 /**
  * List of values for filtering
  */
  @ApiModelProperty(example = "[\"APPROVED\",\"PAUSED\"]", value = "List of values for filtering")
  @Valid
  private List<PinPromotionSummaryStatus> adStatuses = null;

 /**
  * List of product group ids
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of product group ids")
  private List<String> productGroupIds = null;

 /**
  * List of values for filtering
  */
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of values for filtering")
  @Valid
  private List<ProductGroupSummaryStatus> productGroupStatuses = null;

 /**
  * List of product item ids
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of product item ids")
  private List<String> productItemIds = null;

 /**
  * List of targeting types
  */
  @ApiModelProperty(value = "List of targeting types")
  @Valid
  private List<AdsAnalyticsTargetingType> targetingTypes = null;

 /**
  * List of metrics filters
  */
  @ApiModelProperty(value = "List of metrics filters")
  @Valid
  private List<AdsAnalyticsMetricsFilter> metricsFilters = null;
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
  public AdsAnalyticsCreateAsyncRequest startDate(String startDate) {
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
  public AdsAnalyticsCreateAsyncRequest endDate(String endDate) {
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
  public AdsAnalyticsCreateAsyncRequest granularity(Granularity granularity) {
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
  public AdsAnalyticsCreateAsyncRequest clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
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
  public AdsAnalyticsCreateAsyncRequest engagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
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
  public AdsAnalyticsCreateAsyncRequest viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
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
  public AdsAnalyticsCreateAsyncRequest conversionReportTime(ConversionReportTimeType conversionReportTime) {
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
  public AdsAnalyticsCreateAsyncRequest attributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>attributionTypes</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addAttributionTypesItem(ConversionReportAttributionType attributionTypesItem) {
    this.attributionTypes.add(attributionTypesItem);
    return this;
  }

 /**
  * Metric and entity columns
  * @return columns
  */
  @JsonProperty("columns")
  @NotNull
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }

  /**
   * Sets the <code>columns</code> property.
   */
 public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

  /**
   * Sets the <code>columns</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest columns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
    return this;
  }

  /**
   * Adds a new item to the <code>columns</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addColumnsItem(ReportingColumnAsync columnsItem) {
    this.columns.add(columnsItem);
    return this;
  }

 /**
  * Level of the report
  * @return level
  */
  @JsonProperty("level")
  @NotNull
  public MetricsReportingLevel getLevel() {
    return level;
  }

  /**
   * Sets the <code>level</code> property.
   */
 public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

  /**
   * Sets the <code>level</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest level(MetricsReportingLevel level) {
    this.level = level;
    return this;
  }

 /**
  * Specification for formatting report data
  * @return reportFormat
  */
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  /**
   * Sets the <code>reportFormat</code> property.
   */
 public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  /**
   * Sets the <code>reportFormat</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

 /**
  * List of campaign ids
  * @return campaignIds
  */
  @JsonProperty("campaign_ids")
 @Size(min=1,max=500)  public List<String> getCampaignIds() {
    return campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
 public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignIds</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addCampaignIdsItem(String campaignIdsItem) {
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

 /**
  * List of status values for filtering
  * @return campaignStatuses
  */
  @JsonProperty("campaign_statuses")
 @Size(min=1,max=6)  public List<CampaignSummaryStatus> getCampaignStatuses() {
    return campaignStatuses;
  }

  /**
   * Sets the <code>campaignStatuses</code> property.
   */
 public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

  /**
   * Sets the <code>campaignStatuses</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest campaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignStatuses</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addCampaignStatusesItem(CampaignSummaryStatus campaignStatusesItem) {
    this.campaignStatuses.add(campaignStatusesItem);
    return this;
  }

 /**
  * List of values for filtering
  * @return campaignObjectiveTypes
  */
  @JsonProperty("campaign_objective_types")
 @Size(min=1,max=6)  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  /**
   * Sets the <code>campaignObjectiveTypes</code> property.
   */
 public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  /**
   * Sets the <code>campaignObjectiveTypes</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest campaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignObjectiveTypes</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addCampaignObjectiveTypesItem(ObjectiveType campaignObjectiveTypesItem) {
    this.campaignObjectiveTypes.add(campaignObjectiveTypesItem);
    return this;
  }

 /**
  * List of ad group ids
  * @return adGroupIds
  */
  @JsonProperty("ad_group_ids")
 @Size(min=1,max=500)  public List<String> getAdGroupIds() {
    return adGroupIds;
  }

  /**
   * Sets the <code>adGroupIds</code> property.
   */
 public void setAdGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   * Sets the <code>adGroupIds</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest adGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  /**
   * Adds a new item to the <code>adGroupIds</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addAdGroupIdsItem(String adGroupIdsItem) {
    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

 /**
  * List of values for filtering
  * @return adGroupStatuses
  */
  @JsonProperty("ad_group_statuses")
 @Size(min=1,max=6)  public List<AdGroupSummaryStatus> getAdGroupStatuses() {
    return adGroupStatuses;
  }

  /**
   * Sets the <code>adGroupStatuses</code> property.
   */
 public void setAdGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
  }

  /**
   * Sets the <code>adGroupStatuses</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest adGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
    return this;
  }

  /**
   * Adds a new item to the <code>adGroupStatuses</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addAdGroupStatusesItem(AdGroupSummaryStatus adGroupStatusesItem) {
    this.adGroupStatuses.add(adGroupStatusesItem);
    return this;
  }

 /**
  * List of ad ids
  * @return adIds
  */
  @JsonProperty("ad_ids")
 @Size(min=1,max=500)  public List<String> getAdIds() {
    return adIds;
  }

  /**
   * Sets the <code>adIds</code> property.
   */
 public void setAdIds(List<String> adIds) {
    this.adIds = adIds;
  }

  /**
   * Sets the <code>adIds</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest adIds(List<String> adIds) {
    this.adIds = adIds;
    return this;
  }

  /**
   * Adds a new item to the <code>adIds</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addAdIdsItem(String adIdsItem) {
    this.adIds.add(adIdsItem);
    return this;
  }

 /**
  * List of values for filtering
  * @return adStatuses
  */
  @JsonProperty("ad_statuses")
 @Size(min=1,max=6)  public List<PinPromotionSummaryStatus> getAdStatuses() {
    return adStatuses;
  }

  /**
   * Sets the <code>adStatuses</code> property.
   */
 public void setAdStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
  }

  /**
   * Sets the <code>adStatuses</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest adStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
    return this;
  }

  /**
   * Adds a new item to the <code>adStatuses</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addAdStatusesItem(PinPromotionSummaryStatus adStatusesItem) {
    this.adStatuses.add(adStatusesItem);
    return this;
  }

 /**
  * List of product group ids
  * @return productGroupIds
  */
  @JsonProperty("product_group_ids")
 @Size(min=1,max=500)  public List<String> getProductGroupIds() {
    return productGroupIds;
  }

  /**
   * Sets the <code>productGroupIds</code> property.
   */
 public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  /**
   * Sets the <code>productGroupIds</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest productGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  /**
   * Adds a new item to the <code>productGroupIds</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addProductGroupIdsItem(String productGroupIdsItem) {
    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

 /**
  * List of values for filtering
  * @return productGroupStatuses
  */
  @JsonProperty("product_group_statuses")
 @Size(min=1,max=6)  public List<ProductGroupSummaryStatus> getProductGroupStatuses() {
    return productGroupStatuses;
  }

  /**
   * Sets the <code>productGroupStatuses</code> property.
   */
 public void setProductGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
  }

  /**
   * Sets the <code>productGroupStatuses</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest productGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
    return this;
  }

  /**
   * Adds a new item to the <code>productGroupStatuses</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addProductGroupStatusesItem(ProductGroupSummaryStatus productGroupStatusesItem) {
    this.productGroupStatuses.add(productGroupStatusesItem);
    return this;
  }

 /**
  * List of product item ids
  * @return productItemIds
  */
  @JsonProperty("product_item_ids")
 @Size(min=1,max=500)  public List<String> getProductItemIds() {
    return productItemIds;
  }

  /**
   * Sets the <code>productItemIds</code> property.
   */
 public void setProductItemIds(List<String> productItemIds) {
    this.productItemIds = productItemIds;
  }

  /**
   * Sets the <code>productItemIds</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest productItemIds(List<String> productItemIds) {
    this.productItemIds = productItemIds;
    return this;
  }

  /**
   * Adds a new item to the <code>productItemIds</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addProductItemIdsItem(String productItemIdsItem) {
    this.productItemIds.add(productItemIdsItem);
    return this;
  }

 /**
  * List of targeting types
  * @return targetingTypes
  */
  @JsonProperty("targeting_types")
 @Size(min=1,max=5)  public List<AdsAnalyticsTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  /**
   * Sets the <code>targetingTypes</code> property.
   */
 public void setTargetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  /**
   * Sets the <code>targetingTypes</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest targetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>targetingTypes</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addTargetingTypesItem(AdsAnalyticsTargetingType targetingTypesItem) {
    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

 /**
  * List of metrics filters
  * @return metricsFilters
  */
  @JsonProperty("metrics_filters")
 @Size(min=1)  public List<AdsAnalyticsMetricsFilter> getMetricsFilters() {
    return metricsFilters;
  }

  /**
   * Sets the <code>metricsFilters</code> property.
   */
 public void setMetricsFilters(List<AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  /**
   * Sets the <code>metricsFilters</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest metricsFilters(List<AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
    return this;
  }

  /**
   * Adds a new item to the <code>metricsFilters</code> list.
   */
  public AdsAnalyticsCreateAsyncRequest addMetricsFiltersItem(AdsAnalyticsMetricsFilter metricsFiltersItem) {
    this.metricsFilters.add(metricsFiltersItem);
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalyticsCreateAsyncRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    clickWindowDays: ").append(toIndentedString(clickWindowDays)).append("\n");
    sb.append("    engagementWindowDays: ").append(toIndentedString(engagementWindowDays)).append("\n");
    sb.append("    viewWindowDays: ").append(toIndentedString(viewWindowDays)).append("\n");
    sb.append("    conversionReportTime: ").append(toIndentedString(conversionReportTime)).append("\n");
    sb.append("    attributionTypes: ").append(toIndentedString(attributionTypes)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignStatuses: ").append(toIndentedString(campaignStatuses)).append("\n");
    sb.append("    campaignObjectiveTypes: ").append(toIndentedString(campaignObjectiveTypes)).append("\n");
    sb.append("    adGroupIds: ").append(toIndentedString(adGroupIds)).append("\n");
    sb.append("    adGroupStatuses: ").append(toIndentedString(adGroupStatuses)).append("\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    adStatuses: ").append(toIndentedString(adStatuses)).append("\n");
    sb.append("    productGroupIds: ").append(toIndentedString(productGroupIds)).append("\n");
    sb.append("    productGroupStatuses: ").append(toIndentedString(productGroupStatuses)).append("\n");
    sb.append("    productItemIds: ").append(toIndentedString(productItemIds)).append("\n");
    sb.append("    targetingTypes: ").append(toIndentedString(targetingTypes)).append("\n");
    sb.append("    metricsFilters: ").append(toIndentedString(metricsFilters)).append("\n");
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

