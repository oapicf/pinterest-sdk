namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PinAnalyticsMetricsResponseDailyMetricsInner
open System.Collections.Generic

module PinAnalyticsMetricsResponse =

  //#region PinAnalyticsMetricsResponse

  [<CLIMutable>]
  type PinAnalyticsMetricsResponse = {
    [<JsonProperty(PropertyName = "lifetime_metrics")>]
    LifetimeMetrics : IDictionary<string, int>;
    [<JsonProperty(PropertyName = "daily_metrics")>]
    DailyMetrics : PinAnalyticsMetricsResponseDailyMetricsInner[];
    [<JsonProperty(PropertyName = "summary_metrics")>]
    SummaryMetrics : IDictionary<string, decimal>;
  }

  //#endregion
