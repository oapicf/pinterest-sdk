namespace OpenAPI
open CatalogFeedsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CatalogFeedsApiServiceInterface =

    //#region Service interface
    type ICatalogFeedsApiService =
      abstract member FeedProcessingResultsList : unit -> FeedProcessingResultsListResult
      abstract member FeedsCreate : FeedsCreateBodyParams -> FeedsCreateResult
      abstract member FeedsDelete : unit -> FeedsDeleteResult
      abstract member FeedsGet : unit -> FeedsGetResult
      abstract member FeedsIngest : unit -> FeedsIngestResult
      abstract member FeedsList : unit -> FeedsListResult
      abstract member FeedsUpdate : FeedsUpdateBodyParams -> FeedsUpdateResult
      abstract member ItemsIssuesList : unit -> ItemsIssuesListResult
    //#endregion