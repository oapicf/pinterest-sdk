namespace OpenAPI
open OpenAPI.Model.AgeTrendsBucket
open OpenAPI.Model.FeaturedTrend
open OpenAPI.Model.GenderBucket
open OpenAPI.Model.InterestsEnum
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.ProductCategoriesEngagementType
open OpenAPI.Model.ProductCategoryDetailLookbackWindow
open OpenAPI.Model.ProductCategoryDetails
open OpenAPI.Model.ProductCategoryEnum
open OpenAPI.Model.ProductCategoryRegion
open OpenAPI.Model.TrendingProductCategory
open OpenAPI.Model.VerticalProductCategory
open ProductCategoriesApiHandlerParams
open ProductCategoriesApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ProductCategoriesApiServiceImplementation =

    //#region Service implementation
    type ProductCategoriesApiServiceImpl() =
      interface IProductCategoriesApiService with

        member this.TrendsFeaturedTopicsList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> FeaturedTrend[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsFeaturedTopicsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsFeaturedTopicsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsFeaturedTopicsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsFeaturedTopicsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsFeaturedTopicsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsFeaturedTopicsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsFeaturedTopicsListDefaultStatusCode { content = content }

        member this.TrendsProductCategoriesDetailsList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> ProductCategoryDetails[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesDetailsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesDetailsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesDetailsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesDetailsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesDetailsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesDetailsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesDetailsListDefaultStatusCode { content = content }

        member this.TrendsProductCategoriesTrendingList ctx args =
          if true then
            let content = "The request has succeeded." :> obj :?> TrendingProductCategory[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesTrendingListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesTrendingListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesTrendingListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesTrendingListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesTrendingListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesTrendingListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            TrendsProductCategoriesTrendingListDefaultStatusCode { content = content }

      //#endregion

    let ProductCategoriesApiService = ProductCategoriesApiServiceImpl() :> IProductCategoriesApiService