namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdResponse
open OpenAPI.Model.Exception

module AdArrayResponseElement =

  //#region AdArrayResponseElement

  [<CLIMutable>]
  type AdArrayResponseElement = {
    [<JsonProperty(PropertyName = "data")>]
    Data : AdResponse;
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : Exception;
  }

  //#endregion
