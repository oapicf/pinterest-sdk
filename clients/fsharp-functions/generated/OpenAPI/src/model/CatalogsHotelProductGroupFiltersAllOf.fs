namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsHotelProductGroupFilterKeys

module CatalogsHotelProductGroupFiltersAllOf =

  //#region CatalogsHotelProductGroupFiltersAllOf

  [<CLIMutable>]
  type CatalogsHotelProductGroupFiltersAllOf = {
    [<JsonProperty(PropertyName = "all_of")>]
    AllOf : CatalogsHotelProductGroupFilterKeys[];
  }

  //#endregion
