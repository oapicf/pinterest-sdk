package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdAdsAnalyticsAsyncTargetingTypes;
import org.openapitools.vertxweb.server.model.AdGroupSummaryStatus;
import org.openapitools.vertxweb.server.model.AdsAnalyticsMetricsFilter;
import org.openapitools.vertxweb.server.model.CampaignObjectiveType;
import org.openapitools.vertxweb.server.model.CampaignSummaryStatus;
import org.openapitools.vertxweb.server.model.ConversionAttributionWindowDays;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.ConversionReportTimeType;
import org.openapitools.vertxweb.server.model.CustomConversionEventMetrics;
import org.openapitools.vertxweb.server.model.DataOutputFormat;
import org.openapitools.vertxweb.server.model.Granularity;
import org.openapitools.vertxweb.server.model.MetricsReportingLevel;
import org.openapitools.vertxweb.server.model.PinPromotionSummaryStatus;
import org.openapitools.vertxweb.server.model.PrimarySort;
import org.openapitools.vertxweb.server.model.ProductGroupSummaryStatus;
import org.openapitools.vertxweb.server.model.ReportingColumnAsync;
import org.openapitools.vertxweb.server.model.ReportingTimeZone;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsAnalyticsCreateAsyncRequest   {
  
  private List<String> adGroupIds = new ArrayList<>();
  private List<AdGroupSummaryStatus> adGroupStatuses = new ArrayList<>();
  private List<String> adIds = new ArrayList<>();
  private List<PinPromotionSummaryStatus> adStatuses = new ArrayList<>();
  private List<ConversionReportAttributionType> attributionTypes = new ArrayList<>();
  private String campaignBrandLabel;
  private String campaignCustomLabel;
  private List<String> campaignIds = new ArrayList<>();
  private List<CampaignObjectiveType> campaignObjectiveTypes = new ArrayList<>();
  private List<CampaignSummaryStatus> campaignStatuses = new ArrayList<>();
  private ConversionAttributionWindowDays clickWindowDays;
  private List<ReportingColumnAsync> columns = new ArrayList<>();
  private Boolean combineTargetingTypes = false;
  private ConversionReportTimeType conversionReportTime;
  private List<CustomConversionEventMetrics> customConversionEventMetrics = new ArrayList<>();
  private String endDate;
  private Integer endHour;
  private ConversionAttributionWindowDays engagementWindowDays;
  private Granularity granularity;
  private MetricsReportingLevel level;
  private List<AdsAnalyticsMetricsFilter> metricsFilters = new ArrayList<>();
  private PrimarySort primarySort;
  private List<String> productGroupIds = new ArrayList<>();
  private List<ProductGroupSummaryStatus> productGroupStatuses = new ArrayList<>();
  private List<String> productItemIds = new ArrayList<>();
  private DataOutputFormat reportFormat;
  private ReportingTimeZone reportingTimezone;
  private String startDate;
  private Integer startHour;
  private List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes = new ArrayList<>();
  private ConversionAttributionWindowDays viewWindowDays;

  public AdsAnalyticsCreateAsyncRequest () {

  }

  public AdsAnalyticsCreateAsyncRequest (List<String> adGroupIds, List<AdGroupSummaryStatus> adGroupStatuses, List<String> adIds, List<PinPromotionSummaryStatus> adStatuses, List<ConversionReportAttributionType> attributionTypes, String campaignBrandLabel, String campaignCustomLabel, List<String> campaignIds, List<CampaignObjectiveType> campaignObjectiveTypes, List<CampaignSummaryStatus> campaignStatuses, ConversionAttributionWindowDays clickWindowDays, List<ReportingColumnAsync> columns, Boolean combineTargetingTypes, ConversionReportTimeType conversionReportTime, List<CustomConversionEventMetrics> customConversionEventMetrics, String endDate, Integer endHour, ConversionAttributionWindowDays engagementWindowDays, Granularity granularity, MetricsReportingLevel level, List<AdsAnalyticsMetricsFilter> metricsFilters, PrimarySort primarySort, List<String> productGroupIds, List<ProductGroupSummaryStatus> productGroupStatuses, List<String> productItemIds, DataOutputFormat reportFormat, ReportingTimeZone reportingTimezone, String startDate, Integer startHour, List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes, ConversionAttributionWindowDays viewWindowDays) {
    this.adGroupIds = adGroupIds;
    this.adGroupStatuses = adGroupStatuses;
    this.adIds = adIds;
    this.adStatuses = adStatuses;
    this.attributionTypes = attributionTypes;
    this.campaignBrandLabel = campaignBrandLabel;
    this.campaignCustomLabel = campaignCustomLabel;
    this.campaignIds = campaignIds;
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    this.campaignStatuses = campaignStatuses;
    this.clickWindowDays = clickWindowDays;
    this.columns = columns;
    this.combineTargetingTypes = combineTargetingTypes;
    this.conversionReportTime = conversionReportTime;
    this.customConversionEventMetrics = customConversionEventMetrics;
    this.endDate = endDate;
    this.endHour = endHour;
    this.engagementWindowDays = engagementWindowDays;
    this.granularity = granularity;
    this.level = level;
    this.metricsFilters = metricsFilters;
    this.primarySort = primarySort;
    this.productGroupIds = productGroupIds;
    this.productGroupStatuses = productGroupStatuses;
    this.productItemIds = productItemIds;
    this.reportFormat = reportFormat;
    this.reportingTimezone = reportingTimezone;
    this.startDate = startDate;
    this.startHour = startHour;
    this.targetingTypes = targetingTypes;
    this.viewWindowDays = viewWindowDays;
  }

    
  @JsonProperty("ad_group_ids")
  public List<String> getAdGroupIds() {
    return adGroupIds;
  }
  public void setAdGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

    
  @JsonProperty("ad_group_statuses")
  public List<AdGroupSummaryStatus> getAdGroupStatuses() {
    return adGroupStatuses;
  }
  public void setAdGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
  }

    
  @JsonProperty("ad_ids")
  public List<String> getAdIds() {
    return adIds;
  }
  public void setAdIds(List<String> adIds) {
    this.adIds = adIds;
  }

    
  @JsonProperty("ad_statuses")
  public List<PinPromotionSummaryStatus> getAdStatuses() {
    return adStatuses;
  }
  public void setAdStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
  }

    
  @JsonProperty("attribution_types")
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }
  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
  }

    
  @JsonProperty("campaign_brand_label")
  public String getCampaignBrandLabel() {
    return campaignBrandLabel;
  }
  public void setCampaignBrandLabel(String campaignBrandLabel) {
    this.campaignBrandLabel = campaignBrandLabel;
  }

    
  @JsonProperty("campaign_custom_label")
  public String getCampaignCustomLabel() {
    return campaignCustomLabel;
  }
  public void setCampaignCustomLabel(String campaignCustomLabel) {
    this.campaignCustomLabel = campaignCustomLabel;
  }

    
  @JsonProperty("campaign_ids")
  public List<String> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

    
  @JsonProperty("campaign_objective_types")
  public List<CampaignObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }
  public void setCampaignObjectiveTypes(List<CampaignObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

    
  @JsonProperty("campaign_statuses")
  public List<CampaignSummaryStatus> getCampaignStatuses() {
    return campaignStatuses;
  }
  public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

    
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

    
  @JsonProperty("columns")
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }
  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

    
  @JsonProperty("combine_targeting_types")
  public Boolean getCombineTargetingTypes() {
    return combineTargetingTypes;
  }
  public void setCombineTargetingTypes(Boolean combineTargetingTypes) {
    this.combineTargetingTypes = combineTargetingTypes;
  }

    
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }
  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

    
  @JsonProperty("custom_conversion_event_metrics")
  public List<CustomConversionEventMetrics> getCustomConversionEventMetrics() {
    return customConversionEventMetrics;
  }
  public void setCustomConversionEventMetrics(List<CustomConversionEventMetrics> customConversionEventMetrics) {
    this.customConversionEventMetrics = customConversionEventMetrics;
  }

    
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("end_hour")
  public Integer getEndHour() {
    return endHour;
  }
  public void setEndHour(Integer endHour) {
    this.endHour = endHour;
  }

    
  @JsonProperty("engagement_window_days")
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

    
  @JsonProperty("granularity")
  public Granularity getGranularity() {
    return granularity;
  }
  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

    
  @JsonProperty("level")
  public MetricsReportingLevel getLevel() {
    return level;
  }
  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

    
  @JsonProperty("metrics_filters")
  public List<AdsAnalyticsMetricsFilter> getMetricsFilters() {
    return metricsFilters;
  }
  public void setMetricsFilters(List<AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

    
  @JsonProperty("primary_sort")
  public PrimarySort getPrimarySort() {
    return primarySort;
  }
  public void setPrimarySort(PrimarySort primarySort) {
    this.primarySort = primarySort;
  }

    
  @JsonProperty("product_group_ids")
  public List<String> getProductGroupIds() {
    return productGroupIds;
  }
  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

    
  @JsonProperty("product_group_statuses")
  public List<ProductGroupSummaryStatus> getProductGroupStatuses() {
    return productGroupStatuses;
  }
  public void setProductGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
  }

    
  @JsonProperty("product_item_ids")
  public List<String> getProductItemIds() {
    return productItemIds;
  }
  public void setProductItemIds(List<String> productItemIds) {
    this.productItemIds = productItemIds;
  }

    
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }
  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

    
  @JsonProperty("reporting_timezone")
  public ReportingTimeZone getReportingTimezone() {
    return reportingTimezone;
  }
  public void setReportingTimezone(ReportingTimeZone reportingTimezone) {
    this.reportingTimezone = reportingTimezone;
  }

    
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

    
  @JsonProperty("start_hour")
  public Integer getStartHour() {
    return startHour;
  }
  public void setStartHour(Integer startHour) {
    this.startHour = startHour;
  }

    
  @JsonProperty("targeting_types")
  public List<AdAdsAnalyticsAsyncTargetingTypes> getTargetingTypes() {
    return targetingTypes;
  }
  public void setTargetingTypes(List<AdAdsAnalyticsAsyncTargetingTypes> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

    
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
    return Objects.equals(adGroupIds, adsAnalyticsCreateAsyncRequest.adGroupIds) &&
        Objects.equals(adGroupStatuses, adsAnalyticsCreateAsyncRequest.adGroupStatuses) &&
        Objects.equals(adIds, adsAnalyticsCreateAsyncRequest.adIds) &&
        Objects.equals(adStatuses, adsAnalyticsCreateAsyncRequest.adStatuses) &&
        Objects.equals(attributionTypes, adsAnalyticsCreateAsyncRequest.attributionTypes) &&
        Objects.equals(campaignBrandLabel, adsAnalyticsCreateAsyncRequest.campaignBrandLabel) &&
        Objects.equals(campaignCustomLabel, adsAnalyticsCreateAsyncRequest.campaignCustomLabel) &&
        Objects.equals(campaignIds, adsAnalyticsCreateAsyncRequest.campaignIds) &&
        Objects.equals(campaignObjectiveTypes, adsAnalyticsCreateAsyncRequest.campaignObjectiveTypes) &&
        Objects.equals(campaignStatuses, adsAnalyticsCreateAsyncRequest.campaignStatuses) &&
        Objects.equals(clickWindowDays, adsAnalyticsCreateAsyncRequest.clickWindowDays) &&
        Objects.equals(columns, adsAnalyticsCreateAsyncRequest.columns) &&
        Objects.equals(combineTargetingTypes, adsAnalyticsCreateAsyncRequest.combineTargetingTypes) &&
        Objects.equals(conversionReportTime, adsAnalyticsCreateAsyncRequest.conversionReportTime) &&
        Objects.equals(customConversionEventMetrics, adsAnalyticsCreateAsyncRequest.customConversionEventMetrics) &&
        Objects.equals(endDate, adsAnalyticsCreateAsyncRequest.endDate) &&
        Objects.equals(endHour, adsAnalyticsCreateAsyncRequest.endHour) &&
        Objects.equals(engagementWindowDays, adsAnalyticsCreateAsyncRequest.engagementWindowDays) &&
        Objects.equals(granularity, adsAnalyticsCreateAsyncRequest.granularity) &&
        Objects.equals(level, adsAnalyticsCreateAsyncRequest.level) &&
        Objects.equals(metricsFilters, adsAnalyticsCreateAsyncRequest.metricsFilters) &&
        Objects.equals(primarySort, adsAnalyticsCreateAsyncRequest.primarySort) &&
        Objects.equals(productGroupIds, adsAnalyticsCreateAsyncRequest.productGroupIds) &&
        Objects.equals(productGroupStatuses, adsAnalyticsCreateAsyncRequest.productGroupStatuses) &&
        Objects.equals(productItemIds, adsAnalyticsCreateAsyncRequest.productItemIds) &&
        Objects.equals(reportFormat, adsAnalyticsCreateAsyncRequest.reportFormat) &&
        Objects.equals(reportingTimezone, adsAnalyticsCreateAsyncRequest.reportingTimezone) &&
        Objects.equals(startDate, adsAnalyticsCreateAsyncRequest.startDate) &&
        Objects.equals(startHour, adsAnalyticsCreateAsyncRequest.startHour) &&
        Objects.equals(targetingTypes, adsAnalyticsCreateAsyncRequest.targetingTypes) &&
        Objects.equals(viewWindowDays, adsAnalyticsCreateAsyncRequest.viewWindowDays);
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
