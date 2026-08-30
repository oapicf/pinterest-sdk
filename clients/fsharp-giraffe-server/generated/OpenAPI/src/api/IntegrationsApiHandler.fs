namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open IntegrationsApiHandlerParams
open IntegrationsApiServiceInterface
open IntegrationsApiServiceImplementation
open OpenAPI.Model.IntegrationLogsInvalidLogResponse
open OpenAPI.Model.IntegrationLogsRequestCreate
open OpenAPI.Model.IntegrationLogsSuccessResponse
open OpenAPI.Model.IntegrationMetadata
open OpenAPI.Model.IntegrationMetadataCreate
open OpenAPI.Model.IntegrationMetadataUpdate
open OpenAPI.Model.IntegrationRecord
open OpenAPI.Model.IntegrationsGetList200Response
open OpenAPI.Model.PinterestLibError

module IntegrationsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region IntegrationsCommerceDel
    /// <summary>
    /// Delete commerce integration
    /// </summary>

    let IntegrationsCommerceDel (pathParams:IntegrationsCommerceDelPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : IntegrationsCommerceDelArgs
          let result = IntegrationsApiService.IntegrationsCommerceDel ctx serviceArgs
          return! (match result with
                      | IntegrationsCommerceDelStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | IntegrationsCommerceDelStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | IntegrationsCommerceDelStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | IntegrationsCommerceDelStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | IntegrationsCommerceDelStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | IntegrationsCommerceDelStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | IntegrationsCommerceDelStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | IntegrationsCommerceDelDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region IntegrationsCommerceGet
    /// <summary>
    /// Get commerce integration
    /// </summary>

    let IntegrationsCommerceGet (pathParams:IntegrationsCommerceGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : IntegrationsCommerceGetArgs
          let result = IntegrationsApiService.IntegrationsCommerceGet ctx serviceArgs
          return! (match result with
                      | IntegrationsCommerceGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | IntegrationsCommerceGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | IntegrationsCommerceGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | IntegrationsCommerceGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | IntegrationsCommerceGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | IntegrationsCommerceGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | IntegrationsCommerceGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region IntegrationsCommercePatch
    /// <summary>
    /// Update commerce integration
    /// </summary>

    let IntegrationsCommercePatch (pathParams:IntegrationsCommercePatchPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<IntegrationsCommercePatchBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : IntegrationsCommercePatchArgs
          let result = IntegrationsApiService.IntegrationsCommercePatch ctx serviceArgs
          return! (match result with
                      | IntegrationsCommercePatchStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | IntegrationsCommercePatchStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | IntegrationsCommercePatchStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | IntegrationsCommercePatchStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | IntegrationsCommercePatchStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | IntegrationsCommercePatchStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | IntegrationsCommercePatchDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region IntegrationsCommercePost
    /// <summary>
    /// Create commerce integration
    /// </summary>

    let IntegrationsCommercePost  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<IntegrationsCommercePostBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : IntegrationsCommercePostArgs
          let result = IntegrationsApiService.IntegrationsCommercePost ctx serviceArgs
          return! (match result with
                      | IntegrationsCommercePostStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | IntegrationsCommercePostStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | IntegrationsCommercePostStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | IntegrationsCommercePostStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | IntegrationsCommercePostStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | IntegrationsCommercePostStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | IntegrationsCommercePostStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | IntegrationsCommercePostDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region IntegrationsGetById
    /// <summary>
    /// Get integration metadata
    /// </summary>

    let IntegrationsGetById (pathParams:IntegrationsGetByIdPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : IntegrationsGetByIdArgs
          let result = IntegrationsApiService.IntegrationsGetById ctx serviceArgs
          return! (match result with
                      | IntegrationsGetByIdStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | IntegrationsGetByIdStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | IntegrationsGetByIdStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | IntegrationsGetByIdStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | IntegrationsGetByIdStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | IntegrationsGetByIdStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | IntegrationsGetByIdDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region IntegrationsGetList
    /// <summary>
    /// Get integration metadata list
    /// </summary>

    let IntegrationsGetList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<IntegrationsGetListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : IntegrationsGetListArgs
          let result = IntegrationsApiService.IntegrationsGetList ctx serviceArgs
          return! (match result with
                      | IntegrationsGetListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | IntegrationsGetListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | IntegrationsGetListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | IntegrationsGetListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | IntegrationsGetListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | IntegrationsGetListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | IntegrationsGetListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region IntegrationsLogsPost
    /// <summary>
    /// Receives batched logs from integration applications.
    /// </summary>

    let IntegrationsLogsPost  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<IntegrationsLogsPostBodyParams>()
          let serviceArgs = {     bodyParams=bodyParams } : IntegrationsLogsPostArgs
          let result = IntegrationsApiService.IntegrationsLogsPost ctx serviceArgs
          return! (match result with
                      | IntegrationsLogsPostStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | IntegrationsLogsPostStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | IntegrationsLogsPostStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | IntegrationsLogsPostStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | IntegrationsLogsPostStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | IntegrationsLogsPostStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | IntegrationsLogsPostDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

