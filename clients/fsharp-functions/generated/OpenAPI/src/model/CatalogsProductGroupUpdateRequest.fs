namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.string option

module CatalogsProductGroupUpdateRequest =

  //#region CatalogsProductGroupUpdateRequest

  [<CLIMutable>]
  type CatalogsProductGroupUpdateRequest = {
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
