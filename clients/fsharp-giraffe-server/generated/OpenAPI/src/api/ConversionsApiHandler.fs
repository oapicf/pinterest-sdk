namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ConversionsApiHandlerParams
open ConversionsApiServiceInterface
open ConversionsApiServiceImplementation
open OpenAPI.Model.AdvertiserDefinedEventsCreate200Response
open OpenAPI.Model.AdvertiserDefinedEventsCreateRequest
open OpenAPI.Model.AdvertiserDefinedEventsGet200Response
open OpenAPI.Model.PinterestLibError

module ConversionsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AdvertiserDefinedEventsCreate
    /// <summary>
    /// Create advertiser defined events
    /// </summary>

    let AdvertiserDefinedEventsCreate (pathParams:AdvertiserDefinedEventsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdvertiserDefinedEventsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdvertiserDefinedEventsCreateArgs
          let result = ConversionsApiService.AdvertiserDefinedEventsCreate ctx serviceArgs
          return! (match result with
                      | AdvertiserDefinedEventsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdvertiserDefinedEventsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdvertiserDefinedEventsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdvertiserDefinedEventsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdvertiserDefinedEventsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdvertiserDefinedEventsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdvertiserDefinedEventsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdvertiserDefinedEventsDelete
    /// <summary>
    /// Delete advertiser defined events
    /// </summary>

    let AdvertiserDefinedEventsDelete (pathParams:AdvertiserDefinedEventsDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AdvertiserDefinedEventsDeleteQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AdvertiserDefinedEventsDeleteArgs
          let result = ConversionsApiService.AdvertiserDefinedEventsDelete ctx serviceArgs
          return! (match result with
                      | AdvertiserDefinedEventsDeleteStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdvertiserDefinedEventsDeleteStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdvertiserDefinedEventsDeleteStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdvertiserDefinedEventsDeleteStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdvertiserDefinedEventsDeleteStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdvertiserDefinedEventsDeleteStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdvertiserDefinedEventsDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdvertiserDefinedEventsGet
    /// <summary>
    /// Get advertiser defined events
    /// </summary>

    let AdvertiserDefinedEventsGet (pathParams:AdvertiserDefinedEventsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AdvertiserDefinedEventsGetArgs
          let result = ConversionsApiService.AdvertiserDefinedEventsGet ctx serviceArgs
          return! (match result with
                      | AdvertiserDefinedEventsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdvertiserDefinedEventsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdvertiserDefinedEventsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdvertiserDefinedEventsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdvertiserDefinedEventsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdvertiserDefinedEventsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdvertiserDefinedEventsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AdvertiserDefinedEventsUpdate
    /// <summary>
    /// Update advertiser defined events
    /// </summary>

    let AdvertiserDefinedEventsUpdate (pathParams:AdvertiserDefinedEventsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AdvertiserDefinedEventsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AdvertiserDefinedEventsUpdateArgs
          let result = ConversionsApiService.AdvertiserDefinedEventsUpdate ctx serviceArgs
          return! (match result with
                      | AdvertiserDefinedEventsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AdvertiserDefinedEventsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AdvertiserDefinedEventsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AdvertiserDefinedEventsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AdvertiserDefinedEventsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AdvertiserDefinedEventsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AdvertiserDefinedEventsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

