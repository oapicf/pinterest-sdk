namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AuthRespondInvitesBodyItem

module AuthRespondInvitesBody =

  //#region AuthRespondInvitesBody

  [<CLIMutable>]
  type AuthRespondInvitesBody = {
    [<JsonProperty(PropertyName = "invites")>]
    Invites : AuthRespondInvitesBodyItem[];
  }

  //#endregion
