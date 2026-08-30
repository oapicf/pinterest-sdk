namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsProductGroupMultipleStringListCriteria =

  //#region CatalogsProductGroupMultipleStringListCriteria

  [<CLIMutable>]
  type CatalogsProductGroupMultipleStringListCriteria = {
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
    [<JsonProperty(PropertyName = "values")>]
    Values : list[];
  }

  //#endregion
