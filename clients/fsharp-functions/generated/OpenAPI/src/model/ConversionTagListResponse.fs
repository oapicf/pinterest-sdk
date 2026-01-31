namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionTag

module ConversionTagListResponse =

  //#region ConversionTagListResponse

  [<CLIMutable>]
  type ConversionTagListResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : ConversionTag[];
  }

  //#endregion
