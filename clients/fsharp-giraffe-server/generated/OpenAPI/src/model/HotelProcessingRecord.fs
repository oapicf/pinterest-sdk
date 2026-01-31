namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemProcessingStatus
open OpenAPI.Model.ItemValidationEvent

module HotelProcessingRecord =

  //#region HotelProcessingRecord


  type HotelProcessingRecord = {
    Errors : ItemValidationEvent[];
    HotelId : string;
    Status : ItemProcessingStatus;
    Warnings : ItemValidationEvent[];
  }
  //#endregion
