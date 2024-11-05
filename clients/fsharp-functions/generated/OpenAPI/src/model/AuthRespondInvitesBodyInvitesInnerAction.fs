namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Permissions
open System.Collections.Generic

module AuthRespondInvitesBodyInvitesInnerAction =

  //#region AuthRespondInvitesBodyInvitesInnerAction

  [<CLIMutable>]
  type AuthRespondInvitesBodyInvitesInnerAction = {
    [<JsonProperty(PropertyName = "accept_invite")>]
    AcceptInvite : bool;
    [<JsonProperty(PropertyName = "asset_id_to_permissions")>]
    AssetIdToPermissions : IDictionary<string, Permissions[]>;
  }

  //#endregion
