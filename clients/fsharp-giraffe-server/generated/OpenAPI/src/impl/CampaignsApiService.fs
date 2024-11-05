namespace OpenAPI
open OpenAPI.Model.AdsAnalyticsCampaignTargetingType
open OpenAPI.Model.CampaignCreateRequest
open OpenAPI.Model.CampaignCreateResponse
open OpenAPI.Model.CampaignResponse
open OpenAPI.Model.CampaignUpdateRequest
open OpenAPI.Model.CampaignUpdateResponse
open OpenAPI.Model.CampaignsAnalyticsResponseInner
open OpenAPI.Model.CampaignsList200Response
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open CampaignsApiHandlerParams
open CampaignsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module CampaignsApiServiceImplementation =

    //#region Service implementation
    type CampaignsApiServiceImpl() =
      interface ICampaignsApiService with

        member this.CampaignTargetingAnalyticsGet ctx args =
          if true then
            let content = "Success" :> obj :?> MetricsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignTargetingAnalyticsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignTargetingAnalyticsGetDefaultStatusCode { content = content }

        member this.CampaignsAnalytics ctx args =
          if true then
            let content = "Success" :> obj :?> CampaignsAnalyticsResponseInner[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account campaign analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsAnalyticsStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsAnalyticsDefaultStatusCode { content = content }

        member this.CampaignsCreate ctx args =
          if true then
            let content = "response" :> obj :?> CampaignCreateResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsCreateDefaultStatusCode { content = content }

        member this.CampaignsGet ctx args =
          if true then
            let content = "Success" :> obj :?> CampaignResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsGetDefaultStatusCode { content = content }

        member this.CampaignsList ctx args =
          if true then
            let content = "Success" :> obj :?> CampaignsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account campaign parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsListDefaultStatusCode { content = content }

        member this.CampaignsUpdate ctx args =
          if true then
            let content = "response" :> obj :?> CampaignUpdateResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsUpdateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsUpdateDefaultStatusCode { content = content }

      //#endregion

    let CampaignsApiService = CampaignsApiServiceImpl() :> ICampaignsApiService