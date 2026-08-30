namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CancelInviteException =

  //#region CancelInviteException

  [<CLIMutable>]
  type CancelInviteException = {
    [<JsonProperty(PropertyName = "invite_id")>]
    InviteId : string;
    [<JsonProperty(PropertyName = "message")>]
    Message : string;
  }

  //#endregion
