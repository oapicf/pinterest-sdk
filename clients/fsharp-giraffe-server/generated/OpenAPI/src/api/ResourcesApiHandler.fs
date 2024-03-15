namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ResourcesApiHandlerParams
open ResourcesApiServiceInterface
open ResourcesApiServiceImplementation
open OpenAPI.Model.AdAccountsCountryResponse
open OpenAPI.Model.BookClosedResponse
open OpenAPI.Model.DeliveryMetricsResponse
open OpenAPI.Model.Error
open OpenAPI.Model.SingleInterestTargetingOptionResponse

module ResourcesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdAccountCountriesGet
    /// <summary>
    /// Get ad accounts countries
    /// </summary>

    let AdAccountCountriesGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = ResourcesApiService.AdAccountCountriesGet ctx 
          return! (match result with
                      | AdAccountCountriesGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdAccountCountriesGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region DeliveryMetricsGet
    /// <summary>
    /// Get available metrics&#39; definitions
    /// </summary>

    let DeliveryMetricsGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<DeliveryMetricsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : DeliveryMetricsGetArgs
          let result = ResourcesApiService.DeliveryMetricsGet ctx serviceArgs
          return! (match result with
                      | DeliveryMetricsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | DeliveryMetricsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region InterestTargetingOptionsGet
    /// <summary>
    /// Get interest details
    /// </summary>

    let InterestTargetingOptionsGet (pathParams:InterestTargetingOptionsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : InterestTargetingOptionsGetArgs
          let result = ResourcesApiService.InterestTargetingOptionsGet ctx serviceArgs
          return! (match result with
                      | InterestTargetingOptionsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | InterestTargetingOptionsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LeadFormQuestionsGet
    /// <summary>
    /// Get lead form questions
    /// </summary>

    let LeadFormQuestionsGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = ResourcesApiService.LeadFormQuestionsGet ctx 
          return! (match result with
                      | LeadFormQuestionsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | LeadFormQuestionsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MetricsReadyStateGet
    /// <summary>
    /// Get metrics ready state
    /// </summary>

    let MetricsReadyStateGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MetricsReadyStateGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MetricsReadyStateGetArgs
          let result = ResourcesApiService.MetricsReadyStateGet ctx serviceArgs
          return! (match result with
                      | MetricsReadyStateGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | MetricsReadyStateGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region TargetingOptionsGet
    /// <summary>
    /// Get targeting options
    /// </summary>

    let TargetingOptionsGet (pathParams:TargetingOptionsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TargetingOptionsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : TargetingOptionsGetArgs
          let result = ResourcesApiService.TargetingOptionsGet ctx serviceArgs
          return! (match result with
                      | TargetingOptionsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | TargetingOptionsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

