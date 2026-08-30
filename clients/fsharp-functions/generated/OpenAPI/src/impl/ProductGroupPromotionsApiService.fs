namespace OpenAPI
open OpenAPI.Model.EntityStatus
open OpenAPI.Model.Granularity
open OpenAPI.Model.PinterestLibError
open OpenAPI.Model.PinterestLibPaginationOrder
open OpenAPI.Model.ProductGroupAnalyticsItems
open OpenAPI.Model.ProductGroupPromotion
open OpenAPI.Model.ProductGroupPromotions
open OpenAPI.Model.ProductGroupPromotionsCreate
open OpenAPI.Model.ProductGroupPromotionsList200Response
open OpenAPI.Model.ProductGroupPromotionsUpdateWithRequiredBody
open OpenAPI.Model.ReportingColumnSync
open OpenAPI.Model.ReportingTimeZone
open ProductGroupPromotionsApiHandlerParams
open ProductGroupPromotionsApiServiceInterface
open System.Collections.Generic
open System

module ProductGroupPromotionsApiServiceImplementation =

    //#region Service implementation
    type ProductGroupPromotionsApiServiceImpl() =
      interface IProductGroupPromotionsApiService with

        member this.ProductGroupPromotionsCreate (parameters:ProductGroupPromotionsCreateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> ProductGroupPromotions // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsCreateStatusCode200 { content = content }
          else if true then
            let content = "Resource create operation completed successfully." :> obj :?> ProductGroupPromotions // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsCreateStatusCode201 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsCreateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsCreateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsCreateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsCreateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsCreateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsCreateDefaultStatusCode { content = content }

        member this.ProductGroupPromotionsGet () =
          if true then
            let content = "The request has succeeded." :> obj :?> ProductGroupPromotion // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsGetStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsGetStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsGetStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsGetStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsGetStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsGetStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsGetDefaultStatusCode { content = content }

        member this.ProductGroupPromotionsList () =
          if true then
            let content = "The request has succeeded." :> obj :?> ProductGroupPromotionsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsListStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsListStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsListStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsListStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsListStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsListStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsListDefaultStatusCode { content = content }

        member this.ProductGroupPromotionsUpdate (parameters:ProductGroupPromotionsUpdateBodyParams) =
          if true then
            let content = "The request has succeeded." :> obj :?> ProductGroupPromotions // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsUpdateStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsUpdateStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsUpdateStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsUpdateStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsUpdateStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsUpdateStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsUpdateDefaultStatusCode { content = content }

        member this.ProductGroupsAnalytics () =
          if true then
            let content = "The request has succeeded." :> obj :?> ProductGroupAnalyticsItems[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "The request could not be understood by the server due to unexpected data." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsStatusCode400 { content = content }
          else if true then
            let content = "Authentication is required and has either failed or not been provided." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsStatusCode401 { content = content }
          else if true then
            let content = "The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsStatusCode403 { content = content }
          else if true then
            let content = "The requested resource could not be found on this server." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsStatusCode404 { content = content }
          else if true then
            let content = "The user has sent too many requests in a given amount of time and is being rate limited." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsStatusCode429 { content = content }
          else
            let content = "An unexpected error response." :> obj :?> PinterestLibError // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsDefaultStatusCode { content = content }

      //#endregion

    let ProductGroupPromotionsApiService = ProductGroupPromotionsApiServiceImpl() :> IProductGroupPromotionsApiService