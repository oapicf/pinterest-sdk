namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open TermsApiHandlerParams
open TermsApiServiceInterface
open TermsApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.RelatedTerms

module TermsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region TermsRelatedList
    /// <summary>
    /// List related terms
    /// </summary>

    let TermsRelatedList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TermsRelatedListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : TermsRelatedListArgs
          let result = TermsApiService.TermsRelatedList ctx serviceArgs
          return! (match result with
                      | TermsRelatedListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | TermsRelatedListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TermsRelatedListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region TermsSuggestedList
    /// <summary>
    /// List suggested terms
    /// </summary>

    let TermsSuggestedList  : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<TermsSuggestedListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;    } : TermsSuggestedListArgs
          let result = TermsApiService.TermsSuggestedList ctx serviceArgs
          return! (match result with
                      | TermsSuggestedListStatusCode200 resolved ->
                            setStatusCode 200 >=> text resolved.content
                      | TermsSuggestedListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | TermsSuggestedListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

