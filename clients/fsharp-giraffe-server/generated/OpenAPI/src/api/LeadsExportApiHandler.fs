namespace OpenAPI

open System.Collections.Generic
open Giraffe
open Microsoft.AspNetCore.Http
open FSharp.Control.Tasks.V2.ContextInsensitive
open LeadsExportApiHandlerParams
open LeadsExportApiServiceInterface
open LeadsExportApiServiceImplementation
open OpenAPI.Model.LeadsExportResponseData
open OpenAPI.Model.LeadsExports
open OpenAPI.Model.LeadsExportsCreate
open OpenAPI.Model.PinterestLibError

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
                      | LeadsExportCreateStatusCode201 resolved ->
                            setStatusCode 201 >=> json resolved.content
                      | LeadsExportCreateStatusCode400 resolved ->
                            setStatusCode 400 >=> json resolved.content
                      | LeadsExportCreateStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LeadsExportCreateStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LeadsExportCreateStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LeadsExportCreateStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
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
                      | LeadsExportGetStatusCode401 resolved ->
                            setStatusCode 401 >=> json resolved.content
                      | LeadsExportGetStatusCode403 resolved ->
                            setStatusCode 403 >=> json resolved.content
                      | LeadsExportGetStatusCode404 resolved ->
                            setStatusCode 404 >=> json resolved.content
                      | LeadsExportGetStatusCode429 resolved ->
                            setStatusCode 429 >=> json resolved.content
                      | LeadsExportGetDefaultStatusCode resolved ->
                            setStatusCode 0 >=> json resolved.content
          ) next ctx
        }
    //#endregion

