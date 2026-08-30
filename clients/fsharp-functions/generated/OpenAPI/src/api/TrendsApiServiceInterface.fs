namespace OpenAPI
open TrendsApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module TrendsApiServiceInterface =

    //#region Service interface
    type ITrendsApiService =
      abstract member TrendsEditorialArticlesList : unit -> TrendsEditorialArticlesListResult
      abstract member TrendsFeaturedTopicsList : unit -> TrendsFeaturedTopicsListResult
      abstract member TrendsProductCategoriesDetailsList : unit -> TrendsProductCategoriesDetailsListResult
      abstract member TrendsProductCategoriesTrendingList : unit -> TrendsProductCategoriesTrendingListResult
    //#endregion