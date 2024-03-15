namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open SearchApiHandlerParams
open SearchApiServiceInterface
open SearchApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.PinsList200Response
open OpenAPI.Model.SearchPartnerPins200Response
open OpenAPI.Model.SearchUserBoardsGet200Response

module SearchApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region SearchPartnerPins
    /// <summary>
    /// Search pins by a given search term
    /// </summary>

    let SearchPartnerPins  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SearchPartnerPinsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : SearchPartnerPinsArgs
          let result = SearchApiService.SearchPartnerPins ctx serviceArgs
          return! (match result with
                      | SearchPartnerPinsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SearchPartnerPinsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | SearchPartnerPinsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SearchUserBoardsGet
    /// <summary>
    /// Search user&#39;s boards
    /// </summary>

    let SearchUserBoardsGet  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SearchUserBoardsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : SearchUserBoardsGetArgs
          let result = SearchApiService.SearchUserBoardsGet ctx serviceArgs
          return! (match result with
                      | SearchUserBoardsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SearchUserBoardsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region SearchUserPinsList
    /// <summary>
    /// Search user&#39;s Pins
    /// </summary>

    let SearchUserPinsList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<SearchUserPinsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : SearchUserPinsListArgs
          let result = SearchApiService.SearchUserPinsList ctx serviceArgs
          return! (match result with
                      | SearchUserPinsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | SearchUserPinsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | SearchUserPinsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

