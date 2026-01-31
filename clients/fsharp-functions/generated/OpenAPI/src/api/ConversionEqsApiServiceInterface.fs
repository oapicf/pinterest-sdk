namespace OpenAPI
open ConversionEqsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ConversionEqsApiServiceInterface =

    //#region Service interface
    type IConversionEqsApiService =
      abstract member ConversionEqsList : unit -> ConversionEqsListResult
    //#endregion