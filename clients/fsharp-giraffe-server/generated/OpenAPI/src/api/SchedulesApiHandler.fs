namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open SchedulesApiHandlerParams
open SchedulesApiServiceInterface
open SchedulesApiServiceImplementation
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.Schedule
open OpenAPI.Model.ScheduleBatchUpdate
open OpenAPI.Model.ScheduleCreate
open OpenAPI.Model.ScheduleStatus
open OpenAPI.Model.ScheduleType
open OpenAPI.Model.SchedulesCreate200ResponseInner
open OpenAPI.Model.SchedulesList200Response

module SchedulesApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region SchedulesCreate
    /// <summary>
    /// Create schedules
    /// </summary>

    let SchedulesCreate (pathParams:SchedulesCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SchedulesCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SchedulesCreateArgs
          let result = SchedulesApiService.SchedulesCreate ctx serviceArgs
          return! (match result with
                      | SchedulesCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SchedulesCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | SchedulesCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SchedulesCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SchedulesCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SchedulesCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SchedulesCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | SchedulesCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SchedulesList
    /// <summary>
    /// Get Schedules
    /// </summary>

    let SchedulesList (pathParams:SchedulesListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SchedulesListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : SchedulesListArgs
          let result = SchedulesApiService.SchedulesList ctx serviceArgs
          return! (match result with
                      | SchedulesListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SchedulesListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SchedulesListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SchedulesListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SchedulesListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SchedulesListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | SchedulesListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SchedulesUpdate
    /// <summary>
    /// Update schedules
    /// </summary>

    let SchedulesUpdate (pathParams:SchedulesUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<SchedulesUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : SchedulesUpdateArgs
          let result = SchedulesApiService.SchedulesUpdate ctx serviceArgs
          return! (match result with
                      | SchedulesUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SchedulesUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SchedulesUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | SchedulesUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | SchedulesUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SchedulesUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | SchedulesUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

