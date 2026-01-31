namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MsotEventsApiHandlerParams
open MsotEventsApiServiceInterface
open MsotEventsApiServiceImplementation
open OpenAPI.Model.ConversionMSOTEvents
open OpenAPI.Model.Error

module MsotEventsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MsotEventsCreate
    /// <summary>
    /// Send Measurement Source Of Truth (MSOT) attributed conversion events
    /// </summary>

    let MsotEventsCreate (pathParams:MsotEventsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<MsotEventsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : MsotEventsCreateArgs
          let result = MsotEventsApiService.MsotEventsCreate ctx serviceArgs
          return! (match result with
                      | MsotEventsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | MsotEventsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | MsotEventsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | MsotEventsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | MsotEventsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | MsotEventsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

