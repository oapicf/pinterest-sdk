namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsBatchItem
open OpenAPI.Model.CatalogsCreativeAssetsBatchRequest
open OpenAPI.Model.CatalogsHotelBatchRequest
open OpenAPI.Model.CatalogsRetailBatchRequest
open OpenAPI.Model.Country

module CatalogsVerticalBatchRequest =

  //#region CatalogsVerticalBatchRequest

  [<CLIMutable>]
  type CatalogsVerticalBatchRequest = {
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
