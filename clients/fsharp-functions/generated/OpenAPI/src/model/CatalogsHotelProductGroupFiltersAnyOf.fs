namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelProductGroupFilterKeys

module CatalogsHotelProductGroupFiltersAnyOf =

  //#region CatalogsHotelProductGroupFiltersAnyOf

  [<CLIMutable>]
  type CatalogsHotelProductGroupFiltersAnyOf = {
    [<JsonProperty(PropertyName = "any_of")>]
    AnyOf : CatalogsHotelProductGroupFilterKeys[];
  }

  //#endregion
