namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Permissions
open System.Collections.Generic

module AuthRespondInvitesBodyInvitesInnerAction =

  //#region AuthRespondInvitesBodyInvitesInnerAction


  type AuthRespondInvitesBody_invites_inner_action = {
    AcceptInvite : bool;
    AssetIdToPermissions : IDictionary<string, Permissions[]>;
  }
  //#endregion
