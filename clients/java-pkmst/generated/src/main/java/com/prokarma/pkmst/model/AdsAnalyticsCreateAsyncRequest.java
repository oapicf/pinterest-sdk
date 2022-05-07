package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AdGroupSummaryStatus;
import com.prokarma.pkmst.model.AdsAnalyticsCreateAsyncRequestAllOf;
import com.prokarma.pkmst.model.AdsAnalyticsCreateAsyncRequestAllOf1;
import com.prokarma.pkmst.model.AdsAnalyticsMetricsFilter;
import com.prokarma.pkmst.model.AdsAnalyticsTargetingType;
import com.prokarma.pkmst.model.CampaignSummaryStatus;
import com.prokarma.pkmst.model.ConversionAttributionWindowDays;
import com.prokarma.pkmst.model.ConversionReportAttributionType;
import com.prokarma.pkmst.model.ConversionReportTimeType;
import com.prokarma.pkmst.model.DataOutputFormat;
import com.prokarma.pkmst.model.Granularity;
import com.prokarma.pkmst.model.MetricsReportingLevel;
import com.prokarma.pkmst.model.ObjectiveType;
import com.prokarma.pkmst.model.PinPromotionSummaryStatus;
import com.prokarma.pkmst.model.ProductGroupSummaryStatus;
import com.prokarma.pkmst.model.ReportingColumnAsync;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AdsAnalyticsCreateAsyncRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2022-05-07T06:39:36.253940Z[Etc/UTC]")
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
  
  private List<ConversionReportAttributionType> attributionTypes = null;

  @JsonProperty("columns")
  
  private List<ReportingColumnAsync> columns = new ArrayList<>();

  @JsonProperty("level")
  private MetricsReportingLevel level;

  @JsonProperty("report_format")
  private DataOutputFormat reportFormat = "JSON";

  @JsonProperty("campaign_ids")
  
  private List<String> campaignIds = null;

  @JsonProperty("campaign_statuses")
  
  private List<CampaignSummaryStatus> campaignStatuses = null;

  @JsonProperty("campaign_objective_types")
  
  private List<ObjectiveType> campaignObjectiveTypes = null;

  @JsonProperty("ad_group_ids")
  
  private List<String> adGroupIds = null;

  @JsonProperty("ad_group_statuses")
  
  private List<AdGroupSummaryStatus> adGroupStatuses = null;

  @JsonProperty("ad_ids")
  
  private List<String> adIds = null;

  @JsonProperty("ad_statuses")
  
  private List<PinPromotionSummaryStatus> adStatuses = null;

  @JsonProperty("product_group_ids")
  
  private List<String> productGroupIds = null;

  @JsonProperty("product_group_statuses")
  
  private List<ProductGroupSummaryStatus> productGroupStatuses = null;

  @JsonProperty("product_item_ids")
  
  private List<String> productItemIds = null;

  @JsonProperty("targeting_types")
  
  private List<AdsAnalyticsTargetingType> targetingTypes = null;

  @JsonProperty("metrics_filters")
  
  private List<AdsAnalyticsMetricsFilter> metricsFilters = null;

  public AdsAnalyticsCreateAsyncRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   * @return startDate
  **/
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")
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
  **/
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
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
  **/
  @ApiModelProperty(required = true, value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly")
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
  **/
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
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
  **/
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
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
  **/
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
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
  **/
  @ApiModelProperty(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
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
  **/
  @ApiModelProperty(value = "List of types of attribution for the conversion report")
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
  **/
  @ApiModelProperty(required = true, value = "Metric and entity columns")
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
  **/
  @ApiModelProperty(example = "CAMPAIGN", required = true, value = "Level of the report")
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
  **/
  @ApiModelProperty(value = "Specification for formatting report data")
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
  **/
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of campaign ids")
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
  **/
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of status values for filtering")
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
  **/
  @ApiModelProperty(example = "[\"AWARENESS\",\"VIDEO_VIEW\"]", value = "List of values for filtering")
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
  **/
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad group ids")
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
  **/
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of values for filtering")
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
  **/
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad ids")
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
  **/
  @ApiModelProperty(example = "[\"APPROVED\",\"PAUSED\"]", value = "List of values for filtering")
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
  **/
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of product group ids")
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
  **/
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of values for filtering")
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
  **/
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of product item ids")
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
  **/
  @ApiModelProperty(value = "List of targeting types")
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
  **/
  @ApiModelProperty(value = "List of metrics filters")
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

