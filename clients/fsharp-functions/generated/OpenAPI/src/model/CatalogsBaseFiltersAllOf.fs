namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsBaseFilterKeys

module CatalogsBaseFiltersAllOf =

  //#region CatalogsBaseFiltersAllOf

  [<CLIMutable>]
  type CatalogsBaseFiltersAllOf = {
    [<JsonProperty(PropertyName = "all_of")>]
    AllOf : CatalogsBaseFilterKeys[];
  }

  //#endregion
