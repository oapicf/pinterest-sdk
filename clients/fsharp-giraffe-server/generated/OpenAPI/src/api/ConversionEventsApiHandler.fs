namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ConversionEventsApiHandlerParams
open ConversionEventsApiServiceInterface
open ConversionEventsApiServiceImplementation
open OpenAPI.Model.ConversionApiResponse
open OpenAPI.Model.ConversionEvents
open OpenAPI.Model.DetailedError
open OpenAPI.Model.Error

module ConversionEventsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region EventsCreate
    /// <summary>
    /// Send conversions
    /// </summary>

    let EventsCreate (pathParams:EventsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<EventsCreateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<EventsCreateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : EventsCreateArgs
          let result = ConversionEventsApiService.EventsCreate ctx serviceArgs
          return! (match result with
                      | EventsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | EventsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | EventsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | EventsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | EventsCreateStatusCode422 resolved ->
                            setStatusCode 422 >=> json resolved.content
                      | EventsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | EventsCreateStatusCode503 resolved ->
                            setStatusCode 503 >=> json resolved.content
                      | EventsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

