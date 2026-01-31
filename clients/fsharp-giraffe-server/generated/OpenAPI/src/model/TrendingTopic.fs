namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.TrendingPin
open System.Collections.Generic

module TrendingTopic =

  //#region TrendingTopic


  type TrendingTopic = {
    Description : string;
    PercentGrowthMom : int;
    Pins : TrendingPin[];
    RelatedInterests : string[];
    RelatedSearches : string[];
    TimeSeries : IDictionary<string, decimal>;
    Title : string;
  }
  //#endregion
