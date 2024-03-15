namespace OpenAPI
open AdsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AdsApiServiceInterface =

    //#region Service interface
    type IAdsApiService =
      abstract member AdPreviewsCreate : AdPreviewsCreateBodyParams -> AdPreviewsCreateResult
      abstract member AdTargetingAnalyticsGet : unit -> AdTargetingAnalyticsGetResult
      abstract member AdsAnalytics : unit -> AdsAnalyticsResult
      abstract member AdsCreate : AdsCreateBodyParams -> AdsCreateResult
      abstract member AdsGet : unit -> AdsGetResult
      abstract member AdsList : unit -> AdsListResult
      abstract member AdsUpdate : AdsUpdateBodyParams -> AdsUpdateResult
    //#endregion