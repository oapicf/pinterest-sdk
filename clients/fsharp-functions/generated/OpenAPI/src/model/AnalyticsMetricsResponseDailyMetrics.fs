namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module AnalyticsMetricsResponseDailyMetrics =

  //#region AnalyticsMetricsResponseDailyMetrics

  [<CLIMutable>]
  type AnalyticsMetricsResponseDailyMetrics = {
    [<JsonProperty(PropertyName = "data_status")>]
    DataStatus : string;
    [<JsonProperty(PropertyName = "date")>]
    Date : string;
    [<JsonProperty(PropertyName = "metrics")>]
    Metrics : IDictionary<string, decimal>;
  }

  //#endregion
