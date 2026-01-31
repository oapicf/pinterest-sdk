namespace OpenAPI
open CatalogFeedsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CatalogFeedsApiServiceInterface =

    //#region Service interface
    type ICatalogFeedsApiService =
      abstract member FeedProcessingResultsList:HttpContext -> FeedProcessingResultsListArgs->FeedProcessingResultsListResult
      abstract member FeedsCreate:HttpContext -> FeedsCreateArgs->FeedsCreateResult
      abstract member FeedsDelete:HttpContext -> FeedsDeleteArgs->FeedsDeleteResult
      abstract member FeedsGet:HttpContext -> FeedsGetArgs->FeedsGetResult
      abstract member FeedsIngest:HttpContext -> FeedsIngestArgs->FeedsIngestResult
      abstract member FeedsList:HttpContext -> FeedsListArgs->FeedsListResult
      abstract member FeedsUpdate:HttpContext -> FeedsUpdateArgs->FeedsUpdateResult
      abstract member ItemsIssuesList:HttpContext -> ItemsIssuesListArgs->ItemsIssuesListResult
    //#endregion