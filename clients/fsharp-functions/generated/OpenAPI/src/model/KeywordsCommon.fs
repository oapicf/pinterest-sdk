namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MatchTypeResponse
open OpenAPI.Model.int option

module KeywordsCommon =

  //#region KeywordsCommon

  [<CLIMutable>]
  type KeywordsCommon = {
    [<JsonProperty(PropertyName = "bid")>]
    Bid : int option;
    [<JsonProperty(PropertyName = "match_type")>]
    MatchType : MatchTypeResponse;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
