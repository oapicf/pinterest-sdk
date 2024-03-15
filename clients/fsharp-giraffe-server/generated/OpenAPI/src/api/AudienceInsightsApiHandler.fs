namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open AudienceInsightsApiHandlerParams
open AudienceInsightsApiServiceInterface
open AudienceInsightsApiServiceImplementation
open OpenAPI.Model.AudienceDefinitionResponse
open OpenAPI.Model.AudienceInsightType
open OpenAPI.Model.AudienceInsightsResponse
open OpenAPI.Model.Error

module AudienceInsightsApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region AudienceInsightsGet
    /// <summary>
    /// Get audience insights
    /// </summary>

    let AudienceInsightsGet (pathParams:AudienceInsightsGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let queryParams = ctx.TryBindQueryString<AudienceInsightsGetQueryParams>()
          let serviceArgs = {  queryParams=queryParams;  pathParams=pathParams;  } : AudienceInsightsGetArgs
          let result = AudienceInsightsApiService.AudienceInsightsGet ctx serviceArgs
          return! (match result with
                      | AudienceInsightsGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AudienceInsightsGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region AudienceInsightsScopeAndTypeGet
    /// <summary>
    /// Get audience insights scope and type
    /// </summary>

    let AudienceInsightsScopeAndTypeGet (pathParams:AudienceInsightsScopeAndTypeGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : AudienceInsightsScopeAndTypeGetArgs
          let result = AudienceInsightsApiService.AudienceInsightsScopeAndTypeGet ctx serviceArgs
          return! (match result with
                      | AudienceInsightsScopeAndTypeGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | AudienceInsightsScopeAndTypeGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

