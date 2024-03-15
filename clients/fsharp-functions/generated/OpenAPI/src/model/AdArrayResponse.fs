namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdArrayResponseElement

module AdArrayResponse =

  //#region AdArrayResponse

  [<CLIMutable>]
  type AdArrayResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : AdArrayResponseElement[];
  }

  //#endregion
