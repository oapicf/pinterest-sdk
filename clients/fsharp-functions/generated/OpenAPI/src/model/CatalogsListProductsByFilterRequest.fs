namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsListProductsByFeedBasedFilter
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.CatalogsVerticalsListProductsByCatalogBasedFilterRequest
open OpenAPI.Model.Country

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
