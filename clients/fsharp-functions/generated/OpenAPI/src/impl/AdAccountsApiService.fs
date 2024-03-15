namespace OpenAPI
open OpenAPI.Model.AdAccount
open OpenAPI.Model.AdAccountAnalyticsResponseInner
open OpenAPI.Model.AdAccountCreateRequest
open OpenAPI.Model.AdAccountsList200Response
open OpenAPI.Model.AdsAnalyticsCreateAsyncRequest
open OpenAPI.Model.AdsAnalyticsCreateAsyncResponse
open OpenAPI.Model.AdsAnalyticsGetAsyncResponse
open OpenAPI.Model.AdsAnalyticsTargetingType
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.CreateMMMReportRequest
open OpenAPI.Model.CreateMMMReportResponse
open OpenAPI.Model.Error
open OpenAPI.Model.GetMMMReportResponse
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse
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
            let content = "Success" :> obj :?> AdAccount // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsCreateDefaultStatusCode { content = content }

        member this.AdAccountsGet () =
          if true then
            let content = "Success" :> obj :?> AdAccount // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsGetDefaultStatusCode { content = content }

        member this.AdAccountsList () =
          if true then
            let content = "response" :> obj :?> AdAccountsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsListStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AdAccountsListDefaultStatusCode { content = content }

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
            let content = "Success" :> obj :?> AdsAnalyticsCreateAsyncResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateTemplateReportStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads analytics template parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateTemplateReportStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            AnalyticsCreateTemplateReportDefaultStatusCode { content = content }

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