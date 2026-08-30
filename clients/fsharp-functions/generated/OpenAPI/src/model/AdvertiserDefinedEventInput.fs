namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.AdvertiserDefinedEventMappingType

module AdvertiserDefinedEventInput =

  //#region AdvertiserDefinedEventInput

  [<CLIMutable>]
  type AdvertiserDefinedEventInput = {
    [<JsonProperty(PropertyName = "mapped_conversion_type")>]
    MappedConversionType : AdvertiserDefinedEventMappingType;
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
  }

  //#endregion
