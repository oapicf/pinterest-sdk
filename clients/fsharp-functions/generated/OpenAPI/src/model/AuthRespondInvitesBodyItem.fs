namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuthRespondInviteAction

module AuthRespondInvitesBodyItem =

  //#region AuthRespondInvitesBodyItem

  [<CLIMutable>]
  type AuthRespondInvitesBodyItem = {
    [<JsonProperty(PropertyName = "action")>]
    Action : AuthRespondInviteAction;
    [<JsonProperty(PropertyName = "invite_id")>]
    InviteId : string;
  }

  //#endregion
