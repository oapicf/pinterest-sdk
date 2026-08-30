namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open LabelsApiHandlerParams
open LabelsApiServiceInterface
open LabelsApiServiceImplementation
open OpenAPI.Model.LabelCreateRequest
open OpenAPI.Model.LabelUpdateRequest
open OpenAPI.Model.LabeledEntities
open OpenAPI.Model.LabeledEntitiesCreate
open OpenAPI.Model.LabelsList200Response
open OpenAPI.Model.LabelsResponse
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.QueryLabelEntityStatusesItems
open OpenAPI.Model.QueryLabelTypesItems

module LabelsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region LabelsApply
    /// <summary>
    /// Apply label to entity
    /// </summary>

    let LabelsApply (pathParams:LabelsApplyPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<LabelsApplyBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : LabelsApplyArgs
          let result = LabelsApiService.LabelsApply ctx serviceArgs
          return! (match result with
                      | LabelsApplyStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LabelsApplyStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | LabelsApplyStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LabelsApplyStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LabelsApplyStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LabelsApplyStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LabelsApplyStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | LabelsApplyDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LabelsCreate
    /// <summary>
    /// Create labels
    /// </summary>

    let LabelsCreate (pathParams:LabelsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<LabelsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : LabelsCreateArgs
          let result = LabelsApiService.LabelsCreate ctx serviceArgs
          return! (match result with
                      | LabelsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LabelsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LabelsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LabelsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LabelsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LabelsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | LabelsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LabelsList
    /// <summary>
    /// List labels
    /// </summary>

    let LabelsList (pathParams:LabelsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<LabelsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : LabelsListArgs
          let result = LabelsApiService.LabelsList ctx serviceArgs
          return! (match result with
                      | LabelsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LabelsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LabelsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LabelsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LabelsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LabelsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | LabelsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LabelsRemove
    /// <summary>
    /// Remove label from entities
    /// </summary>

    let LabelsRemove (pathParams:LabelsRemovePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<LabelsRemoveBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : LabelsRemoveArgs
          let result = LabelsApiService.LabelsRemove ctx serviceArgs
          return! (match result with
                      | LabelsRemoveStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LabelsRemoveStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | LabelsRemoveStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LabelsRemoveStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LabelsRemoveStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LabelsRemoveStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LabelsRemoveStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | LabelsRemoveDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LabelsUpdate
    /// <summary>
    /// Update labels
    /// </summary>

    let LabelsUpdate (pathParams:LabelsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<LabelsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : LabelsUpdateArgs
          let result = LabelsApiService.LabelsUpdate ctx serviceArgs
          return! (match result with
                      | LabelsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LabelsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LabelsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LabelsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LabelsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LabelsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | LabelsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

