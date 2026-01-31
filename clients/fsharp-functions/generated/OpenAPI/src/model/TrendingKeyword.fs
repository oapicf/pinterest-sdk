namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.PredictedTimeSeries
open OpenAPI.Model.TimeSeries
open OpenAPI.Model.TrendingKeywordDemographics

module TrendingKeyword =

  //#region TrendingKeyword

  [<CLIMutable>]
  type TrendingKeyword = {
    [<JsonProperty(PropertyName = "demographics")>]
    Demographics : TrendingKeywordDemographics;
    [<JsonProperty(PropertyName = "has_prediction")>]
    HasPrediction : bool;
    [<JsonProperty(PropertyName = "keyword")>]
    Keyword : string;
    [<JsonProperty(PropertyName = "pct_growth_mom")>]
    PctGrowthMom : int;
    [<JsonProperty(PropertyName = "pct_growth_wow")>]
    PctGrowthWow : int;
    [<JsonProperty(PropertyName = "pct_growth_yoy")>]
    PctGrowthYoy : int;
    [<JsonProperty(PropertyName = "predicted_time_series")>]
    PredictedTimeSeries : PredictedTimeSeries;
    [<JsonProperty(PropertyName = "time_series")>]
    TimeSeries : TimeSeries;
  }

  //#endregion
