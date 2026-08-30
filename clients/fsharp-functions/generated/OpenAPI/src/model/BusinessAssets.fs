namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AssetGroupBinding
open OpenAPI.Model.AssetTypeResponse
open OpenAPI.Model.CatalogBinding

module BusinessAssets =

  //#region BusinessAssets

  [<CLIMutable>]
  type BusinessAssets = {
    [<JsonProperty(PropertyName = "asset_group_info")>]
    AssetGroupInfo : AssetGroupBinding;
    [<JsonProperty(PropertyName = "asset_id")>]
    AssetId : string;
    [<JsonProperty(PropertyName = "asset_type")>]
    AssetType : AssetTypeResponse;
    [<JsonProperty(PropertyName = "permissions")>]
    Permissions : string[];
    [<JsonProperty(PropertyName = "catalog_info")>]
    CatalogInfo : CatalogBinding;
  }

  //#endregion
