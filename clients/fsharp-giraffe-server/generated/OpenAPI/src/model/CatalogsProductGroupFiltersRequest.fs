namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFilterKeys
open OpenAPI.Model.CatalogsProductGroupFiltersRequestAnyOf
open OpenAPI.Model.CatalogsProductGroupFiltersRequestAnyOf1

module CatalogsProductGroupFiltersRequest =

  //#region CatalogsProductGroupFiltersRequest


  type CatalogsProductGroupFiltersRequest = {
    AnyOf : CatalogsProductGroupFilterKeys[];
    AllOf : CatalogsProductGroupFilterKeys[];
  }
  //#endregion
