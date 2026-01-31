namespace OpenAPI
open ConversionEqsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ConversionEqsApiServiceInterface =

    //#region Service interface
    type IConversionEqsApiService =
      abstract member ConversionEqsList:HttpContext -> ConversionEqsListArgs->ConversionEqsListResult
    //#endregion