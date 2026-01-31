namespace OpenAPI
open OpenAPI.Model.Error
open OpenAPI.Model.PromotionCreateRequest
open OpenAPI.Model.PromotionResponse
open OpenAPI.Model.PromotionUpdateRequest
open OpenAPI.Model.PromotionsList200Response
open OpenAPI.Model.PromotionsResponse
open PromotionsApiHandlerParams
open PromotionsApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module PromotionsApiServiceImplementation =

    //#region Service implementation
    type PromotionsApiServiceImpl() =
      interface IPromotionsApiService with

        member this.PromotionsCreate ctx args =
          if true then
            let content = "Success" :> obj :?> PromotionsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsCreateStatusCode200 { content = content }
          else if true then
            let content = "Invalid create promotions request parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsCreateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsCreateDefaultStatusCode { content = content }

        member this.PromotionsDelete ctx args =
          if true then
            let content = "Promotion deleted successfully" 
            PromotionsDeleteStatusCode204 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsDeleteDefaultStatusCode { content = content }

        member this.PromotionsGet ctx args =
          if true then
            let content = "Success" :> obj :?> PromotionResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsGetStatusCode200 { content = content }
          else if true then
            let content = "The promotion ID for the given ad account ID was not found." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsGetStatusCode404 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsGetDefaultStatusCode { content = content }

        member this.PromotionsList ctx args =
          if true then
            let content = "Success" :> obj :?> PromotionsList200Response // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsListStatusCode200 { content = content }
          else if true then
            let content = "Invalid ad account promotions parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsListStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsListDefaultStatusCode { content = content }

        member this.PromotionsUpdate ctx args =
          if true then
            let content = "Success" :> obj :?> PromotionsResponse // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsUpdateStatusCode200 { content = content }
          else if true then
            let content = "Invalid create promotions request parameters." :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsUpdateStatusCode400 { content = content }
          else
            let content = "Unexpected error" :> obj :?> Error // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PromotionsUpdateDefaultStatusCode { content = content }

      //#endregion

    let PromotionsApiService = PromotionsApiServiceImpl() :> IPromotionsApiService