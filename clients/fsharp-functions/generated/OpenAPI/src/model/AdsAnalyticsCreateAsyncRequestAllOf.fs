namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionAttributionWindowDays
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.ConversionReportTimeType
open OpenAPI.Model.Granularity

module AdsAnalyticsCreateAsyncRequestAllOf =

  //#region AdsAnalyticsCreateAsyncRequestAllOf

  [<CLIMutable>]
  type AdsAnalyticsCreateAsyncRequestAllOf = {
    [<JsonProperty(PropertyName = "start_date")>]
    StartDate : string;
    [<JsonProperty(PropertyName = "end_date")>]
    EndDate : string;
    [<JsonProperty(PropertyName = "granularity")>]
    Granularity : Granularity;
    [<JsonProperty(PropertyName = "click_window_days")>]
    ClickWindowDays : ConversionAttributionWindowDays;
    [<JsonProperty(PropertyName = "engagement_window_days")>]
    EngagementWindowDays : ConversionAttributionWindowDays;
    [<JsonProperty(PropertyName = "view_window_days")>]
    ViewWindowDays : ConversionAttributionWindowDays;
    [<JsonProperty(PropertyName = "conversion_report_time")>]
    ConversionReportTime : ConversionReportTimeType;
    [<JsonProperty(PropertyName = "attribution_types")>]
    AttributionTypes : ConversionReportAttributionType[];
  }

  //#endregion
