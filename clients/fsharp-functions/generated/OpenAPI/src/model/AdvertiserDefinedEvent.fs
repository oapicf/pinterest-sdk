namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.string option

module AdvertiserDefinedEvent =

  //#region AdvertiserDefinedEvent

  [<CLIMutable>]
  type AdvertiserDefinedEvent = {
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "mapped_conversion_type")>]
    MappedConversionType : string option;
  }

  //#endregion
