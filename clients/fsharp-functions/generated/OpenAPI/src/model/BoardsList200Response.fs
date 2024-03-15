namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Board
open OpenAPI.Model.string option

module BoardsList200Response =

  //#region BoardsList200Response

  [<CLIMutable>]
  type BoardsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : Board[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
