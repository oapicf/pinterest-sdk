namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CancelInviteResultItem

module CancelInvitesResponse =

  //#region CancelInvitesResponse

  [<CLIMutable>]
  type CancelInvitesResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : CancelInviteResultItem[];
  }

  //#endregion
