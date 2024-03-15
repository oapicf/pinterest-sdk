namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.Country

module CatalogsProductGroupMultipleCountriesCriteria =

  //#region CatalogsProductGroupMultipleCountriesCriteria

  [<CLIMutable>]
  type CatalogsProductGroupMultipleCountriesCriteria = {
    [<JsonProperty(PropertyName = "values")>]
    Values : Country[];
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
  }

  //#endregion
