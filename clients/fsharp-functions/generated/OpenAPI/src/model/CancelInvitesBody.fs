namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CancelInvitesBody =

  //#region CancelInvitesBody

  [<CLIMutable>]
  type CancelInvitesBody = {
    [<JsonProperty(PropertyName = "invite_ids")>]
    InviteIds : string[];
  }

  //#endregion
