namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.GetBusinessAssetsResponse
open OpenAPI.Model.string option

module BusinessAssetsGet200Response =

  //#region BusinessAssetsGet200Response


  type business_assets_get_200_response = {
    Items : GetBusinessAssetsResponse[];
    Bookmark : string option;
  }
  //#endregion
