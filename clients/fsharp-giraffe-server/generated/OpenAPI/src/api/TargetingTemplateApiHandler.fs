namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open TargetingTemplateApiHandlerParams
open TargetingTemplateApiServiceInterface
open TargetingTemplateApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.TargetingTemplateCreate
open OpenAPI.Model.TargetingTemplateGetResponseData
open OpenAPI.Model.TargetingTemplateList200Response
open OpenAPI.Model.TargetingTemplateUpdateRequest

module TargetingTemplateApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region TargetingTemplateCreate
    /// <summary>
    /// Create targeting templates
    /// </summary>

    let TargetingTemplateCreate (pathParams:TargetingTemplateCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<TargetingTemplateCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : TargetingTemplateCreateArgs
          let result = TargetingTemplateApiService.TargetingTemplateCreate ctx serviceArgs
          return! (match result with
                      | TargetingTemplateCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | TargetingTemplateCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TargetingTemplateCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region TargetingTemplateList
    /// <summary>
    /// List targeting templates
    /// </summary>

    let TargetingTemplateList (pathParams:TargetingTemplateListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TargetingTemplateListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : TargetingTemplateListArgs
          let result = TargetingTemplateApiService.TargetingTemplateList ctx serviceArgs
          return! (match result with
                      | TargetingTemplateListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | TargetingTemplateListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TargetingTemplateListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region TargetingTemplateUpdate
    /// <summary>
    /// Update targeting templates
    /// </summary>

    let TargetingTemplateUpdate (pathParams:TargetingTemplateUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<TargetingTemplateUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : TargetingTemplateUpdateArgs
          let result = TargetingTemplateApiService.TargetingTemplateUpdate ctx serviceArgs
          return! (match result with
                      | TargetingTemplateUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | TargetingTemplateUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TargetingTemplateUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

