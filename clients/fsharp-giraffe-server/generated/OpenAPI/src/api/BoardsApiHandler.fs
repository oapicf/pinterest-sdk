namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open BoardsApiHandlerParams
open BoardsApiServiceInterface
open BoardsApiServiceImplementation
open OpenAPI.Model.Board
open OpenAPI.Model.BoardCreate
open OpenAPI.Model.BoardPrivacyFilter
open OpenAPI.Model.BoardSection
open OpenAPI.Model.BoardSectionCreate
open OpenAPI.Model.BoardSectionUpdateWithRequiredBody
open OpenAPI.Model.BoardSectionsList200Response
open OpenAPI.Model.BoardWithUpdatePrivacy
open OpenAPI.Model.BoardWithUpdatePrivacyUpdate
open OpenAPI.Model.BoardsList200Response
open OpenAPI.Model.BoardsListPins200Response
open OpenAPI.Model.CreativeType
open OpenAPI.Model.PinterestLibError

module BoardsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region BoardSectionsCreate
    /// <summary>
    /// Create board section
    /// </summary>

    let BoardSectionsCreate (pathParams:BoardSectionsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardSectionsCreateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<BoardSectionsCreateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : BoardSectionsCreateArgs
          let result = BoardsApiService.BoardSectionsCreate ctx serviceArgs
          return! (match result with
                      | BoardSectionsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardSectionsCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | BoardSectionsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardSectionsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BoardSectionsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BoardSectionsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BoardSectionsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BoardSectionsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BoardSectionsDelete
    /// <summary>
    /// Delete board section
    /// </summary>

    let BoardSectionsDelete (pathParams:BoardSectionsDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardSectionsDeleteQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BoardSectionsDeleteArgs
          let result = BoardsApiService.BoardSectionsDelete ctx serviceArgs
          return! (match result with
                      | BoardSectionsDeleteStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardSectionsDeleteStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | BoardSectionsDeleteStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardSectionsDeleteStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BoardSectionsDeleteStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BoardSectionsDeleteStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BoardSectionsDeleteStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BoardSectionsDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BoardSectionsList
    /// <summary>
    /// List board sections
    /// </summary>

    let BoardSectionsList (pathParams:BoardSectionsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardSectionsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BoardSectionsListArgs
          let result = BoardsApiService.BoardSectionsList ctx serviceArgs
          return! (match result with
                      | BoardSectionsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardSectionsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardSectionsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BoardSectionsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BoardSectionsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BoardSectionsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BoardSectionsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BoardSectionsListPins
    /// <summary>
    /// List Pins on board section
    /// </summary>

    let BoardSectionsListPins (pathParams:BoardSectionsListPinsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardSectionsListPinsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BoardSectionsListPinsArgs
          let result = BoardsApiService.BoardSectionsListPins ctx serviceArgs
          return! (match result with
                      | BoardSectionsListPinsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardSectionsListPinsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardSectionsListPinsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BoardSectionsListPinsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BoardSectionsListPinsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BoardSectionsListPinsStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BoardSectionsListPinsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BoardSectionsUpdate
    /// <summary>
    /// Update board section
    /// </summary>

    let BoardSectionsUpdate (pathParams:BoardSectionsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardSectionsUpdateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<BoardSectionsUpdateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : BoardSectionsUpdateArgs
          let result = BoardsApiService.BoardSectionsUpdate ctx serviceArgs
          return! (match result with
                      | BoardSectionsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardSectionsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardSectionsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BoardSectionsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BoardSectionsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BoardSectionsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BoardSectionsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BoardsCreate
    /// <summary>
    /// Create board
    /// </summary>

    let BoardsCreate  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardsCreateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<BoardsCreateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;   bodyParams=bodyParams } : BoardsCreateArgs
          let result = BoardsApiService.BoardsCreate ctx serviceArgs
          return! (match result with
                      | BoardsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardsCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | BoardsCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardsCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BoardsCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BoardsCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BoardsCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BoardsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BoardsDelete
    /// <summary>
    /// Delete board
    /// </summary>

    let BoardsDelete (pathParams:BoardsDeletePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardsDeleteQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BoardsDeleteArgs
          let result = BoardsApiService.BoardsDelete ctx serviceArgs
          return! (match result with
                      | BoardsDeleteStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardsDeleteStatusCode204 resolved ->
                            setStatusCode 204 >=> text resolved.content
                      | BoardsDeleteStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardsDeleteStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BoardsDeleteStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BoardsDeleteStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BoardsDeleteStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BoardsDeleteDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BoardsGet
    /// <summary>
    /// Get board
    /// </summary>

    let BoardsGet (pathParams:BoardsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BoardsGetArgs
          let result = BoardsApiService.BoardsGet ctx serviceArgs
          return! (match result with
                      | BoardsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardsGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardsGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BoardsGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BoardsGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BoardsGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BoardsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BoardsList
    /// <summary>
    /// List boards
    /// </summary>

    let BoardsList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : BoardsListArgs
          let result = BoardsApiService.BoardsList ctx serviceArgs
          return! (match result with
                      | BoardsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BoardsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BoardsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BoardsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BoardsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BoardsListPins
    /// <summary>
    /// List Pins on board
    /// </summary>

    let BoardsListPins (pathParams:BoardsListPinsPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardsListPinsQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : BoardsListPinsArgs
          let result = BoardsApiService.BoardsListPins ctx serviceArgs
          return! (match result with
                      | BoardsListPinsStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardsListPinsStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardsListPinsStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BoardsListPinsStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BoardsListPinsStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BoardsListPinsStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BoardsListPinsDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region BoardsUpdate
    /// <summary>
    /// Update board
    /// </summary>

    let BoardsUpdate (pathParams:BoardsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<BoardsUpdateQueryParams>()
          let! bodyParams =
            ctx.BindJsonAsync<BoardsUpdateBodyParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams; bodyParams=bodyParams } : BoardsUpdateArgs
          let result = BoardsApiService.BoardsUpdate ctx serviceArgs
          return! (match result with
                      | BoardsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | BoardsUpdateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | BoardsUpdateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | BoardsUpdateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | BoardsUpdateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | BoardsUpdateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | BoardsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

