namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeletePartnerAssetAccessResult =

  //#region DeletePartnerAssetAccessResult


  type DeletePartnerAssetAccessResult = {
    AssetId : string;
    AssetType : string;
    IsSharedPartner : bool;
    PartnerId : string;
    Permissions : string[];
  }
  //#endregion
