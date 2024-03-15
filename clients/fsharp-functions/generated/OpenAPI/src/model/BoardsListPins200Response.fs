namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Pin
open OpenAPI.Model.string option

module BoardsListPins200Response =

  //#region BoardsListPins200Response

  [<CLIMutable>]
  type BoardsListPins200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : Pin[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
