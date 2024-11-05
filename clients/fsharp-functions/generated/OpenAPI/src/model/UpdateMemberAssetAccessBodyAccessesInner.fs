namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Permissions

module UpdateMemberAssetAccessBodyAccessesInner =

  //#region UpdateMemberAssetAccessBodyAccessesInner

  [<CLIMutable>]
  type UpdateMemberAssetAccessBodyAccessesInner = {
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "member_id")>]
    MemberId : string;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : Permissions[];
  }

  //#endregion
