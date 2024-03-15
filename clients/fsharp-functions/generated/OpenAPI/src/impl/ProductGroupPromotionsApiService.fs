namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.Granularity
open OpenAPI.Model.ProductGroupAnalyticsResponseInner
open OpenAPI.Model.ProductGroupPromotionCreateRequest
open OpenAPI.Model.ProductGroupPromotionResponse
open OpenAPI.Model.ProductGroupPromotionUpdateRequest
open OpenAPI.Model.ProductGroupPromotionsList200Response
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
            let content = "Success" :> obj :?> ProductGroupPromotionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsCreateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsCreateDefaultStatusCode { content = content }

        member this.ProductGroupPromotionsGet () =
          if true then
            let content = "Success" :> obj :?> ProductGroupPromotionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsGetStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsGetDefaultStatusCode { content = content }

        member this.ProductGroupPromotionsList () =
          if true then
            let content = "Success" :> obj :?> ProductGroupPromotionsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsListStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsListDefaultStatusCode { content = content }

        member this.ProductGroupPromotionsUpdate (parameters:ProductGroupPromotionsUpdateBodyParams) =
          if true then
            let content = "Success" :> obj :?> ProductGroupPromotionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsUpdateStatusCode200 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupPromotionsUpdateDefaultStatusCode { content = content }

        member this.ProductGroupsAnalytics () =
          if true then
            let content = "Success" :> obj :?> ProductGroupAnalyticsResponseInner[] // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account ads analytics parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ProductGroupsAnalyticsDefaultStatusCode { content = content }

      //#endregion

    let ProductGroupPromotionsApiService = ProductGroupPromotionsApiServiceImpl() :> IProductGroupPromotionsApiService