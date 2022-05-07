namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open UserAccountApiHandlerParams
open UserAccountApiServiceInterface
open UserAccountApiServiceImplementation
open OpenAPI.Model.Account
open OpenAPI.Model.AnalyticsMetricsResponse
open OpenAPI.Model.Error

module UserAccountApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region UserAccountAnalytics
    /// <summary>
    /// Get user account analytics
    /// </summary>

    let UserAccountAnalytics  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UserAccountAnalyticsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UserAccountAnalyticsArgs
          let result = UserAccountApiService.UserAccountAnalytics ctx serviceArgs
          return! (match result with
                      | UserAccountAnalyticsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UserAccountAnalyticsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UserAccountAnalyticsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region UserAccountGet
    /// <summary>
    /// Get user account
    /// </summary>

    let UserAccountGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<UserAccountGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : UserAccountGetArgs
          let result = UserAccountApiService.UserAccountGet ctx serviceArgs
          return! (match result with
                      | UserAccountGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | UserAccountGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | UserAccountGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

