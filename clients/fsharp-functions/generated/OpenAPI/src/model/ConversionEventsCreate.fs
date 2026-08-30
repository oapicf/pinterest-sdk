namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionEventsDataItems

module ConversionEventsCreate =

  //#region ConversionEventsCreate

  [<CLIMutable>]
  type ConversionEventsCreate = {
    [<JsonProperty(PropertyName = "data")>]
    Data : ConversionEventsDataItems[];
  }

  //#endregion
