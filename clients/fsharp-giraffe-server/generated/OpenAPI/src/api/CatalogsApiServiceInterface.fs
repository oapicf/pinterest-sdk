namespace OpenAPI
open CatalogsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module CatalogsApiServiceInterface =

    //#region Service interface
    type ICatalogsApiService =
      abstract member CatalogsProductGroupsCreate:HttpContext -> CatalogsProductGroupsCreateArgs->CatalogsProductGroupsCreateResult
      abstract member CatalogsProductGroupsDelete:HttpContext -> CatalogsProductGroupsDeleteArgs->CatalogsProductGroupsDeleteResult
      abstract member CatalogsProductGroupsList:HttpContext -> CatalogsProductGroupsListArgs->CatalogsProductGroupsListResult
      abstract member CatalogsProductGroupsUpdate:HttpContext -> CatalogsProductGroupsUpdateArgs->CatalogsProductGroupsUpdateResult
      abstract member FeedProcessingResultsList:HttpContext -> FeedProcessingResultsListArgs->FeedProcessingResultsListResult
      abstract member FeedsCreate:HttpContext -> FeedsCreateArgs->FeedsCreateResult
      abstract member FeedsDelete:HttpContext -> FeedsDeleteArgs->FeedsDeleteResult
      abstract member FeedsGet:HttpContext -> FeedsGetArgs->FeedsGetResult
      abstract member FeedsList:HttpContext -> FeedsListArgs->FeedsListResult
      abstract member FeedsUpdate:HttpContext -> FeedsUpdateArgs->FeedsUpdateResult
      abstract member ItemsBatchGet:HttpContext -> ItemsBatchGetArgs->ItemsBatchGetResult
      abstract member ItemsBatchPost:HttpContext -> ItemsBatchPostArgs->ItemsBatchPostResult
      abstract member ItemsGet:HttpContext -> ItemsGetArgs->ItemsGetResult
    //#endregion