namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnalyticsMetricsResponseDailyMetrics
open System.Collections.Generic

module AnalyticsMetricsResponse =

  //#region AnalyticsMetricsResponse

  [<CLIMutable>]
  type AnalyticsMetricsResponse = {
    [<JsonProperty(PropertyName = "daily_metrics")>]
    DailyMetrics : AnalyticsMetricsResponseDailyMetrics[];
    [<JsonProperty(PropertyName = "summary_metrics")>]
    SummaryMetrics : IDictionary<string, decimal>;
  }

  //#endregion
