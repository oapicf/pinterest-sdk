namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionTagTypeOptimal

module AdvertiserDefinedEvent =

  //#region AdvertiserDefinedEvent

  [<CLIMutable>]
  type AdvertiserDefinedEvent = {
    [<JsonProperty(PropertyName = "mapped_conversion_type")>]
    MappedConversionType : ConversionTagTypeOptimal;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
