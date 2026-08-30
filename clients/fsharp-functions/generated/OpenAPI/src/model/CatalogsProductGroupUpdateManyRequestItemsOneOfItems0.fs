namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.string option

module CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 =

  //#region CatalogsProductGroupUpdateManyRequestItemsOneOfItems0

  [<CLIMutable>]
  type CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 = {
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFiltersRequest;
    [<JsonProperty(PropertyName = "is_featured")>]
    IsFeatured : bool;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "id")>]
    Id : string;
  }

  //#endregion
