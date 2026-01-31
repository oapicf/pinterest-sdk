namespace OpenAPI
open OpenAPI.Model.CatalogsCreateReportResponse
open OpenAPI.Model.CatalogsReport
open OpenAPI.Model.CatalogsReportParameters
open OpenAPI.Model.Error
open OpenAPI.Model.ReportsStats200Response
open OpenAPI.Model.ReportsStatsParametersParameter
open CatalogReportsApiHandlerParams
open CatalogReportsApiServiceInterface
open System.Collections.Generic
open System

module CatalogReportsApiServiceImplementation =

    //#region Service implementation
    type CatalogReportsApiServiceImpl() =
      interface ICatalogReportsApiService with

        member this.ReportsCreate (parameters:ReportsCreateBodyParams) =
          if true then
            let content = "Response containing the report token" :> obj :?> CatalogsCreateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode200 { content = content }
          else if true then
            let content = "Entity (e.g., catalog, feed or processing_result) not found" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode404 { content = content }
          else if true then
            let content = "Can&#39;t access this feature without an existing catalog." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode409 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateDefaultStatusCode { content = content }

        member this.ReportsGet () =
          if true then
            let content = "Response that contains a link to download the report" :> obj :?> CatalogsReport // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode200 { content = content }
          else if true then
            let content = "The token you provided is not valid or has expired." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode400 { content = content }
          else if true then
            let content = "Can&#39;t access this feature without an existing catalog." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode409 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetDefaultStatusCode { content = content }

        member this.ReportsStats () =
          if true then
            let content = "Response containing the diagnostics aggregated counters" :> obj :?> ReportsStats200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsStatusCode200 { content = content }
          else if true then
            let content = "Not authorized to access catalogs" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsStatusCode401 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsDefaultStatusCode { content = content }

      //#endregion

    let CatalogReportsApiService = CatalogReportsApiServiceImpl() :> ICatalogReportsApiService