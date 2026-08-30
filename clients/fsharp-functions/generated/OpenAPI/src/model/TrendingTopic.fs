namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.TrendingPin
open System.Collections.Generic

module TrendingTopic =

  //#region TrendingTopic

  [<CLIMutable>]
  type TrendingTopic = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "percent_growth_mom")>]
    PercentGrowthMom : int;
    [<JsonProperty(PropertyName = "pins")>]
    Pins : TrendingPin[];
    [<JsonProperty(PropertyName = "related_interests")>]
    RelatedInterests : string[];
    [<JsonProperty(PropertyName = "related_searches")>]
    RelatedSearches : string[];
    [<JsonProperty(PropertyName = "time_series")>]
    TimeSeries : IDictionary<string, decimal>;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
  }

  //#endregion
