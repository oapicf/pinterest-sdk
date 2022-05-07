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
    //#endregion