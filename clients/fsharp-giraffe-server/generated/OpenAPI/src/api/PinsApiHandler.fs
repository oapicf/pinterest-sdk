namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PinsApiHandlerParams
open PinsApiServiceInterface
open PinsApiServiceImplementation
open OpenAPI.Model.Error
open System.Collections.Generic
open OpenAPI.Model.Pin
open OpenAPI.Model.PinAnalyticsMetricsResponse
open OpenAPI.Model.PinCreate
open OpenAPI.Model.PinUpdate
open OpenAPI.Model.PinsAnalyticsMetricTypesParameterInner
open OpenAPI.Model.PinsList200Response
open OpenAPI.Model.PinsSaveRequest

module PinsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MultiPinsAnalytics
    /// <summary>
    /// Get multiple Pin analytics
    /// </summary>

    let MultiPinsAnalytics  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MultiPinsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MultiPinsAnalyticsArgs
          let result = PinsApiService.MultiPinsAnalytics ctx serviceArgs
          return! (match result with
                      | MultiPinsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | MultiPinsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | MultiPinsAnalyticsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | MultiPinsAnalyticsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | MultiPinsAnalyticsStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | MultiPinsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PinsAnalytics
    /// <summary>
    /// Get Pin analytics
    /// </summary>

    let PinsAnalytics (pathParams:PinsAnalyticsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PinsAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : PinsAnalyticsArgs
          let result = PinsApiService.PinsAnalytics ctx serviceArgs
          return! (match result with
                      | PinsAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PinsAnalyticsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | PinsAnalyticsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | PinsAnalyticsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | PinsAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PinsCreate
    /// <summary>
    /// Create Pin
    /// </summary>

    let PinsCreate  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PinsCreateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<PinsCreateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : PinsCreateArgs
          let result = PinsApiService.PinsCreate ctx serviceArgs
          return! (match result with
                      | PinsCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | PinsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | PinsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | PinsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | PinsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | PinsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PinsDelete
    /// <summary>
    /// Delete Pin
    /// </summary>

    let PinsDelete (pathParams:PinsDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PinsDeleteQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : PinsDeleteArgs
          let result = PinsApiService.PinsDelete ctx serviceArgs
          return! (match result with
                      | PinsDeleteStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | PinsDeleteStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | PinsDeleteStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | PinsDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PinsGet
    /// <summary>
    /// Get Pin
    /// </summary>

    let PinsGet (pathParams:PinsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PinsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : PinsGetArgs
          let result = PinsApiService.PinsGet ctx serviceArgs
          return! (match result with
                      | PinsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PinsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | PinsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | PinsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PinsList
    /// <summary>
    /// List Pins
    /// </summary>

    let PinsList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PinsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : PinsListArgs
          let result = PinsApiService.PinsList ctx serviceArgs
          return! (match result with
                      | PinsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PinsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | PinsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PinsSave
    /// <summary>
    /// Save Pin
    /// </summary>

    let PinsSave (pathParams:PinsSavePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PinsSaveQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<PinsSaveBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : PinsSaveArgs
          let result = PinsApiService.PinsSave ctx serviceArgs
          return! (match result with
                      | PinsSaveStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | PinsSaveStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | PinsSaveStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | PinsSaveDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region PinsUpdate
    /// <summary>
    /// Update Pin
    /// </summary>

    let PinsUpdate (pathParams:PinsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<PinsUpdateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<PinsUpdateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : PinsUpdateArgs
          let result = PinsApiService.PinsUpdate ctx serviceArgs
          return! (match result with
                      | PinsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | PinsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | PinsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | PinsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | PinsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

