namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsListProductsByFeedBasedFilter
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.CatalogsVerticalsListProductsByCatalogBasedFilterRequest
open OpenAPI.Model.Country

module CatalogsListProductsByFilterRequest =

  //#region CatalogsListProductsByFilterRequest


  type CatalogsListProductsByFilterRequest = {
    FeedId : string;
    Filters : CatalogsProductGroupFilters;
  }
  //#endregion
