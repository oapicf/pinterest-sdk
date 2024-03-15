namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.DataStatus
open System.Collections.Generic

module AnalyticsDailyMetrics =

  //#region AnalyticsDailyMetrics

  [<CLIMutable>]
  type AnalyticsDailyMetrics = {
    [<JsonProperty(PropertyName = "data_status")>]
    DataStatus : DataStatus;
    [<JsonProperty(PropertyName = "date")>]
    Date : string;
    [<JsonProperty(PropertyName = "metrics")>]
    Metrics : IDictionary<string, decimal>;
  }

  //#endregion
