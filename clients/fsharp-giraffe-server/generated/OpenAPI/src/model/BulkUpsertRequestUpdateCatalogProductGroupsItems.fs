namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsLocale
open OpenAPI.Model.CatalogsProductGroupFiltersRequest
open OpenAPI.Model.CatalogsProductGroupUpdateRequest
open OpenAPI.Model.CatalogsVerticalProductGroupUpdateRequest
open OpenAPI.Model.Country
open OpenAPI.Model.string option

module BulkUpsertRequestUpdateCatalogProductGroupsItems =

  //#region BulkUpsertRequestUpdateCatalogProductGroupsItems


  type BulkUpsertRequestUpdateCatalogProductGroupsItems = {
    Description : string option;
    Filters : CatalogsProductGroupFiltersRequest;
    IsFeatured : bool;
    Name : string;
  }
  //#endregion
