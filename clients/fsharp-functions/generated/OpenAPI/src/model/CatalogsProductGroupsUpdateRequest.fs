namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.CatalogsProductGroupUpdateRequest
open OpenAPI.Model.CatalogsVerticalProductGroupUpdateRequest
open OpenAPI.Model.string option

module CatalogsProductGroupsUpdateRequest =

  //#region CatalogsProductGroupsUpdateRequest

  [<CLIMutable>]
  type CatalogsProductGroupsUpdateRequest = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "is_featured")>]
    IsFeatured : bool;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFiltersRequest;
  }

  //#endregion
