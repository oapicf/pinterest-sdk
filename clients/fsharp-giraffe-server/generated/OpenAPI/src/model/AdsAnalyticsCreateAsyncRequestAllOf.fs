namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionAttributionWindowDays
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.ConversionReportTimeType
open OpenAPI.Model.Granularity

module AdsAnalyticsCreateAsyncRequestAllOf =

  //#region AdsAnalyticsCreateAsyncRequestAllOf


  type AdsAnalyticsCreateAsyncRequest_allOf = {
    StartDate : string;
    EndDate : string;
    Granularity : Granularity;
    ClickWindowDays : ConversionAttributionWindowDays;
    EngagementWindowDays : ConversionAttributionWindowDays;
    ViewWindowDays : ConversionAttributionWindowDays;
    ConversionReportTime : ConversionReportTimeType;
    AttributionTypes : ConversionReportAttributionType[];
  }
  //#endregion
