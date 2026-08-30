namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConversionDeletionRequest
open OpenAPI.Model.string option

module ConversionDeletionRequestList200Response =

  //#region ConversionDeletionRequestList200Response


  type conversion_deletion_request_list_200_response = {
    Bookmark : string option;
    Items : ConversionDeletionRequest[];
  }
  //#endregion
