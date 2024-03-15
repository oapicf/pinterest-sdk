namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelProductGroupCreateRequest
open OpenAPI.Model.CatalogsHotelProductGroupFilters
open OpenAPI.Model.string option

module CatalogsVerticalProductGroupCreateRequest =

  //#region CatalogsVerticalProductGroupCreateRequest

  [<CLIMutable>]
  type CatalogsVerticalProductGroupCreateRequest = {
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
