namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilterKeys

module CatalogsProductGroupFiltersAllOf =

  //#region CatalogsProductGroupFiltersAllOf

  [<CLIMutable>]
  type CatalogsProductGroupFiltersAllOf = {
    [<JsonProperty(PropertyName = "all_of")>]
    AllOf : CatalogsProductGroupFilterKeys[];
  }

  //#endregion
