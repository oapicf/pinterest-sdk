namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdGroupSummaryStatus
open OpenAPI.Model.AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics
open OpenAPI.Model.AdsAnalyticsMetricsFilter
open OpenAPI.Model.CampaignSummaryStatus
open OpenAPI.Model.ConversionAttributionWindowDays
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.ConversionReportTimeType
open OpenAPI.Model.DataOutputFormat
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsReportingLevel
open OpenAPI.Model.ObjectiveType
open OpenAPI.Model.PinPromotionSummaryStatus
open OpenAPI.Model.ProductGroupSummaryStatus
open OpenAPI.Model.ReportingColumnAsync
open OpenAPI.Model.ReportingTimeZone

module AdsAnalyticsCreateAsyncRequest =

  //#region AdsAnalyticsCreateAsyncRequest

  [<CLIMutable>]
  type AdsAnalyticsCreateAsyncRequest = {
    [<JsonProperty(PropertyName = "attribution_types")>]
    AttributionTypes : ConversionReportAttributionType[];
    [<JsonProperty(PropertyName = "click_window_days")>]
    ClickWindowDays : ConversionAttributionWindowDays;
    [<JsonProperty(PropertyName = "conversion_report_time")>]
    ConversionReportTime : ConversionReportTimeType;
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : string;
    [<JsonProperty(PropertyName = "engagement_window_days")>]
    EngagementWindowDays : ConversionAttributionWindowDays;
    [<JsonProperty(PropertyName = "granularity")>]
    Granularity : Granularity;
    [<JsonProperty(PropertyName = "start_date")>]
    StartDate : string;
    [<JsonProperty(PropertyName = "view_window_days")>]
    ViewWindowDays : ConversionAttributionWindowDays;
    [<JsonProperty(PropertyName = "campaign_ids")>]
    CampaignIds : string[];
    [<JsonProperty(PropertyName = "campaign_statuses")>]
    CampaignStatuses : CampaignSummaryStatus[];
    [<JsonProperty(PropertyName = "campaign_objective_types")>]
    CampaignObjectiveTypes : ObjectiveType[];
    [<JsonProperty(PropertyName = "campaign_brand_label")>]
    CampaignBrandLabel : string;
    [<JsonProperty(PropertyName = "ad_group_ids")>]
    AdGroupIds : string[];
    [<JsonProperty(PropertyName = "ad_group_statuses")>]
    AdGroupStatuses : AdGroupSummaryStatus[];
    [<JsonProperty(PropertyName = "ad_ids")>]
    AdIds : string[];
    [<JsonProperty(PropertyName = "ad_statuses")>]
    AdStatuses : PinPromotionSummaryStatus[];
    [<JsonProperty(PropertyName = "product_group_ids")>]
    ProductGroupIds : string[];
    [<JsonProperty(PropertyName = "product_group_statuses")>]
    ProductGroupStatuses : ProductGroupSummaryStatus[];
    [<JsonProperty(PropertyName = "product_item_ids")>]
    ProductItemIds : string[];
    [<JsonProperty(PropertyName = "targeting_types")>]
    TargetingTypes : string[];
    [<JsonProperty(PropertyName = "metrics_filters")>]
    MetricsFilters : AdsAnalyticsMetricsFilter[];
    [<JsonProperty(PropertyName = "columns")>]
    Columns : ReportingColumnAsync[];
    [<JsonProperty(PropertyName = "combine_targeting_types")>]
    CombineTargetingTypes : bool;
    [<JsonProperty(PropertyName = "custom_conversion_event_metrics")>]
    CustomConversionEventMetrics : AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics[];
    [<JsonProperty(PropertyName = "end_hour")>]
    EndHour : int;
    [<JsonProperty(PropertyName = "level")>]
    Level : MetricsReportingLevel;
    [<JsonProperty(PropertyName = "primary_sort")>]
    PrimarySort : string;
    [<JsonProperty(PropertyName = "report_format")>]
    ReportFormat : DataOutputFormat;
    [<JsonProperty(PropertyName = "reporting_timezone")>]
    ReportingTimezone : ReportingTimeZone;
    [<JsonProperty(PropertyName = "start_hour")>]
    StartHour : int;
  }

  //#endregion
