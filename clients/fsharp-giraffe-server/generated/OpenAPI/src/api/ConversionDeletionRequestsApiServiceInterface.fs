namespace OpenAPI
open ConversionDeletionRequestsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ConversionDeletionRequestsApiServiceInterface =

    //#region Service interface
    type IConversionDeletionRequestsApiService =
      abstract member ConversionDeletionRequestCreate:HttpContext -> ConversionDeletionRequestCreateArgs->ConversionDeletionRequestCreateResult
      abstract member ConversionDeletionRequestDelete:HttpContext -> ConversionDeletionRequestDeleteArgs->ConversionDeletionRequestDeleteResult
      abstract member ConversionDeletionRequestGet:HttpContext -> ConversionDeletionRequestGetArgs->ConversionDeletionRequestGetResult
      abstract member ConversionDeletionRequestList:HttpContext -> ConversionDeletionRequestListArgs->ConversionDeletionRequestListResult
    //#endregion