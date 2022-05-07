namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.string option

module CatalogsProductGroupCreateRequest =

  //#region CatalogsProductGroupCreateRequest

  [<CLIMutable>]
  type CatalogsProductGroupCreateRequest = {
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string option;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFilters;
  }

  //#endregion
