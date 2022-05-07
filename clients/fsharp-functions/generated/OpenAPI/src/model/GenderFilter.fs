namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module GenderFilter =

  //#region GenderFilter

  [<CLIMutable>]
  type GenderFilter = {
    [<JsonProperty(PropertyName = "GENDER")>]
    GENDER : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
