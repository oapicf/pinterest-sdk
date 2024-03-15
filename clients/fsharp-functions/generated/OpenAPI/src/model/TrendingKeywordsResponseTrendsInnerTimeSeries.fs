namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open System.Collections.Generic

module TrendingKeywordsResponseTrendsInnerTimeSeries =

  //#region TrendingKeywordsResponseTrendsInnerTimeSeries

  [<CLIMutable>]
  type TrendingKeywordsResponseTrendsInnerTimeSeries = {
    [<JsonProperty(PropertyName = "date")>]
    Date : DateTime;
  }

  //#endregion
