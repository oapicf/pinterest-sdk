namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json

module AdvertiserDefinedEventProcessingRecord =

  //#region AdvertiserDefinedEventProcessingRecord

  [<CLIMutable>]
  type AdvertiserDefinedEventProcessingRecord = {
    [<JsonProperty(PropertyName = "exceptions")>]
    Exceptions : string[];
    [<JsonProperty(PropertyName = "name")>]
    Name : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : string;
  }

  //#endregion
