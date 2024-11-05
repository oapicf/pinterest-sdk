namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CampaignsApiHandlerParams
open CampaignsApiServiceInterface
open CampaignsApiServiceImplementation
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

module CampaignsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CampaignTargetingAnalyticsGet
    /// <summary>
    /// Get targeting analytics for campaigns
    /// </summary>

    let CampaignTargetingAnalyticsGet (pathParams:CampaignTargetingAnalyticsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CampaignTargetingAnalyticsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CampaignTargetingAnalyticsGetArgs
          let result = CampaignsApiService.CampaignTargetingAnalyticsGet ctx serviceArgs
          return! (match result with
                      | CampaignTargetingAnalyticsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignTargetingAnalyticsGetDefaultStatusCode resolved ->
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
          let result = CampaignsApiService.CampaignsAnalytics ctx serviceArgs
          return! (match result with
                      | CampaignsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CampaignsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignsCreate
    /// <summary>
    /// Create campaigns
    /// </summary>

    let CampaignsCreate (pathParams:CampaignsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CampaignsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CampaignsCreateArgs
          let result = CampaignsApiService.CampaignsCreate ctx serviceArgs
          return! (match result with
                      | CampaignsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CampaignsGet
    /// <summary>
    /// Get campaign
    /// </summary>

    let CampaignsGet (pathParams:CampaignsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CampaignsGetArgs
          let result = CampaignsApiService.CampaignsGet ctx serviceArgs
          return! (match result with
                      | CampaignsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignsGetDefaultStatusCode resolved ->
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
          let result = CampaignsApiService.CampaignsList ctx serviceArgs
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

    //#region CampaignsUpdate
    /// <summary>
    /// Update campaigns
    /// </summary>

    let CampaignsUpdate (pathParams:CampaignsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CampaignsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CampaignsUpdateArgs
          let result = CampaignsApiService.CampaignsUpdate ctx serviceArgs
          return! (match result with
                      | CampaignsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CampaignsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

