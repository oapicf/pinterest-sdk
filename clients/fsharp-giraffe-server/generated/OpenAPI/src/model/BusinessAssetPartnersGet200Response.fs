namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.UserSingleAssetBinding
open OpenAPI.Model.string option

module BusinessAssetPartnersGet200Response =

  //#region BusinessAssetPartnersGet200Response


  type business_asset_partners_get_200_response = {
    Items : UserSingleAssetBinding[];
    Bookmark : string option;
  }
  //#endregion
