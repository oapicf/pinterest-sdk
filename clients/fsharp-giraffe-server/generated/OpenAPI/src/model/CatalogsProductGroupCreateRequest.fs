namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.string option

module CatalogsProductGroupCreateRequest =

  //#region CatalogsProductGroupCreateRequest


  type CatalogsProductGroupCreateRequest = {
    Name : string;
    Description : string option;
    IsFeatured : bool;
    Filters : CatalogsProductGroupFiltersRequest;
    FeedId : string;
  }
  //#endregion
