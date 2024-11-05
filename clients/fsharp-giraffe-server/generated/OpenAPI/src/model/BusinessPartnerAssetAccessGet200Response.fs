namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GetPartnerAssetsResponse
open OpenAPI.Model.string option

module BusinessPartnerAssetAccessGet200Response =

  //#region BusinessPartnerAssetAccessGet200Response


  type business_partner_asset_access_get_200_response = {
    Items : GetPartnerAssetsResponse[];
    Bookmark : string option;
  }
  //#endregion
