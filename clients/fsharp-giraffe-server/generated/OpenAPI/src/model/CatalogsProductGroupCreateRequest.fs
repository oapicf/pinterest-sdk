namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFilters
open OpenAPI.Model.string option

module CatalogsProductGroupCreateRequest =

  //#region CatalogsProductGroupCreateRequest


  type CatalogsProductGroupCreateRequest = {
    FeedId : string;
    Name : string;
    Description : string option;
    Filters : CatalogsProductGroupFilters;
  }
  //#endregion
