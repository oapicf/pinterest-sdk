namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AdAccountsApiHandlerParams
open AdAccountsApiServiceInterface
open AdAccountsApiServiceImplementation
open OpenAPI.Model.AdsAnalyticsCreateAsyncRequest
open OpenAPI.Model.AdsAnalyticsCreateAsyncResponse
open OpenAPI.Model.AdsAnalyticsGetAsyncResponse
open OpenAPI.Model.AnyType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.Paginated

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
                            setStatusCode 200 >=> text resolved.content
                      | AdAccountAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdAccountAnalyticsDefaultStatusCode resolved ->
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

    //#region AdGroupsAnalytics
    /// <summary>
    /// Get ad group analytics
    /// </summary>

    let AdGroupsAnalytics (pathParams:AdGroupsAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdGroupsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdGroupsAnalyticsArgs
          let result = AdAccountsApiService.AdGroupsAnalytics ctx serviceArgs
          return! (match result with
                      | AdGroupsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | AdGroupsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsList
    /// <summary>
    /// List ad groups
    /// </summary>

    let AdGroupsList (pathParams:AdGroupsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdGroupsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdGroupsListArgs
          let result = AdAccountsApiService.AdGroupsList ctx serviceArgs
          return! (match result with
                      | AdGroupsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdsAnalytics
    /// <summary>
    /// Get ad analytics
    /// </summary>

    let AdsAnalytics (pathParams:AdsAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdsAnalyticsArgs
          let result = AdAccountsApiService.AdsAnalytics ctx serviceArgs
          return! (match result with
                      | AdsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | AdsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdsList
    /// <summary>
    /// List ads
    /// </summary>

    let AdsList (pathParams:AdsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdsListArgs
          let result = AdAccountsApiService.AdsList ctx serviceArgs
          return! (match result with
                      | AdsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdsListDefaultStatusCode resolved ->
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

    //#region CampaignsAnalytics
    /// <summary>
    /// Get campaign analytics
    /// </summary>

    let CampaignsAnalytics (pathParams:CampaignsAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CampaignsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CampaignsAnalyticsArgs
          let result = AdAccountsApiService.CampaignsAnalytics ctx serviceArgs
          return! (match result with
                      | CampaignsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | CampaignsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignsList
    /// <summary>
    /// List campaigns
    /// </summary>

    let CampaignsList (pathParams:CampaignsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CampaignsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CampaignsListArgs
          let result = AdAccountsApiService.CampaignsList ctx serviceArgs
          return! (match result with
                      | CampaignsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region ProductGroupsAnalytics
    /// <summary>
    /// Get product group analytics
    /// </summary>

    let ProductGroupsAnalytics (pathParams:ProductGroupsAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ProductGroupsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ProductGroupsAnalyticsArgs
          let result = AdAccountsApiService.ProductGroupsAnalytics ctx serviceArgs
          return! (match result with
                      | ProductGroupsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | ProductGroupsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ProductGroupsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

