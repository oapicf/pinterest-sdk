namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Permissions

module UpdateMemberAssetAccessItem =

  //#region UpdateMemberAssetAccessItem


  type UpdateMemberAssetAccessItem = {
    AssetId : string;
    MemberId : string;
    Permissions : Permissions[];
  }
  //#endregion
