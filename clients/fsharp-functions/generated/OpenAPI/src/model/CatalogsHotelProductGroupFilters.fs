namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelProductGroupFilterKeys
open OpenAPI.Model.CatalogsHotelProductGroupFiltersAllOf
open OpenAPI.Model.CatalogsHotelProductGroupFiltersAnyOf

module CatalogsHotelProductGroupFilters =

  //#region CatalogsHotelProductGroupFilters

  [<CLIMutable>]
  type CatalogsHotelProductGroupFilters = {
    [<JsonProperty(PropertyName = "any_of")>]
    AnyOf : CatalogsHotelProductGroupFilterKeys[];
    [<JsonProperty(PropertyName = "all_of")>]
    AllOf : CatalogsHotelProductGroupFilterKeys[];
  }

  //#endregion
