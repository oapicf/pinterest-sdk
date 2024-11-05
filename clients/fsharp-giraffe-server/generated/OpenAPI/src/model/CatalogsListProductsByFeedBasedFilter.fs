namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFilters

module CatalogsListProductsByFeedBasedFilter =

  //#region CatalogsListProductsByFeedBasedFilter


  type CatalogsListProductsByFeedBasedFilter = {
    FeedId : string;
    Filters : CatalogsProductGroupFilters;
  }
  //#endregion
