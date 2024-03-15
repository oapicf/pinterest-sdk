namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilterKeys
open OpenAPI.Model.CatalogsProductGroupFiltersRequestAnyOf
open OpenAPI.Model.CatalogsProductGroupFiltersRequestAnyOf1

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
