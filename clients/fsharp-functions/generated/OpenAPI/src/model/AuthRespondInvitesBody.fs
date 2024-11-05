namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuthRespondInvitesBodyInvitesInner

module AuthRespondInvitesBody =

  //#region AuthRespondInvitesBody

  [<CLIMutable>]
  type AuthRespondInvitesBody = {
    [<JsonProperty(PropertyName = "invites")>]
    Invites : AuthRespondInvitesBodyInvitesInner[];
  }

  //#endregion
