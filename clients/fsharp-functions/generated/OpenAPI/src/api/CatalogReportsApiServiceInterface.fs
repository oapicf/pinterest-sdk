namespace OpenAPI
open CatalogReportsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CatalogReportsApiServiceInterface =

    //#region Service interface
    type ICatalogReportsApiService =
      abstract member ReportsCreate : ReportsCreateBodyParams -> ReportsCreateResult
      abstract member ReportsGet : unit -> ReportsGetResult
      abstract member ReportsStats : unit -> ReportsStatsResult
    //#endregion