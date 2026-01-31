namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Gender

module CatalogsProductGroupMultipleGenderCriteria =

  //#region CatalogsProductGroupMultipleGenderCriteria

  [<CLIMutable>]
  type CatalogsProductGroupMultipleGenderCriteria = {
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
    [<JsonProperty(PropertyName = "values")>]
    Values : Gender[];
  }

  //#endregion
