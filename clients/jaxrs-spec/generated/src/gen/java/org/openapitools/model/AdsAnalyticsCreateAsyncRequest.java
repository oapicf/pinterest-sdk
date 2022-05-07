package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AdsAnalyticsCreateAsyncRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-07T06:42:49.569940Z[Etc/UTC]")public class AdsAnalyticsCreateAsyncRequest   {
  
  private @Valid String startDate;
  private @Valid String endDate;
  private @Valid Granularity granularity;
  private @Valid ConversionAttributionWindowDays clickWindowDays = 30;
  private @Valid ConversionAttributionWindowDays engagementWindowDays = 30;
  private @Valid ConversionAttributionWindowDays viewWindowDays = 1;
  private @Valid ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";
  private @Valid List<ConversionReportAttributionType> attributionTypes = new ArrayList<ConversionReportAttributionType>();
  private @Valid List<ReportingColumnAsync> columns = new ArrayList<ReportingColumnAsync>();
  private @Valid MetricsReportingLevel level;
  private @Valid DataOutputFormat reportFormat = "JSON";
  private @Valid List<String> campaignIds = new ArrayList<String>();
  private @Valid List<CampaignSummaryStatus> campaignStatuses = new ArrayList<CampaignSummaryStatus>();
  private @Valid List<ObjectiveType> campaignObjectiveTypes = new ArrayList<ObjectiveType>();
  private @Valid List<String> adGroupIds = new ArrayList<String>();
  private @Valid List<AdGroupSummaryStatus> adGroupStatuses = new ArrayList<AdGroupSummaryStatus>();
  private @Valid List<String> adIds = new ArrayList<String>();
  private @Valid List<PinPromotionSummaryStatus> adStatuses = new ArrayList<PinPromotionSummaryStatus>();
  private @Valid List<String> productGroupIds = new ArrayList<String>();
  private @Valid List<ProductGroupSummaryStatus> productGroupStatuses = new ArrayList<ProductGroupSummaryStatus>();
  private @Valid List<String> productItemIds = new ArrayList<String>();
  private @Valid List<AdsAnalyticsTargetingType> targetingTypes = new ArrayList<AdsAnalyticsTargetingType>();
  private @Valid List<AdsAnalyticsMetricsFilter> metricsFilters = new ArrayList<AdsAnalyticsMetricsFilter>();

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   **/
  public AdsAnalyticsCreateAsyncRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

/**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   **/
  public AdsAnalyticsCreateAsyncRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  

  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

/**
   * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
   **/
  public AdsAnalyticsCreateAsyncRequest granularity(Granularity granularity) {
    this.granularity = granularity;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly")
  @JsonProperty("granularity")
  @NotNull
  public Granularity getGranularity() {
    return granularity;
  }

  @JsonProperty("granularity")
  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

/**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
   **/
  public AdsAnalyticsCreateAsyncRequest clickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
    return this;
  }

  

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }

  @JsonProperty("click_window_days")
  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

/**
   * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
   **/
  public AdsAnalyticsCreateAsyncRequest engagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
    return this;
  }

  

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @JsonProperty("engagement_window_days")
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }

  @JsonProperty("engagement_window_days")
  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

/**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
   **/
  public AdsAnalyticsCreateAsyncRequest viewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
    return this;
  }

  

  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
  @JsonProperty("view_window_days")
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }

  @JsonProperty("view_window_days")
  public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

/**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   **/
  public AdsAnalyticsCreateAsyncRequest conversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
    return this;
  }

  

  
  @ApiModelProperty(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }

  @JsonProperty("conversion_report_time")
  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

