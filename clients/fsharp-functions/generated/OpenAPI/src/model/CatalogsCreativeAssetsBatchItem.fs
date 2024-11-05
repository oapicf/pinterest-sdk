namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreateCreativeAssetsItem
open OpenAPI.Model.CatalogsDeleteCreativeAssetsItem
open OpenAPI.Model.CatalogsUpdatableCreativeAssetsAttributes
open OpenAPI.Model.CatalogsUpdateCreativeAssetsItem
open OpenAPI.Model.CatalogsUpsertCreativeAssetsItem

module CatalogsCreativeAssetsBatchItem =

  //#region CatalogsCreativeAssetsBatchItem

  [<CLIMutable>]
  type CatalogsCreativeAssetsBatchItem = {
    [<JsonProperty(PropertyName = "creative_assets_id")>]
    CreativeAssetsId : string;
    [<JsonProperty(PropertyName = "operation")>]
    Operation : string;
    [<JsonProperty(PropertyName = "attributes")>]
    Attributes : CatalogsUpdatableCreativeAssetsAttributes;
  }

  //#endregion
