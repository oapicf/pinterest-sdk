namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsItemsPostFilters
open OpenAPI.Model.CatalogsItemsRequestLanguage
open OpenAPI.Model.Country

module CatalogsItemsRequest =

  //#region CatalogsItemsRequest

  [<CLIMutable>]
  type CatalogsItemsRequest = {
    [<JsonProperty(PropertyName = "country")>]
    Country : Country;
    [<JsonProperty(PropertyName = "language")>]
    Language : CatalogsItemsRequestLanguage;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsItemsPostFilters;
  }

  //#endregion
