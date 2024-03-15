namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelProductGroupFilters
open OpenAPI.Model.string option

module CatalogsHotelProductGroupCreateRequest =

  //#region CatalogsHotelProductGroupCreateRequest

  [<CLIMutable>]
  type CatalogsHotelProductGroupCreateRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsHotelProductGroupFilters;
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
  }

  //#endregion
