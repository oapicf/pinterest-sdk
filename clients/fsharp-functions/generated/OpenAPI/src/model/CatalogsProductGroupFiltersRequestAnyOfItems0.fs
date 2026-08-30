namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupFilterKeys

module CatalogsProductGroupFiltersRequestAnyOfItems0 =

  //#region CatalogsProductGroupFiltersRequestAnyOfItems0

  [<CLIMutable>]
  type CatalogsProductGroupFiltersRequestAnyOfItems0 = {
    [<JsonProperty(PropertyName = "any_of")>]
    AnyOf : CatalogsProductGroupFilterKeys[];
  }

  //#endregion
