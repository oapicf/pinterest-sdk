namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AllOf
open OpenAPI.Model.AnyOf
open OpenAPI.Model.CatalogsProductGroupFilterKeys

module CatalogsProductGroupFiltersRequest =

  //#region CatalogsProductGroupFiltersRequest

  [<CLIMutable>]
  type CatalogsProductGroupFiltersRequest = {
    [<JsonProperty(PropertyName = "any_of")>]
    AnyOf : CatalogsProductGroupFilterKeys[];
    [<JsonProperty(PropertyName = "all_of")>]
    AllOf : CatalogsProductGroupFilterKeys[];
  }

  //#endregion
