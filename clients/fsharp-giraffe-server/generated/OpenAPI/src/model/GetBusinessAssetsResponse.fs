namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.GetBusinessAssetsResponseCatalogInfo

module GetBusinessAssetsResponse =

  //#region GetBusinessAssetsResponse


  type GetBusinessAssetsResponse = {
    AssetGroupInfo : AssetGroupBinding;
    AssetId : string;
    AssetType : string;
    CatalogInfo : GetBusinessAssetsResponseCatalogInfo;
  }
  //#endregion
