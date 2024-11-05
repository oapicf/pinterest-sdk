namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ItemProcessingStatus
open OpenAPI.Model.ItemValidationEvent

module CreativeAssetsProcessingRecord =

  //#region CreativeAssetsProcessingRecord


  type CreativeAssetsProcessingRecord = {
    CreativeAssetsId : string;
    Errors : ItemValidationEvent[];
    Warnings : ItemValidationEvent[];
    Status : ItemProcessingStatus;
  }
  //#endregion
