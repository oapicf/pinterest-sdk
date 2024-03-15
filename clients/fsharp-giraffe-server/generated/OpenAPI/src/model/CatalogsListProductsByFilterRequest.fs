namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsListProductsByFilterRequestOneOf
open OpenAPI.Model.CatalogsProductGroupFilters

module CatalogsListProductsByFilterRequest =

  //#region CatalogsListProductsByFilterRequest


  type CatalogsListProductsByFilterRequest = {
    FeedId : string;
    Filters : CatalogsProductGroupFilters;
  }
  //#endregion
