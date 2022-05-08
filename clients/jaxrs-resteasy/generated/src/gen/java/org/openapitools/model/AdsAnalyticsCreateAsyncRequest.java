package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2022-05-08T00:33:33.395237Z[Etc/UTC]")
public class AdsAnalyticsCreateAsyncRequest   {
  
  private String startDate;
  private String endDate;
  private Granularity granularity;
  private ConversionAttributionWindowDays clickWindowDays = 30;
  private ConversionAttributionWindowDays engagementWindowDays = 30;
  private ConversionAttributionWindowDays viewWindowDays = 1;
  private ConversionReportTimeType conversionReportTime = "TIME_OF_AD_ACTION";
  private List<ConversionReportAttributionType> attributionTypes = new ArrayList<ConversionReportAttributionType>();
  private List<ReportingColumnAsync> columns = new ArrayList<ReportingColumnAsync>();
  private MetricsReportingLevel level;
  private DataOutputFormat reportFormat = "JSON";
  private List<String> campaignIds = new ArrayList<String>();
  private List<CampaignSummaryStatus> campaignStatuses = new ArrayList<CampaignSummaryStatus>();
  private List<ObjectiveType> campaignObjectiveTypes = new ArrayList<ObjectiveType>();
  private List<String> adGroupIds = new ArrayList<String>();
  private List<AdGroupSummaryStatus> adGroupStatuses = new ArrayList<AdGroupSummaryStatus>();
  private List<String> adIds = new ArrayList<String>();
  private List<PinPromotionSummaryStatus> adStatuses = new ArrayList<PinPromotionSummaryStatus>();
  private List<String> productGroupIds = new ArrayList<String>();
  private List<ProductGroupSummaryStatus> productGroupStatuses = new ArrayList<ProductGroupSummaryStatus>();
  private List<String> productItemIds = new ArrayList<String>();
  private List<AdsAnalyticsTargetingType> targetingTypes = new ArrayList<AdsAnalyticsTargetingType>();
  private List<AdsAnalyticsMetricsFilter> metricsFilters = new ArrayList<AdsAnalyticsMetricsFilter>();

  /**
   * Metric report start date (UTC). Format: YYYY-MM-DD
   **/
  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report start date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Metric report end date (UTC). Format: YYYY-MM-DD
   **/
  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Metric report end date (UTC). Format: YYYY-MM-DD")
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly
   **/
  
  @ApiModelProperty(required = true, value = "TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly")
  @JsonProperty("granularity")
  @NotNull
  public Granularity getGranularity() {
    return granularity;
  }
  public void setGranularity(Granularity granularity) {
    this.granularity = granularity;
  }

  /**
   * Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
   **/
  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @JsonProperty("click_window_days")
  public ConversionAttributionWindowDays getClickWindowDays() {
    return clickWindowDays;
  }
  public void setClickWindowDays(ConversionAttributionWindowDays clickWindowDays) {
    this.clickWindowDays = clickWindowDays;
  }

  /**
   * Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days.
   **/
  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
  @JsonProperty("engagement_window_days")
  public ConversionAttributionWindowDays getEngagementWindowDays() {
    return engagementWindowDays;
  }
  public void setEngagementWindowDays(ConversionAttributionWindowDays engagementWindowDays) {
    this.engagementWindowDays = engagementWindowDays;
  }

  /**
   * Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day.
   **/
  
