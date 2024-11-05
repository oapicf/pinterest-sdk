namespace OpenAPI
open OpenAPI.Model.AdArrayResponse
open OpenAPI.Model.AdCreateRequest
open OpenAPI.Model.AdPreviewRequest
open OpenAPI.Model.AdPreviewURLResponse
open OpenAPI.Model.AdResponse
open OpenAPI.Model.AdUpdateRequest
open OpenAPI.Model.AdsAnalyticsAdTargetingType
open OpenAPI.Model.AdsAnalyticsResponseInner
open OpenAPI.Model.AdsList200Response
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open AdsApiHandlerParams
open AdsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module AdsApiServiceImplementation =

    //#region Service implementation
    type AdsApiServiceImpl() =
      interface IAdsApiService with

        member this.AdPreviewsCreate ctx args =
          if true then
            let content = "Successful ad preview creation." :> obj :?> AdPreviewURLResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdPreviewsCreateStatusCode200 { content = content }
          else if true then
            let content = "Invalid Pin parameters response" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdPreviewsCreateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdPreviewsCreateDefaultStatusCode { content = content }

        member this.AdTargetingAnalyticsGet ctx args =
          if true then
            let content = "Success" :> obj :?> MetricsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdTargetingAnalyticsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdTargetingAnalyticsGetDefaultStatusCode { content = content }

        member this.AdsAnalytics ctx args =
          if true then
            let content = "Success" :> obj :?> AdsAnalyticsResponseInner[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsAnalyticsStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsAnalyticsDefaultStatusCode { content = content }

        member this.AdsCreate ctx args =
          if true then
            let content = "Success" :> obj :?> AdArrayResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsCreateDefaultStatusCode { content = content }

        member this.AdsGet ctx args =
          if true then
            let content = "Success" :> obj :?> AdResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsGetDefaultStatusCode { content = content }

        member this.AdsList ctx args =
          if true then
            let content = "Success" :> obj :?> AdsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsListDefaultStatusCode { content = content }

        member this.AdsUpdate ctx args =
          if true then
            let content = "Success" :> obj :?> AdArrayResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsUpdateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsUpdateDefaultStatusCode { content = content }

      //#endregion

    let AdsApiService = AdsApiServiceImpl() :> IAdsApiService