/**
   * List of types of attribution for the conversion report
   **/
  public AdsAnalyticsCreateAsyncRequest attributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
    return this;
  }

  

  
  @ApiModelProperty(value = "List of types of attribution for the conversion report")
  @JsonProperty("attribution_types")
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }

  @JsonProperty("attribution_types")
  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
  }

  public AdsAnalyticsCreateAsyncRequest addAttributionTypesItem(ConversionReportAttributionType attributionTypesItem) {
    if (this.attributionTypes == null) {
      this.attributionTypes = new ArrayList<ConversionReportAttributionType>();
    }

    this.attributionTypes.add(attributionTypesItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeAttributionTypesItem(ConversionReportAttributionType attributionTypesItem) {
    if (attributionTypesItem != null && this.attributionTypes != null) {
      this.attributionTypes.remove(attributionTypesItem);
    }

    return this;
  }
/**
   * Metric and entity columns
   **/
  public AdsAnalyticsCreateAsyncRequest columns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
    return this;
  }

  

  
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @JsonProperty("columns")
  @NotNull
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }

  @JsonProperty("columns")
  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

  public AdsAnalyticsCreateAsyncRequest addColumnsItem(ReportingColumnAsync columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<ReportingColumnAsync>();
    }

    this.columns.add(columnsItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeColumnsItem(ReportingColumnAsync columnsItem) {
    if (columnsItem != null && this.columns != null) {
      this.columns.remove(columnsItem);
    }

    return this;
  }
/**
   * Level of the report
   **/
  public AdsAnalyticsCreateAsyncRequest level(MetricsReportingLevel level) {
    this.level = level;
    return this;
  }

  

  
  @ApiModelProperty(example = "CAMPAIGN", required = true, value = "Level of the report")
  @JsonProperty("level")
  @NotNull
  public MetricsReportingLevel getLevel() {
    return level;
  }

  @JsonProperty("level")
  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

/**
   * Specification for formatting report data
   **/
  public AdsAnalyticsCreateAsyncRequest reportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
    return this;
  }

  

  
  @ApiModelProperty(value = "Specification for formatting report data")
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }

  @JsonProperty("report_format")
  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

