namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.CatalogsHotelProductGroupFilterKeys
open OpenAPI.Model.CatalogsHotelProductGroupFiltersAllOf
open OpenAPI.Model.CatalogsHotelProductGroupFiltersAnyOf

module CatalogsHotelProductGroupFilters =

  //#region CatalogsHotelProductGroupFilters


  type CatalogsHotelProductGroupFilters = {
    AnyOf : CatalogsHotelProductGroupFilterKeys[];
    AllOf : CatalogsHotelProductGroupFilterKeys[];
  }
  //#endregion
