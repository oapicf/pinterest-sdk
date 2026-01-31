namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.InviteType
open OpenAPI.Model.Permissions
open System.Collections.Generic

module CreateAssetInvitesRequestItem =

  //#region CreateAssetInvitesRequestItem


  type CreateAssetInvitesRequestItem = {
    AssetIdToPermissions : IDictionary<string, Permissions[]>;
    InviteId : string;
    InviteType : InviteType;
  }
  //#endregion
