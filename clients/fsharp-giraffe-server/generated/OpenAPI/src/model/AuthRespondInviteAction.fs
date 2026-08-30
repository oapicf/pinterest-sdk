namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Permissions
open System.Collections.Generic

module AuthRespondInviteAction =

  //#region AuthRespondInviteAction


  type AuthRespondInviteAction = {
    AcceptInvite : bool;
    AssetIdToPermissions : IDictionary<string, list>;
  }
  //#endregion
