namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupCreateRequest
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.CatalogsVerticalProductGroupCreateRequest
open OpenAPI.Model.Country
open OpenAPI.Model.string option

module CatalogsProductGroupsCreateManyRequestItems =

  //#region CatalogsProductGroupsCreateManyRequestItems


  type CatalogsProductGroupsCreateManyRequestItems = {
    Description : string option;
    FeedId : string;
    Filters : CatalogsProductGroupFiltersRequest;
    IsFeatured : bool;
    Name : string;
  }
  //#endregion
