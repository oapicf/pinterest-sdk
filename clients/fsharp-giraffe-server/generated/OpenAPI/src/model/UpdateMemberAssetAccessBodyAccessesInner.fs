namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Permissions

module UpdateMemberAssetAccessBodyAccessesInner =

  //#region UpdateMemberAssetAccessBodyAccessesInner


  type UpdateMemberAssetAccessBody_accesses_inner = {
    AssetId : string;
    MemberId : string;
    Permissions : Permissions[];
  }
  //#endregion
