namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupCreateRequest
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.CatalogsVerticalProductGroupCreateRequest
open OpenAPI.Model.Country
open OpenAPI.Model.string option

module MultipleProductGroupsInner =

  //#region MultipleProductGroupsInner


  type multiple_product_groups_inner = {
    Name : string;
    Description : string option;
    IsFeatured : bool;
    Filters : CatalogsProductGroupFiltersRequest;
    FeedId : string;
  }
  //#endregion