  @ApiModelProperty(value = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
  @JsonProperty("view_window_days")
  public ConversionAttributionWindowDays getViewWindowDays() {
    return viewWindowDays;
  }
  public void setViewWindowDays(ConversionAttributionWindowDays viewWindowDays) {
    this.viewWindowDays = viewWindowDays;
  }

  /**
   * The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
   **/
  
  @ApiModelProperty(value = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
  @JsonProperty("conversion_report_time")
  public ConversionReportTimeType getConversionReportTime() {
    return conversionReportTime;
  }
  public void setConversionReportTime(ConversionReportTimeType conversionReportTime) {
    this.conversionReportTime = conversionReportTime;
  }

  /**
   * List of types of attribution for the conversion report
   **/
  
  @ApiModelProperty(value = "List of types of attribution for the conversion report")
  @JsonProperty("attribution_types")
  public List<ConversionReportAttributionType> getAttributionTypes() {
    return attributionTypes;
  }
  public void setAttributionTypes(List<ConversionReportAttributionType> attributionTypes) {
    this.attributionTypes = attributionTypes;
  }

  /**
   * Metric and entity columns
   **/
  
  @ApiModelProperty(required = true, value = "Metric and entity columns")
  @JsonProperty("columns")
  @NotNull
  public List<ReportingColumnAsync> getColumns() {
    return columns;
  }
  public void setColumns(List<ReportingColumnAsync> columns) {
    this.columns = columns;
  }

  /**
   * Level of the report
   **/
  
  @ApiModelProperty(example = "CAMPAIGN", required = true, value = "Level of the report")
  @JsonProperty("level")
  @NotNull
  public MetricsReportingLevel getLevel() {
    return level;
  }
  public void setLevel(MetricsReportingLevel level) {
    this.level = level;
  }

  /**
   * Specification for formatting report data
   **/
  
  @ApiModelProperty(value = "Specification for formatting report data")
  @JsonProperty("report_format")
  public DataOutputFormat getReportFormat() {
    return reportFormat;
  }
  public void setReportFormat(DataOutputFormat reportFormat) {
    this.reportFormat = reportFormat;
  }

  /**
   * List of campaign ids
   **/
  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of campaign ids")
  @JsonProperty("campaign_ids")
 @Size(min=1,max=500)  public List<String> getCampaignIds() {
    return campaignIds;
  }
  public void setCampaignIds(List<String> campaignIds) {
    this.campaignIds = campaignIds;
  }

  /**
   * List of status values for filtering
   **/
  
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of status values for filtering")
  @JsonProperty("campaign_statuses")
 @Size(min=1,max=6)  public List<CampaignSummaryStatus> getCampaignStatuses() {
    return campaignStatuses;
  }
  public void setCampaignStatuses(List<CampaignSummaryStatus> campaignStatuses) {
    this.campaignStatuses = campaignStatuses;
  }

  /**
   * List of values for filtering
   **/
  
  @ApiModelProperty(example = "[\"AWARENESS\",\"VIDEO_VIEW\"]", value = "List of values for filtering")
  @JsonProperty("campaign_objective_types")
 @Size(min=1,max=6)  public List<ObjectiveType> getCampaignObjectiveTypes() {
    return campaignObjectiveTypes;
  }
  public void setCampaignObjectiveTypes(List<ObjectiveType> campaignObjectiveTypes) {
    this.campaignObjectiveTypes = campaignObjectiveTypes;
  }

  /**
   * List of ad group ids
   **/
  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad group ids")
  @JsonProperty("ad_group_ids")
 @Size(min=1,max=500)  public List<String> getAdGroupIds() {
    return adGroupIds;
  }
  public void setAdGroupIds(List<String> adGroupIds) {
    this.adGroupIds = adGroupIds;
  }

  /**
   * List of values for filtering
   **/
  
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of values for filtering")
  @JsonProperty("ad_group_statuses")
 @Size(min=1,max=6)  public List<AdGroupSummaryStatus> getAdGroupStatuses() {
    return adGroupStatuses;
  }
  public void setAdGroupStatuses(List<AdGroupSummaryStatus> adGroupStatuses) {
    this.adGroupStatuses = adGroupStatuses;
  }

  /**
   * List of ad ids
   **/
  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of ad ids")
  @JsonProperty("ad_ids")
 @Size(min=1,max=500)  public List<String> getAdIds() {
    return adIds;
  }
  public void setAdIds(List<String> adIds) {
    this.adIds = adIds;
  }

  /**
   * List of values for filtering
   **/
  
  @ApiModelProperty(example = "[\"APPROVED\",\"PAUSED\"]", value = "List of values for filtering")
  @JsonProperty("ad_statuses")
 @Size(min=1,max=6)  public List<PinPromotionSummaryStatus> getAdStatuses() {
    return adStatuses;
  }
  public void setAdStatuses(List<PinPromotionSummaryStatus> adStatuses) {
    this.adStatuses = adStatuses;
  }

  /**
   * List of product group ids
   **/
  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of product group ids")
  @JsonProperty("product_group_ids")
 @Size(min=1,max=500)  public List<String> getProductGroupIds() {
    return productGroupIds;
  }
  public void setProductGroupIds(List<String> productGroupIds) {
    this.productGroupIds = productGroupIds;
  }

  /**
   * List of values for filtering
   **/
  
  @ApiModelProperty(example = "[\"RUNNING\",\"PAUSED\"]", value = "List of values for filtering")
  @JsonProperty("product_group_statuses")
 @Size(min=1,max=6)  public List<ProductGroupSummaryStatus> getProductGroupStatuses() {
    return productGroupStatuses;
  }
  public void setProductGroupStatuses(List<ProductGroupSummaryStatus> productGroupStatuses) {
    this.productGroupStatuses = productGroupStatuses;
  }

  /**
   * List of product item ids
   **/
  
  @ApiModelProperty(example = "[\"12345678\"]", value = "List of product item ids")
  @JsonProperty("product_item_ids")
 @Size(min=1,max=500)  public List<String> getProductItemIds() {
    return productItemIds;
  }
  public void setProductItemIds(List<String> productItemIds) {
    this.productItemIds = productItemIds;
  }

  /**
   * List of targeting types
   **/
  
  @ApiModelProperty(value = "List of targeting types")
  @JsonProperty("targeting_types")
 @Size(min=1,max=5)  public List<AdsAnalyticsTargetingType> getTargetingTypes() {
    return targetingTypes;
  }
  public void setTargetingTypes(List<AdsAnalyticsTargetingType> targetingTypes) {
    this.targetingTypes = targetingTypes;
  }

  /**
   * List of metrics filters
   **/
  
  @ApiModelProperty(value = "List of metrics filters")
  @JsonProperty("metrics_filters")
 @Size(min=1)  public List<AdsAnalyticsMetricsFilter> getMetricsFilters() {
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
    return Objects.equals(startDate, adsAnalyticsCreateAsyncRequest.startDate) &&
        Objects.equals(endDate, adsAnalyticsCreateAsyncRequest.endDate) &&
        Objects.equals(granularity, adsAnalyticsCreateAsyncRequest.granularity) &&
        Objects.equals(clickWindowDays, adsAnalyticsCreateAsyncRequest.clickWindowDays) &&
        Objects.equals(engagementWindowDays, adsAnalyticsCreateAsyncRequest.engagementWindowDays) &&
        Objects.equals(viewWindowDays, adsAnalyticsCreateAsyncRequest.viewWindowDays) &&
        Objects.equals(conversionReportTime, adsAnalyticsCreateAsyncRequest.conversionReportTime) &&
        Objects.equals(attributionTypes, adsAnalyticsCreateAsyncRequest.attributionTypes) &&
        Objects.equals(columns, adsAnalyticsCreateAsyncRequest.columns) &&
        Objects.equals(level, adsAnalyticsCreateAsyncRequest.level) &&
        Objects.equals(reportFormat, adsAnalyticsCreateAsyncRequest.reportFormat) &&
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
        Objects.equals(metricsFilters, adsAnalyticsCreateAsyncRequest.metricsFilters);
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

