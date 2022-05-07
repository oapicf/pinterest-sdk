namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilterKeys
open OpenAPI.Model.CatalogsProductGroupFiltersAllOf
open OpenAPI.Model.CatalogsProductGroupFiltersAnyOf

module CatalogsProductGroupFilters =

  //#region CatalogsProductGroupFilters

  [<CLIMutable>]
  type CatalogsProductGroupFilters = {
    [<JsonProperty(PropertyName = "any_of")>]
    AnyOf : CatalogsProductGroupFilterKeys[];
    [<JsonProperty(PropertyName = "all_of")>]
    AllOf : CatalogsProductGroupFilterKeys[];
  }

  //#endregion
