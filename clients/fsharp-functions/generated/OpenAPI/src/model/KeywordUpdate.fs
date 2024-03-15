namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option

module KeywordUpdate =

  //#region KeywordUpdate

  [<CLIMutable>]
  type KeywordUpdate = {
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
    [<JsonProperty(PropertyName = "archived")>]
    Archived : bool;
    [<JsonProperty(PropertyName = "bid")>]
    Bid : int option;
  }

  //#endregion
