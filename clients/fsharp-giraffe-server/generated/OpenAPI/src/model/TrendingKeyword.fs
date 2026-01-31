namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.PredictedTimeSeries
open OpenAPI.Model.TimeSeries
open OpenAPI.Model.TrendingKeywordDemographics

module TrendingKeyword =

  //#region TrendingKeyword


  type TrendingKeyword = {
    Demographics : TrendingKeywordDemographics;
    HasPrediction : bool;
    Keyword : string;
    PctGrowthMom : int;
    PctGrowthWow : int;
    PctGrowthYoy : int;
    PredictedTimeSeries : PredictedTimeSeries;
    TimeSeries : TimeSeries;
  }
  //#endregion
