namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupCreateRequest
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.CatalogsVerticalProductGroupCreateRequest
open OpenAPI.Model.string option

module CatalogsProductGroupsCreateRequest =

  //#region CatalogsProductGroupsCreateRequest


  type catalogs_product_groups_create_request = {
    Name : string;
    Description : string option;
    IsFeatured : bool;
    Filters : CatalogsProductGroupFiltersRequest;
    FeedId : string;
  }
  //#endregion
