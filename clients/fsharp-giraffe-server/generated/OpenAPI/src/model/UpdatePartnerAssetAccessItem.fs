namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.Permissions

module UpdatePartnerAssetAccessItem =

  //#region UpdatePartnerAssetAccessItem


  type UpdatePartnerAssetAccessItem = {
    AssetId : string;
    PartnerId : string;
    Permissions : Permissions[];
  }
  //#endregion
