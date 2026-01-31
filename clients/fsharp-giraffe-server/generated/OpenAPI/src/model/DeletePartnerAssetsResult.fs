namespace OpenAPI.Model

open System
open System.Collections.Generic

module DeletePartnerAssetsResult =

  //#region DeletePartnerAssetsResult


  type DeletePartnerAssetsResult = {
    AssetId : string;
    AssetType : string;
    IsSharedPartner : bool;
    PartnerId : string;
    Permissions : string[];
  }
  //#endregion
