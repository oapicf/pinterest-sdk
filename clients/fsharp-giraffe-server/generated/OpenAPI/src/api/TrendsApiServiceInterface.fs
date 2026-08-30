namespace OpenAPI
open TrendsApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module TrendsApiServiceInterface =

    //#region Service interface
    type ITrendsApiService =
      abstract member TrendsEditorialArticlesList:HttpContext -> TrendsEditorialArticlesListArgs->TrendsEditorialArticlesListResult
      abstract member TrendsFeaturedTopicsList:HttpContext -> TrendsFeaturedTopicsListArgs->TrendsFeaturedTopicsListResult
      abstract member TrendsProductCategoriesDetailsList:HttpContext -> TrendsProductCategoriesDetailsListArgs->TrendsProductCategoriesDetailsListResult
      abstract member TrendsProductCategoriesTrendingList:HttpContext -> TrendsProductCategoriesTrendingListArgs->TrendsProductCategoriesTrendingListResult
    //#endregion