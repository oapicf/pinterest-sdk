namespace OpenAPI
open ProductCategoriesApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ProductCategoriesApiServiceInterface =

    //#region Service interface
    type IProductCategoriesApiService =
      abstract member TrendsFeaturedTopicsList : unit -> TrendsFeaturedTopicsListResult
      abstract member TrendsProductCategoriesDetailsList : unit -> TrendsProductCategoriesDetailsListResult
      abstract member TrendsProductCategoriesTrendingList : unit -> TrendsProductCategoriesTrendingListResult
    //#endregion