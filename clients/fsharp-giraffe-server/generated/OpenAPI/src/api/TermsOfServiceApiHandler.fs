namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open TermsOfServiceApiHandlerParams
open TermsOfServiceApiServiceInterface
open TermsOfServiceApiServiceImplementation
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.TermsOfService

module TermsOfServiceApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region TermsOfServiceGet
    /// <summary>
    /// Get terms of service
    /// </summary>

    let TermsOfServiceGet (pathParams:TermsOfServiceGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TermsOfServiceGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : TermsOfServiceGetArgs
          let result = TermsOfServiceApiService.TermsOfServiceGet ctx serviceArgs
          return! (match result with
                      | TermsOfServiceGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | TermsOfServiceGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TermsOfServiceGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | TermsOfServiceGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | TermsOfServiceGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | TermsOfServiceGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | TermsOfServiceGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

