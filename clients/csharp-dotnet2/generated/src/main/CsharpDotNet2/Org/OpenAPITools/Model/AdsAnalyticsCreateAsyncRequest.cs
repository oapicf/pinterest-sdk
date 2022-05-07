using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class AdsAnalyticsCreateAsyncRequest {
    /// <summary>
    /// Metric report start date (UTC). Format: YYYY-MM-DD
    /// </summary>
    /// <value>Metric report start date (UTC). Format: YYYY-MM-DD</value>
    [DataMember(Name="start_date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "start_date")]
    public string StartDate { get; set; }

    /// <summary>
    /// Metric report end date (UTC). Format: YYYY-MM-DD
    /// </summary>
    /// <value>Metric report end date (UTC). Format: YYYY-MM-DD</value>
    [DataMember(Name="end_date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "end_date")]
    public string EndDate { get; set; }

    /// <summary>
    /// TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
    /// </summary>
    /// <value>TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly</value>
    [DataMember(Name="granularity", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "granularity")]
    public Granularity Granularity { get; set; }

    /// <summary>
    /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    /// </summary>
    /// <value>Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</value>
    [DataMember(Name="click_window_days", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "click_window_days")]
    public ConversionAttributionWindowDays ClickWindowDays { get; set; }

    /// <summary>
    /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
    /// </summary>
    /// <value>Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.</value>
    [DataMember(Name="engagement_window_days", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "engagement_window_days")]
    public ConversionAttributionWindowDays EngagementWindowDays { get; set; }

    /// <summary>
    /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
    /// </summary>
    /// <value>Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.</value>
    [DataMember(Name="view_window_days", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "view_window_days")]
    public ConversionAttributionWindowDays ViewWindowDays { get; set; }

    /// <summary>
    /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
    /// </summary>
    /// <value>The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.</value>
    [DataMember(Name="conversion_report_time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "conversion_report_time")]
    public ConversionReportTimeType ConversionReportTime { get; set; }

    /// <summary>
    /// List of types of attribution for the conversion report
    /// </summary>
    /// <value>List of types of attribution for the conversion report</value>
    [DataMember(Name="attribution_types", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "attribution_types")]
    public List<ConversionReportAttributionType> AttributionTypes { get; set; }

    /// <summary>
    /// Metric and entity columns
    /// </summary>
    /// <value>Metric and entity columns</value>
    [DataMember(Name="columns", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "columns")]
    public List<ReportingColumnAsync> Columns { get; set; }

    /// <summary>
    /// Level of the report
    /// </summary>
    /// <value>Level of the report</value>
    [DataMember(Name="level", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "level")]
    public MetricsReportingLevel Level { get; set; }

    /// <summary>
    /// Specification for formatting report data
    /// </summary>
    /// <value>Specification for formatting report data</value>
    [DataMember(Name="report_format", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "report_format")]
    public DataOutputFormat ReportFormat { get; set; }

    /// <summary>
    /// List of campaign ids
    /// </summary>
    /// <value>List of campaign ids</value>
    [DataMember(Name="campaign_ids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "campaign_ids")]
    public List<string> CampaignIds { get; set; }

    /// <summary>
    /// List of status values for filtering
    /// </summary>
    /// <value>List of status values for filtering</value>
    [DataMember(Name="campaign_statuses", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "campaign_statuses")]
    public List<CampaignSummaryStatus> CampaignStatuses { get; set; }

    /// <summary>
    /// List of values for filtering
    /// </summary>
    /// <value>List of values for filtering</value>
    [DataMember(Name="campaign_objective_types", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "campaign_objective_types")]
    public List<ObjectiveType> CampaignObjectiveTypes { get; set; }

    /// <summary>
    /// List of ad group ids
    /// </summary>
    /// <value>List of ad group ids</value>
    [DataMember(Name="ad_group_ids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ad_group_ids")]
    public List<string> AdGroupIds { get; set; }

    /// <summary>
    /// List of values for filtering
    /// </summary>
    /// <value>List of values for filtering</value>
    [DataMember(Name="ad_group_statuses", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ad_group_statuses")]
    public List<AdGroupSummaryStatus> AdGroupStatuses { get; set; }

    /// <summary>
    /// List of ad ids
    /// </summary>
    /// <value>List of ad ids</value>
    [DataMember(Name="ad_ids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ad_ids")]
    public List<string> AdIds { get; set; }

    /// <summary>
    /// List of values for filtering
    /// </summary>
    /// <value>List of values for filtering</value>
    [DataMember(Name="ad_statuses", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ad_statuses")]
    public List<PinPromotionSummaryStatus> AdStatuses { get; set; }

    /// <summary>
    /// List of product group ids
    /// </summary>
    /// <value>List of product group ids</value>
    [DataMember(Name="product_group_ids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "product_group_ids")]
    public List<string> ProductGroupIds { get; set; }

    /// <summary>
    /// List of values for filtering
    /// </summary>
    /// <value>List of values for filtering</value>
    [DataMember(Name="product_group_statuses", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "product_group_statuses")]
    public List<ProductGroupSummaryStatus> ProductGroupStatuses { get; set; }

    /// <summary>
    /// List of product item ids
    /// </summary>
    /// <value>List of product item ids</value>
    [DataMember(Name="product_item_ids", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "product_item_ids")]
    public List<string> ProductItemIds { get; set; }

    /// <summary>
    /// List of targeting types
    /// </summary>
    /// <value>List of targeting types</value>
    [DataMember(Name="targeting_types", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "targeting_types")]
    public List<AdsAnalyticsTargetingType> TargetingTypes { get; set; }

    /// <summary>
    /// List of metrics filters
    /// </summary>
    /// <value>List of metrics filters</value>
    [DataMember(Name="metrics_filters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "metrics_filters")]
    public List<AdsAnalyticsMetricsFilter> MetricsFilters { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AdsAnalyticsCreateAsyncRequest {\n");
      sb.Append("  StartDate: ").Append(StartDate).Append("\n");
      sb.Append("  EndDate: ").Append(EndDate).Append("\n");
      sb.Append("  Granularity: ").Append(Granularity).Append("\n");
      sb.Append("  ClickWindowDays: ").Append(ClickWindowDays).Append("\n");
      sb.Append("  EngagementWindowDays: ").Append(EngagementWindowDays).Append("\n");
      sb.Append("  ViewWindowDays: ").Append(ViewWindowDays).Append("\n");
      sb.Append("  ConversionReportTime: ").Append(ConversionReportTime).Append("\n");
      sb.Append("  AttributionTypes: ").Append(AttributionTypes).Append("\n");
      sb.Append("  Columns: ").Append(Columns).Append("\n");
      sb.Append("  Level: ").Append(Level).Append("\n");
      sb.Append("  ReportFormat: ").Append(ReportFormat).Append("\n");
      sb.Append("  CampaignIds: ").Append(CampaignIds).Append("\n");
      sb.Append("  CampaignStatuses: ").Append(CampaignStatuses).Append("\n");
      sb.Append("  CampaignObjectiveTypes: ").Append(CampaignObjectiveTypes).Append("\n");
      sb.Append("  AdGroupIds: ").Append(AdGroupIds).Append("\n");
      sb.Append("  AdGroupStatuses: ").Append(AdGroupStatuses).Append("\n");
      sb.Append("  AdIds: ").Append(AdIds).Append("\n");
      sb.Append("  AdStatuses: ").Append(AdStatuses).Append("\n");
      sb.Append("  ProductGroupIds: ").Append(ProductGroupIds).Append("\n");
      sb.Append("  ProductGroupStatuses: ").Append(ProductGroupStatuses).Append("\n");
      sb.Append("  ProductItemIds: ").Append(ProductItemIds).Append("\n");
      sb.Append("  TargetingTypes: ").Append(TargetingTypes).Append("\n");
      sb.Append("  MetricsFilters: ").Append(MetricsFilters).Append("\n");
      sb.Append("}\n");
      return sb.ToString();
    }

    /// <summary>
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
    }

}
}
