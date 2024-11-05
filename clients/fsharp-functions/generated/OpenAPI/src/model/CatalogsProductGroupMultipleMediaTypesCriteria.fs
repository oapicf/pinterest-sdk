namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.MediaType

module CatalogsProductGroupMultipleMediaTypesCriteria =

  //#region CatalogsProductGroupMultipleMediaTypesCriteria

  [<CLIMutable>]
  type CatalogsProductGroupMultipleMediaTypesCriteria = {
    [<JsonProperty(PropertyName = "values")>]
    Values : MediaType[];
    [<JsonProperty(PropertyName = "negated")>]
    Negated : bool;
  }

  //#endregion
