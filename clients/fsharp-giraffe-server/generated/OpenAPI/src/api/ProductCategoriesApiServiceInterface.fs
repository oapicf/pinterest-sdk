namespace OpenAPI
open ProductCategoriesApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ProductCategoriesApiServiceInterface =

    //#region Service interface
    type IProductCategoriesApiService =
      abstract member TrendsFeaturedTopicsList:HttpContext -> TrendsFeaturedTopicsListArgs->TrendsFeaturedTopicsListResult
      abstract member TrendsProductCategoriesDetailsList:HttpContext -> TrendsProductCategoriesDetailsListArgs->TrendsProductCategoriesDetailsListResult
      abstract member TrendsProductCategoriesTrendingList:HttpContext -> TrendsProductCategoriesTrendingListArgs->TrendsProductCategoriesTrendingListResult
    //#endregion