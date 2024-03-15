namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TrendingKeywordsResponseTrendsInnerTimeSeries

module TrendingKeywordsResponseTrendsInner =

  //#region TrendingKeywordsResponseTrendsInner


  type TrendingKeywordsResponse_trends_inner = {
    Keyword : string;
    PctGrowthWow : int;
    PctGrowthMom : int;
    PctGrowthYoy : int;
    TimeSeries : TrendingKeywordsResponseTrendsInnerTimeSeries;
  }
  //#endregion
