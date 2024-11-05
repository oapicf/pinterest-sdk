namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.CatalogsHotelListProductsByCatalogBasedFilterRequest
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsRetailListProductsByCatalogBasedFilterRequest
open OpenAPI.Model.Country

module CatalogsVerticalsListProductsByCatalogBasedFilterRequest =

  //#region CatalogsVerticalsListProductsByCatalogBasedFilterRequest

  [<CLIMutable>]
  type CatalogsVerticalsListProductsByCatalogBasedFilterRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsCreativeAssetsProductGroupFilters;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "locale")>]
    Locale : CatalogsLocale;
  }

  //#endregion
