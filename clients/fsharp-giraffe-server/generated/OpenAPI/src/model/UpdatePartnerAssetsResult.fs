namespace OpenAPI.Model

open System
open System.Collections.Generic

module UpdatePartnerAssetsResult =

  //#region UpdatePartnerAssetsResult


  type UpdatePartnerAssetsResult = {
    AssetId : string;
    AssetType : string;
    PartnerId : string;
    Permissions : string[];
  }
  //#endregion
