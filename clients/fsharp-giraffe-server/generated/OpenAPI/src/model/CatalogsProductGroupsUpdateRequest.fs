namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.CatalogsProductGroupUpdateRequest
open OpenAPI.Model.CatalogsVerticalProductGroupUpdateRequest
open OpenAPI.Model.Country
open OpenAPI.Model.string option

module CatalogsProductGroupsUpdateRequest =

  //#region CatalogsProductGroupsUpdateRequest


  type catalogs_product_groups_update_request = {
    Name : string;
    Description : string option;
    IsFeatured : bool;
    Filters : CatalogsProductGroupFiltersRequest;
  }
  //#endregion
