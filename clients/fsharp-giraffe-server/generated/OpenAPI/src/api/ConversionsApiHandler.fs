namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ConversionsApiHandlerParams
open ConversionsApiServiceInterface
open ConversionsApiServiceImplementation
open OpenAPI.Model.AdvertiserDefinedEventsResponse
open OpenAPI.Model.Error

module ConversionsApiHandler =

    /// <summary>
    /// 
    /// </summary>

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
                      | AdvertiserDefinedEventsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

