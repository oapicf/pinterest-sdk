namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters

module CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest =

  //#region CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest

  [<CLIMutable>]
  type CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsCreativeAssetsProductGroupFilters;
  }

  //#endregion
