namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open LabelsApiHandlerParams
open LabelsApiServiceInterface
open LabelsApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.LabelCreateRequest
open OpenAPI.Model.LabelUpdateRequest
open OpenAPI.Model.LabelsList200Response
open OpenAPI.Model.LabelsResponse

module LabelsApiHandler =

    /// <summary>
    /// 
    /// </summary>

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
                      | LabelsListDefaultStatusCode resolved ->
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
                      | LabelsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

