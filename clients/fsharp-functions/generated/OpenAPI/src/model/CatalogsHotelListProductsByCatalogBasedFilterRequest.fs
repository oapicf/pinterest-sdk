namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelProductGroupFilters

module CatalogsHotelListProductsByCatalogBasedFilterRequest =

  //#region CatalogsHotelListProductsByCatalogBasedFilterRequest

  [<CLIMutable>]
  type CatalogsHotelListProductsByCatalogBasedFilterRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsHotelProductGroupFilters;
  }

  //#endregion
