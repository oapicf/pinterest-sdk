namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open MediaApiHandlerParams
open MediaApiServiceInterface
open MediaApiServiceImplementation
open OpenAPI.Model.Media
open OpenAPI.Model.MediaList200Response
open OpenAPI.Model.MediaUpload
open OpenAPI.Model.MediaUploadCreate
open OpenAPI.Model.PinterestLibError

module MediaApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region MediaCreate
    /// <summary>
    /// Register media upload
    /// </summary>

    let MediaCreate  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<MediaCreateBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : MediaCreateArgs
          let result = MediaApiService.MediaCreate ctx serviceArgs
          return! (match result with
                      | MediaCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | MediaCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | MediaCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | MediaCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | MediaCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | MediaCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | MediaCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | MediaCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MediaGet
    /// <summary>
    /// Get media upload details
    /// </summary>

    let MediaGet (pathParams:MediaGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : MediaGetArgs
          let result = MediaApiService.MediaGet ctx serviceArgs
          return! (match result with
                      | MediaGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | MediaGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | MediaGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | MediaGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | MediaGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | MediaGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | MediaGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region MediaList
    /// <summary>
    /// List media uploads
    /// </summary>

    let MediaList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<MediaListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : MediaListArgs
          let result = MediaApiService.MediaList ctx serviceArgs
          return! (match result with
                      | MediaListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | MediaListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | MediaListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | MediaListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | MediaListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | MediaListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | MediaListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

