namespace OpenAPI
open CatalogReportsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CatalogReportsApiServiceInterface =

    //#region Service interface
    type ICatalogReportsApiService =
      abstract member ReportsCreate:HttpContext -> ReportsCreateArgs->ReportsCreateResult
      abstract member ReportsGet:HttpContext -> ReportsGetArgs->ReportsGetResult
      abstract member ReportsStats:HttpContext -> ReportsStatsArgs->ReportsStatsResult
    //#endregion