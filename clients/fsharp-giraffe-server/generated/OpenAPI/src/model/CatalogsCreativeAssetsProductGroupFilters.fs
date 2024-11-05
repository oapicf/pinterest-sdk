namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFilterKeys
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFiltersAllOf
open OpenAPI.Model.CatalogsCreativeAssetsProductGroupFiltersAnyOf

module CatalogsCreativeAssetsProductGroupFilters =

  //#region CatalogsCreativeAssetsProductGroupFilters


  type CatalogsCreativeAssetsProductGroupFilters = {
    AnyOf : CatalogsCreativeAssetsProductGroupFilterKeys[];
    AllOf : CatalogsCreativeAssetsProductGroupFilterKeys[];
  }
  //#endregion
