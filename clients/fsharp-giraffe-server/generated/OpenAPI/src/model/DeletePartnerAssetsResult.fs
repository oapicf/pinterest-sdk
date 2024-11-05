namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeletePartnerAssetsResult =

  //#region DeletePartnerAssetsResult


  type DeletePartnerAssetsResult = {
    AssetId : string;
    AssetType : string;
    Permissions : string[];
    IsSharedPartner : bool;
    PartnerId : string;
  }
  //#endregion
