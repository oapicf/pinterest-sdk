namespace OpenAPI
open CatalogsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CatalogsApiServiceInterface =

    //#region Service interface
    type ICatalogsApiService =
      abstract member CatalogsCreate : CatalogsCreateBodyParams -> CatalogsCreateResult
      abstract member CatalogsList : unit -> CatalogsListResult
      abstract member CatalogsProductGroupPinsList : unit -> CatalogsProductGroupPinsListResult
      abstract member CatalogsProductGroupsCreate : CatalogsProductGroupsCreateBodyParams -> CatalogsProductGroupsCreateResult
      abstract member CatalogsProductGroupsCreateMany : CatalogsProductGroupsCreateManyBodyParams -> CatalogsProductGroupsCreateManyResult
      abstract member CatalogsProductGroupsDelete : unit -> CatalogsProductGroupsDeleteResult
      abstract member CatalogsProductGroupsDeleteMany : unit -> CatalogsProductGroupsDeleteManyResult
      abstract member CatalogsProductGroupsGet : unit -> CatalogsProductGroupsGetResult
      abstract member CatalogsProductGroupsList : unit -> CatalogsProductGroupsListResult
      abstract member CatalogsProductGroupsProductCountsGet : unit -> CatalogsProductGroupsProductCountsGetResult
      abstract member CatalogsProductGroupsUpdate : CatalogsProductGroupsUpdateBodyParams -> CatalogsProductGroupsUpdateResult
      abstract member FeedProcessingResultsList : unit -> FeedProcessingResultsListResult
      abstract member FeedsCreate : FeedsCreateBodyParams -> FeedsCreateResult
      abstract member FeedsDelete : unit -> FeedsDeleteResult
      abstract member FeedsGet : unit -> FeedsGetResult
      abstract member FeedsIngest : unit -> FeedsIngestResult
      abstract member FeedsList : unit -> FeedsListResult
      abstract member FeedsUpdate : FeedsUpdateBodyParams -> FeedsUpdateResult
      abstract member ItemsBatchGet : unit -> ItemsBatchGetResult
      abstract member ItemsBatchPost : ItemsBatchPostBodyParams -> ItemsBatchPostResult
      abstract member ItemsGet : unit -> ItemsGetResult
      abstract member ItemsIssuesList : unit -> ItemsIssuesListResult
      abstract member ItemsPost : ItemsPostBodyParams -> ItemsPostResult
      abstract member ProductsByProductGroupFilterList : ProductsByProductGroupFilterListBodyParams -> ProductsByProductGroupFilterListResult
      abstract member ReportsCreate : ReportsCreateBodyParams -> ReportsCreateResult
      abstract member ReportsGet : unit -> ReportsGetResult
      abstract member ReportsStats : unit -> ReportsStatsResult
    //#endregion