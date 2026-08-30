namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AudiencesApiHandlerParams
open AudiencesApiServiceInterface
open AudiencesApiServiceImplementation
open OpenAPI.Model.AdAccountsAudience
open OpenAPI.Model.AdAccountsAudienceCreate
open OpenAPI.Model.AdAccountsAudienceUpdate
open OpenAPI.Model.AudienceOwnershipType
open OpenAPI.Model.AudiencesList200Response
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder

module AudiencesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AudiencesCreate
    /// <summary>
    /// Create audience
    /// </summary>

    let AudiencesCreate (pathParams:AudiencesCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AudiencesCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AudiencesCreateArgs
          let result = AudiencesApiService.AudiencesCreate ctx serviceArgs
          return! (match result with
                      | AudiencesCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AudiencesCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | AudiencesCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AudiencesCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AudiencesCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AudiencesCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AudiencesCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AudiencesCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AudiencesGet
    /// <summary>
    /// Get audience
    /// </summary>

    let AudiencesGet (pathParams:AudiencesGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AudiencesGetArgs
          let result = AudiencesApiService.AudiencesGet ctx serviceArgs
          return! (match result with
                      | AudiencesGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AudiencesGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AudiencesGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AudiencesGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AudiencesGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AudiencesGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AudiencesGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AudiencesList
    /// <summary>
    /// List audiences
    /// </summary>

    let AudiencesList (pathParams:AudiencesListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AudiencesListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AudiencesListArgs
          let result = AudiencesApiService.AudiencesList ctx serviceArgs
          return! (match result with
                      | AudiencesListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AudiencesListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AudiencesListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AudiencesListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AudiencesListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AudiencesListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AudiencesListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AudiencesUpdate
    /// <summary>
    /// Update audience
    /// </summary>

    let AudiencesUpdate (pathParams:AudiencesUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<AudiencesUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : AudiencesUpdateArgs
          let result = AudiencesApiService.AudiencesUpdate ctx serviceArgs
          return! (match result with
                      | AudiencesUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AudiencesUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | AudiencesUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | AudiencesUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | AudiencesUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | AudiencesUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | AudiencesUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

