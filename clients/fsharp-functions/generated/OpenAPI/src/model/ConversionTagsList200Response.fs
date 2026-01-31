namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionTag

module ConversionTagsList200Response =

  //#region ConversionTagsList200Response

  [<CLIMutable>]
  type ConversionTagsList200Response = {
    [<JsonProperty(PropertyName = "items")>]
    Items : ConversionTag[];
  }

  //#endregion
