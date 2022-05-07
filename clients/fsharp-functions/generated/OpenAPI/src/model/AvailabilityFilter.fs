namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.CatalogsProductGroupMultipleStringCriteria

module AvailabilityFilter =

  //#region AvailabilityFilter

  [<CLIMutable>]
  type AvailabilityFilter = {
    [<JsonProperty(PropertyName = "AVAILABILITY")>]
    AVAILABILITY : CatalogsProductGroupMultipleStringCriteria;
  }

  //#endregion
