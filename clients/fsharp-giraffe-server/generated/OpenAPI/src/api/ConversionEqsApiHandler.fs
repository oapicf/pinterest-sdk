namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open ConversionEqsApiHandlerParams
open ConversionEqsApiServiceInterface
open ConversionEqsApiServiceImplementation
open OpenAPI.Model.EventQualityScore
open OpenAPI.Model.IngestionSourceOptions
open OpenAPI.Model.LookbackPeriodOptions
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.SourcePlatformOptions

module ConversionEqsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region ConversionEqsList
    /// <summary>
    /// Get event quality score (EQS)
    /// </summary>

    let ConversionEqsList (pathParams:ConversionEqsListPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<ConversionEqsListQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : ConversionEqsListArgs
          let result = ConversionEqsApiService.ConversionEqsList ctx serviceArgs
          return! (match result with
                      | ConversionEqsListStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | ConversionEqsListStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | ConversionEqsListStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | ConversionEqsListStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | ConversionEqsListStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | ConversionEqsListStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | ConversionEqsListDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

