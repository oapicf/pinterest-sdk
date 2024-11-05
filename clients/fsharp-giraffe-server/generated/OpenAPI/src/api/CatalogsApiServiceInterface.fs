namespace OpenAPI
open CatalogsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CatalogsApiServiceInterface =

    //#region Service interface
    type ICatalogsApiService =
      abstract member CatalogsCreate:HttpContext -> CatalogsCreateArgs->CatalogsCreateResult
      abstract member CatalogsList:HttpContext -> CatalogsListArgs->CatalogsListResult
      abstract member CatalogsProductGroupPinsList:HttpContext -> CatalogsProductGroupPinsListArgs->CatalogsProductGroupPinsListResult
      abstract member CatalogsProductGroupsCreate:HttpContext -> CatalogsProductGroupsCreateArgs->CatalogsProductGroupsCreateResult
      abstract member CatalogsProductGroupsCreateMany:HttpContext -> CatalogsProductGroupsCreateManyArgs->CatalogsProductGroupsCreateManyResult
      abstract member CatalogsProductGroupsDelete:HttpContext -> CatalogsProductGroupsDeleteArgs->CatalogsProductGroupsDeleteResult
      abstract member CatalogsProductGroupsDeleteMany:HttpContext -> CatalogsProductGroupsDeleteManyArgs->CatalogsProductGroupsDeleteManyResult
      abstract member CatalogsProductGroupsGet:HttpContext -> CatalogsProductGroupsGetArgs->CatalogsProductGroupsGetResult
      abstract member CatalogsProductGroupsList:HttpContext -> CatalogsProductGroupsListArgs->CatalogsProductGroupsListResult
      abstract member CatalogsProductGroupsProductCountsGet:HttpContext -> CatalogsProductGroupsProductCountsGetArgs->CatalogsProductGroupsProductCountsGetResult
      abstract member CatalogsProductGroupsUpdate:HttpContext -> CatalogsProductGroupsUpdateArgs->CatalogsProductGroupsUpdateResult
      abstract member FeedProcessingResultsList:HttpContext -> FeedProcessingResultsListArgs->FeedProcessingResultsListResult
      abstract member FeedsCreate:HttpContext -> FeedsCreateArgs->FeedsCreateResult
      abstract member FeedsDelete:HttpContext -> FeedsDeleteArgs->FeedsDeleteResult
      abstract member FeedsGet:HttpContext -> FeedsGetArgs->FeedsGetResult
      abstract member FeedsIngest:HttpContext -> FeedsIngestArgs->FeedsIngestResult
      abstract member FeedsList:HttpContext -> FeedsListArgs->FeedsListResult
      abstract member FeedsUpdate:HttpContext -> FeedsUpdateArgs->FeedsUpdateResult
      abstract member ItemsBatchGet:HttpContext -> ItemsBatchGetArgs->ItemsBatchGetResult
      abstract member ItemsBatchPost:HttpContext -> ItemsBatchPostArgs->ItemsBatchPostResult
      abstract member ItemsGet:HttpContext -> ItemsGetArgs->ItemsGetResult
      abstract member ItemsIssuesList:HttpContext -> ItemsIssuesListArgs->ItemsIssuesListResult
      abstract member ItemsPost:HttpContext -> ItemsPostArgs->ItemsPostResult
      abstract member ProductsByProductGroupFilterList:HttpContext -> ProductsByProductGroupFilterListArgs->ProductsByProductGroupFilterListResult
      abstract member ReportsCreate:HttpContext -> ReportsCreateArgs->ReportsCreateResult
      abstract member ReportsGet:HttpContext -> ReportsGetArgs->ReportsGetResult
      abstract member ReportsStats:HttpContext -> ReportsStatsArgs->ReportsStatsResult
    //#endregion