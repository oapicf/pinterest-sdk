namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ResourcesApiHandlerParams
open ResourcesApiServiceInterface
open ResourcesApiServiceImplementation
open OpenAPI.Model.AdAccountCountriesGet200Response
open OpenAPI.Model.BookClosed
open OpenAPI.Model.DeliveryMetricsGet200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PublicTargetingType
open OpenAPI.Model.ReportType
open OpenAPI.Model.SingleInterestTargetingOption

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
                      | AdAccountCountriesGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdAccountCountriesGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdAccountCountriesGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdAccountCountriesGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdAccountCountriesGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | DeliveryMetricsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | DeliveryMetricsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | DeliveryMetricsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | DeliveryMetricsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | DeliveryMetricsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | InterestTargetingOptionsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | InterestTargetingOptionsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | InterestTargetingOptionsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | InterestTargetingOptionsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | InterestTargetingOptionsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | LeadFormQuestionsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LeadFormQuestionsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LeadFormQuestionsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LeadFormQuestionsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LeadFormQuestionsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | MetricsReadyStateGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | MetricsReadyStateGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | MetricsReadyStateGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | MetricsReadyStateGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | MetricsReadyStateGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | TargetingOptionsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TargetingOptionsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | TargetingOptionsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | TargetingOptionsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | TargetingOptionsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | TargetingOptionsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

