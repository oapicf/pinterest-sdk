namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Board
open OpenAPI.Model.string option

module SearchUserBoardsGet200Response =

  //#region SearchUserBoardsGet200Response

  [<CLIMutable>]
  type SearchUserBoardsGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : Board[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
