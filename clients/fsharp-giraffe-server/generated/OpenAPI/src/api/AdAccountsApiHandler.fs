namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AdAccountsApiHandlerParams
open AdAccountsApiServiceInterface
open AdAccountsApiServiceImplementation
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

module AdAccountsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdAccountAnalytics
    /// <summary>
    /// Get ad account analytics
    /// </summary>

    let AdAccountAnalytics (pathParams:AdAccountAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdAccountAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdAccountAnalyticsArgs
          let result = AdAccountsApiService.AdAccountAnalytics ctx serviceArgs
          return! (match result with
                      | AdAccountAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdAccountAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdAccountAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdAccountTargetingAnalyticsGet
    /// <summary>
    /// Get targeting analytics for an ad account
    /// </summary>

    let AdAccountTargetingAnalyticsGet (pathParams:AdAccountTargetingAnalyticsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdAccountTargetingAnalyticsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdAccountTargetingAnalyticsGetArgs
          let result = AdAccountsApiService.AdAccountTargetingAnalyticsGet ctx serviceArgs
          return! (match result with
                      | AdAccountTargetingAnalyticsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdAccountTargetingAnalyticsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdAccountsCreate
    /// <summary>
    /// Create ad account
    /// </summary>

    let AdAccountsCreate  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdAccountsCreateBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : AdAccountsCreateArgs
          let result = AdAccountsApiService.AdAccountsCreate ctx serviceArgs
          return! (match result with
                      | AdAccountsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdAccountsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdAccountsGet
    /// <summary>
    /// Get ad account
    /// </summary>

    let AdAccountsGet (pathParams:AdAccountsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdAccountsGetArgs
          let result = AdAccountsApiService.AdAccountsGet ctx serviceArgs
          return! (match result with
                      | AdAccountsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdAccountsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdAccountsList
    /// <summary>
    /// List ad accounts
    /// </summary>

    let AdAccountsList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdAccountsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : AdAccountsListArgs
          let result = AdAccountsApiService.AdAccountsList ctx serviceArgs
          return! (match result with
                      | AdAccountsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdAccountsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AnalyticsCreateMmmReport
    /// <summary>
    /// Create a request for a Marketing Mix Modeling (MMM) report
    /// </summary>

    let AnalyticsCreateMmmReport (pathParams:AnalyticsCreateMmmReportPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AnalyticsCreateMmmReportBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AnalyticsCreateMmmReportArgs
          let result = AdAccountsApiService.AnalyticsCreateMmmReport ctx serviceArgs
          return! (match result with
                      | AnalyticsCreateMmmReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AnalyticsCreateMmmReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AnalyticsCreateMmmReportDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AnalyticsCreateReport
    /// <summary>
    /// Create async request for an account analytics report
    /// </summary>

    let AnalyticsCreateReport (pathParams:AnalyticsCreateReportPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AnalyticsCreateReportBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AnalyticsCreateReportArgs
          let result = AdAccountsApiService.AnalyticsCreateReport ctx serviceArgs
          return! (match result with
                      | AnalyticsCreateReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AnalyticsCreateReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AnalyticsCreateReportDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AnalyticsCreateTemplateReport
    /// <summary>
    /// Create async request for an analytics report using a template
    /// </summary>

    let AnalyticsCreateTemplateReport (pathParams:AnalyticsCreateTemplateReportPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AnalyticsCreateTemplateReportQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AnalyticsCreateTemplateReportArgs
          let result = AdAccountsApiService.AnalyticsCreateTemplateReport ctx serviceArgs
          return! (match result with
                      | AnalyticsCreateTemplateReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AnalyticsCreateTemplateReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AnalyticsCreateTemplateReportDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AnalyticsGetMmmReport
    /// <summary>
    /// Get advertiser Marketing Mix Modeling (MMM) report.
    /// </summary>

    let AnalyticsGetMmmReport (pathParams:AnalyticsGetMmmReportPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AnalyticsGetMmmReportQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AnalyticsGetMmmReportArgs
          let result = AdAccountsApiService.AnalyticsGetMmmReport ctx serviceArgs
          return! (match result with
                      | AnalyticsGetMmmReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AnalyticsGetMmmReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AnalyticsGetMmmReportDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AnalyticsGetReport
    /// <summary>
    /// Get the account analytics report created by the async call
    /// </summary>

    let AnalyticsGetReport (pathParams:AnalyticsGetReportPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AnalyticsGetReportQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AnalyticsGetReportArgs
          let result = AdAccountsApiService.AnalyticsGetReport ctx serviceArgs
          return! (match result with
                      | AnalyticsGetReportStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AnalyticsGetReportStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AnalyticsGetReportDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SandboxDelete
    /// <summary>
    /// Delete ads data for ad account in API Sandbox
    /// </summary>

    let SandboxDelete (pathParams:SandboxDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : SandboxDeleteArgs
          let result = AdAccountsApiService.SandboxDelete ctx serviceArgs
          return! (match result with
                      | SandboxDeleteStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | SandboxDeleteStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SandboxDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region TemplatesList
    /// <summary>
    /// List templates
    /// </summary>

    let TemplatesList (pathParams:TemplatesListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TemplatesListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : TemplatesListArgs
          let result = AdAccountsApiService.TemplatesList ctx serviceArgs
          return! (match result with
                      | TemplatesListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | TemplatesListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TemplatesListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

