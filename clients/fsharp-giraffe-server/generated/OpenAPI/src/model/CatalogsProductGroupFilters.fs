namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFilterKeys
open OpenAPI.Model.CatalogsProductGroupFiltersAllOf
open OpenAPI.Model.CatalogsProductGroupFiltersAnyOf

module CatalogsProductGroupFilters =

  //#region CatalogsProductGroupFilters


  type CatalogsProductGroupFilters = {
    AnyOf : CatalogsProductGroupFilterKeys[];
    AllOf : CatalogsProductGroupFilterKeys[];
  }
  //#endregion
