namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DataOutputFormat
open OpenAPI.Model.MetricsReportingLevel
open OpenAPI.Model.ReportingColumnAsync

module AdsAnalyticsCreateAsyncRequestAllOf1 =

  //#region AdsAnalyticsCreateAsyncRequestAllOf1

  [<CLIMutable>]
  type AdsAnalyticsCreateAsyncRequestAllOf1 = {
    [<JsonProperty(PropertyName = "columns")>]
    Columns : ReportingColumnAsync[];
    [<JsonProperty(PropertyName = "level")>]
    Level : MetricsReportingLevel;
    [<JsonProperty(PropertyName = "report_format")>]
    ReportFormat : DataOutputFormat;
  }

  //#endregion
