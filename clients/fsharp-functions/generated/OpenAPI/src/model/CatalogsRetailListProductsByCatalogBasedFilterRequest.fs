namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.Country

module CatalogsRetailListProductsByCatalogBasedFilterRequest =

  //#region CatalogsRetailListProductsByCatalogBasedFilterRequest

  [<CLIMutable>]
  type CatalogsRetailListProductsByCatalogBasedFilterRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFilters;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "locale")>]
    Locale : CatalogsLocale;
  }

  //#endregion
