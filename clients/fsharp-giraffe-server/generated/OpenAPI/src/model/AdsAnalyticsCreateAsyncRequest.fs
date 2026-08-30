namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdAdsAnalyticsAsyncTargetingTypes
open OpenAPI.Model.AdGroupSummaryStatus
open OpenAPI.Model.AdsAnalyticsMetricsFilter
open OpenAPI.Model.CampaignObjectiveType
open OpenAPI.Model.CampaignSummaryStatus
open OpenAPI.Model.ConversionAttributionWindowDays
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.ConversionReportTimeType
open OpenAPI.Model.CustomConversionEventMetrics
open OpenAPI.Model.DataOutputFormat
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsReportingLevel
open OpenAPI.Model.PinPromotionSummaryStatus
open OpenAPI.Model.PrimarySort
open OpenAPI.Model.ProductGroupSummaryStatus
open OpenAPI.Model.ReportingColumnAsync
open OpenAPI.Model.ReportingTimeZone

module AdsAnalyticsCreateAsyncRequest =

  //#region AdsAnalyticsCreateAsyncRequest


  type AdsAnalyticsCreateAsyncRequest = {
    AdGroupIds : string[];
    AdGroupStatuses : AdGroupSummaryStatus[];
    AdIds : string[];
    AdStatuses : PinPromotionSummaryStatus[];
    AttributionTypes : ConversionReportAttributionType[];
    CampaignBrandLabel : string;
    CampaignCustomLabel : string;
    CampaignIds : string[];
    CampaignObjectiveTypes : CampaignObjectiveType[];
    CampaignStatuses : CampaignSummaryStatus[];
    ClickWindowDays : ConversionAttributionWindowDays;
    Columns : ReportingColumnAsync[];
    CombineTargetingTypes : bool;
    ConversionReportTime : ConversionReportTimeType;
    CustomConversionEventMetrics : CustomConversionEventMetrics[];
    EndDate : string;
    EndHour : int;
    EngagementWindowDays : ConversionAttributionWindowDays;
    Granularity : Granularity;
    Level : MetricsReportingLevel;
    MetricsFilters : AdsAnalyticsMetricsFilter[];
    PrimarySort : PrimarySort;
    ProductGroupIds : string[];
    ProductGroupStatuses : ProductGroupSummaryStatus[];
    ProductItemIds : string[];
    ReportFormat : DataOutputFormat;
    ReportingTimezone : ReportingTimeZone;
    StartDate : string;
    StartHour : int;
    TargetingTypes : AdAdsAnalyticsAsyncTargetingTypes[];
    ViewWindowDays : ConversionAttributionWindowDays;
  }
  //#endregion
