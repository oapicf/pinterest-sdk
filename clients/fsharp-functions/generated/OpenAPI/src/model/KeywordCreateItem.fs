namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MatchType
open OpenAPI.Model.int option

module KeywordCreateItem =

  //#region KeywordCreateItem

  [<CLIMutable>]
  type KeywordCreateItem = {
    [<JsonProperty(PropertyName = "bid")>]
    Bid : int option;
    [<JsonProperty(PropertyName = "match_type")>]
    MatchType : MatchType;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
