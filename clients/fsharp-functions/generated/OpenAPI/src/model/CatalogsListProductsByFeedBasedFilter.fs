namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilters

module CatalogsListProductsByFeedBasedFilter =

  //#region CatalogsListProductsByFeedBasedFilter

  [<CLIMutable>]
  type CatalogsListProductsByFeedBasedFilter = {
    [<JsonProperty(PropertyName = "feed_id")>]
    FeedId : string;
    [<JsonProperty(PropertyName = "filters")>]
    Filters : CatalogsProductGroupFilters;
  }

  //#endregion
