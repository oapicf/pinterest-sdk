namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsListProductsByFilterRequestOneOf
open OpenAPI.Model.CatalogsProductGroupFilters

module CatalogsListProductsByFilterRequest =

  //#region CatalogsListProductsByFilterRequest

  [<CLIMutable>]
  type CatalogsListProductsByFilterRequest = {
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFilters;
  }

  //#endregion
