namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.string option

module CatalogsProductGroupCreateRequest =

  //#region CatalogsProductGroupCreateRequest


  type CatalogsProductGroupCreateRequest = {
    Description : string option;
    FeedId : string;
    Filters : CatalogsProductGroupFiltersRequest;
    IsFeatured : bool;
    Name : string;
  }
  //#endregion
