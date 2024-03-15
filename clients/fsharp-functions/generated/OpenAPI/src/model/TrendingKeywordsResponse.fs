namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TrendingKeywordsResponseTrendsInner

module TrendingKeywordsResponse =

  //#region TrendingKeywordsResponse

  [<CLIMutable>]
  type TrendingKeywordsResponse = {
    [<JsonProperty(PropertyName = "trends")>]
    Trends : TrendingKeywordsResponseTrendsInner[];
  }

  //#endregion
