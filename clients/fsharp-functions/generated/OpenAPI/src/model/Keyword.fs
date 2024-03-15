namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MatchTypeResponse
open OpenAPI.Model.int option

module Keyword =

  //#region Keyword

  [<CLIMutable>]
  type Keyword = {
    [<JsonProperty(PropertyName = "archived")>]
    Archived : bool;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "parent_id")>]
    ParentId : string;
    [<JsonProperty(PropertyName = "parent_type")>]
    ParentType : string;
    [<JsonProperty(PropertyName = "type")>]
    Type : string;
    [<JsonProperty(PropertyName = "bid")>]
    Bid : int option;
    [<JsonProperty(PropertyName = "match_type")>]
    MatchType : MatchTypeResponse;
    [<JsonProperty(PropertyName = "value")>]
    Value : string;
  }

  //#endregion
