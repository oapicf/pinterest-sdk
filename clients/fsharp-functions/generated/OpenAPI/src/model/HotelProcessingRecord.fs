namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ItemProcessingStatus
open OpenAPI.Model.ItemValidationEvent

module HotelProcessingRecord =

  //#region HotelProcessingRecord

  [<CLIMutable>]
  type HotelProcessingRecord = {
    [<JsonProperty(PropertyName = "errors")>]
    Errors : ItemValidationEvent[];
    [<JsonProperty(PropertyName = "hotel_id")>]
    HotelId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : ItemProcessingStatus;
    [<JsonProperty(PropertyName = "warnings")>]
    Warnings : ItemValidationEvent[];
  }

  //#endregion
