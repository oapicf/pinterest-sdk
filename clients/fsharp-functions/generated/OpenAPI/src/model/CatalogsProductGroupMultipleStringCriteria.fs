namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module CatalogsProductGroupMultipleStringCriteria =

  //#region CatalogsProductGroupMultipleStringCriteria

  [<CLIMutable>]
  type CatalogsProductGroupMultipleStringCriteria = {
    [<JsonProperty(PropertyName = "values")>]
    Values : string[];
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
  }

  //#endregion
