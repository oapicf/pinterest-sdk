namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AdGroupsApiHandlerParams
open AdGroupsApiServiceInterface
open AdGroupsApiServiceImplementation
open OpenAPI.Model.AdGroupArrayResponse
open OpenAPI.Model.AdGroupAudienceSizingRequest
open OpenAPI.Model.AdGroupAudienceSizingResponse
open OpenAPI.Model.AdGroupCreateRequest
open OpenAPI.Model.AdGroupResponse
open OpenAPI.Model.AdGroupUpdateRequest
open OpenAPI.Model.AdGroupsAnalyticsResponseInner
open OpenAPI.Model.AdGroupsList200Response
open OpenAPI.Model.AdsAnalyticsTargetingType
open OpenAPI.Model.BidFloor
open OpenAPI.Model.BidFloorRequest
open OpenAPI.Model.ConversionReportAttributionType
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.MetricsResponse

module AdGroupsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdGroupsAnalytics
    /// <summary>
    /// Get ad group analytics
    /// </summary>

    let AdGroupsAnalytics (pathParams:AdGroupsAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdGroupsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdGroupsAnalyticsArgs
          let result = AdGroupsApiService.AdGroupsAnalytics ctx serviceArgs
          return! (match result with
                      | AdGroupsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsAudienceSizing
    /// <summary>
    /// Get audience sizing
    /// </summary>

    let AdGroupsAudienceSizing (pathParams:AdGroupsAudienceSizingPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdGroupsAudienceSizingBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdGroupsAudienceSizingArgs
          let result = AdGroupsApiService.AdGroupsAudienceSizing ctx serviceArgs
          return! (match result with
                      | AdGroupsAudienceSizingStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsAudienceSizingStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdGroupsAudienceSizingStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdGroupsAudienceSizingDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsBidFloorGet
    /// <summary>
    /// Get bid floors
    /// </summary>

    let AdGroupsBidFloorGet (pathParams:AdGroupsBidFloorGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdGroupsBidFloorGetBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdGroupsBidFloorGetArgs
          let result = AdGroupsApiService.AdGroupsBidFloorGet ctx serviceArgs
          return! (match result with
                      | AdGroupsBidFloorGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsBidFloorGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsCreate
    /// <summary>
    /// Create ad groups
    /// </summary>

    let AdGroupsCreate (pathParams:AdGroupsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdGroupsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdGroupsCreateArgs
          let result = AdGroupsApiService.AdGroupsCreate ctx serviceArgs
          return! (match result with
                      | AdGroupsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsGet
    /// <summary>
    /// Get ad group
    /// </summary>

    let AdGroupsGet (pathParams:AdGroupsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdGroupsGetArgs
          let result = AdGroupsApiService.AdGroupsGet ctx serviceArgs
          return! (match result with
                      | AdGroupsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsGetDefaultStatusCode resolved ->
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
          let result = AdGroupsApiService.AdGroupsList ctx serviceArgs
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

    //#region AdGroupsTargetingAnalyticsGet
    /// <summary>
    /// Get targeting analytics for ad groups
    /// </summary>

    let AdGroupsTargetingAnalyticsGet (pathParams:AdGroupsTargetingAnalyticsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdGroupsTargetingAnalyticsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdGroupsTargetingAnalyticsGetArgs
          let result = AdGroupsApiService.AdGroupsTargetingAnalyticsGet ctx serviceArgs
          return! (match result with
                      | AdGroupsTargetingAnalyticsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsTargetingAnalyticsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdGroupsUpdate
    /// <summary>
    /// Update ad groups
    /// </summary>

    let AdGroupsUpdate (pathParams:AdGroupsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdGroupsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdGroupsUpdateArgs
          let result = AdGroupsApiService.AdGroupsUpdate ctx serviceArgs
          return! (match result with
                      | AdGroupsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdGroupsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

