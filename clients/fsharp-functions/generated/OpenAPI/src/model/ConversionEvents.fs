namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionEventsDataInner

module ConversionEvents =

  //#region ConversionEvents

  [<CLIMutable>]
  type ConversionEvents = {
    [<JsonProperty(PropertyName = "data")>]
    Data : ConversionEventsDataInner[];
  }

  //#endregion
