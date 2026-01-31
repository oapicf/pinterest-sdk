namespace OpenAPI.Model

open System
open System.Collections.Generic
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

  //#region enums
  type TargetingTypesEnum[] = KEYWORDEnum of string[]  |  APPTYPEEnum of string[]  |  GENDEREnum of string[]  |  LOCATIONEnum of string[]  |  PLACEMENTEnum of string[]  |  COUNTRYEnum of string[]  |  TARGETEDINTERESTEnum of string[]  |  PINNERINTERESTEnum of string[]  |  AUDIENCEINCLUDEEnum of string[]  |  GEOEnum of string[]  |  AGEBUCKETEnum of string[]  |  REGIONEnum of string[]  |  MEDIATYPEEnum of string[]  |  AGEBUCKETANDGENDEREnum of string[]  |  AUDIENCEMULTIPLIEREnum of string[]  |  CREATIVEENHANCEMENTSEnum of string[]  |  LOCALADSSTORECODEEnum of string[]  
  //#endregion
  //#region enums
  type PrimarySortEnum = BYIDEnum of string  |  BYDATEEnum of string  
  //#endregion

  type AdsAnalyticsCreateAsyncRequest = {
    AttributionTypes : ConversionReportAttributionType[];
    ClickWindowDays : ConversionAttributionWindowDays;
    ConversionReportTime : ConversionReportTimeType;
    EndDate : string;
    EngagementWindowDays : ConversionAttributionWindowDays;
    Granularity : Granularity;
    StartDate : string;
    ViewWindowDays : ConversionAttributionWindowDays;
    CampaignIds : string[];
    CampaignStatuses : CampaignSummaryStatus[];
    CampaignObjectiveTypes : ObjectiveType[];
    CampaignBrandLabel : string;
    AdGroupIds : string[];
    AdGroupStatuses : AdGroupSummaryStatus[];
    AdIds : string[];
    AdStatuses : PinPromotionSummaryStatus[];
    ProductGroupIds : string[];
    ProductGroupStatuses : ProductGroupSummaryStatus[];
    ProductItemIds : string[];
    TargetingTypes : TargetingTypesEnum[];
    MetricsFilters : AdsAnalyticsMetricsFilter[];
    Columns : ReportingColumnAsync[];
    CombineTargetingTypes : bool;
    CustomConversionEventMetrics : AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics[];
    EndHour : int;
    Level : MetricsReportingLevel;
    PrimarySort : PrimarySortEnum;
    ReportFormat : DataOutputFormat;
    ReportingTimezone : ReportingTimeZone;
    StartHour : int;
  }
  //#endregion
