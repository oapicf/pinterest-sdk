package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdsAnalyticsCreateAsyncRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdsAnalyticsCreateAsyncRequest {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Pattern(regexp = "^\\d+$")String> adGroupIds = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<AdGroupSummaryStatus> adGroupStatuses = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Pattern(regexp = "^\\d+$")String> adIds = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<PinPromotionSummaryStatus> adStatuses = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<ConversionReportAttributionType> attributionTypes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String campaignBrandLabel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String campaignCustomLabel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Pattern(regexp = "^\\d+$")String> campaignIds = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<CampaignObjectiveType> campaignObjectiveTypes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<CampaignSummaryStatus> campaignStatuses = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionAttributionWindowDays clickWindowDays;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<ReportingColumnAsync> columns = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Boolean combineTargetingTypes = false;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionReportTimeType conversionReportTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CustomConversionEventMetrics> customConversionEventMetrics = new ArrayList<>();

  private String endDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer endHour;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionAttributionWindowDays engagementWindowDays;

  private Granularity granularity;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable MetricsReportingLevel level;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid AdsAnalyticsMetricsFilter> metricsFilters = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable PrimarySort primarySort;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Pattern(regexp = "^\\d+$")String> productGroupIds = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<ProductGroupSummaryStatus> productGroupStatuses = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Pattern(regexp = "^\\d+$")String> productItemIds = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable DataOutputFormat reportFormat;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ReportingTimeZone reportingTimezone;

  private String startDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer startHour;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConversionAttributionWindowDays viewWindowDays;

  public AdsAnalyticsCreateAsyncRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdsAnalyticsCreateAsyncRequest(String endDate, Granularity granularity, String startDate) {
    this.endDate = endDate;
    this.granularity = granularity;
    this.startDate = startDate;
  }

  public AdsAnalyticsCreateAsyncRequest adGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
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
  @Size(min = 1, max = 500) 
  @Schema(name = "ad_group_ids", description = "List of ad group ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_group_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getAdGroupIds() {
    return adGroupIds;
  }

  @JsonProperty("ad_group_ids")
  public void setAdGroupIds(List<@Pattern(regexp = "^\\d+$")String> adGroupIds) {
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
  @Valid @Size(min = 1, max = 6) 
  @Schema(name = "ad_group_statuses", description = "List of values for filtering", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_group_statuses")
  public List<AdGroupSummaryStatus> getAdGroupStatuses() {
    return adGroupStatuses;
  }

  @JsonProperty("ad_group_statuses")
  public void setAdGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest adIds(List<@Pattern(regexp = "^\\d+$")String> adIds) {
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
  @Size(min = 1, max = 500) 
  @Schema(name = "ad_ids", description = "List of ad ids. This parameter is not supported for Product Item level reports.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getAdIds() {
    return adIds;
  }

  @JsonProperty("ad_ids")
  public void setAdIds(List<@Pattern(regexp = "^\\d+$")String> adIds) {
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
  @Valid @Size(min = 1, max = 6) 
  @Schema(name = "ad_statuses", description = "List of values for filtering. This parameter is not supported for Product Item level reports.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_statuses")
  public List<PinPromotionSummaryStatus> getAdStatuses() {
    return adStatuses;
  }

  @JsonProperty("ad_statuses")
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
  @Valid 
  @Schema(name = "attribution_types", description = "List of attribution types for the conversion report.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution_types")
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }

  @JsonProperty("attribution_types")
  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
  }

  public AdsAnalyticsCreateAsyncRequest campaignBrandLabel(@Nullable String campaignBrandLabel) {
    this.campaignBrandLabel = campaignBrandLabel;
    return this;
  }

  /**
   * Campaign brand label for filtering.
   * @return campaignBrandLabel
   */
  
  @Schema(name = "campaign_brand_label", description = "Campaign brand label for filtering.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_brand_label")
  public @Nullable String getCampaignBrandLabel() {
    return campaignBrandLabel;
  }

  @JsonProperty("campaign_brand_label")
  public void setCampaignBrandLabel(@Nullable String campaignBrandLabel) {
    this.campaignBrandLabel = campaignBrandLabel;
  }

  public AdsAnalyticsCreateAsyncRequest campaignCustomLabel(@Nullable String campaignCustomLabel) {
    this.campaignCustomLabel = campaignCustomLabel;
    return this;
  }

  /**
   * Campaign custom label for filtering.
   * @return campaignCustomLabel
   */
  
  @Schema(name = "campaign_custom_label", description = "Campaign custom label for filtering.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_custom_label")
  public @Nullable String getCampaignCustomLabel() {
    return campaignCustomLabel;
  }

  @JsonProperty("campaign_custom_label")
  public void setCampaignCustomLabel(@Nullable String campaignCustomLabel) {
    this.campaignCustomLabel = campaignCustomLabel;
  }

  public AdsAnalyticsCreateAsyncRequest campaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
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
  @Size(min = 1, max = 500) 
  @Schema(name = "campaign_ids", description = "List of campaign ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getCampaignIds() {
    return campaignIds;
  }

  @JsonProperty("campaign_ids")
  public void setCampaignIds(List<@Pattern(regexp = "^\\d+$")String> campaignIds) {
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
  @Valid @Size(min = 1, max = 7) 
  @Schema(name = "campaign_objective_types", description = "List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_objective_types")
  public List<CampaignObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  @JsonProperty("campaign_objective_types")
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
  @Valid @Size(min = 1, max = 6) 
  @Schema(name = "campaign_statuses", description = "List of status values for filtering", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_statuses")
  public List<CampaignSummaryStatus> getCampaignStatuses() {
    return campaignStatuses;
  }

  @JsonProperty("campaign_statuses")
  public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest clickWindowDays(@Nullable ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action.
   * @return clickWindowDays
   */
  @Valid 
  @Schema(name = "click_window_days", description = "Number of days to use as the conversion attribution window for a pin click action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click_window_days")
  public @Nullable ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  @JsonProperty("click_window_days")
  public void setClickWindowDays(@Nullable ConversionAttributionWindowDays clickWindowDays) {
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
  @Valid 
  @Schema(name = "columns", description = "Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("columns")
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }

  @JsonProperty("columns")
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
  
  @Schema(name = "combine_targeting_types", description = "Determines if the targeting types included in the request should be consolidated into a single breakdown.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("combine_targeting_types")
  public Boolean getCombineTargetingTypes() {
    return combineTargetingTypes;
  }

  @JsonProperty("combine_targeting_types")
  public void setCombineTargetingTypes(Boolean combineTargetingTypes) {
    this.combineTargetingTypes = combineTargetingTypes;
  }

  public AdsAnalyticsCreateAsyncRequest conversionReportTime(@Nullable ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

  /**
   * Date dimension for conversion metrics.
   * @return conversionReportTime
   */
  @Valid 
  @Schema(name = "conversion_report_time", description = "Date dimension for conversion metrics.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conversion_report_time")
  public @Nullable ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  @JsonProperty("conversion_report_time")
  public void setConversionReportTime(@Nullable ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  public AdsAnalyticsCreateAsyncRequest customConversionEventMetrics(List<@Valid CustomConversionEventMetrics> customConversionEventMetrics) {
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
  @Valid 
  @Schema(name = "custom_conversion_event_metrics", description = "List of advertiser-defined custom conversion event metrics to include in the report", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_conversion_event_metrics")
  public List<@Valid CustomConversionEventMetrics> getCustomConversionEventMetrics() {
    return customConversionEventMetrics;
  }

  @JsonProperty("custom_conversion_event_metrics")
  public void setCustomConversionEventMetrics(List<@Valid CustomConversionEventMetrics> customConversionEventMetrics) {
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
  @NotNull @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "end_date", description = "Metric report end date (UTC). Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public AdsAnalyticsCreateAsyncRequest endHour(@Nullable Integer endHour) {
    this.endHour = endHour;
    return this;
  }

  /**
   * Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
   * minimum: 0
   * maximum: 23
   * @return endHour
   */
  @Min(value = 0) @Max(value = 23) 
  @Schema(name = "end_hour", description = "Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_hour")
  public @Nullable Integer getEndHour() {
    return endHour;
  }

  @JsonProperty("end_hour")
  public void setEndHour(@Nullable Integer endHour) {
    this.endHour = endHour;
  }

  public AdsAnalyticsCreateAsyncRequest engagementWindowDays(@Nullable ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for an engagement action.
   * @return engagementWindowDays
   */
  @Valid 
  @Schema(name = "engagement_window_days", description = "Number of days to use as the conversion attribution window for an engagement action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("engagement_window_days")
  public @Nullable ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }

  @JsonProperty("engagement_window_days")
  public void setEngagementWindowDays(@Nullable ConversionAttributionWindowDays engagementWindowDays) {
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
  @NotNull @Valid 
  @Schema(name = "granularity", description = "  TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("granularity")
  public Granularity getGranularity() {
    return granularity;
  }

  @JsonProperty("granularity")
  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  public AdsAnalyticsCreateAsyncRequest level(@Nullable MetricsReportingLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Level of the report
   * @return level
   */
  @Valid 
  @Schema(name = "level", description = "Level of the report", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("level")
  public @Nullable MetricsReportingLevel getLevel() {
    return level;
  }

  @JsonProperty("level")
  public void setLevel(@Nullable MetricsReportingLevel level) {
    this.level = level;
  }

  public AdsAnalyticsCreateAsyncRequest metricsFilters(List<@Valid AdsAnalyticsMetricsFilter> metricsFilters) {
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
  @Valid @Size(min = 1) 
  @Schema(name = "metrics_filters", description = "List of metrics filters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metrics_filters")
  public List<@Valid AdsAnalyticsMetricsFilter> getMetricsFilters() {
    return metricsFilters;
  }

  @JsonProperty("metrics_filters")
  public void setMetricsFilters(List<@Valid AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  public AdsAnalyticsCreateAsyncRequest primarySort(@Nullable PrimarySort primarySort) {
    this.primarySort = primarySort;
    return this;
  }

  /**
   * Get primarySort
   * @return primarySort
   */
  @Valid 
  @Schema(name = "primary_sort", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("primary_sort")
  public @Nullable PrimarySort getPrimarySort() {
    return primarySort;
  }

  @JsonProperty("primary_sort")
  public void setPrimarySort(@Nullable PrimarySort primarySort) {
    this.primarySort = primarySort;
  }

  public AdsAnalyticsCreateAsyncRequest productGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
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
  @Size(min = 1, max = 500) 
  @Schema(name = "product_group_ids", description = "List of product group ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_group_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getProductGroupIds() {
    return productGroupIds;
  }

  @JsonProperty("product_group_ids")
  public void setProductGroupIds(List<@Pattern(regexp = "^\\d+$")String> productGroupIds) {
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
  @Valid @Size(min = 1, max = 6) 
  @Schema(name = "product_group_statuses", description = "List of values for filtering", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_group_statuses")
  public List<ProductGroupSummaryStatus> getProductGroupStatuses() {
    return productGroupStatuses;
  }

  @JsonProperty("product_group_statuses")
  public void setProductGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest productItemIds(List<@Pattern(regexp = "^\\d+$")String> productItemIds) {
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
  @Size(min = 1, max = 500) 
  @Schema(name = "product_item_ids", description = "List of product item ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_item_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getProductItemIds() {
    return productItemIds;
  }

  @JsonProperty("product_item_ids")
  public void setProductItemIds(List<@Pattern(regexp = "^\\d+$")String> productItemIds) {
    this.productItemIds = productItemIds;
  }

  public AdsAnalyticsCreateAsyncRequest reportFormat(@Nullable DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

  /**
   * Get reportFormat
   * @return reportFormat
   */
  @Valid 
  @Schema(name = "report_format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("report_format")
  public @Nullable DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  @JsonProperty("report_format")
  public void setReportFormat(@Nullable DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  public AdsAnalyticsCreateAsyncRequest reportingTimezone(@Nullable ReportingTimeZone reportingTimezone) {
    this.reportingTimezone = reportingTimezone;
    return this;
  }

  /**
   * Specify the timezone to be applied for the reporting.
   * @return reportingTimezone
   */
  @Valid 
  @Schema(name = "reporting_timezone", description = "Specify the timezone to be applied for the reporting.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reporting_timezone")
  public @Nullable ReportingTimeZone getReportingTimezone() {
    return reportingTimezone;
  }

  @JsonProperty("reporting_timezone")
  public void setReportingTimezone(@Nullable ReportingTimeZone reportingTimezone) {
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
  @NotNull @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "start_date", description = "Metric report start date (UTC). Format: YYYY-MM-DD", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public AdsAnalyticsCreateAsyncRequest startHour(@Nullable Integer startHour) {
    this.startHour = startHour;
    return this;
  }

  /**
   * Which hour of the start date to begin the report. Only allowed for hourly reports.
   * minimum: 0
   * maximum: 23
   * @return startHour
   */
  @Min(value = 0) @Max(value = 23) 
  @Schema(name = "start_hour", description = "Which hour of the start date to begin the report. Only allowed for hourly reports.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_hour")
  public @Nullable Integer getStartHour() {
    return startHour;
  }

  @JsonProperty("start_hour")
  public void setStartHour(@Nullable Integer startHour) {
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
  @Valid @Size(min = 1, max = 5) 
  @Schema(name = "targeting_types", description = "List of targeting types. Requires `level` to be a value ending in `_TARGETING`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targeting_types")
  public List<AdAdsAnalyticsAsyncTargetingTypes> getTargetingTypes() {
    return targetingTypes;
  }

  @JsonProperty("targeting_types")
  public void setTargetingTypes(List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public AdsAnalyticsCreateAsyncRequest viewWindowDays(@Nullable ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action.
   * @return viewWindowDays
   */
  @Valid 
  @Schema(name = "view_window_days", description = "Number of days to use as the conversion attribution window for a view action.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_window_days")
  public @Nullable ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  @JsonProperty("view_window_days")
  public void setViewWindowDays(@Nullable ConversionAttributionWindowDays viewWindowDays) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

