namespace OpenAPI
open OrderLinesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module OrderLinesApiServiceInterface =

    //#region Service interface
    type IOrderLinesApiService =
      abstract member OrderLinesGet:HttpContext -> OrderLinesGetArgs->OrderLinesGetResult
      abstract member OrderLinesList:HttpContext -> OrderLinesListArgs->OrderLinesListResult
    //#endregion