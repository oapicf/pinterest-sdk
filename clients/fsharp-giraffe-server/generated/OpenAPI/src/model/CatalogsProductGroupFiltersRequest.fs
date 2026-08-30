namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsProductGroupFilterKeys
open OpenAPI.Model.CatalogsProductGroupFiltersRequestAnyOfItems0
open OpenAPI.Model.CatalogsProductGroupFiltersRequestAnyOfItems1

module CatalogsProductGroupFiltersRequest =

  //#region CatalogsProductGroupFiltersRequest


  type CatalogsProductGroupFiltersRequest = {
    AnyOf : CatalogsProductGroupFilterKeys[];
    AllOf : CatalogsProductGroupFilterKeys[];
  }
  //#endregion
