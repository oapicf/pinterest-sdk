namespace OpenAPI
open CatalogsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CatalogsApiServiceInterface =

    //#region Service interface
    type ICatalogsApiService =
      abstract member CatalogsProductGroupsCreate : CatalogsProductGroupsCreateBodyParams -> CatalogsProductGroupsCreateResult
      abstract member CatalogsProductGroupsDelete : unit -> CatalogsProductGroupsDeleteResult
      abstract member CatalogsProductGroupsList : unit -> CatalogsProductGroupsListResult
      abstract member CatalogsProductGroupsUpdate : CatalogsProductGroupsUpdateBodyParams -> CatalogsProductGroupsUpdateResult
      abstract member FeedProcessingResultsList : unit -> FeedProcessingResultsListResult
      abstract member FeedsCreate : FeedsCreateBodyParams -> FeedsCreateResult
      abstract member FeedsDelete : unit -> FeedsDeleteResult
      abstract member FeedsGet : unit -> FeedsGetResult
      abstract member FeedsList : unit -> FeedsListResult
      abstract member FeedsUpdate : FeedsUpdateBodyParams -> FeedsUpdateResult
      abstract member ItemsBatchGet : unit -> ItemsBatchGetResult
      abstract member ItemsBatchPost : ItemsBatchPostBodyParams -> ItemsBatchPostResult
      abstract member ItemsGet : unit -> ItemsGetResult
    //#endregion