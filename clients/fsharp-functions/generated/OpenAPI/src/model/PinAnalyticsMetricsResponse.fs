namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinAnalyticsDailyMetrics
open System.Collections.Generic

module PinAnalyticsMetricsResponse =

  //#region PinAnalyticsMetricsResponse

  [<CLIMutable>]
  type PinAnalyticsMetricsResponse = {
    [<JsonProperty(PropertyName = "daily_metrics")>]
    DailyMetrics : PinAnalyticsDailyMetrics[];
    [<JsonProperty(PropertyName = "lifetime_metrics")>]
    LifetimeMetrics : IDictionary<string, int>;
    [<JsonProperty(PropertyName = "summary_metrics")>]
    SummaryMetrics : IDictionary<string, decimal>;
  }

  //#endregion
