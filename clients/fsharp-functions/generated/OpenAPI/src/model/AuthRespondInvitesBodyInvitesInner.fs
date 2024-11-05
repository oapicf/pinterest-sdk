namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuthRespondInvitesBodyInvitesInnerAction

module AuthRespondInvitesBodyInvitesInner =

  //#region AuthRespondInvitesBodyInvitesInner

  [<CLIMutable>]
  type AuthRespondInvitesBodyInvitesInner = {
    [<JsonProperty(PropertyName = "action")>]
    Action : AuthRespondInvitesBodyInvitesInnerAction;
    [<JsonProperty(PropertyName = "invite_id")>]
    InviteId : string;
  }

  //#endregion
