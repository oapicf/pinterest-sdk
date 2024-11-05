namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open LeadsExportApiHandlerParams
open LeadsExportApiServiceInterface
open LeadsExportApiServiceImplementation
open OpenAPI.Model.Error
open OpenAPI.Model.LeadsExportCreateRequest
open OpenAPI.Model.LeadsExportCreateResponse
open OpenAPI.Model.LeadsExportResponseData

module LeadsExportApiHandler =

    /// <summary>
    /// 
    /// </summary>

    //#region LeadsExportCreate
    /// <summary>
    /// Create a request to export leads collected from a lead ad
    /// </summary>

    let LeadsExportCreate (pathParams:LeadsExportCreatePathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let! bodyParams =
            ctx.BindJsonAsync<LeadsExportCreateBodyParams>()
          let serviceArgs = {    pathParams=pathParams; bodyParams=bodyParams } : LeadsExportCreateArgs
          let result = LeadsExportApiService.LeadsExportCreate ctx serviceArgs
          return! (match result with
                      | LeadsExportCreateStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LeadsExportCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LeadsExportCreateDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

    //#region LeadsExportGet
    /// <summary>
    /// Get the lead export from the lead export create call
    /// </summary>

    let LeadsExportGet (pathParams:LeadsExportGetPathParams) : HttpHandler =
      fun (next : HttpFunc) (ctx : HttpContext) ->
        task {
          let serviceArgs = {    pathParams=pathParams;  } : LeadsExportGetArgs
          let result = LeadsExportApiService.LeadsExportGet ctx serviceArgs
          return! (match result with
                      | LeadsExportGetStatusCode200 resolved ->
                            setStatusCode 200 >=> json resolved.content
                      | LeadsExportGetStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LeadsExportGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LeadsExportGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

