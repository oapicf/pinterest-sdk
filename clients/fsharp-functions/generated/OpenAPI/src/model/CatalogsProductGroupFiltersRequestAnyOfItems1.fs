namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilterKeys

module CatalogsProductGroupFiltersRequestAnyOfItems1 =

  //#region CatalogsProductGroupFiltersRequestAnyOfItems1

  [<CLIMutable>]
  type CatalogsProductGroupFiltersRequestAnyOfItems1 = {
    [<JsonProperty(PropertyName = "all_of")>]
    AllOf : CatalogsProductGroupFilterKeys[];
  }

  //#endregion
