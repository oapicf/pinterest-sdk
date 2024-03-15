namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module ConditionFilter =

  //#region ConditionFilter

  [<CLIMutable>]
  type ConditionFilter = {
    [<JsonProperty(PropertyName = "CONDITION")>]
    CONDITION : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
