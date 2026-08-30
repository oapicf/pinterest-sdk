namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.SupplementalItemProcessingStatus
open OpenAPI.Model.SupplementalItemValidationEvent

module SupplementalOperationResult =

  //#region SupplementalOperationResult

  //#region enums
  type SupplementalTypeEnum = LOCALINVENTORYEnum of string  
  //#endregion

  type SupplementalOperationResult = {
    Errors : SupplementalItemValidationEvent[];
    ItemId : string;
    Status : SupplementalItemProcessingStatus;
    StoreCode : string;
    SupplementalType : SupplementalTypeEnum;
    Warnings : SupplementalItemValidationEvent[];
  }
  //#endregion
