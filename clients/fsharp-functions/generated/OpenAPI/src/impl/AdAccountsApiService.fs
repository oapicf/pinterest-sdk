namespace OpenAPI
open OpenAPI.Model.AdsAnalyticsCreateAsyncRequest
open OpenAPI.Model.AdsAnalyticsCreateAsyncResponse
open OpenAPI.Model.AdsAnalyticsGetAsyncResponse
open OpenAPI.Model.AnyType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.Paginated
open AdAccountsApiHandlerParams
open AdAccountsApiServiceInterface
open System.Collections.Generic
open System

module AdAccountsApiServiceImplementation =

    //#region Service implementation
    type AdAccountsApiServiceImpl() =
      interface IAdAccountsApiService with

        member this.AdAccountAnalytics () =
          if true then
            let content = "Success" :> obj :?> IDictionary<string, obj>[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountAnalyticsStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountAnalyticsDefaultStatusCode { content = content }

        member this.AdAccountsList () =
          if true then
            let content = "response" :> obj :?> Paginated // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsListStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsListDefaultStatusCode { content = content }

        member this.AdGroupsAnalytics () =
          if true then
            let content = "Success" :> obj :?> IDictionary<string, obj>[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account group analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsAnalyticsStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsAnalyticsDefaultStatusCode { content = content }

        member this.AdGroupsList () =
          if true then
            let content = "Success" :> obj :?> Paginated // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account group parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdGroupsListDefaultStatusCode { content = content }

        member this.AdsAnalytics () =
          if true then
            let content = "Success" :> obj :?> IDictionary<string, obj>[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsAnalyticsStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsAnalyticsDefaultStatusCode { content = content }

        member this.AdsList () =
          if true then
            let content = "Success" :> obj :?> Paginated // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdsListDefaultStatusCode { content = content }

        member this.AnalyticsCreateReport (parameters:AnalyticsCreateReportBodyParams) =
          if true then
            let content = "Success" :> obj :?> AdsAnalyticsCreateAsyncResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateReportStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateReportStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateReportDefaultStatusCode { content = content }

        member this.AnalyticsGetReport () =
          if true then
            let content = "Success" :> obj :?> AdsAnalyticsGetAsyncResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsGetReportStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsGetReportStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsGetReportDefaultStatusCode { content = content }

        member this.CampaignsAnalytics () =
          if true then
            let content = "Success" :> obj :?> IDictionary<string, obj>[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account campaign analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsAnalyticsStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsAnalyticsDefaultStatusCode { content = content }

        member this.CampaignsList () =
          if true then
            let content = "Success" :> obj :?> Paginated // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account campaign parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CampaignsListDefaultStatusCode { content = content }

        member this.ProductGroupsAnalytics () =
          if true then
            let content = "Success" :> obj :?> IDictionary<string, obj>[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsDefaultStatusCode { content = content }

      //#endregion

    let AdAccountsApiService = AdAccountsApiServiceImpl() :> IAdAccountsApiService