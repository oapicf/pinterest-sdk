namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionDeletionRequestStatus

module ConversionDeletionRequest =

  //#region ConversionDeletionRequest


  type ConversionDeletionRequest = {
    CreatedTime : DateTime;
    ProcessedTime : DateTime;
    RequestId : string;
    Status : ConversionDeletionRequestStatus;
  }
  //#endregion
