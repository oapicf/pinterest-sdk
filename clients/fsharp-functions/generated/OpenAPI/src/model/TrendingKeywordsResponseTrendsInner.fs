namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TrendingKeywordsResponseTrendsInnerTimeSeries

module TrendingKeywordsResponseTrendsInner =

  //#region TrendingKeywordsResponseTrendsInner

  [<CLIMutable>]
  type TrendingKeywordsResponseTrendsInner = {
    [<JsonProperty(PropertyName = "keyword")>]
    Keyword : string;
    [<JsonProperty(PropertyName = "pct_growth_wow")>]
    PctGrowthWow : int;
    [<JsonProperty(PropertyName = "pct_growth_mom")>]
    PctGrowthMom : int;
    [<JsonProperty(PropertyName = "pct_growth_yoy")>]
    PctGrowthYoy : int;
    [<JsonProperty(PropertyName = "time_series")>]
    TimeSeries : TrendingKeywordsResponseTrendsInnerTimeSeries;
  }

  //#endregion
