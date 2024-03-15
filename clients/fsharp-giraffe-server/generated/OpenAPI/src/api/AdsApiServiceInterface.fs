namespace OpenAPI
open AdsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module AdsApiServiceInterface =

    //#region Service interface
    type IAdsApiService =
      abstract member AdPreviewsCreate:HttpContext -> AdPreviewsCreateArgs->AdPreviewsCreateResult
      abstract member AdTargetingAnalyticsGet:HttpContext -> AdTargetingAnalyticsGetArgs->AdTargetingAnalyticsGetResult
      abstract member AdsAnalytics:HttpContext -> AdsAnalyticsArgs->AdsAnalyticsResult
      abstract member AdsCreate:HttpContext -> AdsCreateArgs->AdsCreateResult
      abstract member AdsGet:HttpContext -> AdsGetArgs->AdsGetResult
      abstract member AdsList:HttpContext -> AdsListArgs->AdsListResult
      abstract member AdsUpdate:HttpContext -> AdsUpdateArgs->AdsUpdateResult
    //#endregion