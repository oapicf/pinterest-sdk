namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.Country
open OpenAPI.Model.string option

module CatalogsRetailProductGroupUpdateRequest =

  //#region CatalogsRetailProductGroupUpdateRequest

  [<CLIMutable>]
  type CatalogsRetailProductGroupUpdateRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFiltersRequest;
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "locale")>]
    Locale : CatalogsLocale;
  }

  //#endregion
