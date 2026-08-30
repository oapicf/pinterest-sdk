namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.AssetTypeResponse
open OpenAPI.Model.CatalogBinding

module BusinessAssets =

  //#region BusinessAssets


  type BusinessAssets = {
    AssetGroupInfo : AssetGroupBinding;
    AssetId : string;
    AssetType : AssetTypeResponse;
    Permissions : string[];
    CatalogInfo : CatalogBinding;
  }
  //#endregion
