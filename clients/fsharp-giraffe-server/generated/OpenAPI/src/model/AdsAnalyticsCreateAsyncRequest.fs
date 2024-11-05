namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AdGroupSummaryStatus
open OpenAPI.Model.AdsAnalyticsMetricsFilter
open OpenAPI.Model.AdsAnalyticsTargetingType
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

module AdsAnalyticsCreateAsyncRequest =

  //#region AdsAnalyticsCreateAsyncRequest

  //#region enums
  type PrimarySortEnum = IDEnum of string  |  DATEEnum of string  
  //#endregion

  type AdsAnalyticsCreateAsyncRequest = {
    StartDate : string;
    EndDate : string;
    Granularity : Granularity;
    ClickWindowDays : ConversionAttributionWindowDays;
    EngagementWindowDays : ConversionAttributionWindowDays;
    ViewWindowDays : ConversionAttributionWindowDays;
    ConversionReportTime : ConversionReportTimeType;
    AttributionTypes : ConversionReportAttributionType[];
    CampaignIds : string[];
    CampaignStatuses : CampaignSummaryStatus[];
    CampaignObjectiveTypes : ObjectiveType[];
    AdGroupIds : string[];
    AdGroupStatuses : AdGroupSummaryStatus[];
    AdIds : string[];
    AdStatuses : PinPromotionSummaryStatus[];
    ProductGroupIds : string[];
    ProductGroupStatuses : ProductGroupSummaryStatus[];
    ProductItemIds : string[];
    TargetingTypes : AdsAnalyticsTargetingType[];
    MetricsFilters : AdsAnalyticsMetricsFilter[];
    Columns : ReportingColumnAsync[];
    Level : MetricsReportingLevel;
    ReportFormat : DataOutputFormat;
    PrimarySort : PrimarySortEnum;
    StartHour : int;
    EndHour : int;
  }
  //#endregion
