namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InviteResponse
open OpenAPI.Model.string option

module GetInvites200Response =

  //#region GetInvites200Response

  [<CLIMutable>]
  type GetInvites200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : InviteResponse[];
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
  }

  //#endregion
