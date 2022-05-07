namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilterKeys

module CatalogsProductGroupFiltersAnyOf =

  //#region CatalogsProductGroupFiltersAnyOf

  [<CLIMutable>]
  type CatalogsProductGroupFiltersAnyOf = {
    [<JsonProperty(PropertyName = "any_of")>]
    AnyOf : CatalogsProductGroupFilterKeys[];
  }

  //#endregion
