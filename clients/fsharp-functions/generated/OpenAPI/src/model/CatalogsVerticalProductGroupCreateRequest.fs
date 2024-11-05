namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupCreateRequest
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.CatalogsHotelProductGroupCreateRequest
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsRetailProductGroupCreateRequest
open OpenAPI.Model.Country
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
    Filters : CatalogsCreativeAssetsProductGroupFilters;
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "locale")>]
    Locale : CatalogsLocale;
  }

  //#endregion
