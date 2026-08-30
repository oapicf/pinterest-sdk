namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConversionDeletionRequestStatus

module ConversionDeletionRequest =

  //#region ConversionDeletionRequest

  [<CLIMutable>]
  type ConversionDeletionRequest = {
    [<JsonProperty(PropertyName = "created_time")>]
    CreatedTime : DateTime;
    [<JsonProperty(PropertyName = "processed_time")>]
    ProcessedTime : DateTime;
    [<JsonProperty(PropertyName = "request_id")>]
    RequestId : string;
    [<JsonProperty(PropertyName = "status")>]
    Status : ConversionDeletionRequestStatus;
  }

  //#endregion
