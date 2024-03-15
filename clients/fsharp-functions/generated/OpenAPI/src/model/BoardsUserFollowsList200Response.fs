namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Board
open OpenAPI.Model.string option

module BoardsUserFollowsList200Response =

  //#region BoardsUserFollowsList200Response

  [<CLIMutable>]
  type BoardsUserFollowsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : Board[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
