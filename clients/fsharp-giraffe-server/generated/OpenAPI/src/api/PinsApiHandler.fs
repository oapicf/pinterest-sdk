namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open PinsApiHandlerParams
open PinsApiServiceInterface
open PinsApiServiceImplementation
open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.Error
open OpenAPI.Model.Pin

module PinsApiHandler =

    /// <summary>
    /// 
    /// </summary>

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
          let! bodyParams =
            ctx.BindJsonAsync<PinsCreateBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : PinsCreateArgs
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
          let serviceArgs = {    pathParams=pathParams;  } : PinsDeleteArgs
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

