namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsBatchItem
open OpenAPI.Model.Country

module CatalogsCreativeAssetsBatchRequest =

  //#region CatalogsCreativeAssetsBatchRequest

  [<CLIMutable>]
  type CatalogsCreativeAssetsBatchRequest = {
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsCreativeAssetsBatchItem[];
    [<JsonProperty(PropertyName = "language")>]
    Language : string;
  }

  //#endregion
