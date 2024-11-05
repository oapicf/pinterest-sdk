namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.InviteType
open OpenAPI.Model.Permissions
open System.Collections.Generic

module CreateAssetInvitesRequestItem =

  //#region CreateAssetInvitesRequestItem

  [<CLIMutable>]
  type CreateAssetInvitesRequestItem = {
    [<JsonProperty(PropertyName = "invite_id")>]
    InviteId : string;
    [<JsonProperty(PropertyName = "invite_type")>]
    InviteType : InviteType;
    [<JsonProperty(PropertyName = "asset_id_to_permissions")>]
    AssetIdToPermissions : IDictionary<string, Permissions[]>;
  }

  //#endregion
