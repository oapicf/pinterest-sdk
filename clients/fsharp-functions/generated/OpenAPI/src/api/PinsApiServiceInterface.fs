namespace OpenAPI
open PinsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module PinsApiServiceInterface =

    //#region Service interface
    type IPinsApiService =
      abstract member PinsAnalytics : unit -> PinsAnalyticsResult
      abstract member PinsCreate : PinsCreateBodyParams -> PinsCreateResult
      abstract member PinsDelete : unit -> PinsDeleteResult
      abstract member PinsGet : unit -> PinsGetResult
      abstract member PinsList : unit -> PinsListResult
      abstract member PinsSave : PinsSaveBodyParams -> PinsSaveResult
      abstract member PinsUpdate : PinsUpdateBodyParams -> PinsUpdateResult
    //#endregion