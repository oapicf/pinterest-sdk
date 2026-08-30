namespace OpenAPI
open OpenAPI.Model.CatalogsCreateReportResponse
open OpenAPI.Model.CatalogsReport
open OpenAPI.Model.CatalogsReportParameters
open OpenAPI.Model.CatalogsReportStatsParameters
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.ReportsStats200Response
open CatalogReportsApiHandlerParams
open CatalogReportsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module CatalogReportsApiServiceImplementation =

    //#region Service implementation
    type CatalogReportsApiServiceImpl() =
      interface ICatalogReportsApiService with

        member this.ReportsCreate ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsCreateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> CatalogsCreateReportResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsCreateDefaultStatusCode { content = content }

        member this.ReportsGet ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> CatalogsReport // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsGetDefaultStatusCode { content = content }

        member this.ReportsStats ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> ReportsStats200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ReportsStatsDefaultStatusCode { content = content }

      //#endregion

    let CatalogReportsApiService = CatalogReportsApiServiceImpl() :> ICatalogReportsApiService