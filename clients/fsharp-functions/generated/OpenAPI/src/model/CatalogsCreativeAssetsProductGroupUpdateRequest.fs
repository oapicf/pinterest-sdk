namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilters
open OpenAPI.Model.string option

module CatalogsCreativeAssetsProductGroupUpdateRequest =

  //#region CatalogsCreativeAssetsProductGroupUpdateRequest

  [<CLIMutable>]
  type CatalogsCreativeAssetsProductGroupUpdateRequest = {
    [<JsonProperty(PropertyName = "catalog_type")>]
    CatalogType : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsCreativeAssetsProductGroupFilters;
  }

  //#endregion
