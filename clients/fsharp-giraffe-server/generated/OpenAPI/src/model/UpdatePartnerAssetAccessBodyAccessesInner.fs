namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Permissions

module UpdatePartnerAssetAccessBodyAccessesInner =

  //#region UpdatePartnerAssetAccessBodyAccessesInner


  type UpdatePartnerAssetAccessBody_accesses_inner = {
    AssetId : string;
    PartnerId : string;
    Permissions : Permissions[];
  }
  //#endregion
