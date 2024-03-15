namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OauthApiHandlerParams
open OauthApiServiceInterface
open OauthApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.OauthAccessTokenResponse

module OauthApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region OauthToken
    /// <summary>
    /// Generate OAuth access token
    /// </summary>

    let OauthToken  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<OauthTokenFormParams>()
          let serviceArgs = {   formParams=formParams;   } : OauthTokenArgs
          let result = OauthApiService.OauthToken ctx serviceArgs
          return! (match result with
                      | OauthTokenStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | OauthTokenDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

