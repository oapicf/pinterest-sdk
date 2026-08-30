namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AuthRespondInviteAction

module AuthRespondInvitesBodyItem =

  //#region AuthRespondInvitesBodyItem


  type AuthRespondInvitesBodyItem = {
    Action : AuthRespondInviteAction;
    InviteId : string;
  }
  //#endregion
