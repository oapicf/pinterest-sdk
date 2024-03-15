namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilterKeys

module CatalogsProductGroupFiltersRequestAnyOf1 =

  //#region CatalogsProductGroupFiltersRequestAnyOf1

  [<CLIMutable>]
  type CatalogsProductGroupFiltersRequestAnyOf1 = {
    [<JsonProperty(PropertyName = "all_of")>]
    AllOf : CatalogsProductGroupFilterKeys[];
  }

  //#endregion
