namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsBaseFilterKeys

module CatalogsBaseFiltersAnyOf =

  //#region CatalogsBaseFiltersAnyOf

  [<CLIMutable>]
  type CatalogsBaseFiltersAnyOf = {
    [<JsonProperty(PropertyName = "any_of")>]
    AnyOf : CatalogsBaseFilterKeys[];
  }

  //#endregion
