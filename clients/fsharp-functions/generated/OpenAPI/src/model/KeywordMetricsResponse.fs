namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.KeywordMetrics

module KeywordMetricsResponse =

  //#region KeywordMetricsResponse

  [<CLIMutable>]
  type KeywordMetricsResponse = {
    [<JsonProperty(PropertyName = "keyword")>]
    Keyword : string;
    [<JsonProperty(PropertyName = "metrics")>]
    Metrics : KeywordMetrics;
  }

  //#endregion
