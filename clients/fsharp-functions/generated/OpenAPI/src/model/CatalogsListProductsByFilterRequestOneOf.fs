namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilters

module CatalogsListProductsByFilterRequestOneOf =

  //#region CatalogsListProductsByFilterRequestOneOf

  [<CLIMutable>]
  type CatalogsListProductsByFilterRequestOneOf = {
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFilters;
  }

  //#endregion
