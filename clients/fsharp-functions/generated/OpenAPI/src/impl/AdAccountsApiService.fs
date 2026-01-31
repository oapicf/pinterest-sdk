namespace OpenAPI
open OpenAPI.Model.AdAccount
open OpenAPI.Model.AdAccountAnalyticsResponseInner
open OpenAPI.Model.AdAccountCreate
open OpenAPI.Model.AdAccountsList200Response
open OpenAPI.Model.AdsAnalyticsCreateAsyncRequest
open OpenAPI.Model.AdsAnalyticsCreateAsyncResponse
open OpenAPI.Model.AdsAnalyticsGetAsyncResponse
open OpenAPI.Model.AdsAnalyticsTargetingType
open OpenAPI.Model.ConversionProductReportRequest
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.CreateMMMReportRequest
open OpenAPI.Model.CreateMMMReportResponse
open OpenAPI.Model.Error
open OpenAPI.Model.GetMMMReportResponse
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.ReportingTimeZone
open OpenAPI.Model.TemplateBasedReport
open OpenAPI.Model.TemplatesList200Response
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
            let content = "Success" :> obj :?> AdAccountAnalyticsResponseInner[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountAnalyticsStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountAnalyticsDefaultStatusCode { content = content }

        member this.AdAccountTargetingAnalyticsGet () =
          if true then
            let content = "Success" :> obj :?> MetricsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountTargetingAnalyticsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountTargetingAnalyticsGetDefaultStatusCode { content = content }

        member this.AdAccountsCreate (parameters:AdAccountsCreateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> AdAccount // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> AdAccount // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCreateDefaultStatusCode { content = content }

        member this.AdAccountsGet () =
          if true then
            let content = "The request has succeeded." :> obj :?> AdAccount // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsGetDefaultStatusCode { content = content }

        member this.AdAccountsList () =
          if true then
            let content = "The request has succeeded." :> obj :?> AdAccountsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsListDefaultStatusCode { content = content }

        member this.AnalyticsCreateConversionProductReport (parameters:AnalyticsCreateConversionProductReportBodyParams) =
          if true then
            let content = "Success" :> obj :?> AdsAnalyticsCreateAsyncResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateConversionProductReportStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads analytics brand, category, SKU parameters" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateConversionProductReportStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateConversionProductReportDefaultStatusCode { content = content }

        member this.AnalyticsCreateMmmReport (parameters:AnalyticsCreateMmmReportBodyParams) =
          if true then
            let content = "Success" :> obj :?> CreateMMMReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateMmmReportStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads analytics mmm parameters" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateMmmReportStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateMmmReportDefaultStatusCode { content = content }

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

        member this.AnalyticsCreateTemplateReport () =
          if true then
            let content = "The request has succeeded." :> obj :?> TemplateBasedReport // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateTemplateReportStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> TemplateBasedReport // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateTemplateReportStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateTemplateReportStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateTemplateReportStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateTemplateReportStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateTemplateReportStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateTemplateReportStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateTemplateReportDefaultStatusCode { content = content }

        member this.AnalyticsGetConversionProductReport () =
          if true then
            let content = "Success" :> obj :?> AdsAnalyticsGetAsyncResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsGetConversionProductReportStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsGetConversionProductReportStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsGetConversionProductReportDefaultStatusCode { content = content }

        member this.AnalyticsGetMmmReport () =
          if true then
            let content = "Success" :> obj :?> GetMMMReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsGetMmmReportStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsGetMmmReportStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsGetMmmReportDefaultStatusCode { content = content }

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

        member this.SandboxDelete () =
          if true then
            let content = "OK" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SandboxDeleteStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account id." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SandboxDeleteStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            SandboxDeleteDefaultStatusCode { content = content }

        member this.TemplatesList () =
          if true then
            let content = "Success" :> obj :?> TemplatesList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TemplatesListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account template parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TemplatesListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TemplatesListDefaultStatusCode { content = content }

      //#endregion

    let AdAccountsApiService = AdAccountsApiServiceImpl() :> IAdAccountsApiService