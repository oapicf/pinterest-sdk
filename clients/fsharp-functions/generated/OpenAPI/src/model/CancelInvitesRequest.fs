namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CancelInvitesRequest =

  //#region CancelInvitesRequest

  [<CLIMutable>]
  type CancelInvitesRequest = {
    [<JsonProperty(PropertyName = "invite_ids")>]
    InviteIds : string[];
  }

  //#endregion
