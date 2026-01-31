namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.AllOf
open OpenAPI.Model.AnyOf
open OpenAPI.Model.CatalogsProductGroupFilterKeys

module CatalogsProductGroupFiltersRequest =

  //#region CatalogsProductGroupFiltersRequest


  type CatalogsProductGroupFiltersRequest = {
    AnyOf : CatalogsProductGroupFilterKeys[];
    AllOf : CatalogsProductGroupFilterKeys[];
  }
  //#endregion
