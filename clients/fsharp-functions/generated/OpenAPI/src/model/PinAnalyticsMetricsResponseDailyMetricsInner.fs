namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module PinAnalyticsMetricsResponseDailyMetricsInner =

  //#region PinAnalyticsMetricsResponseDailyMetricsInner

  [<CLIMutable>]
  type PinAnalyticsMetricsResponseDailyMetricsInner = {
    [<JsonProperty(PropertyName = "data_status")>]
    DataStatus : DataStatus;
    [<JsonProperty(PropertyName = "date")>]
    Date : string;
    [<JsonProperty(PropertyName = "metrics")>]
    Metrics : IDictionary<string, decimal>;
  }

  //#endregion
