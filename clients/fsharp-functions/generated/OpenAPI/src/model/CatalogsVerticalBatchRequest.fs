namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsBatchItem
open OpenAPI.Model.CatalogsCreativeAssetsBatchRequest
open OpenAPI.Model.CatalogsHotelBatchRequest
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.CatalogsRetailBatchRequest
open OpenAPI.Model.Country

module CatalogsVerticalBatchRequest =

  //#region CatalogsVerticalBatchRequest

  [<CLIMutable>]
  type CatalogsVerticalBatchRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : CatalogsItemsRequestLanguage;
    [<JsonProperty(PropertyName = "items")>]
    Items : CatalogsCreativeAssetsBatchItem[];
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
  }

  //#endregion
