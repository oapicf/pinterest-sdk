namespace OpenAPI
open OrderLinesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module OrderLinesApiServiceInterface =

    //#region Service interface
    type IOrderLinesApiService =
      abstract member OrderLinesGet : unit -> OrderLinesGetResult
      abstract member OrderLinesList : unit -> OrderLinesListResult
    //#endregion