/**
   * List of campaign ids
   **/
  public AdsAnalyticsCreateAsyncRequest campaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of campaign ids")
  @JsonProperty("campaign_ids")
 @Size(min=1,max=500)  public List<String> getCampaignIds() {
    return campaignIds;
  }

  @JsonProperty("campaign_ids")
  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  public AdsAnalyticsCreateAsyncRequest addCampaignIdsItem(String campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<String>();
    }

    this.campaignIds.add(campaignIdsItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeCampaignIdsItem(String campaignIdsItem) {
    if (campaignIdsItem != null && this.campaignIds != null) {
      this.campaignIds.remove(campaignIdsItem);
    }

    return this;
  }
/**
   * List of status values for filtering
   **/
  public AdsAnalyticsCreateAsyncRequest campaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of status values for filtering")
  @JsonProperty("campaign_statuses")
 @Size(min=1,max=6)  public List<CampaignSummaryStatus> getCampaignStatuses() {
    return campaignStatuses;
  }

  @JsonProperty("campaign_statuses")
  public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest addCampaignStatusesItem(CampaignSummaryStatus campaignStatusesItem) {
    if (this.campaignStatuses == null) {
      this.campaignStatuses = new ArrayList<CampaignSummaryStatus>();
    }

    this.campaignStatuses.add(campaignStatusesItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeCampaignStatusesItem(CampaignSummaryStatus campaignStatusesItem) {
    if (campaignStatusesItem != null && this.campaignStatuses != null) {
      this.campaignStatuses.remove(campaignStatusesItem);
    }

    return this;
  }
/**
   * List of values for filtering
   **/
  public AdsAnalyticsCreateAsyncRequest campaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"AWARENESS\",\"VIDEO_VIEW\"]", value = "List of values for filtering")
  @JsonProperty("campaign_objective_types")
 @Size(min=1,max=6)  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }

  @JsonProperty("campaign_objective_types")
  public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  public AdsAnalyticsCreateAsyncRequest addCampaignObjectiveTypesItem(ObjectiveType campaignObjectiveTypesItem) {
    if (this.campaignObjectiveTypes == null) {
      this.campaignObjectiveTypes = new ArrayList<ObjectiveType>();
    }

    this.campaignObjectiveTypes.add(campaignObjectiveTypesItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeCampaignObjectiveTypesItem(ObjectiveType campaignObjectiveTypesItem) {
    if (campaignObjectiveTypesItem != null && this.campaignObjectiveTypes != null) {
      this.campaignObjectiveTypes.remove(campaignObjectiveTypesItem);
    }

    return this;
  }
/**
   * List of ad group ids
   **/
  public AdsAnalyticsCreateAsyncRequest adGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad group ids")
  @JsonProperty("ad_group_ids")
 @Size(min=1,max=500)  public List<String> getAdGroupIds() {
    return adGroupIds;
  }

  @JsonProperty("ad_group_ids")
  public void setAdGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  public AdsAnalyticsCreateAsyncRequest addAdGroupIdsItem(String adGroupIdsItem) {
    if (this.adGroupIds == null) {
      this.adGroupIds = new ArrayList<String>();
    }

    this.adGroupIds.add(adGroupIdsItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeAdGroupIdsItem(String adGroupIdsItem) {
    if (adGroupIdsItem != null && this.adGroupIds != null) {
      this.adGroupIds.remove(adGroupIdsItem);
    }

    return this;
  }
/**
   * List of values for filtering
   **/
  public AdsAnalyticsCreateAsyncRequest adGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of values for filtering")
  @JsonProperty("ad_group_statuses")
 @Size(min=1,max=6)  public List<AdGroupSummaryStatus> getAdGroupStatuses() {
    return adGroupStatuses;
  }

  @JsonProperty("ad_group_statuses")
  public void setAdGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest addAdGroupStatusesItem(AdGroupSummaryStatus adGroupStatusesItem) {
    if (this.adGroupStatuses == null) {
      this.adGroupStatuses = new ArrayList<AdGroupSummaryStatus>();
    }

    this.adGroupStatuses.add(adGroupStatusesItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeAdGroupStatusesItem(AdGroupSummaryStatus adGroupStatusesItem) {
    if (adGroupStatusesItem != null && this.adGroupStatuses != null) {
      this.adGroupStatuses.remove(adGroupStatusesItem);
    }

    return this;
  }
/**
   * List of ad ids
   **/
  public AdsAnalyticsCreateAsyncRequest adIds(List<String> adIds) {
    this.adIds = adIds;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad ids")
  @JsonProperty("ad_ids")
 @Size(min=1,max=500)  public List<String> getAdIds() {
    return adIds;
  }

  @JsonProperty("ad_ids")
  public void setAdIds(List<String> adIds) {
    this.adIds = adIds;
  }

  public AdsAnalyticsCreateAsyncRequest addAdIdsItem(String adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<String>();
    }

    this.adIds.add(adIdsItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeAdIdsItem(String adIdsItem) {
    if (adIdsItem != null && this.adIds != null) {
      this.adIds.remove(adIdsItem);
    }

    return this;
  }
/**
   * List of values for filtering
   **/
  public AdsAnalyticsCreateAsyncRequest adStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"APPROVED\",\"PAUSED\"]", value = "List of values for filtering")
  @JsonProperty("ad_statuses")
 @Size(min=1,max=6)  public List<PinPromotionSummaryStatus> getAdStatuses() {
    return adStatuses;
  }

  @JsonProperty("ad_statuses")
  public void setAdStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest addAdStatusesItem(PinPromotionSummaryStatus adStatusesItem) {
    if (this.adStatuses == null) {
      this.adStatuses = new ArrayList<PinPromotionSummaryStatus>();
    }

    this.adStatuses.add(adStatusesItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeAdStatusesItem(PinPromotionSummaryStatus adStatusesItem) {
    if (adStatusesItem != null && this.adStatuses != null) {
      this.adStatuses.remove(adStatusesItem);
    }

    return this;
  }
/**
   * List of product group ids
   **/
  public AdsAnalyticsCreateAsyncRequest productGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of product group ids")
  @JsonProperty("product_group_ids")
 @Size(min=1,max=500)  public List<String> getProductGroupIds() {
    return productGroupIds;
  }

  @JsonProperty("product_group_ids")
  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  public AdsAnalyticsCreateAsyncRequest addProductGroupIdsItem(String productGroupIdsItem) {
    if (this.productGroupIds == null) {
      this.productGroupIds = new ArrayList<String>();
    }

    this.productGroupIds.add(productGroupIdsItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeProductGroupIdsItem(String productGroupIdsItem) {
    if (productGroupIdsItem != null && this.productGroupIds != null) {
      this.productGroupIds.remove(productGroupIdsItem);
    }

    return this;
  }
/**
   * List of values for filtering
   **/
  public AdsAnalyticsCreateAsyncRequest productGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of values for filtering")
  @JsonProperty("product_group_statuses")
 @Size(min=1,max=6)  public List<ProductGroupSummaryStatus> getProductGroupStatuses() {
    return productGroupStatuses;
  }

  @JsonProperty("product_group_statuses")
  public void setProductGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
  }

  public AdsAnalyticsCreateAsyncRequest addProductGroupStatusesItem(ProductGroupSummaryStatus productGroupStatusesItem) {
    if (this.productGroupStatuses == null) {
      this.productGroupStatuses = new ArrayList<ProductGroupSummaryStatus>();
    }

    this.productGroupStatuses.add(productGroupStatusesItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeProductGroupStatusesItem(ProductGroupSummaryStatus productGroupStatusesItem) {
    if (productGroupStatusesItem != null && this.productGroupStatuses != null) {
      this.productGroupStatuses.remove(productGroupStatusesItem);
    }

    return this;
  }
/**
   * List of product item ids
   **/
  public AdsAnalyticsCreateAsyncRequest productItemIds(List<String> productItemIds) {
    this.productItemIds = productItemIds;
    return this;
  }

  

  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of product item ids")
  @JsonProperty("product_item_ids")
 @Size(min=1,max=500)  public List<String> getProductItemIds() {
    return productItemIds;
  }

  @JsonProperty("product_item_ids")
  public void setProductItemIds(List<String> productItemIds) {
    this.productItemIds = productItemIds;
  }

  public AdsAnalyticsCreateAsyncRequest addProductItemIdsItem(String productItemIdsItem) {
    if (this.productItemIds == null) {
      this.productItemIds = new ArrayList<String>();
    }

    this.productItemIds.add(productItemIdsItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeProductItemIdsItem(String productItemIdsItem) {
    if (productItemIdsItem != null && this.productItemIds != null) {
      this.productItemIds.remove(productItemIdsItem);
    }

    return this;
  }
/**
   * List of targeting types
   **/
  public AdsAnalyticsCreateAsyncRequest targetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
    return this;
  }

  

  
  @ApiModelProperty(value = "List of targeting types")
  @JsonProperty("targeting_types")
 @Size(min=1,max=5)  public List<AdsAnalyticsTargetingType> getTargetingTypes() {
    return targetingTypes;
  }

  @JsonProperty("targeting_types")
  public void setTargetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  public AdsAnalyticsCreateAsyncRequest addTargetingTypesItem(AdsAnalyticsTargetingType targetingTypesItem) {
    if (this.targetingTypes == null) {
      this.targetingTypes = new ArrayList<AdsAnalyticsTargetingType>();
    }

    this.targetingTypes.add(targetingTypesItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeTargetingTypesItem(AdsAnalyticsTargetingType targetingTypesItem) {
    if (targetingTypesItem != null && this.targetingTypes != null) {
      this.targetingTypes.remove(targetingTypesItem);
    }

    return this;
  }
/**
   * List of metrics filters
   **/
  public AdsAnalyticsCreateAsyncRequest metricsFilters(List<AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
    return this;
  }

  

  
  @ApiModelProperty(value = "List of metrics filters")
  @JsonProperty("metrics_filters")
 @Size(min=1)  public List<AdsAnalyticsMetricsFilter> getMetricsFilters() {
    return metricsFilters;
  }

  @JsonProperty("metrics_filters")
  public void setMetricsFilters(List<AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

  public AdsAnalyticsCreateAsyncRequest addMetricsFiltersItem(AdsAnalyticsMetricsFilter metricsFiltersItem) {
    if (this.metricsFilters == null) {
      this.metricsFilters = new ArrayList<AdsAnalyticsMetricsFilter>();
    }

    this.metricsFilters.add(metricsFiltersItem);
    return this;
  }

  public AdsAnalyticsCreateAsyncRequest removeMetricsFiltersItem(AdsAnalyticsMetricsFilter metricsFiltersItem) {
    if (metricsFiltersItem != null && this.metricsFilters != null) {
      this.metricsFilters.remove(metricsFiltersItem);
    }

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

