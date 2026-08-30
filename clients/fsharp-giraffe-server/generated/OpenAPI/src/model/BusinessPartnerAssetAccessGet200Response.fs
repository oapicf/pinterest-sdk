namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.BaseBusinessAssets
open OpenAPI.Model.string option

module BusinessPartnerAssetAccessGet200Response =

  //#region BusinessPartnerAssetAccessGet200Response


  type business_partner_asset_access_get_200_response = {
    Bookmark : string option;
    Items : BaseBusinessAssets[];
  }
  //#endregion
