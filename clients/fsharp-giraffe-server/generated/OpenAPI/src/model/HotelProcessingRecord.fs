namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemProcessingStatus
open OpenAPI.Model.ItemValidationEvent

module HotelProcessingRecord =

  //#region HotelProcessingRecord


  type HotelProcessingRecord = {
    HotelId : string;
    Errors : ItemValidationEvent[];
    Warnings : ItemValidationEvent[];
    Status : ItemProcessingStatus;
  }
  //#endregion
