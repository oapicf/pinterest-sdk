namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.KeywordMetricsResponse

module KeywordsMetricsArrayResponse =

  //#region KeywordsMetricsArrayResponse

  [<CLIMutable>]
  type KeywordsMetricsArrayResponse = {
    [<JsonProperty(PropertyName = "data")>]
    Data : KeywordMetricsResponse[];
  }

  //#endregion
