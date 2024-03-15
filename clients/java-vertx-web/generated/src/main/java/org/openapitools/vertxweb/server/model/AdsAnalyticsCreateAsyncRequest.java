package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdGroupSummaryStatus;
import org.openapitools.vertxweb.server.model.AdsAnalyticsMetricsFilter;
import org.openapitools.vertxweb.server.model.AdsAnalyticsTargetingType;
import org.openapitools.vertxweb.server.model.CampaignSummaryStatus;
import org.openapitools.vertxweb.server.model.ConversionAttributionWindowDays;
import org.openapitools.vertxweb.server.model.ConversionReportAttributionType;
import org.openapitools.vertxweb.server.model.ConversionReportTimeType;
import org.openapitools.vertxweb.server.model.DataOutputFormat;
import org.openapitools.vertxweb.server.model.Granularity;
import org.openapitools.vertxweb.server.model.MetricsReportingLevel;
import org.openapitools.vertxweb.server.model.ObjectiveType;
import org.openapitools.vertxweb.server.model.PinPromotionSummaryStatus;
import org.openapitools.vertxweb.server.model.ProductGroupSummaryStatus;
import org.openapitools.vertxweb.server.model.ReportingColumnAsync;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsAnalyticsCreateAsyncRequest   {
  
  private String startDate;
  private String endDate;
  private Granularity granularity;
  private ConversionAttributionWindowDays clickWindowDays = ConversionAttributionWindowDays.NUMBER_30;
  private ConversionAttributionWindowDays engagementWindowDays = ConversionAttributionWindowDays.NUMBER_30;
  private ConversionAttributionWindowDays viewWindowDays = ConversionAttributionWindowDays.NUMBER_1;
  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";
  private List<ConversionReportAttributionType> attributionTypes;
  private List<String> campaignIds;
  private List<CampaignSummaryStatus> campaignStatuses;
  private List<ObjectiveType> campaignObjectiveTypes;
  private List<String> adGroupIds;
  private List<AdGroupSummaryStatus> adGroupStatuses;
  private List<String> adIds;
  private List<PinPromotionSummaryStatus> adStatuses;
  private List<String> productGroupIds;
  private List<ProductGroupSummaryStatus> productGroupStatuses;
  private List<String> productItemIds;
  private List<AdsAnalyticsTargetingType> targetingTypes;
  private List<AdsAnalyticsMetricsFilter> metricsFilters;
  private List<ReportingColumnAsync> columns = new ArrayList<>();
  private MetricsReportingLevel level;
  private DataOutputFormat reportFormat = "JSON";

  public AdsAnalyticsCreateAsyncRequest () {

  }

  public AdsAnalyticsCreateAsyncRequest (String startDate, String endDate, Granularity granularity, ConversionAttributionWindowDays clickWindowDays, ConversionAttributionWindowDays engagementWindowDays, ConversionAttributionWindowDays viewWindowDays, ConversionReportTimeType conversionReportTime, List<ConversionReportAttributionType> attributionTypes, List<String> campaignIds, List<CampaignSummaryStatus> campaignStatuses, List<ObjectiveType> campaignObjectiveTypes, List<String> adGroupIds, List<AdGroupSummaryStatus> adGroupStatuses, List<String> adIds, List<PinPromotionSummaryStatus> adStatuses, List<String> productGroupIds, List<ProductGroupSummaryStatus> productGroupStatuses, List<String> productItemIds, List<AdsAnalyticsTargetingType> targetingTypes, List<AdsAnalyticsMetricsFilter> metricsFilters, List<ReportingColumnAsync> columns, MetricsReportingLevel level, DataOutputFormat reportFormat) {
    this.startDate = startDate;
    this.endDate = endDate;
    this.granularity = granularity;
    this.clickWindowDays = clickWindowDays;
    this.engagementWindowDays = engagementWindowDays;
    this.viewWindowDays = viewWindowDays;
    this.conversionReportTime = conversionReportTime;
    this.attributionTypes = attributionTypes;
    this.campaignIds = campaignIds;
    this.campaignStatuses = campaignStatuses;
    this.campaignObjectiveTypes = campaignObjectiveTypes;
    this.adGroupIds = adGroupIds;
    this.adGroupStatuses = adGroupStatuses;
    this.adIds = adIds;
    this.adStatuses = adStatuses;
    this.productGroupIds = productGroupIds;
    this.productGroupStatuses = productGroupStatuses;
    this.productItemIds = productItemIds;
    this.targetingTypes = targetingTypes;
    this.metricsFilters = metricsFilters;
    this.columns = columns;
    this.level = level;
    this.reportFormat = reportFormat;
  }

    
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

    
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("granularity")
  public Granularity getGranularity() {
    return granularity;
  }
  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

    
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

    
  @JsonProperty("engagement_window_days")
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

    
  @JsonProperty("view_window_days")
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }
  public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

    
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }
  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

    
  @JsonProperty("attribution_types")
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }
  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
  }

    
  @JsonProperty("campaign_ids")
  public List<String> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

    
  @JsonProperty("campaign_statuses")
  public List<CampaignSummaryStatus> getCampaignStatuses() {
    return campaignStatuses;
  }
  public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

    
  @JsonProperty("campaign_objective_types")
  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }
  public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
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

    
  @JsonProperty("targeting_types")
  public List<AdsAnalyticsTargetingType> getTargetingTypes() {
    return targetingTypes;
  }
  public void setTargetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

    
  @JsonProperty("metrics_filters")
  public List<AdsAnalyticsMetricsFilter> getMetricsFilters() {
    return metricsFilters;
  }
  public void setMetricsFilters(List<AdsAnalyticsMetricsFilter> metricsFilters) {
    this.metricsFilters = metricsFilters;
  }

    
  @JsonProperty("columns")
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }
  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

    
  @JsonProperty("level")
  public MetricsReportingLevel getLevel() {
    return level;
  }
  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

    
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }
  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
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
    return Objects.equals(startDate, adsAnalyticsCreateAsyncRequest.startDate) &&
        Objects.equals(endDate, adsAnalyticsCreateAsyncRequest.endDate) &&
        Objects.equals(granularity, adsAnalyticsCreateAsyncRequest.granularity) &&
        Objects.equals(clickWindowDays, adsAnalyticsCreateAsyncRequest.clickWindowDays) &&
        Objects.equals(engagementWindowDays, adsAnalyticsCreateAsyncRequest.engagementWindowDays) &&
        Objects.equals(viewWindowDays, adsAnalyticsCreateAsyncRequest.viewWindowDays) &&
        Objects.equals(conversionReportTime, adsAnalyticsCreateAsyncRequest.conversionReportTime) &&
        Objects.equals(attributionTypes, adsAnalyticsCreateAsyncRequest.attributionTypes) &&
        Objects.equals(campaignIds, adsAnalyticsCreateAsyncRequest.campaignIds) &&
        Objects.equals(campaignStatuses, adsAnalyticsCreateAsyncRequest.campaignStatuses) &&
        Objects.equals(campaignObjectiveTypes, adsAnalyticsCreateAsyncRequest.campaignObjectiveTypes) &&
        Objects.equals(adGroupIds, adsAnalyticsCreateAsyncRequest.adGroupIds) &&
        Objects.equals(adGroupStatuses, adsAnalyticsCreateAsyncRequest.adGroupStatuses) &&
        Objects.equals(adIds, adsAnalyticsCreateAsyncRequest.adIds) &&
        Objects.equals(adStatuses, adsAnalyticsCreateAsyncRequest.adStatuses) &&
        Objects.equals(productGroupIds, adsAnalyticsCreateAsyncRequest.productGroupIds) &&
        Objects.equals(productGroupStatuses, adsAnalyticsCreateAsyncRequest.productGroupStatuses) &&
        Objects.equals(productItemIds, adsAnalyticsCreateAsyncRequest.productItemIds) &&
        Objects.equals(targetingTypes, adsAnalyticsCreateAsyncRequest.targetingTypes) &&
        Objects.equals(metricsFilters, adsAnalyticsCreateAsyncRequest.metricsFilters) &&
        Objects.equals(columns, adsAnalyticsCreateAsyncRequest.columns) &&
        Objects.equals(level, adsAnalyticsCreateAsyncRequest.level) &&
        Objects.equals(reportFormat, adsAnalyticsCreateAsyncRequest.reportFormat);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
