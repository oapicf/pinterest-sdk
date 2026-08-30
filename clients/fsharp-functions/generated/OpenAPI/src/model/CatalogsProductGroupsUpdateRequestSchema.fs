namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.CatalogsProductGroupUpdateRequest
open OpenAPI.Model.CatalogsVerticalProductGroupUpdateRequest
open OpenAPI.Model.Country
open OpenAPI.Model.string option

module CatalogsProductGroupsUpdateRequestSchema =

  //#region CatalogsProductGroupsUpdateRequestSchema

  [<CLIMutable>]
  type CatalogsProductGroupsUpdateRequestSchema = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFiltersRequest;
    [<JsonProperty(PropertyName = "is_featured")>]
    IsFeatured : bool;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
