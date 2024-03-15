namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupCreateRequest
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.CatalogsVerticalProductGroupCreateRequest
open OpenAPI.Model.string option

module CatalogsProductGroupsCreateRequest =

  //#region CatalogsProductGroupsCreateRequest

  [<CLIMutable>]
  type CatalogsProductGroupsCreateRequest = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "is_featured")>]
    IsFeatured : bool;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFiltersRequest;
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string;
  }

  //#endregion
