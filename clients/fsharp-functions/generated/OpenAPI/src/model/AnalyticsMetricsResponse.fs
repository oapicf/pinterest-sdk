namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AnalyticsDailyMetrics
open System.Collections.Generic

module AnalyticsMetricsResponse =

  //#region AnalyticsMetricsResponse

  [<CLIMutable>]
  type AnalyticsMetricsResponse = {
    [<JsonProperty(PropertyName = "summary_metrics")>]
    SummaryMetrics : IDictionary<string, decimal>;
    [<JsonProperty(PropertyName = "daily_metrics")>]
    DailyMetrics : AnalyticsDailyMetrics[];
  }

  //#endregion
