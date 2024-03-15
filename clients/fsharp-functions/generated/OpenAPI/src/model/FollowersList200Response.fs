namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.UserSummary
open OpenAPI.Model.string option

module FollowersList200Response =

  //#region FollowersList200Response

  [<CLIMutable>]
  type FollowersList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : UserSummary[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
