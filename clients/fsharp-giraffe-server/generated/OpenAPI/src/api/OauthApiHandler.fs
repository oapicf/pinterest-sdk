namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open OauthApiHandlerParams
open OauthApiServiceInterface
open OauthApiServiceImplementation
open OpenAPI.Model.ConversionAccessTokenResponse
open OpenAPI.Model.Error
open OpenAPI.Model.OauthAccessTokenResponse

module OauthApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region OauthConversionToken
    /// <summary>
    /// Generate OAuth access token for conversion API
    /// </summary>

    let OauthConversionToken  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let result = OauthApiService.OauthConversionToken ctx 
          return! (match result with
                      | OauthConversionTokenStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | OauthConversionTokenDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

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

    //#region TokenRevoke
    /// <summary>
    /// Revoke a token
    /// </summary>

    let TokenRevoke  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! formParams = ctx.TryBindFormAsync<TokenRevokeFormParams>()
          let serviceArgs = {   formParams=formParams;   } : TokenRevokeArgs
          let result = OauthApiService.TokenRevoke ctx serviceArgs
          return! (match result with
                      | TokenRevokeStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | TokenRevokeStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | TokenRevokeStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | TokenRevokeDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

