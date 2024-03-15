namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open KeywordsApiHandlerParams
open KeywordsApiServiceInterface
open KeywordsApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.KeywordUpdateBody
open OpenAPI.Model.KeywordsGet200Response
open OpenAPI.Model.KeywordsMetricsArrayResponse
open OpenAPI.Model.KeywordsRequest
open OpenAPI.Model.KeywordsResponse
open OpenAPI.Model.MatchType
open OpenAPI.Model.TrendType
open OpenAPI.Model.TrendingKeywordsResponse
open OpenAPI.Model.TrendsSupportedRegion

module KeywordsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region CountryKeywordsMetricsGet
    /// <summary>
    /// Get country&#39;s keyword metrics
    /// </summary>

    let CountryKeywordsMetricsGet (pathParams:CountryKeywordsMetricsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<CountryKeywordsMetricsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : CountryKeywordsMetricsGetArgs
          let result = KeywordsApiService.CountryKeywordsMetricsGet ctx serviceArgs
          return! (match result with
                      | CountryKeywordsMetricsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | CountryKeywordsMetricsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region KeywordsCreate
    /// <summary>
    /// Create keywords
    /// </summary>

    let KeywordsCreate (pathParams:KeywordsCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<KeywordsCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : KeywordsCreateArgs
          let result = KeywordsApiService.KeywordsCreate ctx serviceArgs
          return! (match result with
                      | KeywordsCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | KeywordsCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region KeywordsGet
    /// <summary>
    /// Get keywords
    /// </summary>

    let KeywordsGet (pathParams:KeywordsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<KeywordsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : KeywordsGetArgs
          let result = KeywordsApiService.KeywordsGet ctx serviceArgs
          return! (match result with
                      | KeywordsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | KeywordsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region KeywordsUpdate
    /// <summary>
    /// Update keywords
    /// </summary>

    let KeywordsUpdate (pathParams:KeywordsUpdatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<KeywordsUpdateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : KeywordsUpdateArgs
          let result = KeywordsApiService.KeywordsUpdate ctx serviceArgs
          return! (match result with
                      | KeywordsUpdateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | KeywordsUpdateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region TrendingKeywordsList
    /// <summary>
    /// List trending keywords
    /// </summary>

    let TrendingKeywordsList (pathParams:TrendingKeywordsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TrendingKeywordsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : TrendingKeywordsListArgs
          let result = KeywordsApiService.TrendingKeywordsList ctx serviceArgs
          return! (match result with
                      | TrendingKeywordsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | TrendingKeywordsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TrendingKeywordsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

