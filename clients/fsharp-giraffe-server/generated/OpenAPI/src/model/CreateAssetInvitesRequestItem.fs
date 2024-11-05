namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InviteType
open OpenAPI.Model.Permissions
open System.Collections.Generic

module CreateAssetInvitesRequestItem =

  //#region CreateAssetInvitesRequestItem


  type CreateAssetInvitesRequestItem = {
    InviteId : string;
    InviteType : InviteType;
    AssetIdToPermissions : IDictionary<string, Permissions[]>;
  }
  //#endregion
