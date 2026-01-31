namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Interest
open OpenAPI.Model.string option

module UserAccountFollowedInterests200Response =

  //#region UserAccountFollowedInterests200Response

  [<CLIMutable>]
  type UserAccountFollowedInterests200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : Interest[];
  }

  //#endregion
