package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroupSummaryStatus;
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
  @Valid
  private Granularity granularity;

 /**
  * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @Valid
  private ConversionAttributionWindowDays clickWindowDays = ConversionAttributionWindowDays.NUMBER_30;

 /**
  * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @Valid
  private ConversionAttributionWindowDays engagementWindowDays = ConversionAttributionWindowDays.NUMBER_30;

 /**
  * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  */
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
  @Valid
  private ConversionAttributionWindowDays viewWindowDays = ConversionAttributionWindowDays.NUMBER_1;

 /**
  * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  */
  @ApiModelProperty(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
  @Valid
  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";

 /**
  * List of types of attribution for the conversion report
  */
  @ApiModelProperty(value = "List of types of attribution for the conversion report")
  @Valid
  private List<ConversionReportAttributionType> attributionTypes;

 /**
  * List of campaign ids
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of campaign ids")
  private List<@Pattern(regexp = "^\\d+$")String> campaignIds;

 /**
  * List of status values for filtering
  */
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of status values for filtering")
  @Valid
  private List<CampaignSummaryStatus> campaignStatuses;

 /**
  * List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
  */
  @ApiModelProperty(example = "[\"AWARENESS\",\"VIDEO_VIEW\"]", value = "List of values for filtering. [\"WEB_SESSIONS\"] in BETA.")
  @Valid
  private List<ObjectiveType> campaignObjectiveTypes;

 /**
  * List of ad group ids
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad group ids")
  private List<@Pattern(regexp = "^\\d+$")String> adGroupIds;

 /**
  * List of values for filtering
  */
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of values for filtering")
  @Valid
  private List<AdGroupSummaryStatus> adGroupStatuses;

 /**
  * List of ad ids [This parameter is no supported for Product Item Level Reports]
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad ids [This parameter is no supported for Product Item Level Reports]")
  private List<@Pattern(regexp = "^\\d+$")String> adIds;

 /**
  * List of values for filtering [This parameter is not supported for Product Item Level Reports]
  */
  @ApiModelProperty(example = "[\"APPROVED\",\"PAUSED\"]", value = "List of values for filtering [This parameter is not supported for Product Item Level Reports]")
  @Valid
  private List<PinPromotionSummaryStatus> adStatuses;

 /**
  * List of product group ids
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of product group ids")
  private List<@Pattern(regexp = "^\\d+$")String> productGroupIds;

 /**
  * List of values for filtering
  */
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of values for filtering")
  @Valid
  private List<ProductGroupSummaryStatus> productGroupStatuses;

 /**
  * List of product item ids
  */
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of product item ids")
  private List<@Pattern(regexp = "^\\d+$")String> productItemIds;

 /**
  * List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
  */
  @ApiModelProperty(value = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`.")
  @Valid
  private List<AdsAnalyticsTargetingType> targetingTypes;

 /**
  * List of metrics filters
  */
  @ApiModelProperty(value = "List of metrics filters")
  @Valid
  private List<@Valid AdsAnalyticsMetricsFilter> metricsFilters;

 /**
  * Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
  */
  @ApiModelProperty(required = true, value = "Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.")
  @Valid
  private List<ReportingColumnAsync> columns = new ArrayList<>();

 /**
  * Level of the report
  */
  @ApiModelProperty(required = true, value = "Level of the report")
  @Valid
  private MetricsReportingLevel level;

 /**
  * Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
  */
  @ApiModelProperty(value = "Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.")
  @Valid
  private DataOutputFormat reportFormat = "JSON";
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
  * List of campaign ids
  * @return campaignIds
  */
  @JsonProperty("campaign_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getCampaignIds() {
    return campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
 public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * Sets the <code>campaignIds</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest campaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
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
  * List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA.
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
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }

  /**
   * Sets the <code>adGroupIds</code> property.
   */
 public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   * Sets the <code>adGroupIds</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest adGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
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
  * List of ad ids [This parameter is no supported for Product Item Level Reports]
  * @return adIds
  */
  @JsonProperty("ad_ids")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getAdIds() {
    return adIds;
  }

  /**
   * Sets the <code>adIds</code> property.
   */
 public void setAdIds(List<@Pattern(regexp = "^\\d+$")String> adIds) {
    this.adIds = adIds;
  }

  /**
   * Sets the <code>adIds</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest adIds(List<@Pattern(regexp = "^\\d+$")String> adIds) {
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
  * List of values for filtering [This parameter is not supported for Product Item Level Reports]
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
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }

  /**
   * Sets the <code>productGroupIds</code> property.
   */
 public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  /**
   * Sets the <code>productGroupIds</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest productGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
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
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^\\d+$")String> getProductItemIds() {
    return productItemIds;
  }

  /**
   * Sets the <code>productItemIds</code> property.
   */
 public void setProductItemIds(List<@Pattern(regexp = "^\\d+$")String> productItemIds) {
    this.productItemIds = productItemIds;
  }

  /**
   * Sets the <code>productItemIds</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest productItemIds(List<@Pattern(regexp = "^\\d+$")String> productItemIds) {
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
  * List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;.
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
 @Size(min=1)  public List<@Valid AdsAnalyticsMetricsFilter> getMetricsFilters() {
    return metricsFilters;
  }

  /**
   * Sets the <code>metricsFilters</code> property.
   */
 public void setMetricsFilters(List<@Valid AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  /**
   * Sets the <code>metricsFilters</code> property.
   */
  public AdsAnalyticsCreateAsyncRequest metricsFilters(List<@Valid AdsAnalyticsMetricsFilter> metricsFilters) {
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

 /**
  * Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
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
  * Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsAnalyticsCreateAsyncRequest adsAnalyticsCreateAsyncRequest = (AdsAnalyticsCreateAsyncRequest) o;
    return Objects.equals(this.startDate, adsAnalyticsCreateAsyncRequest.startDate) &&
        Objects.equals(this.endDate, adsAnalyticsCreateAsyncRequest.endDate) &&
        Objects.equals(this.granularity, adsAnalyticsCreateAsyncRequest.granularity) &&
        Objects.equals(this.clickWindowDays, adsAnalyticsCreateAsyncRequest.clickWindowDays) &&
        Objects.equals(this.engagementWindowDays, adsAnalyticsCreateAsyncRequest.engagementWindowDays) &&
        Objects.equals(this.viewWindowDays, adsAnalyticsCreateAsyncRequest.viewWindowDays) &&
        Objects.equals(this.conversionReportTime, adsAnalyticsCreateAsyncRequest.conversionReportTime) &&
        Objects.equals(this.attributionTypes, adsAnalyticsCreateAsyncRequest.attributionTypes) &&
        Objects.equals(this.campaignIds, adsAnalyticsCreateAsyncRequest.campaignIds) &&
        Objects.equals(this.campaignStatuses, adsAnalyticsCreateAsyncRequest.campaignStatuses) &&
        Objects.equals(this.campaignObjectiveTypes, adsAnalyticsCreateAsyncRequest.campaignObjectiveTypes) &&
        Objects.equals(this.adGroupIds, adsAnalyticsCreateAsyncRequest.adGroupIds) &&
        Objects.equals(this.adGroupStatuses, adsAnalyticsCreateAsyncRequest.adGroupStatuses) &&
        Objects.equals(this.adIds, adsAnalyticsCreateAsyncRequest.adIds) &&
        Objects.equals(this.adStatuses, adsAnalyticsCreateAsyncRequest.adStatuses) &&
        Objects.equals(this.productGroupIds, adsAnalyticsCreateAsyncRequest.productGroupIds) &&
        Objects.equals(this.productGroupStatuses, adsAnalyticsCreateAsyncRequest.productGroupStatuses) &&
        Objects.equals(this.productItemIds, adsAnalyticsCreateAsyncRequest.productItemIds) &&
        Objects.equals(this.targetingTypes, adsAnalyticsCreateAsyncRequest.targetingTypes) &&
        Objects.equals(this.metricsFilters, adsAnalyticsCreateAsyncRequest.metricsFilters) &&
        Objects.equals(this.columns, adsAnalyticsCreateAsyncRequest.columns) &&
        Objects.equals(this.level, adsAnalyticsCreateAsyncRequest.level) &&
        Objects.equals(this.reportFormat, adsAnalyticsCreateAsyncRequest.reportFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, campaignIds, campaignStatuses, campaignObjectiveTypes, adGroupIds, adGroupStatuses, adIds, adStatuses, productGroupIds, productGroupStatuses, productItemIds, targetingTypes, metricsFilters, columns, level, reportFormat);
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
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    reportFormat: ").append(toIndentedString(reportFormat)).append("\n");
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

