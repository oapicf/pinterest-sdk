namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilterKeys

module CatalogsProductGroupFiltersRequestAnyOf =

  //#region CatalogsProductGroupFiltersRequestAnyOf

  [<CLIMutable>]
  type CatalogsProductGroupFiltersRequestAnyOf = {
    [<JsonProperty(PropertyName = "any_of")>]
    AnyOf : CatalogsProductGroupFilterKeys[];
  }

  //#endregion
