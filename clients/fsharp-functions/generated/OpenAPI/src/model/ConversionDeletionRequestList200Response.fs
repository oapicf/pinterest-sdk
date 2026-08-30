namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionDeletionRequest
open OpenAPI.Model.string option

module ConversionDeletionRequestList200Response =

  //#region ConversionDeletionRequestList200Response

  [<CLIMutable>]
  type ConversionDeletionRequestList200Response = {
    [<JsonProperty(PropertyName = "bookmark")>]
    Bookmark : string option;
    [<JsonProperty(PropertyName = "items")>]
    Items : ConversionDeletionRequest[];
  }

  //#endregion
