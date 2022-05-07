namespace OpenAPI
open UserAccountApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module UserAccountApiServiceInterface =

    //#region Service interface
    type IUserAccountApiService =
      abstract member UserAccountAnalytics : unit -> UserAccountAnalyticsResult
      abstract member UserAccountGet : unit -> UserAccountGetResult
    //#endregion