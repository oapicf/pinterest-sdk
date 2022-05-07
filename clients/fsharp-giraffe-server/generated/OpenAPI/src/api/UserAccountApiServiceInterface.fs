namespace OpenAPI
open UserAccountApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module UserAccountApiServiceInterface =

    //#region Service interface
    type IUserAccountApiService =
      abstract member UserAccountAnalytics:HttpContext -> UserAccountAnalyticsArgs->UserAccountAnalyticsResult
      abstract member UserAccountGet:HttpContext -> UserAccountGetArgs->UserAccountGetResult
    //#endregion