namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionTagResponse

module ConversionTagListResponse =

  //#region ConversionTagListResponse

  [<CLIMutable>]
  type ConversionTagListResponse = {
    [<JsonProperty(PropertyName = "items")>]
    Items : ConversionTagResponse[];
  }

  //#endregion
