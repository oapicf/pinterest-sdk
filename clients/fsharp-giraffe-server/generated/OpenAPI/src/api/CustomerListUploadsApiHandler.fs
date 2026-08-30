namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open CustomerListUploadsApiHandlerParams
open CustomerListUploadsApiServiceInterface
open CustomerListUploadsApiServiceImplementation
open OpenAPI.Model.CustomerListUpload
open OpenAPI.Model.CustomerListUploadCreateRequest
open OpenAPI.Model.CustomerListUploadCreateResponse
open OpenAPI.Model.PinterestLibError

module CustomerListUploadsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CustomerListUploadsCreate
    /// <summary>
    /// Create customer list upload
    /// </summary>

    let CustomerListUploadsCreate (pathParams:CustomerListUploadsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<CustomerListUploadsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : CustomerListUploadsCreateArgs
          let result = CustomerListUploadsApiService.CustomerListUploadsCreate ctx serviceArgs
          return! (match result with
                      | CustomerListUploadsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CustomerListUploadsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CustomerListUploadsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CustomerListUploadsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CustomerListUploadsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CustomerListUploadsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CustomerListUploadsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CustomerListUploadsGet
    /// <summary>
    /// Get customer list upload
    /// </summary>

    let CustomerListUploadsGet (pathParams:CustomerListUploadsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CustomerListUploadsGetArgs
          let result = CustomerListUploadsApiService.CustomerListUploadsGet ctx serviceArgs
          return! (match result with
                      | CustomerListUploadsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CustomerListUploadsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CustomerListUploadsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CustomerListUploadsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CustomerListUploadsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CustomerListUploadsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CustomerListUploadsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region CustomerListUploadsRun
    /// <summary>
    /// Run customer list upload
    /// </summary>

    let CustomerListUploadsRun (pathParams:CustomerListUploadsRunPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : CustomerListUploadsRunArgs
          let result = CustomerListUploadsApiService.CustomerListUploadsRun ctx serviceArgs
          return! (match result with
                      | CustomerListUploadsRunStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CustomerListUploadsRunStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | CustomerListUploadsRunStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | CustomerListUploadsRunStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | CustomerListUploadsRunStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | CustomerListUploadsRunStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | CustomerListUploadsRunDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

