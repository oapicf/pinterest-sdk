namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.Country
open OpenAPI.Model.string option

module CatalogsRetailProductGroupCreateRequest =

  //#region CatalogsRetailProductGroupCreateRequest

  [<CLIMutable>]
  type CatalogsRetailProductGroupCreateRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFiltersRequest;
    [<JsonProperty(PropertyName = "catalog_id")>]
    CatalogId : string;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "locale")>]
    Locale : CatalogsLocale;
  }

  //#endregion
