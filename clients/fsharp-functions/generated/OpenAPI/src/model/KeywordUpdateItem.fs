namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.int option

module KeywordUpdateItem =

  //#region KeywordUpdateItem

  [<CLIMutable>]
  type KeywordUpdateItem = {
    [<JsonProperty(PropertyName = "archived")>]
    Archived : bool;
    [<JsonProperty(PropertyName = "bid")>]
    Bid : int option;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
