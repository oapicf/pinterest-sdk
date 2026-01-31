namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open NotificationApiHandlerParams
open NotificationApiServiceInterface
open NotificationApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.NotificationPostRequest
open OpenAPI.Model.NotificationResponse

module NotificationApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region NotificationPost
    /// <summary>
    /// Receive notifications from external partners.
    /// </summary>

    let NotificationPost  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<NotificationPostBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : NotificationPostArgs
          let result = NotificationApiService.NotificationPost ctx serviceArgs
          return! (match result with
                      | NotificationPostStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | NotificationPostStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | NotificationPostDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

