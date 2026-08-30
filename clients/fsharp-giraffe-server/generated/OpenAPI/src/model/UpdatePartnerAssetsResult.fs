namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetTypeResponse

module UpdatePartnerAssetsResult =

  //#region UpdatePartnerAssetsResult


  type UpdatePartnerAssetsResult = {
    AssetId : string;
    AssetType : AssetTypeResponse;
    PartnerId : string;
    Permissions : string[];
  }
  //#endregion
