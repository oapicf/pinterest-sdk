namespace OpenAPI
open ConversionDeletionRequestsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ConversionDeletionRequestsApiServiceInterface =

    //#region Service interface
    type IConversionDeletionRequestsApiService =
      abstract member ConversionDeletionRequestCreate : ConversionDeletionRequestCreateBodyParams -> ConversionDeletionRequestCreateResult
      abstract member ConversionDeletionRequestDelete : unit -> ConversionDeletionRequestDeleteResult
      abstract member ConversionDeletionRequestGet : unit -> ConversionDeletionRequestGetResult
      abstract member ConversionDeletionRequestList : unit -> ConversionDeletionRequestListResult
    //#endregion