package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdsAnalyticsCreateAsyncRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T10:48:11.625089Z[Etc/UTC]")
public class AdsAnalyticsCreateAsyncRequest   {

  @JsonProperty("start_date")
  private String startDate;

  @JsonProperty("end_date")
  private String endDate;

  @JsonProperty("granularity")
  private Granularity granularity;

  @JsonProperty("click_window_days")
  private ConversionAttributionWindowDays clickWindowDays = 30;

  @JsonProperty("engagement_window_days")
  private ConversionAttributionWindowDays engagementWindowDays = 30;

  @JsonProperty("view_window_days")
  private ConversionAttributionWindowDays viewWindowDays = 1;

  @JsonProperty("conversion_report_time")
  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";

  @JsonProperty("attribution_types")
  @Valid
  private List<ConversionReportAttributionType> attributionTypes = null;

  @JsonProperty("columns")
  @Valid
  private List<ReportingColumnAsync> columns = new ArrayList<>();

  @JsonProperty("level")
  private MetricsReportingLevel level;

  @JsonProperty("report_format")
  private DataOutputFormat reportFormat = "JSON";

  @JsonProperty("campaign_ids")
  @Valid
  private List<String> campaignIds = null;

  @JsonProperty("campaign_statuses")
  @Valid
  private List<CampaignSummaryStatus> campaignStatuses = null;

  @JsonProperty("campaign_objective_types")
  @Valid
  private List<ObjectiveType> campaignObjectiveTypes = null;

  @JsonProperty("ad_group_ids")
  @Valid
  private List<String> adGroupIds = null;

  @JsonProperty("ad_group_statuses")
  @Valid
  private List<AdGroupSummaryStatus> adGroupStatuses = null;

  @JsonProperty("ad_ids")
  @Valid
  private List<String> adIds = null;

  @JsonProperty("ad_statuses")
  @Valid
  private List<PinPromotionSummaryStatus> adStatuses = null;

  @JsonProperty("product_group_ids")
  @Valid
  private List<String> productGroupIds = null;

  @JsonProperty("product_group_statuses")
  @Valid
  private List<ProductGroupSummaryStatus> productGroupStatuses = null;

  @JsonProperty("product_item_ids")
  @Valid
  private List<String> productItemIds = null;

  @JsonProperty("targeting_types")
  @Valid
  private List<AdsAnalyticsTargetingType> targetingTypes = null;

  @JsonProperty("metrics_filters")
  @Valid
  private List<AdsAnalyticsMetricsFilter> metricsFilters = null;

  public AdsAnalyticsCreateAsyncRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   * @return startDate
  */
  @NotNull @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "start_date", example = "2020-12-20", description = "Metric report start date (UTC). Format: YYYY-MM-DD", required = true)
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public AdsAnalyticsCreateAsyncRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   * @return endDate
  */
  @NotNull @Pattern(regexp = "^(\\d{4})-(\\d{2})-(\\d{2})$") 
  @Schema(name = "end_date", example = "2020-12-20", description = "Metric report end date (UTC). Format: YYYY-MM-DD", required = true)
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public AdsAnalyticsCreateAsyncRequest granularity(Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

  /**
   * TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
   * @return granularity
  */
  @NotNull @Valid 
  @Schema(name = "granularity", description = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly", required = true)
  public Granularity getGranularity() {
    return granularity;
  }

  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  public AdsAnalyticsCreateAsyncRequest clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @return clickWindowDays
  */
  @Valid 
  @Schema(name = "click_window_days", description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", required = false)
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  public AdsAnalyticsCreateAsyncRequest engagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
   * @return engagementWindowDays
  */
  @Valid 
  @Schema(name = "engagement_window_days", description = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.", required = false)
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }

  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  public AdsAnalyticsCreateAsyncRequest viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
   * @return viewWindowDays
  */
  @Valid 
  @Schema(name = "view_window_days", description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.", required = false)
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

  public AdsAnalyticsCreateAsyncRequest conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

  /**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   * @return conversionReportTime
  */
  @Valid 
  @Schema(name = "conversion_report_time", description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.", required = false)
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
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
   * List of types of attribution for the conversion report
   * @return attributionTypes
  */
  @Valid 
  @Schema(name = "attribution_types", description = "List of types of attribution for the conversion report", required = false)
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }

  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
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
   * Metric and entity columns
   * @return columns
  */
  @NotNull @Valid 
  @Schema(name = "columns", description = "Metric and entity columns", required = true)
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }

  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

  public AdsAnalyticsCreateAsyncRequest level(MetricsReportingLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Level of the report
   * @return level
  */
  @NotNull @Valid 
  @Schema(name = "level", example = "CAMPAIGN", description = "Level of the report", required = true)
  public MetricsReportingLevel getLevel() {
    return level;
  }

  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

  public AdsAnalyticsCreateAsyncRequest reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

  /**
   * Specification for formatting report data
   * @return reportFormat
  */
  @Valid 
  @Schema(name = "report_format", description = "Specification for formatting report data", required = false)
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
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
  @Size(min = 1, max = 500) 
  @Schema(name = "campaign_ids", example = "[\"12345678\"]", description = "List of campaign ids", required = false)
  public List<String> getCampaignIds() {
    return campaignIds;
  }

  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
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
  @Schema(name = "campaign_statuses", example = "[\"RUNNING\",\"PAUSED\"]", description = "List of status values for filtering", required = false)
  public List<CampaignSummaryStatus> getCampaignStatuses() {
    return campaignStatuses;
  }

  public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest campaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addCampaignObjectiveTypesItem(ObjectiveType campaignObjectiveTypesItem) {
    if (this.campaignObjectiveTypes == null) {
      this.campaignObjectiveTypes = new ArrayList<>();
    }
    this.campaignObjectiveTypes.add(campaignObjectiveTypesItem);
    return this;
  }

  /**
   * List of values for filtering
   * @return campaignObjectiveTypes
  */
  @Valid @Size(min = 1, max = 6) 
  @Schema(name = "campaign_objective_types", example = "[\"AWARENESS\",\"VIDEO_VIEW\"]", description = "List of values for filtering", required = false)
  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

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
  @Size(min = 1, max = 500) 
  @Schema(name = "ad_group_ids", example = "[\"12345678\"]", description = "List of ad group ids", required = false)
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
  @Valid @Size(min = 1, max = 6) 
  @Schema(name = "ad_group_statuses", example = "[\"RUNNING\",\"PAUSED\"]", description = "List of values for filtering", required = false)
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
   * List of ad ids
   * @return adIds
  */
  @Size(min = 1, max = 500) 
  @Schema(name = "ad_ids", example = "[\"12345678\"]", description = "List of ad ids", required = false)
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
   * List of values for filtering
   * @return adStatuses
  */
  @Valid @Size(min = 1, max = 6) 
  @Schema(name = "ad_statuses", example = "[\"APPROVED\",\"PAUSED\"]", description = "List of values for filtering", required = false)
  public List<PinPromotionSummaryStatus> getAdStatuses() {
    return adStatuses;
  }

  public void setAdStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
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
  @Size(min = 1, max = 500) 
  @Schema(name = "product_group_ids", example = "[\"12345678\"]", description = "List of product group ids", required = false)
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
  @Valid @Size(min = 1, max = 6) 
  @Schema(name = "product_group_statuses", example = "[\"RUNNING\",\"PAUSED\"]", description = "List of values for filtering", required = false)
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
  @Size(min = 1, max = 500) 
  @Schema(name = "product_item_ids", example = "[\"12345678\"]", description = "List of product item ids", required = false)
  public List<String> getProductItemIds() {
    return productItemIds;
  }

  public void setProductItemIds(List<String> productItemIds) {
    this.productItemIds = productItemIds;
  }

  public AdsAnalyticsCreateAsyncRequest targetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest addTargetingTypesItem(AdsAnalyticsTargetingType targetingTypesItem) {
    if (this.targetingTypes == null) {
      this.targetingTypes = new ArrayList<>();
    }
    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

  /**
   * List of targeting types
   * @return targetingTypes
  */
  @Valid @Size(min = 1, max = 5) 
  @Schema(name = "targeting_types", description = "List of targeting types", required = false)
  public List<AdsAnalyticsTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  public void setTargetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
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
  @Valid @Size(min = 1) 
  @Schema(name = "metrics_filters", description = "List of metrics filters", required = false)
  public List<AdsAnalyticsMetricsFilter> getMetricsFilters() {
    return metricsFilters;
  }

  public void setMetricsFilters(List<AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
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
        Objects.equals(this.columns, adsAnalyticsCreateAsyncRequest.columns) &&
        Objects.equals(this.level, adsAnalyticsCreateAsyncRequest.level) &&
        Objects.equals(this.reportFormat, adsAnalyticsCreateAsyncRequest.reportFormat) &&
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
        Objects.equals(this.metricsFilters, adsAnalyticsCreateAsyncRequest.metricsFilters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, granularity, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, attributionTypes, columns, level, reportFormat, campaignIds, campaignStatuses, campaignObjectiveTypes, adGroupIds, adGroupStatuses, adIds, adStatuses, productGroupIds, productGroupStatuses, productItemIds, targetingTypes, metricsFilters);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

