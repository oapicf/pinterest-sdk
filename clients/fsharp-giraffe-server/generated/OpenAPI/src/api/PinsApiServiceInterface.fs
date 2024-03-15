namespace OpenAPI
open PinsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module PinsApiServiceInterface =

    //#region Service interface
    type IPinsApiService =
      abstract member PinsAnalytics:HttpContext -> PinsAnalyticsArgs->PinsAnalyticsResult
      abstract member PinsCreate:HttpContext -> PinsCreateArgs->PinsCreateResult
      abstract member PinsDelete:HttpContext -> PinsDeleteArgs->PinsDeleteResult
      abstract member PinsGet:HttpContext -> PinsGetArgs->PinsGetResult
      abstract member PinsList:HttpContext -> PinsListArgs->PinsListResult
      abstract member PinsSave:HttpContext -> PinsSaveArgs->PinsSaveResult
      abstract member PinsUpdate:HttpContext -> PinsUpdateArgs->PinsUpdateResult
    //#endregion