namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UserSummary
open OpenAPI.Model.string option

module UserFollowingGet200Response =

  //#region UserFollowingGet200Response

  [<CLIMutable>]
  type UserFollowingGet200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UserSummary[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
